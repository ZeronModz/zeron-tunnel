package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q10 extends sb2 {
    public final p10 H;

    public q10(TextView textView) {
        this.H = new p10(textView);
    }

    @Override // defpackage.sb2
    public final InputFilter[] j(InputFilter[] inputFilterArr) {
        return !(b10.k != null) ? inputFilterArr : this.H.j(inputFilterArr);
    }

    @Override // defpackage.sb2
    public final boolean l() {
        return this.H.J;
    }

    @Override // defpackage.sb2
    public final void q(boolean z) {
        if (b10.k != null) {
            this.H.q(z);
        }
    }

    @Override // defpackage.sb2
    public final void r(boolean z) {
        boolean z2 = b10.k != null;
        p10 p10Var = this.H;
        if (z2) {
            p10Var.r(z);
        } else {
            p10Var.J = z;
        }
    }

    @Override // defpackage.sb2
    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return !(b10.k != null) ? transformationMethod : this.H.x(transformationMethod);
    }
}
