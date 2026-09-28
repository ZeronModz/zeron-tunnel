package defpackage;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 implements OnApplyWindowInsetsListener {
    public final Object a;
    public final int b;
    public final int c;

    public /* synthetic */ cw1(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        View view2 = (View) this.a;
        int i = windowInsetsCompat.a.g(519).b;
        int i2 = this.b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return windowInsetsCompat;
    }

    public /* synthetic */ cw1(String str, int i, int i2, int i3, long j) {
        this.a = str;
        this.c = i;
        this.b = i2;
    }

    public cw1(View view, int i, int i2) {
        this.b = i;
        this.a = view;
        this.c = i2;
    }
}
