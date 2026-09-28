package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ef extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public /* synthetic */ ef(BottomAppBar bottomAppBar, int i) {
        this.a = i;
        this.b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 1:
                int i2 = BottomAppBar.u0;
                bottomAppBar.W = null;
                break;
            case 2:
                int i3 = BottomAppBar.u0;
                bottomAppBar.m0 = false;
                bottomAppBar.a0 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 0:
                if (!bottomAppBar.m0) {
                    bottomAppBar.F(bottomAppBar.b0, bottomAppBar.n0);
                }
                break;
            case 1:
                int i2 = BottomAppBar.u0;
                break;
            case 2:
                int i3 = BottomAppBar.u0;
                break;
            default:
                bottomAppBar.s0.onAnimationStart(animator);
                View viewB = bottomAppBar.B();
                FloatingActionButton floatingActionButton = viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                }
                break;
        }
    }
}
