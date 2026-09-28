package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sq2 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ ss2 d;

    public sq2(ss2 ss2Var, boolean z) {
        Objects.requireNonNull(ss2Var);
        this.d = ss2Var;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        ss2 ss2Var = this.d;
        if (ss2Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            ss2Var.d(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
