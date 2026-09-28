package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.h;
import androidx.customview.widget.ExploreByTouchHelper;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u40 extends AccessibilityNodeProviderCompat {
    public final /* synthetic */ ExploreByTouchHelper b;

    public u40(ExploreByTouchHelper exploreByTouchHelper) {
        this.b = exploreByTouchHelper;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final AccessibilityNodeInfoCompat a(int i) {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.b.r(i).a));
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final AccessibilityNodeInfoCompat b(int i) {
        ExploreByTouchHelper exploreByTouchHelper = this.b;
        int i2 = i == 2 ? exploreByTouchHelper.k : exploreByTouchHelper.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        ExploreByTouchHelper exploreByTouchHelper = this.b;
        View view = exploreByTouchHelper.i;
        if (i == -1) {
            WeakHashMap weakHashMap = h.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return exploreByTouchHelper.w(i);
        }
        if (i2 == 2) {
            return exploreByTouchHelper.j(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return exploreByTouchHelper.s(i, i2, bundle);
            }
            if (exploreByTouchHelper.k != i) {
                return false;
            }
            exploreByTouchHelper.k = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            view.invalidate();
            exploreByTouchHelper.x(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = exploreByTouchHelper.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = exploreByTouchHelper.k) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            exploreByTouchHelper.k = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            view.invalidate();
            exploreByTouchHelper.x(i3, 65536);
        }
        exploreByTouchHelper.k = i;
        view.invalidate();
        exploreByTouchHelper.x(i, AttribFlags.SSH_FILEXFER_ATTR_CTIME);
        return true;
    }
}
