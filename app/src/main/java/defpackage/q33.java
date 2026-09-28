package defpackage;

import com.google.android.gms.internal.ads.f7;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q33 extends f7 {
    public static q33 q(ListenableFuture listenableFuture) {
        return listenableFuture instanceof q33 ? (q33) listenableFuture : new r33(listenableFuture);
    }
}
