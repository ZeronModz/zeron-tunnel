package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.r;
import com.github.mikephil.charting.charts.Chart;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.transition.platform.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable = ((BottomSheetBehavior) obj).i;
                if (materialShapeDrawable != null) {
                    materialShapeDrawable.n(fFloatValue);
                }
                break;
            case 1:
                ((Chart) obj).postInvalidate();
                break;
            case 2:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                ((View) obj).invalidate();
                break;
            case 4:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                r rVar = (r) obj;
                rVar.c.setAlpha(iFloatValue);
                rVar.d.setAlpha(iFloatValue);
                rVar.s.invalidate();
                break;
            case 5:
                d dVar = (d) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i2 = d.J;
                if (dVar.I != animatedFraction) {
                    dVar.d(animatedFraction);
                }
                break;
            case 6:
                com.google.android.material.transition.d dVar2 = (com.google.android.material.transition.d) obj;
                float animatedFraction2 = valueAnimator.getAnimatedFraction();
                int i3 = com.google.android.material.transition.d.J;
                if (dVar2.I != animatedFraction2) {
                    dVar2.d(animatedFraction2);
                }
                break;
            case 7:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 8:
                ((TextInputLayout) obj).v0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
