package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p10 extends sb2 {
    public final TextView H;
    public final l10 I;
    public boolean J = true;

    public p10(TextView textView) {
        this.H = textView;
        this.I = new l10(textView);
    }

    @Override // defpackage.sb2
    public final InputFilter[] j(InputFilter[] inputFilterArr) {
        if (!this.J) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof l10) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            l10 l10Var = this.I;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = l10Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == l10Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.sb2
    public final boolean l() {
        return this.J;
    }

    @Override // defpackage.sb2
    public final void q(boolean z) {
        if (z) {
            TextView textView = this.H;
            textView.setTransformationMethod(x(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.sb2
    public final void r(boolean z) {
        this.J = z;
        TextView textView = this.H;
        textView.setTransformationMethod(x(textView.getTransformationMethod()));
        textView.setFilters(j(textView.getFilters()));
    }

    @Override // defpackage.sb2
    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return this.J ? ((transformationMethod instanceof t10) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new t10(transformationMethod) : transformationMethod instanceof t10 ? ((t10) transformationMethod).a : transformationMethod;
    }
}
