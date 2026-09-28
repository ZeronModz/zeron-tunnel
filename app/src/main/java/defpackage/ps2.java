package defpackage;

import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzfav;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ps2 implements zzfav {
    public final boolean a;

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        if (this.a) {
            zzdahVar.a.putBoolean("sdk_prefetch", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final void zzb(Object obj) {
    }
}
