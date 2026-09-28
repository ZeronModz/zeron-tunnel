package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mo1 extends ViewSpline {
    public final /* synthetic */ int f;

    @Override // androidx.constraintlayout.motion.utils.ViewSpline
    public final void d(View view, float f) {
        switch (this.f) {
            case 0:
                view.setAlpha(a(f));
                break;
            case 1:
                view.setElevation(a(f));
                break;
            case 2:
                view.setPivotX(a(f));
                break;
            case 3:
                view.setPivotY(a(f));
                break;
            case 4:
                view.setRotation(a(f));
                break;
            case 5:
                view.setRotationX(a(f));
                break;
            case 6:
                view.setRotationY(a(f));
                break;
            case 7:
                view.setScaleX(a(f));
                break;
            case 8:
                view.setScaleY(a(f));
                break;
            case 9:
                view.setTranslationX(a(f));
                break;
            case 10:
                view.setTranslationY(a(f));
                break;
            default:
                view.setTranslationZ(a(f));
                break;
        }
    }
}
