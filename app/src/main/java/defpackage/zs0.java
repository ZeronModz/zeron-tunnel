package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zs0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ d f;

    public zs0(d dVar, int i, boolean z) {
        this.f = dVar;
        this.d = i;
        this.e = z;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        NavigationMenuPresenter navigationMenuPresenter = this.f.g;
        int i = this.d;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (navigationMenuPresenter.f.e(i3) == 2 || navigationMenuPresenter.f.e(i3) == 3) {
                i2--;
            }
        }
        accessibilityNodeInfoCompat.o(y1.b(i2, 1, 1, this.e, view.isSelected(), 1));
    }
}
