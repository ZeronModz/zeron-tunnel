package defpackage;

import android.animation.ValueAnimator;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.ImageCapture$ScreenFlashListener;
import androidx.camera.view.ScreenFlashView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i51 implements ImageCapture$ScreenFlash {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ ScreenFlashView c;

    public i51(ScreenFlashView screenFlashView) {
        this.c = screenFlashView;
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void apply(long j, ImageCapture$ScreenFlashListener imageCapture$ScreenFlashListener) {
        km0.a("ScreenFlashView");
        ScreenFlashView screenFlashView = this.c;
        this.a = screenFlashView.getBrightness();
        screenFlashView.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(imageCapture$ScreenFlashListener);
        j60 j60Var = new j60(imageCapture$ScreenFlashListener, 18);
        km0.a("ScreenFlashView");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(screenFlashView.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new mz(screenFlashView, 3));
        valueAnimatorOfFloat.addListener(new j51(j60Var));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void clear() {
        km0.a("ScreenFlashView");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        ScreenFlashView screenFlashView = this.c;
        screenFlashView.setAlpha(0.0f);
        screenFlashView.setBrightness(this.a);
    }
}
