package defpackage;

import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzcen;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l72 {
    public final zzbsl a;
    public ListenableFuture b;

    public l72(zzbsl zzbslVar) {
        this.a = zzbslVar;
    }

    public final void a() {
        if (this.b == null) {
            zzcen zzcenVar = new zzcen();
            this.b = zzcenVar;
            this.a.b().a(new k72(zzcenVar), new rb0(zzcenVar, 28));
        }
    }
}
