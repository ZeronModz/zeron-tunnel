package defpackage;

import com.google.android.gms.internal.ads.zzidc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fd3 {
    public final Object a;
    public final int b;

    public fd3(int i, zzidc zzidcVar) {
        this.a = zzidcVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fd3)) {
            return false;
        }
        fd3 fd3Var = (fd3) obj;
        return this.a == fd3Var.a && this.b == fd3Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
