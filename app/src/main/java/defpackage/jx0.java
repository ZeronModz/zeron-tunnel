package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jx0 {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        s31.c();
    }

    public static void b(boolean z, String str) {
        if (z) {
            return;
        }
        u7.r(str);
    }

    public static void c(float f, String str) {
        if (Float.isNaN(f)) {
            u7.r(str.concat(" must not be NaN"));
        } else if (Float.isInfinite(f)) {
            u7.r(str.concat(" must not be infinite"));
        }
    }

    public static void d(int i, int i2, String str, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void e(int i) {
        if (i >= 0) {
            return;
        }
        s31.c();
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        io0.e(str);
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        u7.p(str);
    }
}
