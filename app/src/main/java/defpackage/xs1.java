package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xs1 {
    public final s5 a;
    public final Feature b;

    public /* synthetic */ xs1(s5 s5Var, Feature feature) {
        this.a = s5Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof xs1)) {
            return false;
        }
        xs1 xs1Var = (xs1) obj;
        return dn0.p(this.a, xs1Var.a) && dn0.p(this.b, xs1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        y6 y6Var = new y6(this);
        y6Var.c(this.a, "key");
        y6Var.c(this.b, "feature");
        return y6Var.toString();
    }
}
