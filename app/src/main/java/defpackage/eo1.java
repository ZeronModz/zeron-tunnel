package defpackage;

import android.R;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.h;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 extends zn1 {
    public final co1 a = new co1(this);
    public final do1 b = new do1(this);
    public xn1 c;
    public final /* synthetic */ ViewPager2 d;

    public eo1(ViewPager2 viewPager2) {
        this.d = viewPager2;
    }

    public final void a() {
        int iC;
        int i = R.id.accessibilityActionPageLeft;
        ViewPager2 viewPager2 = this.d;
        h.m(R.id.accessibilityActionPageLeft, viewPager2);
        h.j(0, viewPager2);
        h.m(R.id.accessibilityActionPageRight, viewPager2);
        h.j(0, viewPager2);
        h.m(R.id.accessibilityActionPageUp, viewPager2);
        h.j(0, viewPager2);
        h.m(R.id.accessibilityActionPageDown, viewPager2);
        h.j(0, viewPager2);
        if (viewPager2.getAdapter() == null || (iC = viewPager2.getAdapter().c()) == 0 || !viewPager2.r) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        do1 do1Var = this.b;
        co1 co1Var = this.a;
        if (orientation != 0) {
            if (viewPager2.d < iC - 1) {
                h.n(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, (CharSequence) null), null, co1Var);
            }
            if (viewPager2.d > 0) {
                h.n(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, (CharSequence) null), null, do1Var);
                return;
            }
            return;
        }
        boolean zB = viewPager2.b();
        int i2 = zB ? 16908360 : 16908361;
        if (zB) {
            i = 16908361;
        }
        if (viewPager2.d < iC - 1) {
            h.n(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, (CharSequence) null), null, co1Var);
        }
        if (viewPager2.d > 0) {
            h.n(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, (CharSequence) null), null, do1Var);
        }
    }
}
