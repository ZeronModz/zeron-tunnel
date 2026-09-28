package defpackage;

import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 extends zzblv {
    public final /* synthetic */ zzbxf a;

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbxg zzbxgVar;
        zzbxf zzbxfVar = this.a;
        if (zzbxfVar.b == null) {
            return;
        }
        synchronized (zzbxfVar) {
            zzbxgVar = zzbxfVar.c;
            if (zzbxgVar == null) {
                zzbxgVar = new zzbxg(zzblmVar);
                zzbxfVar.c = zzbxgVar;
            }
        }
        zzbxfVar.b.onCustomClick(zzbxgVar, str);
    }
}
