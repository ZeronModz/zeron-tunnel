package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzdnb;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hj2 implements zzboh {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public /* synthetic */ hj2(zzdnb zzdnbVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(zzdnbVar);
                break;
            default:
                this.b = new WeakReference(zzdnbVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                zzdnb zzdnbVar = (zzdnb) weakReference.get();
                if (zzdnbVar != null) {
                    ri2 ri2Var = zzdnbVar.i;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        zzdnbVar.h.onAdClicked();
                        if (((Boolean) zzbd.zzc().a(p32.jc)).booleanValue()) {
                            ri2Var.zzdu();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                ri2Var.zzdQ();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                zzdnb zzdnbVar2 = (zzdnb) weakReference.get();
                if (zzdnbVar2 != null) {
                    ri2 ri2Var2 = zzdnbVar2.i;
                    zzdnbVar2.h.onAdClicked();
                    if (((Boolean) zzbd.zzc().a(p32.jc)).booleanValue()) {
                        ri2Var2.zzdu();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            ri2Var2.zzdQ();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
