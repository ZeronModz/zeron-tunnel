package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e7 extends ResourcesCompat$FontCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ k7 d;

    public e7(k7 k7Var, int i, int i2, WeakReference weakReference) {
        this.d = k7Var;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void c(Typeface typeface) {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = j7.a(typeface, i, (this.b & 2) != 0);
        }
        k7 k7Var = this.d;
        if (k7Var.m) {
            k7Var.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i3 = k7Var.j;
                if (zIsAttachedToWindow) {
                    textView.post(new f7(textView, typeface, i3, i2));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }

    @Override // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void b(int i) {
    }
}
