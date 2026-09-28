package defpackage;

import android.animation.Animator;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jn implements Animator.AnimatorListener {
    public final /* synthetic */ kn a;
    public final /* synthetic */ CircularProgressDrawable b;

    public jn(CircularProgressDrawable circularProgressDrawable, kn knVar) {
        this.b = circularProgressDrawable;
        this.a = knVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        CircularProgressDrawable circularProgressDrawable = this.b;
        kn knVar = this.a;
        circularProgressDrawable.a(1.0f, knVar, true);
        knVar.k = knVar.e;
        knVar.l = knVar.f;
        knVar.m = knVar.g;
        knVar.a((knVar.j + 1) % knVar.i.length);
        if (!circularProgressDrawable.f) {
            circularProgressDrawable.e += 1.0f;
            return;
        }
        circularProgressDrawable.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (knVar.n) {
            knVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
