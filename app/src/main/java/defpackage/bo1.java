package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bo1 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo1(ViewPager2 viewPager2, Context context) {
        super(context);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(RecyclerView.State state, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.D0(state, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void U(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.U(recycler, state, accessibilityNodeInfoCompat);
        this.E.t.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void W(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int iF;
        ViewPager2 viewPager2 = this.E.t.d;
        int iF2 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.g.getClass();
            iF = RecyclerView.LayoutManager.F(view);
        } else {
            iF = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.g.getClass();
            iF2 = RecyclerView.LayoutManager.F(view);
        }
        accessibilityNodeInfoCompat.o(y1.b(iF, 1, iF2, false, false, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean j0(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
        this.E.t.getClass();
        return super.j0(recycler, state, i, bundle);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
