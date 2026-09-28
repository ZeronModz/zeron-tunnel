package defpackage;

import com.google.common.math.LinearTransformation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nk0 extends LinearTransformation {
    public final double a;

    public nk0(double d) {
        this.a = d;
    }

    public final String toString() {
        return String.format("x = %g", Double.valueOf(this.a));
    }
}
