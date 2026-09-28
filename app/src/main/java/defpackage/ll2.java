package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdca;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ll2 implements zzdca {
    public final zzcjl a;

    public ll2(zzcjl zzcjlVar) {
        this.a = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(Context context) {
        zzcjl zzcjlVar = this.a;
        if (zzcjlVar != null) {
            zzcjlVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(Context context) {
        zzcjl zzcjlVar = this.a;
        if (zzcjlVar != null) {
            zzcjlVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(Context context) {
        zzcjl zzcjlVar = this.a;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }
}
