package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool$Poolable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.hz;
import defpackage.ou0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedMoveViewJob extends AnimatedViewPortJob {
    public static final ou0 k;

    static {
        ou0 ou0VarA = ou0.a(4, new AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        k = ou0VarA;
        ou0VarA.f = 0.5f;
    }

    public AnimatedMoveViewJob(ViewPortHandler viewPortHandler, float f, float f2, Transformer transformer, View view, float f3, float f4, long j) {
        super(viewPortHandler, f, f2, transformer, view, f3, f4, j);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new AnimatedMoveViewJob(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob
    public final void b() {
        k.c(this);
    }

    @Override // com.github.mikephil.charting.jobs.AnimatedViewPortJob, android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.d;
        float f2 = this.i;
        float fK = hz.k(f, f2, 0.0f, f2);
        float[] fArr = this.b;
        fArr[0] = fK;
        float f3 = this.j;
        fArr[1] = hz.k(this.e, f3, 0.0f, f3);
        this.f.g(fArr);
        this.c.a(this.g, fArr);
    }
}
