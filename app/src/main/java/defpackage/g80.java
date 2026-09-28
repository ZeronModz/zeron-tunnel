package defpackage;

import android.graphics.Rect;
import androidx.customview.widget.FocusStrategy$BoundsAdapter;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements Comparator {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final boolean c;
    public final FocusStrategy$BoundsAdapter d;

    public g80(boolean z, FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter) {
        this.c = z;
        this.d = focusStrategy$BoundsAdapter;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        FocusStrategy$BoundsAdapter focusStrategy$BoundsAdapter = this.d;
        Rect rect = this.a;
        focusStrategy$BoundsAdapter.obtainBounds(obj, rect);
        Rect rect2 = this.b;
        focusStrategy$BoundsAdapter.obtainBounds(obj2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
