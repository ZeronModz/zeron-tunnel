package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fy implements Executor {
    public static volatile fy b;
    public static final fy c = new fy(1);
    public static final /* synthetic */ fy d = new fy(2);
    public static final /* synthetic */ fy e = new fy(3);
    public static final /* synthetic */ fy f = new fy(5);
    public static final /* synthetic */ fy g = new fy(6);
    public final /* synthetic */ int a;

    public /* synthetic */ fy(int i) {
        this.a = i;
    }

    public static fy b() {
        if (b != null) {
            return b;
        }
        synchronized (fy.class) {
            try {
                if (b == null) {
                    b = new fy(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                new Thread(runnable).start();
                break;
            case 5:
                break;
            case 6:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final /* synthetic */ void a(Runnable runnable) {
    }
}
