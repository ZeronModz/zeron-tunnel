package defpackage;

import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oq1 {
    public final WindowInsetsCompat a;
    public og0[] b;

    public oq1() {
        this(new WindowInsetsCompat((WindowInsetsCompat) null));
    }

    public final void a() {
        og0[] og0VarArr = this.b;
        if (og0VarArr != null) {
            og0 og0VarG = og0VarArr[0];
            og0 og0VarG2 = og0VarArr[1];
            WindowInsetsCompat windowInsetsCompat = this.a;
            if (og0VarG2 == null) {
                og0VarG2 = windowInsetsCompat.a.g(2);
            }
            if (og0VarG == null) {
                og0VarG = windowInsetsCompat.a.g(1);
            }
            g(og0.a(og0VarG, og0VarG2));
            og0 og0Var = this.b[sq1.a(16)];
            if (og0Var != null) {
                f(og0Var);
            }
            og0 og0Var2 = this.b[sq1.a(32)];
            if (og0Var2 != null) {
                d(og0Var2);
            }
            og0 og0Var3 = this.b[sq1.a(64)];
            if (og0Var3 != null) {
                h(og0Var3);
            }
        }
    }

    public abstract WindowInsetsCompat b();

    public void c(int i, og0 og0Var) {
        if (this.b == null) {
            this.b = new og0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[sq1.a(i2)] = og0Var;
            }
        }
    }

    public abstract void e(og0 og0Var);

    public abstract void g(og0 og0Var);

    public oq1(WindowInsetsCompat windowInsetsCompat) {
        this.a = windowInsetsCompat;
    }

    public void d(og0 og0Var) {
    }

    public void f(og0 og0Var) {
    }

    public void h(og0 og0Var) {
    }
}
