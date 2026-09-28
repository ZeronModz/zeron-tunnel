package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ wc1(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 2:
                int iAbs = swipeRefreshLayout.x - Math.abs(swipeRefreshLayout.w);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.v + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.t.getTop());
                CircularProgressDrawable circularProgressDrawable = swipeRefreshLayout.z;
                float f2 = 1.0f - f;
                kn knVar = circularProgressDrawable.a;
                if (f2 != knVar.p) {
                    knVar.p = f2;
                }
                circularProgressDrawable.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.e(f);
                break;
        }
    }
}
