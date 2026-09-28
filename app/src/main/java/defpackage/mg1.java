package defpackage;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mg1 {
    public static final RectF a = new RectF();

    public static View a(int i, View view) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        u7.r(hz.t(resourceName, " is not a valid ancestor"));
        return null;
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static float c(float f, float f2, float f3) {
        return hz.k(f2, f, f3, f);
    }

    public static float d(float f, float f2, float f3, float f4, float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : c(f, f2, (f5 - f3) / (f4 - f3)) : c(f, f2, f5);
    }

    public static int e(float f, float f2, float f3, int i, int i2) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) c(i, i2, (f3 - f) / (f2 - f));
    }
}
