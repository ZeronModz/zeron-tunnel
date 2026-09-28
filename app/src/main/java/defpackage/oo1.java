package defpackage;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends ViewTimeCycle {
    public final /* synthetic */ int k;

    @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
    public final boolean e(float f, long j, View view, KeyCache keyCache) {
        switch (this.k) {
            case 0:
                view.setAlpha(d(f, j, view, keyCache));
                break;
            case 1:
                view.setElevation(d(f, j, view, keyCache));
                break;
            case 2:
                view.setRotation(d(f, j, view, keyCache));
                break;
            case 3:
                view.setRotationX(d(f, j, view, keyCache));
                break;
            case 4:
                view.setRotationY(d(f, j, view, keyCache));
                break;
            case 5:
                view.setScaleX(d(f, j, view, keyCache));
                break;
            case 6:
                view.setScaleY(d(f, j, view, keyCache));
                break;
            case 7:
                view.setTranslationX(d(f, j, view, keyCache));
                break;
            case 8:
                view.setTranslationY(d(f, j, view, keyCache));
                break;
            default:
                view.setTranslationZ(d(f, j, view, keyCache));
                break;
        }
        return this.h;
    }
}
