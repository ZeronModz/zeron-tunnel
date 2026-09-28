package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kq1 extends oq1 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public og0 d;

    public kq1() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.oq1
    public WindowInsetsCompat b() {
        a();
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, this.c);
        og0[] og0VarArr = this.b;
        r rVar = windowInsetsCompatG.a;
        rVar.q(og0VarArr);
        rVar.t(this.d);
        return windowInsetsCompatG;
    }

    @Override // defpackage.oq1
    public void e(og0 og0Var) {
        this.d = og0Var;
    }

    @Override // defpackage.oq1
    public void g(og0 og0Var) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(og0Var.a, og0Var.b, og0Var.c, og0Var.d);
        }
    }

    public kq1(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
        this.c = windowInsetsCompat.f();
    }
}
