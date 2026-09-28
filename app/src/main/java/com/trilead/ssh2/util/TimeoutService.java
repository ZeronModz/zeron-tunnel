package com.trilead.ssh2.util;

import defpackage.hz;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TimeoutService {
    private static final ScheduledExecutorService scheduler;
    private static final ThreadFactory threadFactory;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class TimeoutToken implements Runnable {
        private boolean cancelled = false;
        private Runnable handler;

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            this.handler.run();
        }
    }

    static {
        ThreadFactory threadFactory2 = new ThreadFactory() { // from class: com.trilead.ssh2.util.TimeoutService.1
            private AtomicInteger count = new AtomicInteger();

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, hz.o(this.count.incrementAndGet(), "TimeoutService-"));
                thread.setDaemon(true);
                return thread;
            }
        };
        threadFactory = threadFactory2;
        scheduler = Executors.newScheduledThreadPool(20, threadFactory2);
    }

    public static final TimeoutToken addTimeoutHandler(long j, Runnable runnable) {
        TimeoutToken timeoutToken = new TimeoutToken();
        timeoutToken.handler = runnable;
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        scheduler.schedule(timeoutToken, jCurrentTimeMillis, TimeUnit.MILLISECONDS);
        return timeoutToken;
    }

    public static final void cancelTimeoutHandler(TimeoutToken timeoutToken) {
        timeoutToken.cancelled = true;
    }
}
