package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable$Delegate;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fn extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    public static final int[] G0 = {R.attr.state_enabled};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public float A;
    public ColorStateList A0;
    public float B;
    public WeakReference B0;
    public ColorStateList C;
    public TextUtils.TruncateAt C0;
    public float D;
    public boolean D0;
    public ColorStateList E;
    public int E0;
    public CharSequence F;
    public boolean F0;
    public boolean G;
    public Drawable H;
    public ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public RippleDrawable N;
    public ColorStateList O;
    public float P;
    public SpannableStringBuilder Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public MotionSpec V;
    public MotionSpec W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public final Context f0;
    public final Paint g0;
    public final Paint.FontMetrics h0;
    public final RectF i0;
    public final PointF j0;
    public final Path k0;
    public final TextDrawableHelper l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public int u0;
    public ColorFilter v0;
    public PorterDuffColorFilter w0;
    public ColorStateList x0;
    public ColorStateList y;
    public PorterDuff.Mode y0;
    public ColorStateList z;
    public int[] z0;

    public fn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, dev.zeron.tunnel.R.style.Widget_MaterialComponents_Chip_Action);
        this.B = -1.0f;
        this.g0 = new Paint(1);
        this.h0 = new Paint.FontMetrics();
        this.i0 = new RectF();
        this.j0 = new PointF();
        this.k0 = new Path();
        this.u0 = 255;
        this.y0 = PorterDuff.Mode.SRC_IN;
        this.B0 = new WeakReference(null);
        j(context);
        this.f0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.l0 = textDrawableHelper;
        this.F = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        textDrawableHelper.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.z0, iArr)) {
            this.z0 = iArr;
            if (c0()) {
                F(getState(), iArr);
            }
        }
        this.D0 = true;
        H0.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean D(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void d0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (c0()) {
            return this.c0 + this.P + this.d0;
        }
        return 0.0f;
    }

    public final float B() {
        return this.F0 ? h() : this.B;
    }

    public final void E() {
        ChipDrawable$Delegate chipDrawable$Delegate = (ChipDrawable$Delegate) this.B0.get();
        if (chipDrawable$Delegate != null) {
            chipDrawable$Delegate.onChipDrawableSizeChange();
        }
    }

    public final boolean F(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.y;
        int iB = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.m0) : 0);
        boolean state = true;
        if (this.m0 != iB) {
            this.m0 = iB;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.z;
        int iB2 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.n0) : 0);
        if (this.n0 != iB2) {
            this.n0 = iB2;
            zOnStateChange = true;
        }
        int iC = oo.c(iB2, iB);
        if ((this.o0 != iC) | (this.a.c == null)) {
            this.o0 = iC;
            m(ColorStateList.valueOf(iC));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.p0) : 0;
        if (this.p0 != colorForState) {
            this.p0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.A0 == null || !y31.d(iArr)) ? 0 : this.A0.getColorForState(iArr, this.q0);
        if (this.q0 != colorForState2) {
            this.q0 = colorForState2;
        }
        TextAppearance textAppearance = this.l0.g;
        int colorForState3 = (textAppearance == null || (colorStateList = textAppearance.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState3) {
            this.r0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.R) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.s0 == z || this.T == null) {
            z2 = false;
        } else {
            float fZ = z();
            this.s0 = z;
            if (fZ != z()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.x0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.t0) : 0;
        if (this.t0 != colorForState4) {
            this.t0 = colorForState4;
            ColorStateList colorStateList6 = this.x0;
            PorterDuff.Mode mode = this.y0;
            this.w0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (D(this.H)) {
            state |= this.H.setState(iArr);
        }
        if (D(this.T)) {
            state |= this.T.setState(iArr);
        }
        if (D(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.M.setState(iArr3);
        }
        if (D(this.N)) {
            state |= this.N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            E();
        }
        return state;
    }

    public final void G(boolean z) {
        if (this.R != z) {
            this.R = z;
            float fZ = z();
            if (!z && this.s0) {
                this.s0 = false;
            }
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.T != drawable) {
            float fZ = z();
            this.T = drawable;
            float fZ2 = z();
            d0(this.T);
            x(this.T);
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.S && (drawable = this.T) != null && this.R) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z) {
        if (this.S != z) {
            boolean zA0 = a0();
            this.S = z;
            boolean zA02 = a0();
            if (zA0 != zA02) {
                Drawable drawable = this.T;
                if (zA02) {
                    x(drawable);
                } else {
                    d0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void K(float f) {
        if (this.B != f) {
            this.B = f;
            setShapeAppearanceModel(this.a.a.g(f));
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.H;
        Drawable drawableE = drawable2 != null ? qj1.E(drawable2) : null;
        if (drawableE != drawable) {
            float fZ = z();
            this.H = drawable != null ? drawable.mutate() : null;
            float fZ2 = z();
            d0(drawableE);
            if (b0()) {
                x(this.H);
            }
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void M(float f) {
        if (this.J != f) {
            float fZ = z();
            this.J = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (b0()) {
                this.H.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.G != z) {
            boolean zB0 = b0();
            this.G = z;
            boolean zB02 = b0();
            if (zB0 != zB02) {
                Drawable drawable = this.H;
                if (zB02) {
                    x(drawable);
                } else {
                    d0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.F0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f) {
        if (this.D != f) {
            this.D = f;
            this.g0.setStrokeWidth(f);
            if (this.F0) {
                t(f);
            }
            invalidateSelf();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2 = this.M;
        Drawable drawableE = drawable2 != null ? qj1.E(drawable2) : null;
        if (drawableE != drawable) {
            float fA = A();
            this.M = drawable != null ? drawable.mutate() : null;
            this.N = new RippleDrawable(y31.c(this.E), this.M, H0);
            float fA2 = A();
            d0(drawableE);
            if (c0()) {
                x(this.M);
            }
            invalidateSelf();
            if (fA != fA2) {
                E();
            }
        }
    }

    public final void S(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void T(float f) {
        if (this.P != f) {
            this.P = f;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void U(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (c0()) {
                this.M.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z) {
        if (this.L != z) {
            boolean zC0 = c0();
            this.L = z;
            boolean zC02 = c0();
            if (zC0 != zC02) {
                Drawable drawable = this.M;
                if (zC02) {
                    x(drawable);
                } else {
                    d0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void X(float f) {
        if (this.Z != f) {
            float fZ = z();
            this.Z = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void Y(float f) {
        if (this.Y != f) {
            float fZ = z();
            this.Y = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            this.A0 = null;
            onStateChange(getState());
        }
    }

    public final boolean a0() {
        return this.S && this.T != null && this.s0;
    }

    public final boolean b0() {
        return this.G && this.H != null;
    }

    public final boolean c0() {
        return this.L && this.M != null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.u0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.F0;
        Paint paint = this.g0;
        RectF rectF = this.i0;
        if (!z) {
            paint.setColor(this.m0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (!this.F0) {
            paint.setColor(this.n0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.v0;
            if (colorFilter == null) {
                colorFilter = this.w0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (this.F0) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.F0) {
            paint.setColor(this.p0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                ColorFilter colorFilter2 = this.v0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.w0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.D / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.B - (this.D / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.q0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.F0) {
            RectF rectF2 = new RectF(bounds);
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = this.a;
            ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawableState.a;
            float f4 = materialShapeDrawableState.i;
            a aVar = this.q;
            ShapeAppearancePathProvider shapeAppearancePathProvider = this.r;
            Path path = this.k0;
            shapeAppearancePathProvider.a(shapeAppearanceModel, f4, rectF2, aVar, path);
            d(canvas2, paint, path, this.a.a, f());
        } else {
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (b0()) {
            y(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.H.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.H.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (a0()) {
            y(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.T.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.T.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.D0 && this.F != null) {
            PointF pointF = this.j0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.F;
            TextDrawableHelper textDrawableHelper = this.l0;
            if (charSequence != null) {
                float fZ = z() + this.X + this.a0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fZ;
                } else {
                    pointF.x = bounds.right - fZ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = textDrawableHelper.a;
                Paint.FontMetrics fontMetrics = this.h0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.F != null) {
                float fZ2 = z() + this.X + this.a0;
                float fA = A() + this.e0 + this.b0;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fZ2;
                    rectF.right = bounds.right - fA;
                } else {
                    rectF.left = i3 + fA;
                    rectF.right = bounds.right - fZ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            TextAppearance textAppearance = textDrawableHelper.g;
            TextPaint textPaint2 = textDrawableHelper.a;
            if (textAppearance != null) {
                textPaint2.drawableState = getState();
                textDrawableHelper.g.e(this.f0, textPaint2, textDrawableHelper.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(textDrawableHelper.a(this.F.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.F;
            if (z2 && this.C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.C0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (c0()) {
            rectF.setEmpty();
            if (c0()) {
                float f9 = this.e0 + this.d0;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.P;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.P;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.M.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.N.setBounds(this.M.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.u0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(A() + this.l0.a(this.F.toString()) + z() + this.X + this.a0 + this.b0 + this.e0), this.E0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
            outline2 = outline;
        }
        outline2.setAlpha(this.u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (C(this.y) || C(this.z) || C(this.C)) {
            return true;
        }
        TextAppearance textAppearance = this.l0.g;
        if (textAppearance == null || (colorStateList = textAppearance.j) == null || !colorStateList.isStateful()) {
            return (this.S && this.T != null && this.R) || D(this.H) || D(this.T) || C(this.x0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (b0()) {
            zOnLayoutDirectionChanged |= this.H.setLayoutDirection(i);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.T.setLayoutDirection(i);
        }
        if (c0()) {
            zOnLayoutDirectionChanged |= this.M.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (b0()) {
            zOnLevelChange |= this.H.setLevel(i);
        }
        if (a0()) {
            zOnLevelChange |= this.T.setLevel(i);
        }
        if (c0()) {
            zOnLevelChange |= this.M.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.z0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void onTextSizeChange() {
        E();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.v0 != colorFilter) {
            this.v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.y0 != mode) {
            this.y0 = mode;
            ColorStateList colorStateList = this.x0;
            this.w0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (b0()) {
            visible |= this.H.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.T.setVisible(z, z2);
        }
        if (c0()) {
            visible |= this.M.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(this.z0);
            }
            drawable.setTintList(this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            drawable2.setTintList(this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b0() || a0()) {
            float f = this.X + this.Y;
            Drawable drawable = this.s0 ? this.T : this.H;
            float intrinsicWidth = this.J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.s0 ? this.T : this.H;
            float fCeil = this.J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(wo1.c(this.f0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float z() {
        if (!b0() && !a0()) {
            return 0.0f;
        }
        float f = this.Y;
        Drawable drawable = this.s0 ? this.T : this.H;
        float intrinsicWidth = this.J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.Z;
    }
}
