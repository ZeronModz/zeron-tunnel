package defpackage;

import android.view.View;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 extends ViewPropertyAnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public nf1(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
        this.a = 1;
        this.d = viewPropertyAnimatorCompatSet;
        this.b = false;
        this.c = 0;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((ToolbarWidgetWrapper) obj).a.setVisibility(this.c);
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = (ViewPropertyAnimatorCompatSet) obj;
                if (i2 == viewPropertyAnimatorCompatSet.a.size()) {
                    ViewPropertyAnimatorListener viewPropertyAnimatorListener = viewPropertyAnimatorCompatSet.d;
                    if (viewPropertyAnimatorListener != null) {
                        viewPropertyAnimatorListener.onAnimationEnd(null);
                    }
                    this.c = 0;
                    this.b = false;
                    viewPropertyAnimatorCompatSet.e = false;
                }
                break;
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((ToolbarWidgetWrapper) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ViewPropertyAnimatorListener viewPropertyAnimatorListener = ((ViewPropertyAnimatorCompatSet) obj).d;
                    if (viewPropertyAnimatorListener != null) {
                        viewPropertyAnimatorListener.onAnimationStart(null);
                    }
                    break;
                }
                break;
        }
    }

    public nf1(ToolbarWidgetWrapper toolbarWidgetWrapper, int i) {
        this.a = 0;
        this.d = toolbarWidgetWrapper;
        this.c = i;
        this.b = false;
    }
}
