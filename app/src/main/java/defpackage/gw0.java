package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import dev.zeron.tunnel.R;
import com.google.android.material.textfield.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gw0 extends r20 {
    public final int e;
    public EditText f;
    public final mn g;

    public gw0(b bVar, int i) {
        super(bVar);
        this.e = R.drawable.design_password_eye;
        this.g = new mn(this, 5);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.r20
    public final void b() {
        p();
    }

    @Override // defpackage.r20
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.r20
    public final int d() {
        return this.e;
    }

    @Override // defpackage.r20
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.r20
    public final boolean j() {
        return true;
    }

    @Override // defpackage.r20
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.r20
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.r20
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.r20
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
