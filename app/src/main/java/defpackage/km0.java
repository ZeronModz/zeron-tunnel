package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class km0 {
    public static int a = 3;

    public static void a(String str) {
        e(3, f(str));
    }

    public static void b(String str) {
        e(6, f(str));
    }

    public static void c(String str) {
        e(6, f(str));
    }

    public static boolean d(String str) {
        return e(3, f(str));
    }

    public static boolean e(int i, String str) {
        return a <= i || Log.isLoggable(str, i);
    }

    public static String f(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void g(String str) {
        e(5, f(str));
    }

    public static void h(String str) {
        e(5, f(str));
    }
}
