package defpackage;

import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hr2 implements zzfax {
    public final zzgzy a;
    public final cu2 b;
    public final int c;

    public hr2(zzgzy zzgzyVar, cu2 cu2Var, int i) {
        this.a = zzgzyVar;
        this.b = cu2Var;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.a.zzc(new hc0(this, 10));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 5;
    }
}
