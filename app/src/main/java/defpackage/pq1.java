package defpackage;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class pq1 extends o {
    public og0 n;

    public pq1(WindowInsetsCompat windowInsetsCompat, pq1 pq1Var) {
        super(windowInsetsCompat, pq1Var);
        this.n = null;
        this.n = pq1Var.n;
    }

    @Override // androidx.core.view.r
    public WindowInsetsCompat b() {
        return WindowInsetsCompat.g(null, this.c.consumeStableInsets());
    }

    @Override // androidx.core.view.r
    public WindowInsetsCompat c() {
        return WindowInsetsCompat.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.r
    public final og0 j() {
        og0 og0Var = this.n;
        if (og0Var != null) {
            return og0Var;
        }
        WindowInsets windowInsets = this.c;
        og0 og0VarC = og0.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.n = og0VarC;
        return og0VarC;
    }

    @Override // androidx.core.view.r
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override // androidx.core.view.r
    public void t(og0 og0Var) {
        this.n = og0Var;
    }

    public pq1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
        this.n = null;
    }
}
