package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.l;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Matrix h;
    public final /* synthetic */ l i;

    public i70(l lVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.i = lVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l lVar = this.i;
        FloatingActionButton floatingActionButton = lVar.u;
        floatingActionButton.setAlpha(AnimationUtils.b(this.a, this.b, 0.0f, 0.2f, fFloatValue));
        float f = this.c;
        float f2 = this.d;
        floatingActionButton.setScaleX(AnimationUtils.a(f, f2, fFloatValue));
        floatingActionButton.setScaleY(AnimationUtils.a(this.e, f2, fFloatValue));
        float f3 = this.f;
        float f4 = this.g;
        lVar.o = AnimationUtils.a(f3, f4, fFloatValue);
        float fA = AnimationUtils.a(f3, f4, fFloatValue);
        Matrix matrix = this.h;
        lVar.a(fA, matrix);
        floatingActionButton.setImageMatrix(matrix);
    }
}
