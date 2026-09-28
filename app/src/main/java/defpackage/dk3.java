package defpackage;

import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzsj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dk3 implements zzsj {
    public final /* synthetic */ zzsd a;

    public /* synthetic */ dk3(zzsd zzsdVar) {
        this.a = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        ii2.K(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zzb(final long j) {
        zzdy zzdyVar = new zzdy() { // from class: ck3
            @Override // com.google.android.gms.internal.ads.zzdy
            /* JADX INFO: renamed from: zza */
            public final /* synthetic */ void mo9zza(Object obj) {
                ((zzqa) obj).zza(j);
            }
        };
        zzed zzedVar = this.a.h;
        zzedVar.c(-1, zzdyVar);
        zzedVar.d();
    }
}
