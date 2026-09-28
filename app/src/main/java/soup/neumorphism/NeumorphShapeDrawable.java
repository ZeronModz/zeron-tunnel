package soup.neumorphism;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d11;
import defpackage.hz;
import defpackage.u7;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import soup.neumorphism.NeumorphShapeAppearanceModel;
import soup.neumorphism.internal.blur.BlurProvider;
import soup.neumorphism.internal.shape.BasinShape;
import soup.neumorphism.internal.shape.FlatShape;
import soup.neumorphism.internal.shape.PressedShape;
import soup.neumorphism.internal.shape.Shape;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u000bB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0013"}, d2 = {"Lsoup/neumorphism/NeumorphShapeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lsoup/neumorphism/NeumorphShapeAppearanceModel;", "shapeAppearanceModel", "Lsoup/neumorphism/internal/blur/BlurProvider;", "blurProvider", "(Lsoup/neumorphism/NeumorphShapeAppearanceModel;Lsoup/neumorphism/internal/blur/BlurProvider;)V", "Companion", "NeumorphShapeDrawableState", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class NeumorphShapeDrawable extends Drawable {
    public static final Companion h = new Companion(null);
    public NeumorphShapeDrawableState a;
    public boolean b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public Shape g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsoup/neumorphism/NeumorphShapeDrawable$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "neumorphism_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    public NeumorphShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        context.getClass();
        NeumorphShapeAppearanceModel.f.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d11.f, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, d11.g);
        try {
            int i3 = typedArrayObtainStyledAttributes2.getInt(0, 0);
            float fA = NeumorphShapeAppearanceModel.Companion.a(typedArrayObtainStyledAttributes2, 1, 0.0f);
            float fA2 = NeumorphShapeAppearanceModel.Companion.a(typedArrayObtainStyledAttributes2, 4, fA);
            float fA3 = NeumorphShapeAppearanceModel.Companion.a(typedArrayObtainStyledAttributes2, 5, fA);
            float fA4 = NeumorphShapeAppearanceModel.Companion.a(typedArrayObtainStyledAttributes2, 2, fA);
            float fA5 = NeumorphShapeAppearanceModel.Companion.a(typedArrayObtainStyledAttributes2, 3, fA);
            NeumorphShapeAppearanceModel.Builder builder = new NeumorphShapeAppearanceModel.Builder();
            builder.a = i3;
            builder.b = fA2;
            builder.c = fA3;
            builder.e = fA4;
            builder.d = fA5;
            typedArrayObtainStyledAttributes2.recycle();
            this(new NeumorphShapeAppearanceModel(builder, null), new BlurProvider(context));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static Shape m(int i, NeumorphShapeDrawableState neumorphShapeDrawableState) {
        if (i == 0) {
            return new FlatShape(neumorphShapeDrawableState);
        }
        if (i == 1) {
            return new PressedShape(neumorphShapeDrawableState);
        }
        if (i == 2) {
            return new BasinShape(neumorphShapeDrawableState);
        }
        u7.r(hz.p(i, "ShapeType(", ") is invalid."));
        return null;
    }

    public final Rect a() {
        Rect rect = this.a.d;
        Rect bounds = getBounds();
        bounds.getClass();
        return new Rect(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
    }

    public final void b(ColorStateList colorStateList) {
        if (yg0.a(this.a.e, colorStateList)) {
            return;
        }
        this.a.e = colorStateList;
        int[] state = getState();
        state.getClass();
        onStateChange(state);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.d.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public final void d(int i) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.i != i) {
            neumorphShapeDrawableState.i = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Paint paint = this.c;
        int alpha = paint.getAlpha();
        int i = this.a.h;
        h.getClass();
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        float f = this.a.g;
        Paint paint2 = this.d;
        paint2.setStrokeWidth(f);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.h;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.b;
        Path path = this.f;
        if (z) {
            Rect rectA = a();
            RectF rectF = this.e;
            rectF.set(rectA);
            NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
            NeumorphShapeAppearanceModel neumorphShapeAppearanceModel = neumorphShapeDrawableState.a;
            Rect rect = neumorphShapeDrawableState.d;
            float f2 = rect.left;
            float f3 = rect.top;
            float fWidth = rectF.width() + f2;
            float fHeight = rectF.height() + f3;
            path.reset();
            int i3 = neumorphShapeAppearanceModel.a;
            if (i3 == 0) {
                float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
                float fMin2 = Math.min(fMin, neumorphShapeAppearanceModel.b);
                float fMin3 = Math.min(fMin, neumorphShapeAppearanceModel.c);
                float fMin4 = Math.min(fMin, neumorphShapeAppearanceModel.d);
                float fMin5 = Math.min(fMin, neumorphShapeAppearanceModel.e);
                path.addRoundRect(f2, f3, fWidth, fHeight, new float[]{fMin2, fMin2, fMin3, fMin3, fMin4, fMin4, fMin5, fMin5}, Path.Direction.CW);
            } else if (i3 == 1) {
                path.addOval(f2, f3, fWidth, fHeight, Path.Direction.CW);
            }
            path.close();
            Shape shape = this.g;
            if (shape != null) {
                shape.updateShadowBitmap(a());
            }
            this.b = false;
        }
        Paint.Style style = this.a.o;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        if (style == style2 || style == Paint.Style.FILL) {
            canvas.drawPath(path, paint);
        }
        Shape shape2 = this.g;
        if (shape2 != null) {
            shape2.draw(canvas, path);
        }
        Paint.Style style3 = this.a.o;
        if ((style3 == style2 || style3 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            canvas.drawPath(path, paint2);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(int i) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.m != i) {
            neumorphShapeDrawableState.m = i;
            invalidateSelf();
        }
    }

    public final void f(int i) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.l != i) {
            neumorphShapeDrawableState.l = i;
            invalidateSelf();
        }
    }

    public final void g(float f) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.k != f) {
            neumorphShapeDrawableState.k = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.getClass();
        int i = this.a.a.a;
        if (i == 0) {
            outline.setRect(a());
        } else {
            if (i != 1) {
                return;
            }
            outline.setOval(a());
        }
    }

    public final void h(NeumorphShapeAppearanceModel neumorphShapeAppearanceModel) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        neumorphShapeDrawableState.getClass();
        neumorphShapeDrawableState.a = neumorphShapeAppearanceModel;
        invalidateSelf();
    }

    public final void i(int i) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.j != i) {
            neumorphShapeDrawableState.j = i;
            this.g = m(i, neumorphShapeDrawableState);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.b = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.a.e) != null && colorStateList.isStateful());
    }

    public final void j(ColorStateList colorStateList) {
        if (yg0.a(this.a.f, colorStateList)) {
            return;
        }
        this.a.f = colorStateList;
        int[] state = getState();
        state.getClass();
        onStateChange(state);
    }

    public final void k(float f) {
        this.a.g = f;
        invalidateSelf();
    }

    public final void l(float f) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.n != f) {
            neumorphShapeDrawableState.n = f;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        NeumorphShapeDrawableState neumorphShapeDrawableState = new NeumorphShapeDrawableState(this.a);
        this.a = neumorphShapeDrawableState;
        Shape shape = this.g;
        if (shape != null) {
            shape.setDrawableState(neumorphShapeDrawableState);
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        this.b = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        iArr.getClass();
        ColorStateList colorStateList = this.a.e;
        boolean z = true;
        boolean z2 = false;
        if (colorStateList != null && color2 != (colorForState2 = colorStateList.getColorForState(iArr, (color2 = (paint2 = this.c).getColor())))) {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        ColorStateList colorStateList2 = this.a.f;
        if (colorStateList2 == null || color == (colorForState = colorStateList2.getColorForState(iArr, (color = (paint = this.d).getColor())))) {
            z = z2;
        } else {
            paint.setColor(colorForState);
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        NeumorphShapeDrawableState neumorphShapeDrawableState = this.a;
        if (neumorphShapeDrawableState.h != i) {
            neumorphShapeDrawableState.h = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;", "Landroid/graphics/drawable/Drawable$ConstantState;", "Lsoup/neumorphism/NeumorphShapeAppearanceModel;", "shapeAppearanceModel", "Lsoup/neumorphism/internal/blur/BlurProvider;", "blurProvider", "<init>", "(Lsoup/neumorphism/NeumorphShapeAppearanceModel;Lsoup/neumorphism/internal/blur/BlurProvider;)V", "orig", "(Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
    public static final class NeumorphShapeDrawableState extends Drawable.ConstantState {
        public NeumorphShapeAppearanceModel a;
        public final BlurProvider b;
        public boolean c;
        public final Rect d;
        public ColorStateList e;
        public ColorStateList f;
        public float g;
        public int h;
        public int i;
        public int j;
        public float k;
        public int l;
        public int m;
        public float n;
        public final Paint.Style o;

        public NeumorphShapeDrawableState(NeumorphShapeDrawableState neumorphShapeDrawableState) {
            neumorphShapeDrawableState.getClass();
            this.d = new Rect();
            this.h = 255;
            this.l = -1;
            this.m = -16777216;
            this.o = Paint.Style.FILL_AND_STROKE;
            this.a = neumorphShapeDrawableState.a;
            this.b = neumorphShapeDrawableState.b;
            this.c = neumorphShapeDrawableState.c;
            this.d = new Rect(neumorphShapeDrawableState.d);
            this.e = neumorphShapeDrawableState.e;
            this.f = neumorphShapeDrawableState.f;
            this.g = neumorphShapeDrawableState.g;
            this.h = neumorphShapeDrawableState.h;
            this.i = neumorphShapeDrawableState.i;
            this.j = neumorphShapeDrawableState.j;
            this.k = neumorphShapeDrawableState.k;
            this.l = neumorphShapeDrawableState.l;
            this.m = neumorphShapeDrawableState.m;
            this.n = neumorphShapeDrawableState.n;
            this.o = neumorphShapeDrawableState.o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            NeumorphShapeDrawable neumorphShapeDrawable = new NeumorphShapeDrawable(this, (xu) null);
            neumorphShapeDrawable.b = true;
            return neumorphShapeDrawable;
        }

        public NeumorphShapeDrawableState(NeumorphShapeAppearanceModel neumorphShapeAppearanceModel, BlurProvider blurProvider) {
            neumorphShapeAppearanceModel.getClass();
            blurProvider.getClass();
            this.d = new Rect();
            this.h = 255;
            this.l = -1;
            this.m = -16777216;
            this.o = Paint.Style.FILL_AND_STROKE;
            this.a = neumorphShapeAppearanceModel;
            this.b = blurProvider;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NeumorphShapeDrawable(Context context) {
        this(new NeumorphShapeAppearanceModel(), new BlurProvider(context));
        context.getClass();
    }

    public /* synthetic */ NeumorphShapeDrawable(NeumorphShapeDrawableState neumorphShapeDrawableState, xu xuVar) {
        this(neumorphShapeDrawableState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NeumorphShapeDrawable(NeumorphShapeAppearanceModel neumorphShapeAppearanceModel, BlurProvider blurProvider) {
        this(new NeumorphShapeDrawableState(neumorphShapeAppearanceModel, blurProvider));
        neumorphShapeAppearanceModel.getClass();
        blurProvider.getClass();
    }

    public NeumorphShapeDrawable(NeumorphShapeDrawableState neumorphShapeDrawableState) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(0);
        this.d = paint2;
        this.e = new RectF();
        this.f = new Path();
        this.a = neumorphShapeDrawableState;
        this.g = m(neumorphShapeDrawableState.j, neumorphShapeDrawableState);
    }
}
