package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ws0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ NavigationBarItemView b;

    public ws0(NavigationBarItemView navigationBarItemView, float f) {
        this.b = navigationBarItemView;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.G;
        this.b.d(fFloatValue, this.a);
    }
}
