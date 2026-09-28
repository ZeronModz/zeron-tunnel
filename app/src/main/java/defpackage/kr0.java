package defpackage;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements Interpolator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Easing b;

    public /* synthetic */ kr0(Easing easing, int i) {
        this.a = i;
        this.b = easing;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double dA;
        switch (this.a) {
            case 0:
                dA = this.b.a(f);
                break;
            case 1:
                dA = this.b.a(f);
                break;
            default:
                dA = this.b.a(f);
                break;
        }
        return (float) dA;
    }
}
