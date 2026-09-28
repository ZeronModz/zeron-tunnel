package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf1 {
    public gf1() {
        new HashMap();
    }

    public static gf1 a(double d, double d2) {
        nc0 nc0VarA = nc0.a(d, d2, 50.0d);
        double dAbs = Math.abs(nc0VarA.b - d2);
        for (double d3 = 1.0d; d3 < 50.0d && Math.round(d2) != Math.round(nc0VarA.b); d3 += 1.0d) {
            nc0 nc0VarA2 = nc0.a(d, d2, 50.0d + d3);
            double dAbs2 = Math.abs(nc0VarA2.b - d2);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                nc0VarA = nc0VarA2;
            }
            nc0 nc0VarA3 = nc0.a(d, d2, 50.0d - d3);
            double dAbs3 = Math.abs(nc0VarA3.b - d2);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                nc0VarA = nc0VarA3;
            }
        }
        return new gf1();
    }
}
