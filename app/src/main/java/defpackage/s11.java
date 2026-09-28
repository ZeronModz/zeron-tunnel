package defpackage;

import okhttp3.internal.connection.RealCall;
import okio.AsyncTimeout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s11 extends AsyncTimeout {
    public final /* synthetic */ RealCall n;

    public s11(RealCall realCall) {
        this.n = realCall;
    }

    @Override // okio.AsyncTimeout
    public final void n() {
        this.n.cancel();
    }
}
