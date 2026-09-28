package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AnimatedViewPortJob extends ViewPortJob implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public final ObjectAnimator h;
    public final float i;
    public final float j;

    public AnimatedViewPortJob(ViewPortHandler viewPortHandler, float f, float f2, Transformer transformer, View view, float f3, float f4, long j) {
        super(viewPortHandler, f, f2, transformer, view);
        this.i = f3;
        this.j = f4;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, TypedValues.CycleType.S_WAVE_PHASE, 0.0f, 1.0f);
        this.h = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addUpdateListener(this);
        objectAnimatorOfFloat.addListener(this);
    }

    public abstract void b();

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        try {
            b();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        try {
            b();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }
}
