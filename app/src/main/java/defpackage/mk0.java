package defpackage;

import com.google.common.math.LinearTransformation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mk0 extends LinearTransformation {
    public final double a;
    public final double b;

    public mk0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final String toString() {
        return String.format("y = %g * x + %g", Double.valueOf(this.a), Double.valueOf(this.b));
    }
}
