package defpackage;

import com.google.android.gms.internal.ads.c3;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m72 implements zzgyw {
    public final ListenableFuture a;

    public m72(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        return z.Z(this.a, new c3(this, obj), g3.g);
    }
}
