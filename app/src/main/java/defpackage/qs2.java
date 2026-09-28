package defpackage;

import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 implements zzfax {
    public final boolean a;

    public qs2(zzfgn zzfgnVar) {
        this.a = zzfgnVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return z.j(new ps2(this.a));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 36;
    }
}
