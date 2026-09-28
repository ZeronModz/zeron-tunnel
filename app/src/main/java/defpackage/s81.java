package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.h;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 extends AccessibilityDelegateCompat {
    public final Rect d = new Rect();
    public final /* synthetic */ SlidingPaneLayout e;

    public s81(SlidingPaneLayout slidingPaneLayout) {
        this.e = slidingPaneLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
        Rect rect = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
        accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
        accessibilityNodeInfoCompat.l(accessibilityNodeInfoObtain.getClassName());
        accessibilityNodeInfoCompat.p(accessibilityNodeInfoObtain.getContentDescription());
        accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
        accessibilityNodeInfoCompat.m(accessibilityNodeInfoObtain.isClickable());
        accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
        accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
        accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
        accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
        accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
        accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
        accessibilityNodeInfoCompat.l("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        accessibilityNodeInfoCompat.b = -1;
        accessibilityNodeInfo.setSource(view);
        WeakHashMap weakHashMap = h.a;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            accessibilityNodeInfo.setParent((View) parentForAccessibility);
        }
        SlidingPaneLayout slidingPaneLayout = this.e;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = slidingPaneLayout.getChildAt(i);
            if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                accessibilityNodeInfo.addChild(childAt);
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.e.b(view)) {
            return false;
        }
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
