package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vo1 {
    public static final cp1 a;
    public static final bm b;
    public static final bm c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new dp1();
        } else {
            a = new cp1();
        }
        b = new bm("translationAlpha", 14, Float.class);
        c = new bm("clipBounds", 15, Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.a0(view, i, i2, i3, i4);
    }

    public static void b(View view, float f) {
        a.w(view, f);
    }

    public static void c(View view, int i) {
        a.b0(view, i);
    }
}
