package defpackage;

import android.graphics.Matrix;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.floatingactionbutton.l;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h70 extends MatrixEvaluator {
    public final /* synthetic */ l d;

    public h70(l lVar) {
        this.d = lVar;
    }

    @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.d.o = f;
        return super.evaluate(f, matrix, matrix2);
    }
}
