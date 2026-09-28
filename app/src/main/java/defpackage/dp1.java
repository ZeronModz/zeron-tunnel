package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 extends cp1 {
    @Override // defpackage.cp1
    public final void Z(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.cp1
    public final void a0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.cp1
    public final void b0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.cp1
    public final void c0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.cp1
    public final void d0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.ii2
    public final float l(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.ii2
    public final void w(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
