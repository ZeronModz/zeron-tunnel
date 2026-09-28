package defpackage;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l82 extends zzbly {
    public final /* synthetic */ zzbxf a;

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbxg zzbxgVar;
        zzbxf zzbxfVar = this.a;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = zzbxfVar.a;
        synchronized (zzbxfVar) {
            zzbxgVar = zzbxfVar.c;
            if (zzbxgVar == null) {
                zzbxgVar = new zzbxg(zzblmVar);
                zzbxfVar.c = zzbxgVar;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzbxgVar);
    }
}
