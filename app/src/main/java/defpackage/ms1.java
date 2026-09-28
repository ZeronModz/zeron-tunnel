package defpackage;

import com.google.android.gms.common.api.internal.zaaw;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ms1 implements Runnable {
    public final /* synthetic */ zaaw a;

    public /* synthetic */ ms1(zaaw zaawVar) {
        this.a = zaawVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        zaaw zaawVar = this.a;
        Lock lock = zaawVar.b;
        Lock lock2 = zaawVar.b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                rs1 rs1Var = zaawVar.a.e;
                rs1Var.sendMessage(rs1Var.obtainMessage(2, e));
            }
        } finally {
            lock2.unlock();
        }
    }
}
