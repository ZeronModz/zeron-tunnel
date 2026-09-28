package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.h;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kz extends AccessibilityDelegateCompat {
    public final /* synthetic */ DrawerLayout d;

    public kz(DrawerLayout drawerLayout) {
        this.d = drawerLayout;
        new Rect();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.d;
        View viewG = drawerLayout.g();
        if (viewG == null) {
            return true;
        }
        int iJ = drawerLayout.j(viewG);
        WeakHashMap weakHashMap = h.a;
        Gravity.getAbsoluteGravity(iJ, drawerLayout.getLayoutDirection());
        return true;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int[] iArr = DrawerLayout.C;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfoCompat.l("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfoCompat.i(AccessibilityNodeInfoCompat.AccessibilityActionCompat.e);
        accessibilityNodeInfoCompat.i(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int[] iArr = DrawerLayout.C;
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
