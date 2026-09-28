package soup.neumorphism.internal.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import defpackage.i5;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.a;
import soup.neumorphism.LightSource;
import soup.neumorphism.NeumorphShapeAppearanceModel;
import soup.neumorphism.NeumorphShapeDrawable;
import soup.neumorphism.internal.blur.BlurProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsoup/neumorphism/internal/shape/FlatShape;", "Lsoup/neumorphism/internal/shape/Shape;", "Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;", "drawableState", "<init>", "(Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class FlatShape implements Shape {
    public Bitmap a;
    public Bitmap b;
    public final GradientDrawable c;
    public final GradientDrawable d;
    public NeumorphShapeDrawable.NeumorphShapeDrawableState e;

    public FlatShape(NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState) {
        neumorphShapeDrawableState.getClass();
        this.e = neumorphShapeDrawableState;
        this.c = new GradientDrawable();
        this.d = new GradientDrawable();
    }

    public final Bitmap a(GradientDrawable gradientDrawable, int i, int i2) {
        Function1<Bitmap, Bitmap> function1 = new Function1<Bitmap, Bitmap>() { // from class: soup.neumorphism.internal.shape.FlatShape$toBlurredBitmap$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Bitmap invoke(Bitmap bitmap) {
                bitmap.getClass();
                NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState = this.this$0.e;
                return neumorphShapeDrawableState.c ? bitmap : BlurProvider.a(neumorphShapeDrawableState.b, bitmap);
            }
        };
        float f = this.e.k;
        float f2 = 2.0f * f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(a.b(i + f2), a.b(i2 + f2), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iSave = canvas.save();
        canvas.translate(f, f);
        try {
            gradientDrawable.draw(canvas);
            canvas.restoreToCount(iSave);
            return function1.invoke(bitmapCreateBitmap);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void draw(Canvas canvas, Path path) {
        canvas.getClass();
        path.getClass();
        int iSave = canvas.save();
        i5.a(canvas, path);
        try {
            NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState = this.e;
            int i = neumorphShapeDrawableState.i;
            float f = neumorphShapeDrawableState.k;
            float f2 = neumorphShapeDrawableState.n + f;
            Rect rect = neumorphShapeDrawableState.d;
            float f3 = rect.left;
            float f4 = rect.top;
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                LightSource.Companion.getClass();
                canvas.drawBitmap(bitmap, (i == 0 || i == 1 ? (-f) - f2 : (-f) + f2) + f3, (i == 0 || i == 2 ? (-f) - f2 : (-f) + f2) + f4, (Paint) null);
            }
            Bitmap bitmap2 = this.b;
            if (bitmap2 != null) {
                LightSource.Companion.getClass();
                float f5 = i == 0 || i == 1 ? (-f) + f2 : (-f) - f2;
                boolean z = i == 0 || i == 2;
                float f6 = -f;
                canvas.drawBitmap(bitmap2, f5 + f3, (z ? f6 + f2 : f6 - f2) + f4, (Paint) null);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void setDrawableState(NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState) {
        neumorphShapeDrawableState.getClass();
        this.e = neumorphShapeDrawableState;
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void updateShadowBitmap(final Rect rect) {
        rect.getClass();
        Function2<GradientDrawable, NeumorphShapeAppearanceModel, mk1> function2 = new Function2<GradientDrawable, NeumorphShapeAppearanceModel, mk1>() { // from class: soup.neumorphism.internal.shape.FlatShape.updateShadowBitmap.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GradientDrawable gradientDrawable, NeumorphShapeAppearanceModel neumorphShapeAppearanceModel) {
                gradientDrawable.getClass();
                neumorphShapeAppearanceModel.getClass();
                int i = neumorphShapeAppearanceModel.a;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    gradientDrawable.setShape(1);
                    return;
                }
                gradientDrawable.setShape(0);
                float fMin = Math.min(rect.width() / 2.0f, rect.height() / 2.0f);
                float fMin2 = Math.min(fMin, neumorphShapeAppearanceModel.b);
                float fMin3 = Math.min(fMin, neumorphShapeAppearanceModel.c);
                float fMin4 = Math.min(fMin, neumorphShapeAppearanceModel.d);
                float fMin5 = Math.min(fMin, neumorphShapeAppearanceModel.e);
                gradientDrawable.setCornerRadii(new float[]{fMin2, fMin2, fMin3, fMin3, fMin4, fMin4, fMin5, fMin5});
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ mk1 invoke(GradientDrawable gradientDrawable, NeumorphShapeAppearanceModel neumorphShapeAppearanceModel) {
                invoke2(gradientDrawable, neumorphShapeAppearanceModel);
                return mk1.a;
            }
        };
        int i = this.e.l;
        GradientDrawable gradientDrawable = this.c;
        gradientDrawable.setColor(i);
        function2.invoke2(gradientDrawable, this.e.a);
        int i2 = this.e.m;
        GradientDrawable gradientDrawable2 = this.d;
        gradientDrawable2.setColor(i2);
        function2.invoke2(gradientDrawable2, this.e.a);
        int iWidth = rect.width();
        int iHeight = rect.height();
        gradientDrawable.setSize(iWidth, iHeight);
        gradientDrawable.setBounds(0, 0, iWidth, iHeight);
        gradientDrawable2.setSize(iWidth, iHeight);
        gradientDrawable2.setBounds(0, 0, iWidth, iHeight);
        this.a = a(gradientDrawable, iWidth, iHeight);
        this.b = a(gradientDrawable2, iWidth, iHeight);
    }
}
