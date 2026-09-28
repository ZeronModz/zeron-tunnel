package defpackage;

import defpackage.hz;
import defpackage.te2;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class te2 implements Executor {
    public final ThreadPoolExecutor b;
    public final AtomicInteger a = new AtomicInteger(1);
    public WeakReference c = new WeakReference(null);

    public te2() {
        final String str = "Google consent worker";
        ThreadFactory threadFactory = new ThreadFactory(str) { // from class: com.google.android.gms.internal.consent_sdk.zzcq
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                te2 te2Var = this.a;
                Thread thread = new Thread(runnable, hz.o(te2Var.a.getAndIncrement(), "Google consent worker #"));
                te2Var.c = new WeakReference(thread);
                return thread;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.c.get()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }
}
