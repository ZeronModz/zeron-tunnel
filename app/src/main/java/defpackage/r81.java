package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.j;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r81 extends j {
    public final /* synthetic */ int a;

    public /* synthetic */ r81(int i) {
        this.a = i;
    }

    @Override // androidx.transition.Slide.CalculateSlide
    public final float getGoneY(ViewGroup viewGroup, View view) {
        switch (this.a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
