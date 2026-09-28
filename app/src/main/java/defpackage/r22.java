package defpackage;

import com.google.android.gms.internal.ads.i2;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.pa;
import com.google.android.gms.internal.ads.zzbgj$zzc;
import java.util.DesugarCollections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r22 extends pa implements zzbgj$zzc {
    @Override // com.google.android.gms.internal.ads.zzbgj$zzc
    public final List zza() {
        return DesugarCollections.unmodifiableList(((l2) this.b).zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgj$zzc
    public final int zzb() {
        return ((l2) this.b).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgj$zzc
    public final i2 zzc(int i) {
        return ((l2) this.b).zzc(i);
    }
}
