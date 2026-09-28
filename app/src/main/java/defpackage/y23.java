package defpackage;

import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y23 extends a33 {
    @Override // defpackage.a33
    public final /* synthetic */ void r(Object obj) {
        l((ListenableFuture) obj);
    }

    @Override // defpackage.a33
    public final Object s(Object obj, Throwable th) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        ListenableFuture listenableFutureZza = zzgywVar.zza(th);
        if (listenableFutureZza != null) {
            return listenableFutureZza;
        }
        io0.e(mu.F("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar));
        return null;
    }
}
