package defpackage;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class lq1 extends oq1 {
    public final WindowInsets.Builder c;

    public lq1(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
        WindowInsets windowInsetsF = windowInsetsCompat.f();
        this.c = windowInsetsF != null ? z1.b(windowInsetsF) : z1.a();
    }

    @Override // defpackage.oq1
    public WindowInsetsCompat b() {
        a();
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, this.c.build());
        windowInsetsCompatG.a.q(this.b);
        return windowInsetsCompatG;
    }

    @Override // defpackage.oq1
    public void d(og0 og0Var) {
        this.c.setMandatorySystemGestureInsets(og0Var.e());
    }

    @Override // defpackage.oq1
    public void e(og0 og0Var) {
        this.c.setStableInsets(og0Var.e());
    }

    @Override // defpackage.oq1
    public void f(og0 og0Var) {
        this.c.setSystemGestureInsets(og0Var.e());
    }

    @Override // defpackage.oq1
    public void g(og0 og0Var) {
        this.c.setSystemWindowInsets(og0Var.e());
    }

    @Override // defpackage.oq1
    public void h(og0 og0Var) {
        this.c.setTappableElementInsets(og0Var.e());
    }

    public lq1() {
        this.c = z1.a();
    }
}
