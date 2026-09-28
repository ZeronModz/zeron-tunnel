package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jv0 {
    public final OutputConfiguration a;
    public String b;
    public boolean c;
    public long d = 1;

    public jv0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jv0)) {
            return false;
        }
        jv0 jv0Var = (jv0) obj;
        return this.a.equals(jv0Var.a) && this.c == jv0Var.c && this.d == jv0Var.d && Objects.equals(this.b, jv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (this.c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i2 = (i << 5) - i;
        String str = this.b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
