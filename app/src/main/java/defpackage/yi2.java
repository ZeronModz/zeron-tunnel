package defpackage;

import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdkr;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzdkr b;

    public /* synthetic */ yi2(zzdkr zzdkrVar, int i) {
        this.a = i;
        this.b = zzdkrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzdkr zzdkrVar = this.b;
        switch (i) {
            case 0:
                zzcjl zzcjlVar = zzdkrVar.b;
                if (zzcjlVar == null) {
                    return null;
                }
                return zzcjlVar.zzD();
            case 1:
                zzcjl zzcjlVar2 = zzdkrVar.b;
                if (zzcjlVar2 != null) {
                    return zzcjlVar2.zzD();
                }
                return null;
            default:
                return zzdkrVar.b;
        }
    }
}
