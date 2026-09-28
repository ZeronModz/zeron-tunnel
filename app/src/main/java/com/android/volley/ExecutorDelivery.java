package com.android.volley;

import android.os.Handler;
import defpackage.s8;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorDelivery implements ResponseDelivery {
    public final Executor a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class ResponseDeliveryRunnable implements Runnable {
        public final Request a;
        public final a b;
        public final Runnable c;

        public ResponseDeliveryRunnable(Request request, a aVar, Runnable runnable) {
            this.a = request;
            this.b = aVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Response$ErrorListener response$ErrorListener;
            if (this.a.k()) {
                this.a.c("canceled-at-delivery");
                return;
            }
            a aVar = this.b;
            VolleyError volleyError = aVar.c;
            boolean z = volleyError == null;
            Request request = this.a;
            if (z) {
                request.b(aVar.a);
            } else {
                synchronized (request.e) {
                    response$ErrorListener = request.f;
                }
                if (response$ErrorListener != null) {
                    response$ErrorListener.onErrorResponse(volleyError);
                }
            }
            boolean z2 = this.b.d;
            Request request2 = this.a;
            if (z2) {
                request2.a("intermediate-response");
            } else {
                request2.c("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExecutorDelivery(Handler handler) {
        this.a = new s8(handler, 1);
    }

    @Override // com.android.volley.ResponseDelivery
    public final void postError(Request request, VolleyError volleyError) {
        request.a("post-error");
        this.a.execute(new ResponseDeliveryRunnable(request, new a(volleyError), null));
    }

    @Override // com.android.volley.ResponseDelivery
    public final void postResponse(Request request, a aVar, Runnable runnable) {
        synchronized (request.e) {
            request.i = true;
        }
        request.a("post-response");
        this.a.execute(new ResponseDeliveryRunnable(request, aVar, runnable));
    }

    public ExecutorDelivery(Executor executor) {
        this.a = executor;
    }

    @Override // com.android.volley.ResponseDelivery
    public final void postResponse(Request request, a aVar) {
        postResponse(request, aVar, null);
    }
}
