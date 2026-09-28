package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.l;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.transition.Transition;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public nz(Transition transition, ArrayMap arrayMap) {
        this.a = 2;
        this.c = transition;
        this.b = arrayMap;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((ViewPropertyAnimatorListener) this.b).onAnimationCancel((View) this.c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) obj2;
                drawerLayout.c((NavigationView) obj, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 1:
                ((CircularRevealWidget) obj2).setCircularRevealOverlayDrawable(null);
                break;
            case 2:
                ((ArrayMap) obj2).remove(animator);
                ((Transition) obj).n.remove(animator);
                break;
            case 3:
                ((ViewPropertyAnimatorListener) obj2).onAnimationEnd((View) obj);
                break;
            default:
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) obj2;
                windowInsetsAnimationCompat.a.e(1.0f);
                l.f((View) obj, windowInsetsAnimationCompat);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                ((CircularRevealWidget) obj).setCircularRevealOverlayDrawable((Drawable) obj2);
                break;
            case 2:
                ((Transition) obj2).n.add(animator);
                break;
            case 3:
                ((ViewPropertyAnimatorListener) obj).onAnimationStart((View) obj2);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ nz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
