package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdqe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oj2 implements zzbde {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzdoc b;

    public oj2(zzdoc zzdocVar, String str) {
        this.a = str;
        this.b = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        if (!((Boolean) zzbd.zzc().a(p32.p2)).booleanValue()) {
            if (zzbddVar.j) {
                zzdoc zzdocVar = this.b;
                if (zzdocVar.w != null) {
                    zzdocVar.H.put(this.a, Boolean.TRUE);
                    zzdqe zzdqeVar = zzdocVar.w;
                    if (zzdqeVar == null) {
                        return;
                    }
                    zzdocVar.v(zzdqeVar.zzdE(), zzdqeVar.zzj(), zzdqeVar.zzk(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzbddVar.j) {
                    zzdoc zzdocVar2 = this.b;
                    if (zzdocVar2.w != null) {
                        zzdocVar2.H.put(this.a, Boolean.TRUE);
                        zzdqe zzdqeVar2 = zzdocVar2.w;
                        if (zzdqeVar2 == null) {
                        } else {
                            zzdocVar2.v(zzdqeVar2.zzdE(), zzdocVar2.w.zzj(), zzdocVar2.w.zzk(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
