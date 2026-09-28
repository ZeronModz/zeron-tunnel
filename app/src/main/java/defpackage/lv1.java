package defpackage;

import android.os.Trace;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.zzadp;
import com.google.android.gms.internal.ads.zzuk;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lv1 implements zzadp {
    public final /* synthetic */ zzuk a;
    public final /* synthetic */ int b;
    public final /* synthetic */ g c;

    public lv1(g gVar, zzuk zzukVar, int i, long j) {
        this.a = zzukVar;
        this.b = i;
        this.c = gVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zza(long j) {
        this.c.c0(this.a, this.b, j);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzb() {
        Trace.beginSection("dropVideoBuffer");
        this.a.zzc(this.b, false);
        Trace.endSection();
        this.c.a0(0, 1);
    }
}
