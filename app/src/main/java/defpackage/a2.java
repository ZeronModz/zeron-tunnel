package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends AccessibilityNodeProvider {
    public final AccessibilityNodeProviderCompat a;

    public a2(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
        this.a = accessibilityNodeProviderCompat;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatA = this.a.a(i);
        if (accessibilityNodeInfoCompatA == null) {
            return null;
        }
        return accessibilityNodeInfoCompatA.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatB = this.a.b(i);
        if (accessibilityNodeInfoCompatB == null) {
            return null;
        }
        return accessibilityNodeInfoCompatB.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.c(i, i2, bundle);
    }
}
