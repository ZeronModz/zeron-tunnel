package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 extends ViewOscillator {
    public final float[] g = new float[1];
    public ConstraintAttribute h;

    @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
    public final void c(ConstraintAttribute constraintAttribute) {
        this.h = constraintAttribute;
    }

    @Override // androidx.constraintlayout.motion.utils.ViewOscillator
    public final void e(View view, float f) {
        float fA = a(f);
        float[] fArr = this.g;
        fArr[0] = fA;
        CustomSupport.b(this.h, view, fArr);
    }
}
