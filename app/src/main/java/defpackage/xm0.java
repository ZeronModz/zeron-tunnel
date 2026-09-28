package defpackage;

import com.github.mikephil.charting.utils.ObjectPool$Poolable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 extends ObjectPool$Poolable {
    public static final ou0 d;
    public double b = 0.0d;
    public double c = 0.0d;

    static {
        ou0 ou0VarA = ou0.a(64, new xm0());
        d = ou0VarA;
        ou0VarA.f = 0.5f;
    }

    public static xm0 b(double d2, double d3) {
        xm0 xm0Var = (xm0) d.b();
        xm0Var.b = d2;
        xm0Var.c = d3;
        return xm0Var;
    }

    public static void c(xm0 xm0Var) {
        d.c(xm0Var);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new xm0();
    }

    public final String toString() {
        return "MPPointD, x: " + this.b + ", y: " + this.c;
    }
}
