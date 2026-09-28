package defpackage;

import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yl implements zzdy {
    public int a;
    public long b;
    public Object c;

    public yl(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        ((zzna) obj).zzm((zzmy) this.c, this.a, this.b);
    }
}
