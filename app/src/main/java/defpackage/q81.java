package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.i;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 extends i {
    public final /* synthetic */ int a;

    public /* synthetic */ q81(int i) {
        this.a = i;
    }

    @Override // androidx.transition.Slide.CalculateSlide
    public final float getGoneX(ViewGroup viewGroup, View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                }
                break;
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                }
                break;
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }
}
