package defpackage;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class rq1 extends qq1 {
    public og0 o;
    public og0 p;
    public og0 q;

    public rq1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // androidx.core.view.r
    public og0 i() {
        og0 og0Var = this.p;
        if (og0Var != null) {
            return og0Var;
        }
        og0 og0VarD = og0.d(this.c.getMandatorySystemGestureInsets());
        this.p = og0VarD;
        return og0VarD;
    }

    @Override // androidx.core.view.r
    public og0 k() {
        og0 og0Var = this.o;
        if (og0Var != null) {
            return og0Var;
        }
        og0 og0VarD = og0.d(this.c.getSystemGestureInsets());
        this.o = og0VarD;
        return og0VarD;
    }

    @Override // androidx.core.view.r
    public og0 m() {
        og0 og0Var = this.q;
        if (og0Var != null) {
            return og0Var;
        }
        og0 og0VarD = og0.d(this.c.getTappableElementInsets());
        this.q = og0VarD;
        return og0VarD;
    }

    @Override // androidx.core.view.o, androidx.core.view.r
    public WindowInsetsCompat n(int i, int i2, int i3, int i4) {
        return WindowInsetsCompat.g(null, this.c.inset(i, i2, i3, i4));
    }

    public rq1(WindowInsetsCompat windowInsetsCompat, rq1 rq1Var) {
        super(windowInsetsCompat, rq1Var);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.pq1, androidx.core.view.r
    public void t(og0 og0Var) {
    }
}
