package defpackage;

import com.google.android.gms.internal.ads.zzgdv;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my2 implements Callable {
    public final /* synthetic */ ny2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ my2(ny2 ny2Var, int i) {
        this.a = ny2Var;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b - 1;
        ny2 ny2Var = this.a;
        if (i == 1) {
            return (zzgdv) ny2Var.a.zzb();
        }
        if (i == 2) {
            return (zzgdv) ny2Var.b.zzb();
        }
        if (i == 3) {
            return (zzgdv) ny2Var.c.zzb();
        }
        s31.c();
        return null;
    }
}
