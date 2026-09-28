package defpackage;

import android.view.View;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.appcompat.app.k;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.h;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 extends ViewPropertyAnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dq1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        View view2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                WindowDecorActionBar windowDecorActionBar = (WindowDecorActionBar) obj;
                if (windowDecorActionBar.q && (view2 = windowDecorActionBar.h) != null) {
                    view2.setTranslationY(0.0f);
                    windowDecorActionBar.e.setTranslationY(0.0f);
                }
                windowDecorActionBar.e.setVisibility(8);
                windowDecorActionBar.e.setTransitioning(false);
                windowDecorActionBar.u = null;
                ActionMode.Callback callback = windowDecorActionBar.l;
                if (callback != null) {
                    callback.onDestroyActionMode(windowDecorActionBar.k);
                    windowDecorActionBar.k = null;
                    windowDecorActionBar.l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = windowDecorActionBar.d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = h.a;
                    an1.c(actionBarOverlayLayout);
                }
                break;
            case 1:
                WindowDecorActionBar windowDecorActionBar2 = (WindowDecorActionBar) obj;
                windowDecorActionBar2.u = null;
                windowDecorActionBar2.e.requestLayout();
                break;
            default:
                k kVar = ((i6) obj).a;
                kVar.v.setAlpha(1.0f);
                kVar.y.d(null);
                kVar.y = null;
                break;
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view) {
        switch (this.a) {
            case 2:
                ((i6) this.b).a.v.setVisibility(0);
                break;
        }
    }
}
