package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 {
    public static vp0 i;
    public static final Object j = new Object();
    public vp0 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Object h;

    public static vp0 a(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        vp0 vp0Var;
        synchronized (j) {
            try {
                vp0Var = i;
                if (vp0Var == null) {
                    vp0Var = new vp0();
                } else {
                    i = vp0Var.a;
                    vp0Var.a = null;
                }
                vp0Var.b = i2;
                vp0Var.c = i3;
                vp0Var.d = i4;
                vp0Var.e = i5;
                vp0Var.f = i6;
                vp0Var.g = i7;
                vp0Var.h = obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vp0Var;
    }

    public final void b() {
        this.a = null;
        this.g = 0;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.h = null;
        synchronized (j) {
            try {
                vp0 vp0Var = i;
                if (vp0Var != null) {
                    this.a = vp0Var;
                }
                i = this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
