package com.v2ray.ang.util;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import dev.zeron.tunnel.R;
import defpackage.b11;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CircleProgressBar extends View {
    public float a;
    public float b;
    public int c;
    public int d;
    public int e;
    public final RectF f;
    public final Paint g;
    public final Paint h;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 4.0f;
        this.b = 0.0f;
        this.c = 0;
        this.d = 100;
        this.e = -12303292;
        this.f = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b11.a, 0, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getDimension(3, this.a);
            this.b = typedArrayObtainStyledAttributes.getFloat(2, this.b);
            this.e = typedArrayObtainStyledAttributes.getInt(4, this.e);
            this.c = typedArrayObtainStyledAttributes.getInt(1, this.c);
            this.d = typedArrayObtainStyledAttributes.getInt(0, this.d);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.g = paint;
            int i = this.e;
            paint.setColor(Color.argb(Math.round(Color.alpha(i) * 0.3f), Color.red(i), Color.green(i), Color.blue(i)));
            Paint paint2 = this.g;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.g.setStrokeWidth(this.a);
            Paint paint3 = new Paint(1);
            this.h = paint3;
            paint3.setStyle(style);
            this.h.setStrokeWidth(this.a);
            this.h.setStrokeCap(Paint.Cap.ROUND);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getColor() {
        return this.e;
    }

    public int getMax() {
        return this.d;
    }

    public int getMin() {
        return this.c;
    }

    public float getProgress() {
        return this.b;
    }

    public float getStrokeWidth() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f, this.g);
        canvas.save();
        canvas.rotate(-90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawArc(this.f, 0.0f, (this.b * 360.0f) / this.d, false, this.h);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(iMin, iMin);
        float f = this.a;
        float f2 = iMin;
        this.f.set((f / 2.0f) + 0.0f, (f / 2.0f) + 0.0f, f2 - (f / 2.0f), f2 - (f / 2.0f));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h.setShader(new SweepGradient(i / 2.0f, i2 / 2.0f, new int[]{getContext().getColor(R.color.progress_first), getContext().getColor(R.color.progress_second), getContext().getColor(R.color.progress_third), getContext().getColor(R.color.progress_fourth), getContext().getColor(R.color.progress_fifth)}, (float[]) null));
    }

    public void setColor(int i) {
        this.e = i;
        this.g.setColor(Color.argb(Math.round(Color.alpha(i) * 0.3f), Color.red(i), Color.green(i), Color.blue(i)));
        this.h.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setMax(int i) {
        this.d = i;
        invalidate();
    }

    public void setMin(int i) {
        this.c = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public void setStrokeWidth(float f) {
        this.a = f;
        this.g.setStrokeWidth(f);
        this.h.setStrokeWidth(f);
        invalidate();
        requestLayout();
    }
}
