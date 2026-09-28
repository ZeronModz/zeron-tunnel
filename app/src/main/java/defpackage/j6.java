package defpackage;

import android.view.View;
import androidx.appcompat.app.k;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.h;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 extends ViewPropertyAnimatorListenerAdapter {
    public final /* synthetic */ k a;

    public j6(k kVar) {
        this.a = kVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        k kVar = this.a;
        kVar.v.setAlpha(1.0f);
        kVar.y.d(null);
        kVar.y = null;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        k kVar = this.a;
        kVar.v.setVisibility(0);
        if (kVar.v.getParent() instanceof View) {
            View view2 = (View) kVar.v.getParent();
            WeakHashMap weakHashMap = h.a;
            an1.c(view2);
        }
    }
}
