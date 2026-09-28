package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.internal.NavigationMenuPresenter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class at0 extends RecyclerViewAccessibilityDelegate {
    public final /* synthetic */ NavigationMenuPresenter f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(NavigationMenuPresenter navigationMenuPresenter, RecyclerView recyclerView) {
        super(recyclerView);
        this.f = navigationMenuPresenter;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.d(view, accessibilityNodeInfoCompat);
        NavigationMenuPresenter navigationMenuPresenter = this.f.f.g;
        int i = 0;
        for (int i2 = 0; i2 < navigationMenuPresenter.f.d.size(); i2++) {
            int iE = navigationMenuPresenter.f.e(i2);
            if (iE == 0 || iE == 1) {
                i++;
            }
        }
        accessibilityNodeInfoCompat.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
