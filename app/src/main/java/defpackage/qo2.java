package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qo2 {
    public final zzbzq a;

    public qo2(zzbzq zzbzqVar) {
        this.a = zzbzqVar;
    }

    public final void a() {
        ListenableFuture listenableFutureA = this.a.a();
        if (!((Boolean) zzbd.zzc().a(p32.L8)).booleanValue()) {
            cn0.b0(listenableFutureA, "persistFlags");
            return;
        }
        q43 q43Var = new q43("persistFlags", 7);
        listenableFutureA.addListener(new s33(0, listenableFutureA, q43Var), g3.g);
    }
}
