package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 implements TypeEvaluator {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d5(int i) {
        this.a = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hw0[] hw0VarArr = (hw0[]) obj;
                hw0[] hw0VarArr2 = (hw0[]) obj2;
                if (!iw0.a(hw0VarArr, hw0VarArr2)) {
                    u7.r("Can't interpolate between two incompatible pathData");
                    return null;
                }
                if (!iw0.a((hw0[]) this.b, hw0VarArr)) {
                    this.b = iw0.e(hw0VarArr);
                }
                int i = 0;
                while (true) {
                    int length = hw0VarArr.length;
                    hw0[] hw0VarArr3 = (hw0[]) this.b;
                    if (i >= length) {
                        return hw0VarArr3;
                    }
                    hw0 hw0Var = hw0VarArr3[i];
                    hw0 hw0Var2 = hw0VarArr[i];
                    hw0 hw0Var3 = hw0VarArr2[i];
                    hw0Var.getClass();
                    hw0Var.a = hw0Var2.a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = hw0Var2.b;
                        if (i2 < fArr.length) {
                            hw0Var.b[i2] = (hw0Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                    i++;
                }
                break;
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                float[] fArr4 = (float[]) this.b;
                for (int i3 = 0; i3 < fArr4.length; i3++) {
                    float f2 = fArr2[i3];
                    fArr4[i3] = hz.k(fArr3[i3], f2, f, f2);
                }
                return fArr4;
            case 2:
                float fFloatValue = ((FloatEvaluator) this.b).evaluate(f, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            default:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i4 = rect.left + ((int) ((rect2.left - r0) * f));
                int i5 = rect.top + ((int) ((rect2.top - r1) * f));
                int i6 = rect.right + ((int) ((rect2.right - r2) * f));
                int i7 = rect.bottom + ((int) ((rect2.bottom - r11) * f));
                Rect rect3 = (Rect) this.b;
                if (rect3 == null) {
                    return new Rect(i4, i5, i6, i7);
                }
                rect3.set(i4, i5, i6, i7);
                return rect3;
        }
    }
}
