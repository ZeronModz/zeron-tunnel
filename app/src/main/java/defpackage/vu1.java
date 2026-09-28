package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vu1 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;
    public final Object c;

    public vu1(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
            default:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.c;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                int andIncrement = atomicInteger.getAndIncrement();
                String str = (String) obj;
                StringBuilder sb = new StringBuilder(ec1.H(12, String.valueOf(andIncrement).length(), str));
                sb.append("AdWorker(");
                sb.append(str);
                sb.append(") #");
                sb.append(andIncrement);
                return new Thread(runnable, sb.toString());
            case 1:
                int andIncrement2 = atomicInteger.getAndIncrement();
                String str2 = (String) obj;
                StringBuilder sb2 = new StringBuilder(ec1.H(12, String.valueOf(andIncrement2).length(), str2));
                sb2.append("AdWorker(");
                sb2.append(str2);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
            default:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                int andIncrement3 = atomicInteger.getAndIncrement();
                StringBuilder sb3 = new StringBuilder(String.valueOf(andIncrement3).length() + 5);
                sb3.append("gads-");
                sb3.append(andIncrement3);
                threadNewThread.setName(sb3.toString());
                return threadNewThread;
        }
    }

    public vu1() {
        this.a = 2;
        this.c = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }
}
