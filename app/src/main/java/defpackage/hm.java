package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hm {
    public final Matrix a = new Matrix();
    public final View b;
    public final float[] c;
    public float d;
    public float e;

    public hm(View view, float[] fArr) {
        this.b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.c = fArr2;
        this.d = fArr2[2];
        this.e = fArr2[5];
        a();
    }

    public final void a() {
        float f = this.d;
        float[] fArr = this.c;
        fArr[2] = f;
        fArr[5] = this.e;
        Matrix matrix = this.a;
        matrix.setValues(fArr);
        vo1.a.Z(this.b, matrix);
    }
}
