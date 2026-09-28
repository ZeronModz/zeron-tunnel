package defpackage;

import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ng2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzcwv b;

    public /* synthetic */ ng2(zzcwv zzcwvVar, int i) {
        this.a = i;
        this.b = zzcwvVar;
    }

    public zzfjc a() {
        zzfjc zzfjcVar = this.b.a;
        k02.J(zzfjcVar);
        return zzfjcVar;
    }

    public tt2 b() {
        tt2 tt2Var = this.b.b;
        k02.J(tt2Var);
        return tt2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzcwv zzcwvVar = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = zzcwvVar.b;
                k02.J(tt2Var);
                return tt2Var;
            case 1:
                return zzcwvVar.c;
            case 2:
                return zzcwvVar.a();
            default:
                zzfjc zzfjcVar = zzcwvVar.a;
                k02.J(zzfjcVar);
                return zzfjcVar;
        }
    }
}
