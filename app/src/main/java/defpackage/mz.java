package defpackage;

import android.animation.ValueAnimator;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.camera.view.ScreenFlashView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.v2ray.ang.helper.SimpleItemTouchHelperCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DrawerLayout) obj).setScrimColor(oo.e(-1728053248, AnimationUtils.c(valueAnimator.getAnimatedFraction(), oz.a, 0)));
                break;
            case 1:
                ((b00) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((ClippableRoundedCornerLayout) obj).a(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                int i2 = ScreenFlashView.d;
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                km0.a("ScreenFlashView");
                ((ScreenFlashView) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((DrawerArrowDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ((FadeThroughDrawable) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
                int i3 = SimpleItemTouchHelperCallback.f;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                viewHolder.a.setTranslationX(fFloatValue);
                viewHolder.a.setAlpha(1.0f - (Math.abs(fFloatValue) / (r6.getWidth() * 0.25f)));
                break;
        }
    }
}
