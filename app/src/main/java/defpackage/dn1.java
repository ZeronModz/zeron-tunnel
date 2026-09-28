package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dn1 {
    public static WindowInsetsCompat a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, rootWindowInsets);
        r rVar = windowInsetsCompatG.a;
        rVar.s(windowInsetsCompatG);
        rVar.d(view.getRootView());
        return windowInsetsCompatG;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
