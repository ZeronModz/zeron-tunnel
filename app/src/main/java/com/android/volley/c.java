package com.android.volley;

import com.android.volley.Cache;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Request.NetworkRequestCompleteListener {
    public final HashMap a = new HashMap();
    public final ResponseDelivery b;
    public final CacheDispatcher c;
    public final BlockingQueue d;

    public c(CacheDispatcher cacheDispatcher, BlockingQueue blockingQueue, ResponseDelivery responseDelivery) {
        this.b = responseDelivery;
        this.c = cacheDispatcher;
        this.d = blockingQueue;
    }

    public final synchronized boolean a(Request request) {
        try {
            String strF = request.f();
            boolean zContainsKey = this.a.containsKey(strF);
            HashMap map = this.a;
            if (!zContainsKey) {
                map.put(strF, null);
                request.o(this);
                if (VolleyLog.a) {
                    VolleyLog.a("new request, sending to network %s", strF);
                }
                return false;
            }
            List arrayList = (List) map.get(strF);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            request.a("waiting-for-response");
            arrayList.add(request);
            this.a.put(strF, arrayList);
            if (VolleyLog.a) {
                VolleyLog.a("Request for cacheKey=%s is in flight, putting on hold.", strF);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public final synchronized void onNoUsableResponseReceived(Request request) {
        try {
            String strF = request.f();
            List list = (List) this.a.remove(strF);
            if (list != null && !list.isEmpty()) {
                if (VolleyLog.a) {
                    VolleyLog.b("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strF);
                }
                Request request2 = (Request) list.remove(0);
                this.a.put(strF, list);
                request2.o(this);
                BlockingQueue blockingQueue = this.d;
                if (blockingQueue != null) {
                    try {
                        blockingQueue.put(request2);
                    } catch (InterruptedException e) {
                        VolleyLog.a("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        CacheDispatcher cacheDispatcher = this.c;
                        cacheDispatcher.e = true;
                        cacheDispatcher.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public final void onResponseReceived(Request request, a aVar) {
        List list;
        Cache.Entry entry = aVar.b;
        if (entry == null || entry.e < System.currentTimeMillis()) {
            onNoUsableResponseReceived(request);
            return;
        }
        String strF = request.f();
        synchronized (this) {
            list = (List) this.a.remove(strF);
        }
        if (list != null) {
            if (VolleyLog.a) {
                VolleyLog.b("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strF);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.postResponse((Request) it.next(), aVar);
            }
        }
    }
}
