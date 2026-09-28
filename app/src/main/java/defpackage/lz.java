package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.h;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lz extends AccessibilityDelegateCompat {
    public final /* synthetic */ int d;

    public /* synthetic */ lz(int i) {
        this.d = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int[] iArr = DrawerLayout.C;
                WeakHashMap weakHashMap = h.a;
                if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                    accessibilityNodeInfo.setParent(null);
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.n(null);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.u(false);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                accessibilityNodeInfoCompat.n(null);
                break;
        }
    }
}
