package defpackage;

import android.view.View;
import androidx.customview.widget.ViewDragHelper$Callback;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lf extends ViewDragHelper$Callback {
    public final /* synthetic */ BottomSheetBehavior a;

    public lf(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper$Callback
    public final int a(int i, View view) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.ViewDragHelper$Callback
    public final int b(int i, View view) {
        return qj1.p(i, this.a.A(), d());
    }

    @Override // androidx.customview.widget.ViewDragHelper$Callback
    public final int d() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }

    @Override // androidx.customview.widget.ViewDragHelper$Callback
    public final void h(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.G(1);
            }
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper$Callback
    public final void i(View view, int i, int i2) {
        this.a.w(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // androidx.customview.widget.ViewDragHelper$Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf.j(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean k(int i, View view) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.L;
        if (i2 == 1 || bottomSheetBehavior.c0) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.a0 == i) {
            WeakReference weakReference = bottomSheetBehavior.W;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
