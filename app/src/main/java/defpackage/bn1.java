package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 implements View.OnApplyWindowInsetsListener {
    public WindowInsetsCompat a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ OnApplyWindowInsetsListener c;

    public bn1(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.b = view;
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (i < 30) {
            cn1.a(windowInsets, this.b);
            if (windowInsetsCompatG.equals(this.a)) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompatG).f();
            }
        }
        this.a = windowInsetsCompatG;
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompatG);
        if (i >= 30) {
            return windowInsetsCompatOnApplyWindowInsets.f();
        }
        WeakHashMap weakHashMap = h.a;
        an1.c(view);
        return windowInsetsCompatOnApplyWindowInsets.f();
    }
}
