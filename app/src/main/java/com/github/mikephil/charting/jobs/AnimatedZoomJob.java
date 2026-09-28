package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ObjectPool$Poolable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.hz;
import defpackage.ou0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedZoomJob extends AnimatedViewPortJob implements Animator.AnimatorListener {
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final YAxis o;
    public final float p;
    public final Matrix q;

    static {
        ou0.a(8, new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L));
    }

    public AnimatedZoomJob(ViewPortHandler viewPortHandler, View view, Transformer transformer, YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        super(viewPortHandler, f2, f3, transformer, view, f4, f5, j);
        this.q = new Matrix();
        this.m = f6;
        this.n = f7;
        this.k = f8;
        this.l = f9;
        this.h.addListener(this);
        this.o = yAxis;
        this.p = f;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new AnimatedZoomJob(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.g).a();
        this.g.postInvalidate();
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.d;
        float f2 = this.i;
        float fK = hz.k(f, f2, 0.0f, f2);
        float f3 = this.j;
        float fK2 = hz.k(this.e, f3, 0.0f, f3);
        ViewPortHandler viewPortHandler = this.c;
        viewPortHandler.getClass();
        Matrix matrix = this.q;
        matrix.reset();
        matrix.set(viewPortHandler.a);
        matrix.setScale(fK, fK2);
        this.c.l(matrix, this.g, false);
        float f4 = this.o.y;
        ViewPortHandler viewPortHandler2 = this.c;
        float f5 = f4 / viewPortHandler2.j;
        float f6 = this.m - ((this.p / viewPortHandler2.i) / 2.0f);
        float f7 = this.k;
        float f8 = ((f6 - f7) * 0.0f) + f7;
        float[] fArr = this.b;
        fArr[0] = f8;
        float f9 = (f5 / 2.0f) + this.n;
        float f10 = this.l;
        fArr[1] = ((f9 - f10) * 0.0f) + f10;
        this.f.g(fArr);
        this.c.n(fArr, matrix);
        this.c.l(matrix, this.g, true);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public final void b() {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
