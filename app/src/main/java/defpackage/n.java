package defpackage;

import android.view.View;
import androidx.appcompat.widget.a;
import androidx.core.view.ViewPropertyAnimatorListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ViewPropertyAnimatorListener {
    public int a;
    public boolean b;
    public Object c;

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view) {
        this.b = true;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationEnd(View view) {
        if (this.b) {
            return;
        }
        a aVar = (a) this.c;
        aVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.b = false;
    }
}
