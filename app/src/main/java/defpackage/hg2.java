package defpackage;

import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzdgl;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hg2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzcvx b;

    public /* synthetic */ hg2(zzcvx zzcvxVar, int i) {
        this.a = i;
        this.b = zzcvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzcvx zzcvxVar = this.b;
        switch (i) {
            case 0:
                zzdgl zzdglVar = zzcvxVar.b;
                return zzdglVar != null ? new zzdje(zzdglVar, g3.g) : new zzdje(new gg2(), g3.g);
            default:
                return zzcvxVar.b;
        }
    }
}
