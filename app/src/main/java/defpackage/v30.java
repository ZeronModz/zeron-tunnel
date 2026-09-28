package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v30 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public v30(ss2 ss2Var) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new u30(runnable, 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread;
            case 1:
                Thread threadNewThread2 = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread2.setName("ScionFrontendApi");
                return threadNewThread2;
            default:
                String str = wt2.a;
                return new Thread(runnable, (String) obj);
        }
    }

    public /* synthetic */ v30(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }
}
