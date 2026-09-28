package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ws1 implements Runnable {
    public final /* synthetic */ rb0 a;

    public ws1(rb0 rb0Var) {
        this.a = rb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = ((zabq) this.a.b).b;
        client.disconnect(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
