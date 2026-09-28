package defpackage;

import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzbms;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v52 extends zzblv {
    public final /* synthetic */ zzbms a;

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbln zzblnVar;
        zzbms zzbmsVar = this.a;
        if (zzbmsVar.b == null) {
            return;
        }
        synchronized (zzbmsVar) {
            zzblnVar = zzbmsVar.c;
            if (zzblnVar == null) {
                zzblnVar = new zzbln(zzblmVar);
                zzbmsVar.c = zzblnVar;
            }
        }
        zzbmsVar.b.zzc(zzblnVar, str);
    }
}
