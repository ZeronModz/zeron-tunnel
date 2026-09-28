package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 {
    public final OutputConfiguration a;
    public long b = 1;

    public nv0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nv0)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        return this.a.equals(nv0Var.a) && this.b == nv0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((iHashCode << 5) - iHashCode);
    }
}
