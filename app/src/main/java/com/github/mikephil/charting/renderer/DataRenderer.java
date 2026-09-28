package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DataRenderer extends Renderer {
    public final ChartAnimator b;
    public final Paint c;
    public Paint d;
    public final Paint e;

    public DataRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(viewPortHandler);
        this.b = chartAnimator;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(Utils.c(9.0f));
        Paint paint3 = new Paint(1);
        this.d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(2.0f);
        this.d.setColor(Color.rgb(255, 187, 115));
    }

    public final void a(IDataSet iDataSet) {
        Typeface valueTypeface = iDataSet.getValueTypeface();
        Paint paint = this.e;
        paint.setTypeface(valueTypeface);
        paint.setTextSize(iDataSet.getValueTextSize());
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, Highlight[] highlightArr);

    public abstract void e(Canvas canvas);

    public abstract void f();

    public boolean g(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().d()) < ((float) chartInterface.getMaxVisibleCount()) * this.a.i;
    }
}
