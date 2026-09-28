package soup.neumorphism.internal.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import defpackage.hz;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import soup.neumorphism.LightSource;
import soup.neumorphism.NeumorphShapeAppearanceModel;
import soup.neumorphism.NeumorphShapeDrawable;
import soup.neumorphism.internal.blur.BlurProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsoup/neumorphism/internal/shape/PressedShape;", "Lsoup/neumorphism/internal/shape/Shape;", "Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;", "drawableState", "<init>", "(Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class PressedShape implements Shape {
    public Bitmap a;
    public final GradientDrawable b;
    public final GradientDrawable c;
    public NeumorphShapeDrawable.NeumorphShapeDrawableState d;

    public PressedShape(NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState) {
        neumorphShapeDrawableState.getClass();
        this.d = neumorphShapeDrawableState;
        this.b = new GradientDrawable();
        this.c = new GradientDrawable();
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void draw(Canvas canvas, Path path) {
        canvas.getClass();
        path.getClass();
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                Rect rect = this.d.d;
                canvas.drawBitmap(bitmap, rect.left, rect.top, (Paint) null);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void setDrawableState(NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState) {
        neumorphShapeDrawableState.getClass();
        this.d = neumorphShapeDrawableState;
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void updateShadowBitmap(Rect rect) {
        float f;
        float f2;
        float[] fArr;
        float f3;
        float[] fArr2;
        rect.getClass();
        int i = (int) this.d.k;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i2 = iWidth + i;
        int i3 = iHeight + i;
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setSize(i2, i3);
        gradientDrawable.setStroke(i, this.d.l);
        int i4 = this.d.a.a;
        if (i4 != 0) {
            if (i4 == 1) {
                gradientDrawable.setShape(1);
            }
            f = 0.0f;
        } else {
            f = 0.0f;
            float fMin = Math.min(iWidth / 2.0f, iHeight / 2.0f);
            NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState = this.d;
            NeumorphShapeAppearanceModel neumorphShapeAppearanceModel = neumorphShapeDrawableState.a;
            int i5 = neumorphShapeDrawableState.i;
            if (i5 == 0) {
                f2 = neumorphShapeAppearanceModel.d;
            } else if (i5 == 1) {
                f2 = neumorphShapeAppearanceModel.c;
            } else if (i5 == 2) {
                f2 = neumorphShapeAppearanceModel.e;
            } else {
                if (i5 != 3) {
                    u7.p(hz.q(this.d.i, " is not supported.", new StringBuilder("LightSource ")));
                    return;
                }
                f2 = neumorphShapeAppearanceModel.b;
            }
            float fMin2 = Math.min(fMin, f2);
            gradientDrawable.setShape(0);
            int i6 = this.d.i;
            if (i6 == 0) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fMin2, fMin2, 0.0f, 0.0f};
            } else if (i6 == 1) {
                fArr = new float[]{0.0f, 0.0f, fMin2, fMin2, 0.0f, 0.0f, 0.0f, 0.0f};
            } else if (i6 == 2) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fMin2, fMin2};
            } else {
                if (i6 != 3) {
                    u7.p(hz.q(this.d.i, " is not supported.", new StringBuilder("LightSource ")));
                    return;
                }
                fArr = new float[]{fMin2, fMin2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            gradientDrawable.setCornerRadii(fArr);
        }
        GradientDrawable gradientDrawable2 = this.c;
        gradientDrawable2.setSize(i2, i3);
        gradientDrawable2.setStroke(i, this.d.m);
        int i7 = this.d.a.a;
        if (i7 == 0) {
            float fMin3 = Math.min(iWidth / 2.0f, iHeight / 2.0f);
            NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState2 = this.d;
            NeumorphShapeAppearanceModel neumorphShapeAppearanceModel2 = neumorphShapeDrawableState2.a;
            int i8 = neumorphShapeDrawableState2.i;
            if (i8 == 0) {
                f3 = neumorphShapeAppearanceModel2.b;
            } else if (i8 == 1) {
                f3 = neumorphShapeAppearanceModel2.d;
            } else if (i8 == 2) {
                f3 = neumorphShapeAppearanceModel2.c;
            } else {
                if (i8 != 3) {
                    u7.p(hz.q(this.d.i, " is not supported.", new StringBuilder("LightSource ")));
                    return;
                }
                f3 = neumorphShapeAppearanceModel2.e;
            }
            float fMin4 = Math.min(fMin3, f3);
            gradientDrawable2.setShape(0);
            int i9 = this.d.i;
            if (i9 == 0) {
                fArr2 = new float[]{fMin4, fMin4, f, f, f, f, f, f};
            } else if (i9 == 1) {
                fArr2 = new float[]{f, f, f, f, f, f, fMin4, fMin4};
            } else if (i9 == 2) {
                fArr2 = new float[]{f, f, fMin4, fMin4, f, f, f, f};
            } else {
                if (i9 != 3) {
                    u7.p(hz.q(this.d.i, " is not supported.", new StringBuilder("LightSource ")));
                    return;
                }
                fArr2 = new float[]{f, f, f, f, fMin4, fMin4, f, f};
            }
            gradientDrawable2.setCornerRadii(fArr2);
        } else if (i7 == 1) {
            gradientDrawable2.setShape(1);
        }
        gradientDrawable.setSize(i2, i3);
        gradientDrawable.setBounds(0, 0, i2, i3);
        gradientDrawable2.setSize(i2, i3);
        gradientDrawable2.setBounds(0, 0, i2, i3);
        Function1<Bitmap, Bitmap> function1 = new Function1<Bitmap, Bitmap>() { // from class: soup.neumorphism.internal.shape.PressedShape$generateShadowBitmap$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Bitmap invoke(Bitmap bitmap) {
                bitmap.getClass();
                NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState3 = this.this$0.d;
                return neumorphShapeDrawableState3.c ? bitmap : BlurProvider.a(neumorphShapeDrawableState3.b, bitmap);
            }
        };
        NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState3 = this.d;
        float f4 = neumorphShapeDrawableState3.k;
        int i10 = neumorphShapeDrawableState3.i;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        LightSource.Companion.getClass();
        float f5 = (i10 == 0 || i10 == 1) ? -f4 : f;
        float f6 = (i10 == 0 || i10 == 2) ? -f4 : f;
        int iSave = canvas.save();
        canvas.translate(f5, f6);
        try {
            gradientDrawable.draw(canvas);
            float f7 = (i10 == 2 || i10 == 3) ? -f4 : f;
            float f8 = (i10 == 1 || i10 == 3) ? -f4 : f;
            iSave = canvas.save();
            canvas.translate(f7, f8);
            try {
                gradientDrawable2.draw(canvas);
                canvas.restoreToCount(iSave);
                this.a = function1.invoke(bitmapCreateBitmap);
            } finally {
            }
        } finally {
        }
    }
}
