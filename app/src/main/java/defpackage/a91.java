package defpackage;

import android.animation.ValueAnimator;
import me.ibrahimsn.lib.SmoothBottomBar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a91 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SmoothBottomBar b;

    public /* synthetic */ a91(SmoothBottomBar smoothBottomBar, int i) {
        this.a = i;
        this.b = smoothBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SmoothBottomBar smoothBottomBar = this.b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    io0.e("null cannot be cast to non-null type kotlin.Float");
                } else {
                    smoothBottomBar.c = ((Float) animatedValue).floatValue();
                }
                break;
            default:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 == null) {
                    io0.e("null cannot be cast to non-null type kotlin.Int");
                } else {
                    smoothBottomBar.b = ((Integer) animatedValue2).intValue();
                }
                break;
        }
    }
}
