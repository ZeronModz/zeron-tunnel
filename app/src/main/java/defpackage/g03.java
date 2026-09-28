package defpackage;

import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzika;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g03 implements zzgmu {
    public final zzika a;
    public final f6 b;
    public final long c;

    public g03(zzika zzikaVar, f6 f6Var, long j) {
        this.a = zzikaVar;
        this.b = f6Var;
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(r5 r5Var) {
        f6 f6Var = this.b;
        if (r5Var == null || r5Var.equals(r5.A())) {
            f6Var.b(15104);
            return true;
        }
        if (r5Var.x() != this.a.zzb()) {
            f6Var.b(15105);
            return true;
        }
        boolean z = (r5Var.v().w() * 1000) - System.currentTimeMillis() <= this.c;
        if (z) {
            f6Var.b(15106);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(r5 r5Var) {
        f6 f6Var = this.b;
        if (r5Var == null || r5Var.equals(r5.A())) {
            f6Var.b(15102);
            return false;
        }
        if (r5Var.x() == this.a.zzb()) {
            return true;
        }
        f6Var.b(15103);
        return false;
    }
}
