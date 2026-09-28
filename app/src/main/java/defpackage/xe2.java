package defpackage;

import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzdbf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 implements zzdbf {
    public final tt2 a;
    public final zzcdz b;

    public xe2(tt2 tt2Var, zzcdz zzcdzVar) {
        this.a = tt2Var;
        this.b = zzcdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        if (this.a.r0) {
            zzcdz zzcdzVar = this.b;
            synchronized (zzcdzVar.a) {
                zzcdzVar.d.c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }
}
