package defpackage;

import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzmb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h92 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public h92(zzd zzdVar, long j) {
        this.a = 0;
        this.b = j;
        Objects.requireNonNull(zzdVar);
        this.c = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zzd) obj).g(j);
                break;
            case 1:
                ((zzcjw) obj).a.zzu(true, j);
                break;
            case 2:
                r rVar = ((w) obj).a;
                f63 f63Var = rVar.e;
                r.f(f63Var);
                f63Var.k.b(j);
                m mVar = rVar.f;
                r.h(mVar);
                mVar.m.b(Long.valueOf(j), "Session timeout duration set");
                break;
            case 3:
                zzmb zzmbVar = (zzmb) obj;
                zzd zzdVar = zzmbVar.a.n;
                r.e(zzdVar);
                zzdVar.d(j);
                zzmbVar.e = null;
                break;
            default:
                zzrb zzrbVar = (zzrb) obj;
                zzrbVar.getClass();
                String str = wt2.a;
                zzrbVar.b.zzo(j);
                break;
        }
    }

    public /* synthetic */ h92(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public h92(w wVar, long j) {
        this.a = 2;
        this.b = j;
        Objects.requireNonNull(wVar);
        this.c = wVar;
    }

    public h92(zzmb zzmbVar, long j) {
        this.a = 3;
        this.b = j;
        Objects.requireNonNull(zzmbVar);
        this.c = zzmbVar;
    }
}
