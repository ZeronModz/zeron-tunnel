package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h50 extends AnimatorListenerAdapter {
    public final /* synthetic */ CircularRevealWidget a;

    public h50(CircularRevealWidget circularRevealWidget) {
        this.a = circularRevealWidget;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CircularRevealWidget circularRevealWidget = this.a;
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        circularRevealWidget.setRevealInfo(revealInfo);
    }
}
