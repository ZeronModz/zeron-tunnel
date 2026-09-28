package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class qq1 extends pq1 {
    public qq1(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
        super(windowInsetsCompat, windowInsets);
    }

    @Override // androidx.core.view.r
    public WindowInsetsCompat a() {
        return WindowInsetsCompat.g(null, this.c.consumeDisplayCutout());
    }

    @Override // androidx.core.view.o, androidx.core.view.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq1)) {
            return false;
        }
        qq1 qq1Var = (qq1) obj;
        return Objects.equals(this.c, qq1Var.c) && Objects.equals(this.g, qq1Var.g) && o.A(this.h, qq1Var.h);
    }

    @Override // androidx.core.view.r
    public DisplayCutoutCompat f() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    @Override // androidx.core.view.r
    public int hashCode() {
        return this.c.hashCode();
    }

    public qq1(WindowInsetsCompat windowInsetsCompat, qq1 qq1Var) {
        super(windowInsetsCompat, qq1Var);
    }
}
