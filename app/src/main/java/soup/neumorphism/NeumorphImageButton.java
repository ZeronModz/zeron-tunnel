package soup.neumorphism;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d11;
import defpackage.mu;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u00018B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\"\u0010\u001fJ\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020#¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u001dJ\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u001dJ\r\u0010/\u001a\u00020\u0006¢\u0006\u0004\b/\u0010,J\u0015\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020#¢\u0006\u0004\b1\u0010&J\r\u00102\u001a\u00020#¢\u0006\u0004\b2\u0010(J\u0017\u00104\u001a\u00020\r2\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001dJ\u0017\u00105\u001a\u00020\r2\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u001dJ\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020#H\u0016¢\u0006\u0004\b7\u0010&¨\u00069"}, d2 = {"Lsoup/neumorphism/NeumorphImageButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lmk1;", "setBackgroundInternal", "(Landroid/graphics/drawable/Drawable;)V", "setBackground", "setBackgroundDrawable", "Lsoup/neumorphism/NeumorphShapeAppearanceModel;", "shapeAppearanceModel", "setShapeAppearanceModel", "(Lsoup/neumorphism/NeumorphShapeAppearanceModel;)V", "getShapeAppearanceModel", "()Lsoup/neumorphism/NeumorphShapeAppearanceModel;", "Landroid/content/res/ColorStateList;", "backgroundColor", "setBackgroundColor", "(Landroid/content/res/ColorStateList;)V", TypedValues.Custom.S_COLOR, "(I)V", "getBackgroundColor", "()Landroid/content/res/ColorStateList;", "strokeColor", "setStrokeColor", "getStrokeColor", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "strokeWidth", "setStrokeWidth", "(F)V", "getStrokeWidth", "()F", "lightSource", "setLightSource", "getLightSource", "()I", "shapeType", "setShapeType", "getShapeType", "shadowElevation", "setShadowElevation", "getShadowElevation", "shadowColor", "setShadowColorLight", "setShadowColorDark", "translationZ", "setTranslationZ", "Companion", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class NeumorphImageButton extends AppCompatImageButton {
    public final boolean d;
    public final NeumorphShapeDrawable e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsoup/neumorphism/NeumorphImageButton$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "LOG_TAG", "Ljava/lang/String;", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeumorphImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        super(context, attributeSet, i);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d11.d, i, i2);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(12);
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, 0.0f);
        int i3 = typedArrayObtainStyledAttributes.getInt(6, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(11, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
        int iL = mu.l(context, typedArrayObtainStyledAttributes, 8, R.color.design_default_color_shadow_light);
        int iL2 = mu.l(context, typedArrayObtainStyledAttributes, 7, R.color.design_default_color_shadow_dark);
        typedArrayObtainStyledAttributes.recycle();
        NeumorphShapeDrawable neumorphShapeDrawable = new NeumorphShapeDrawable(context, attributeSet, i, i2);
        neumorphShapeDrawable.a.c = isInEditMode();
        neumorphShapeDrawable.d(i3);
        neumorphShapeDrawable.i(i4);
        neumorphShapeDrawable.g(dimension2);
        neumorphShapeDrawable.f(iL);
        neumorphShapeDrawable.e(iL2);
        neumorphShapeDrawable.b(colorStateList);
        neumorphShapeDrawable.k(dimension);
        neumorphShapeDrawable.j(colorStateList2);
        neumorphShapeDrawable.l(getTranslationZ());
        this.e = neumorphShapeDrawable;
        dimensionPixelSize2 = dimensionPixelSize2 < 0 ? dimensionPixelSize : dimensionPixelSize2;
        int i5 = dimensionPixelSize4 >= 0 ? dimensionPixelSize4 : dimensionPixelSize;
        int i6 = dimensionPixelSize3 >= 0 ? dimensionPixelSize3 : dimensionPixelSize;
        int i7 = dimensionPixelSize5 >= 0 ? dimensionPixelSize5 : dimensionPixelSize;
        if (this.f != dimensionPixelSize2) {
            this.f = dimensionPixelSize2;
            z = true;
        } else {
            z = false;
        }
        if (this.h != i5) {
            this.h = i5;
            z = true;
        }
        if (this.g != i6) {
            this.g = i6;
            z = true;
        }
        if (this.i != i7) {
            this.i = i7;
            z = true;
        }
        if (z) {
            neumorphShapeDrawable.c(dimensionPixelSize2, i5, i6, i7);
            requestLayout();
            invalidateOutline();
        }
        setBackgroundInternal(neumorphShapeDrawable);
        this.d = true;
    }

    private final void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final ColorStateList getBackgroundColor() {
        return this.e.a.e;
    }

    public final int getLightSource() {
        return this.e.a.i;
    }

    public final float getShadowElevation() {
        return this.e.a.k;
    }

    public final NeumorphShapeAppearanceModel getShapeAppearanceModel() {
        return this.e.a.a;
    }

    public final int getShapeType() {
        return this.e.a.j;
    }

    public final ColorStateList getStrokeColor() {
        return this.e.a.f;
    }

    public final float getStrokeWidth() {
        return this.e.a.g;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.e.b(ColorStateList.valueOf(color));
    }

    public final void setLightSource(int lightSource) {
        this.e.d(lightSource);
    }

    public final void setShadowColorDark(int shadowColor) {
        this.e.e(shadowColor);
    }

    public final void setShadowColorLight(int shadowColor) {
        this.e.f(shadowColor);
    }

    public final void setShadowElevation(float shadowElevation) {
        this.e.g(shadowElevation);
    }

    public final void setShapeAppearanceModel(NeumorphShapeAppearanceModel shapeAppearanceModel) {
        shapeAppearanceModel.getClass();
        this.e.h(shapeAppearanceModel);
    }

    public final void setShapeType(int shapeType) {
        this.e.i(shapeType);
    }

    public final void setStrokeColor(ColorStateList strokeColor) {
        this.e.j(strokeColor);
    }

    public final void setStrokeWidth(float strokeWidth) {
        this.e.k(strokeWidth);
    }

    @Override // android.view.View
    public void setTranslationZ(float translationZ) {
        super.setTranslationZ(translationZ);
        if (this.d) {
            this.e.l(translationZ);
        }
    }

    public final void setBackgroundColor(ColorStateList backgroundColor) {
        this.e.b(backgroundColor);
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public NeumorphImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public NeumorphImageButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ NeumorphImageButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, xu xuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.neumorphImageButtonStyle : i, (i3 & 8) != 0 ? R.style.Widget_Neumorph_ImageButton : i2);
    }

    public NeumorphImageButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
