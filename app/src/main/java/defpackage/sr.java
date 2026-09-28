package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sr implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ sr(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                ((CoordinatorLayout) viewGroup).i(0);
                break;
            default:
                h hVar = (h) viewGroup;
                hVar.postInvalidateOnAnimation();
                ViewGroup viewGroup2 = hVar.a;
                if (viewGroup2 != null && (view = hVar.b) != null) {
                    viewGroup2.endViewTransition(view);
                    hVar.a.postInvalidateOnAnimation();
                    hVar.a = null;
                    hVar.b = null;
                }
                break;
        }
        return true;
    }
}
