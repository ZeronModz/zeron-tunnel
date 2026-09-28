package defpackage;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class so1 implements ViewUtils$OnApplyWindowInsetsListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rb0 d;

    public so1(boolean z, boolean z2, boolean z3, rb0 rb0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = rb0Var;
    }

    @Override // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        if (this.a) {
            viewUtils$RelativePadding.d = windowInsetsCompat.a() + viewUtils$RelativePadding.d;
        }
        boolean zF = wo1.f(view);
        if (this.b) {
            if (zF) {
                viewUtils$RelativePadding.c = windowInsetsCompat.b() + viewUtils$RelativePadding.c;
            } else {
                viewUtils$RelativePadding.a = windowInsetsCompat.b() + viewUtils$RelativePadding.a;
            }
        }
        if (this.c) {
            if (zF) {
                viewUtils$RelativePadding.a = windowInsetsCompat.c() + viewUtils$RelativePadding.a;
            } else {
                viewUtils$RelativePadding.c = windowInsetsCompat.c() + viewUtils$RelativePadding.c;
            }
        }
        int i = viewUtils$RelativePadding.a;
        int i2 = viewUtils$RelativePadding.b;
        int i3 = viewUtils$RelativePadding.c;
        int i4 = viewUtils$RelativePadding.d;
        WeakHashMap weakHashMap = h.a;
        view.setPaddingRelative(i, i2, i3, i4);
        this.d.onApplyWindowInsets(view, windowInsetsCompat, viewUtils$RelativePadding);
        return windowInsetsCompat;
    }
}
