package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f6 implements Executor {
    public final Object a = new Object();
    public final ArrayDeque b = new ArrayDeque();
    public final fy c;
    public Runnable d;

    public f6(fy fyVar) {
        this.c = fyVar;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                Runnable runnable = (Runnable) this.b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            try {
                this.b.add(new r4(1, this, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
