package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.preference.PreferenceGroupAdapter;
import androidx.preference.PreferenceRecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tx0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ PreferenceRecyclerViewAccessibilityDelegate d;

    public tx0(PreferenceRecyclerViewAccessibilityDelegate preferenceRecyclerViewAccessibilityDelegate) {
        this.d = preferenceRecyclerViewAccessibilityDelegate;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        PreferenceRecyclerViewAccessibilityDelegate preferenceRecyclerViewAccessibilityDelegate = this.d;
        preferenceRecyclerViewAccessibilityDelegate.g.d(view, accessibilityNodeInfoCompat);
        RecyclerView recyclerView = preferenceRecyclerViewAccessibilityDelegate.f;
        recyclerView.getClass();
        RecyclerView.ViewHolder viewHolderK = RecyclerView.K(view);
        int iB = viewHolderK != null ? viewHolderK.b() : -1;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof PreferenceGroupAdapter) {
            ((PreferenceGroupAdapter) adapter).w(iB);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean g(View view, int i, Bundle bundle) {
        return this.d.g.g(view, i, bundle);
    }
}
