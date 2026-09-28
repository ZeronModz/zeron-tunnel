package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rf1 extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    public final Paint.FontMetrics A;
    public final TextDrawableHelper B;
    public final vs0 C;
    public final Rect D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public CharSequence y;
    public final Context z;

    public rf1(Context context, int i) {
        super(context, null, 0, i);
        this.A = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.B = textDrawableHelper;
        this.C = new vs0(this, 2);
        this.D = new Rect();
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = 0.5f;
        this.O = 1.0f;
        this.z = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = textDrawableHelper.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fX = x();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.J)) - ((double) this.J)));
        canvas.scale(this.L, this.M, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.N) + getBounds().top);
        canvas.translate(fX, f);
        super.draw(canvas);
        if (this.y == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            TextDrawableHelper textDrawableHelper = this.B;
            TextPaint textPaint = textDrawableHelper.a;
            Paint.FontMetrics fontMetrics = this.A;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (textDrawableHelper.g != null) {
                textPaint.drawableState = getState();
                textDrawableHelper.g.e(this.z, textDrawableHelper.a, textDrawableHelper.b);
                textPaint.setAlpha((int) (this.O * 255.0f));
            }
            CharSequence charSequence = this.y;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.B.a.getTextSize(), this.G);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.E * 2;
        CharSequence charSequence = this.y;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.B.a(charSequence.toString())), this.F);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.I) {
            ShapeAppearanceModel shapeAppearanceModel = this.a.a;
            shapeAppearanceModel.getClass();
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel);
            builder.k = y();
            setShapeAppearanceModel(builder.a());
        }
    }

    public final float x() {
        int i;
        Rect rect = this.D;
        if (((rect.right - getBounds().right) - this.K) - this.H < 0) {
            i = ((rect.right - getBounds().right) - this.K) - this.H;
        } else {
            if (((rect.left - getBounds().left) - this.K) + this.H <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.K) + this.H;
        }
        return i;
    }

    public final OffsetEdgeTreatment y() {
        float f = -x();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.J)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.J), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
