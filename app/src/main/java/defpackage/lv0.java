package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lv0 {
    public final OutputConfiguration a;
    public String b;
    public long c = 1;

    public lv0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lv0)) {
            return false;
        }
        lv0 lv0Var = (lv0) obj;
        return this.a.equals(lv0Var.a) && this.c == lv0Var.c && Objects.equals(this.b, lv0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        String str = this.b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
