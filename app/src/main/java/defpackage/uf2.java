package defpackage;

import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdeg;
import com.google.android.gms.internal.ads.zzdgc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf2 implements zzdgc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzdgc
    public final /* synthetic */ void zza() {
        zzm zzmVarZzL;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zzdeg) obj).zzc();
                break;
            default:
                zzcjl zzcjlVar = (zzcjl) obj;
                if (zzcjlVar != null && (zzmVarZzL = zzcjlVar.zzL()) != null) {
                    zzmVarZzL.zzb();
                    break;
                }
                break;
        }
    }
}
