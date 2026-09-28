package defpackage;

import android.util.Range;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class um1 {
    public static final Range a = new Range(0, Integer.MAX_VALUE);
    public static final Range b = new Range(0, Integer.MAX_VALUE);
    public static final d01 c;

    static {
        ic icVar = b01.c;
        c = d01.a(Arrays.asList(icVar, b01.b, b01.a), new ib(icVar, 1));
    }

    public static fd a() {
        fd fdVar = new fd();
        d01 d01Var = c;
        if (d01Var == null) {
            io0.e("Null qualitySelector");
            return null;
        }
        fdVar.a = d01Var;
        Range range = a;
        if (range == null) {
            io0.e("Null frameRate");
            return null;
        }
        fdVar.b = range;
        Range range2 = b;
        if (range2 == null) {
            io0.e("Null bitrate");
            return null;
        }
        fdVar.c = range2;
        fdVar.d = -1;
        return fdVar;
    }
}
