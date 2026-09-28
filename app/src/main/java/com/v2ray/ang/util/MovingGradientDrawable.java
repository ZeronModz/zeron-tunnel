package com.v2ray.ang.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class MovingGradientDrawable extends Drawable {
    public LinearGradient b;
    public final Paint a = new Paint(1);
    public final Matrix c = new Matrix();
    public float d = 0.0f;
    public final int[] e = {Color.parseColor("#1f000000"), Color.parseColor("#2f000000"), Color.parseColor("#3f000000"), Color.parseColor("#2f000000"), Color.parseColor("#1f000000")};

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        LinearGradient linearGradient = this.b;
        Paint paint = this.a;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, bounds.width() * 2.0f, 0.0f, this.e, (float[]) null, Shader.TileMode.MIRROR);
            this.b = linearGradient2;
            paint.setShader(linearGradient2);
        }
        float f = this.d + 1.0f;
        this.d = f;
        if (f > bounds.width() * 100.0f) {
            this.d = 0.0f;
        }
        float f2 = this.d;
        Matrix matrix = this.c;
        matrix.setTranslate(f2, 0.0f);
        this.b.setLocalMatrix(matrix);
        float fMin = Math.min(bounds.width(), bounds.height()) / 2.0f;
        canvas.drawRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, fMin, fMin, paint);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
