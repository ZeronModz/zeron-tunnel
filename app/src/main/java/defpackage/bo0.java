package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.h;
import dev.zeron.tunnel.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bo0 {
    public final MaterialButton a;
    public ShapeAppearanceModel b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public MaterialShapeDrawable m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public bo0(MaterialButton materialButton, ShapeAppearanceModel shapeAppearanceModel) {
        this.a = materialButton;
        this.b = shapeAppearanceModel;
    }

    public final Shapeable a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.s;
        return numberOfLayers > 2 ? (Shapeable) rippleDrawable2.getDrawable(2) : (Shapeable) rippleDrawable2.getDrawable(1);
    }

    public final MaterialShapeDrawable b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(ShapeAppearanceModel shapeAppearanceModel) {
        this.b = shapeAppearanceModel;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = h.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.b);
        MaterialButton materialButton = this.a;
        materialShapeDrawable.j(materialButton.getContext());
        materialShapeDrawable.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        materialShapeDrawable.t(f);
        materialShapeDrawable.s(colorStateList);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.b);
        materialShapeDrawable2.setTint(0);
        float f2 = this.h;
        int iB = this.n ? lo0.b(R.attr.colorSurface, materialButton) : 0;
        materialShapeDrawable2.t(f2);
        materialShapeDrawable2.s(ColorStateList.valueOf(iB));
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.b);
        this.m = materialShapeDrawable3;
        materialShapeDrawable3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(y31.c(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableB = b(false);
        if (materialShapeDrawableB != null) {
            materialShapeDrawableB.l(this.t);
            materialShapeDrawableB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        MaterialShapeDrawable materialShapeDrawableB = b(false);
        MaterialShapeDrawable materialShapeDrawableB2 = b(true);
        if (materialShapeDrawableB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            materialShapeDrawableB.t(f);
            materialShapeDrawableB.s(colorStateList);
            if (materialShapeDrawableB2 != null) {
                float f2 = this.h;
                int iB = this.n ? lo0.b(R.attr.colorSurface, this.a) : 0;
                materialShapeDrawableB2.t(f2);
                materialShapeDrawableB2.s(ColorStateList.valueOf(iB));
            }
        }
    }
}
