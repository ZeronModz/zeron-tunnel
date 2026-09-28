package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u00 extends a {
    public final /* synthetic */ int a;

    public /* synthetic */ u00(int i) {
        this.a = i;
    }

    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.a) {
            case 0:
                RectF rectFA = a.a(tabLayout, view);
                RectF rectFA2 = a.a(tabLayout, view2);
                if (rectFA.left < rectFA2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(AnimationUtils.c(fSin, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, AnimationUtils.c(fCos, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFA3 = a.a(tabLayout, view);
                float fB = f < 0.5f ? AnimationUtils.b(1.0f, 0.0f, 0.0f, 0.5f, f) : AnimationUtils.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFA3.left, drawable.getBounds().top, (int) rectFA3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
