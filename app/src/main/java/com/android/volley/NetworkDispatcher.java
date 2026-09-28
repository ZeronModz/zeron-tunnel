package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class NetworkDispatcher extends Thread {
    public final BlockingQueue a;
    public final Network b;
    public final Cache c;
    public final ResponseDelivery d;

    public NetworkDispatcher(BlockingQueue<Request<?>> blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.a = blockingQueue;
        this.b = network;
        this.c = cache;
        this.d = responseDelivery;
    }

    private void a() throws InterruptedException {
        Request<?> request = (Request) this.a.take();
        ResponseDelivery responseDelivery = this.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        request.getClass();
        try {
            request.a("network-queue-take");
            if (request.k()) {
                request.c("network-discard-cancelled");
                request.l();
                return;
            }
            TrafficStats.setThreadStatsTag(request.d);
            NetworkResponse networkResponsePerformRequest = this.b.performRequest(request);
            request.a("network-http-complete");
            if (networkResponsePerformRequest.d && request.j()) {
                request.c("not-modified");
                request.l();
                return;
            }
            a aVarN = request.n(networkResponsePerformRequest);
            request.a("network-parse-complete");
            if (request.g && aVarN.b != null) {
                this.c.put(request.f(), aVarN.b);
                request.a("network-cache-written");
            }
            synchronized (request.e) {
                request.i = true;
            }
            responseDelivery.postResponse(request, aVarN);
            request.m(aVarN);
        } catch (VolleyError e) {
            e.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
            responseDelivery.postError(request, e);
            request.l();
        } catch (Exception e2) {
            VolleyLog.a("Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - jElapsedRealtime);
            responseDelivery.postError(request, volleyError);
            request.l();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                VolleyLog.a("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
