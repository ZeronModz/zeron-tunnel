package com.android.volley;

import android.os.Process;
import com.android.volley.Cache;
import defpackage.db0;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CacheDispatcher extends Thread {
    public static final boolean g = VolleyLog.a;
    public final BlockingQueue a;
    public final BlockingQueue b;
    public final Cache c;
    public final ResponseDelivery d;
    public volatile boolean e = false;
    public final c f;

    public CacheDispatcher(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.a = blockingQueue;
        this.b = blockingQueue2;
        this.c = cache;
        this.d = responseDelivery;
        this.f = new c(this, blockingQueue2, responseDelivery);
    }

    private void a() throws InterruptedException {
        Request<?> request = (Request) this.a.take();
        request.a("cache-queue-take");
        if (request.k()) {
            request.c("cache-discard-canceled");
            return;
        }
        String strF = request.f();
        Cache cache = this.c;
        Cache.Entry entry = cache.get(strF);
        BlockingQueue blockingQueue = this.b;
        c cVar = this.f;
        if (entry == null) {
            request.a("cache-miss");
            if (cVar.a(request)) {
                return;
            }
            blockingQueue.put(request);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (entry.e < jCurrentTimeMillis) {
            request.a("cache-hit-expired");
            request.k = entry;
            if (cVar.a(request)) {
                return;
            }
            blockingQueue.put(request);
            return;
        }
        request.a("cache-hit");
        a aVarN = request.n(new NetworkResponse(entry.a, entry.g));
        request.a("cache-hit-parsed");
        if (!(aVarN.c == null)) {
            request.a("cache-parsing-failed");
            cache.invalidate(request.f(), true);
            request.k = null;
            if (cVar.a(request)) {
                return;
            }
            blockingQueue.put(request);
            return;
        }
        long j = entry.f;
        ResponseDelivery responseDelivery = this.d;
        if (j >= jCurrentTimeMillis) {
            responseDelivery.postResponse(request, aVarN);
            return;
        }
        request.a("cache-hit-refresh-needed");
        request.k = entry;
        aVarN.d = true;
        if (cVar.a(request)) {
            responseDelivery.postResponse(request, aVarN);
        } else {
            responseDelivery.postResponse(request, aVarN, new db0(this, 3, request, z));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (g) {
            VolleyLog.b("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.c.initialize();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.a("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
