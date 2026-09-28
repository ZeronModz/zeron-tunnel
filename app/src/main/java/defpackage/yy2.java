package defpackage;

import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgha;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yy2 implements zzgha {
    public final Map a;
    public final vz1 b;
    public final r03 c;
    public final long d;

    public yy2(vz1 vz1Var, Map map, k5 k5Var, f6 f6Var) {
        this.a = map;
        this.b = vz1Var;
        this.c = f6Var.a(112);
        this.d = k5Var.zzj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        b1 b1Var;
        try {
            try {
                this.c.a();
                ListenableFuture listenableFuture = (ListenableFuture) this.a.get("gs");
                if (listenableFuture != null && (b1Var = (b1) listenableFuture.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                    vz1 vz1Var = this.b;
                    synchronized (vz1Var) {
                        g1 g1VarS0 = b1Var.s0();
                        vz1Var.d();
                        ((b1) vz1Var.b).i0(g1VarS0);
                        long jQ0 = b1Var.q0();
                        vz1Var.d();
                        ((b1) vz1Var.b).S(jQ0);
                    }
                }
            } catch (Throwable th) {
                this.c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.c.b(e);
        }
        this.c.c();
        return null;
    }
}
