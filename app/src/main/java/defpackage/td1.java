package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 {
    public RemoteCall a;
    public boolean b;
    public Feature[] c;
    public int d;

    public final et1 a() {
        yg0.f(this.a != null, "execute parameter required");
        return new et1(this, this.c, this.b, this.d);
    }
}
