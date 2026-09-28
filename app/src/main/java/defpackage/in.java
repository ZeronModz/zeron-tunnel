package defpackage;

import android.animation.ValueAnimator;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import me.ibrahimsn.lib.BottomBarItem;
import me.ibrahimsn.lib.SmoothBottomBar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class in implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public in(SmoothBottomBar smoothBottomBar, BottomBarItem bottomBarItem) {
        this.b = smoothBottomBar;
        this.c = bottomBarItem;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable circularProgressDrawable = (CircularProgressDrawable) obj2;
                kn knVar = (kn) obj;
                CircularProgressDrawable.d(fFloatValue, knVar);
                circularProgressDrawable.a(fFloatValue, knVar, false);
                circularProgressDrawable.invalidateSelf();
                break;
            default:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    io0.e("null cannot be cast to non-null type kotlin.Int");
                } else {
                    ((BottomBarItem) obj2).e = ((Integer) animatedValue).intValue();
                    ((SmoothBottomBar) obj).invalidate();
                }
                break;
        }
    }

    public in(CircularProgressDrawable circularProgressDrawable, kn knVar) {
        this.c = circularProgressDrawable;
        this.b = knVar;
    }
}
