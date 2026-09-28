package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jo0 extends Animatable2Compat.AnimationCallback {
    public final /* synthetic */ MaterialCheckBox b;

    public jo0(MaterialCheckBox materialCheckBox) {
        this.b = materialCheckBox;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void a(Drawable drawable) {
        ColorStateList colorStateList = this.b.o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void b(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.b;
        ColorStateList colorStateList = materialCheckBox.o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.s, colorStateList.getDefaultColor()));
        }
    }
}
