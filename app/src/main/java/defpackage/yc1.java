package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout a;

    public yc1(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        wc1 wc1Var = new wc1(swipeRefreshLayout, 1);
        swipeRefreshLayout.B = wc1Var;
        wc1Var.setDuration(150L);
        hn hnVar = swipeRefreshLayout.t;
        hnVar.a = null;
        hnVar.clearAnimation();
        swipeRefreshLayout.t.startAnimation(swipeRefreshLayout.B);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
