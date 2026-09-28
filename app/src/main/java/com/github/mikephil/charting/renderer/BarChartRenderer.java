package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.sandok.tunnel.core.Connection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    public final BarDataProvider g;
    public final RectF h;
    public BarBuffer[] i;
    public final Paint j;
    public final Paint k;
    public final RectF l;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.h = new RectF();
        this.l = new RectF();
        this.g = barDataProvider;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.d.setColor(Color.rgb(0, 0, 0));
        this.d.setAlpha(Connection.CONNECTION_DEFAULT_TIMEOUT);
        Paint paint2 = new Paint(1);
        this.j = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        BarData barData = this.g.getBarData();
        for (int i = 0; i < barData.c(); i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.b(i);
            if (iBarDataSet.isVisible()) {
                j(canvas, iBarDataSet, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void d(Canvas canvas, Highlight[] highlightArr) {
        float f;
        float f2;
        float f3;
        float f4;
        BarDataProvider barDataProvider = this.g;
        BarData barData = barDataProvider.getBarData();
        for (Highlight highlight : highlightArr) {
            int i = highlight.f;
            int i2 = highlight.g;
            IBarDataSet iBarDataSet = (IBarDataSet) barData.b(i);
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.a, highlight.b);
                if (h(barEntry, iBarDataSet)) {
                    Transformer transformer = barDataProvider.getTransformer(iBarDataSet.getAxisDependency());
                    this.d.setColor(iBarDataSet.getHighLightColor());
                    this.d.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (i2 < 0 || barEntry.e == null) {
                        f = barEntry.a;
                        f2 = 0.0f;
                    } else if (barDataProvider.isHighlightFullBarEnabled()) {
                        f = barEntry.h;
                        f2 = -barEntry.g;
                    } else {
                        Range range = barEntry.f[i2];
                        f3 = range.a;
                        f4 = range.b;
                        l(barEntry.d, f3, f4, barData.j / 2.0f, transformer);
                        RectF rectF = this.h;
                        m(highlight, rectF);
                        canvas.drawRect(rectF, this.d);
                    }
                    float f5 = f2;
                    f3 = f;
                    f4 = f5;
                    l(barEntry.d, f3, f4, barData.j / 2.0f, transformer);
                    RectF rectF2 = this.h;
                    m(highlight, rectF2);
                    canvas.drawRect(rectF2, this.d);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void e(Canvas canvas) {
        List list;
        float f;
        MPPointF mPPointF;
        int i;
        BarDataProvider barDataProvider;
        int i2;
        ValueFormatter valueFormatter;
        float[] fArr;
        boolean z;
        float[] fArr2;
        int i3;
        float f2;
        int i4;
        Drawable drawable;
        float f3;
        float f4;
        Drawable drawable2;
        float[] fArr3;
        float f5;
        BarEntry barEntry;
        BarDataProvider barDataProvider2;
        boolean z2;
        int i5;
        ValueFormatter valueFormatter2;
        int i6;
        List list2;
        float f6;
        MPPointF mPPointF2;
        ViewPortHandler viewPortHandler;
        float f7;
        Drawable drawable3;
        BarChartRenderer barChartRenderer = this;
        BarDataProvider barDataProvider3 = barChartRenderer.g;
        if (barChartRenderer.g(barDataProvider3)) {
            List list3 = barDataProvider3.getBarData().i;
            float fC = Utils.c(4.5f);
            boolean zIsDrawValueAboveBarEnabled = barDataProvider3.isDrawValueAboveBarEnabled();
            int i7 = 0;
            while (i7 < barDataProvider3.getBarData().c()) {
                IBarDataSet iBarDataSet = (IBarDataSet) list3.get(i7);
                if (BarLineScatterCandleBubbleRenderer.i(iBarDataSet)) {
                    barChartRenderer.a(iBarDataSet);
                    boolean zIsInverted = barDataProvider3.isInverted(iBarDataSet.getAxisDependency());
                    float fA = Utils.a(barChartRenderer.e, "8");
                    float f8 = zIsDrawValueAboveBarEnabled ? -fC : fA + fC;
                    float f9 = zIsDrawValueAboveBarEnabled ? fA + fC : -fC;
                    if (zIsInverted) {
                        f8 = (-f8) - fA;
                        f9 = (-f9) - fA;
                    }
                    float f10 = f8;
                    float f11 = f9;
                    BarBuffer barBuffer = barChartRenderer.i[i7];
                    barChartRenderer.b.getClass();
                    ValueFormatter valueFormatter3 = iBarDataSet.getValueFormatter();
                    MPPointF mPPointFC = MPPointF.c(iBarDataSet.getIconsOffset());
                    mPPointFC.b = Utils.c(mPPointFC.b);
                    mPPointFC.c = Utils.c(mPPointFC.c);
                    boolean zIsStacked = iBarDataSet.isStacked();
                    ViewPortHandler viewPortHandler2 = barChartRenderer.a;
                    if (zIsStacked) {
                        ValueFormatter valueFormatter4 = valueFormatter3;
                        list = list3;
                        f = fC;
                        mPPointF = mPPointFC;
                        Transformer transformer = barDataProvider3.getTransformer(iBarDataSet.getAxisDependency());
                        int i8 = 0;
                        int length = 0;
                        while (i8 < iBarDataSet.getEntryCount() * 1.0f) {
                            BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i8);
                            float[] fArr4 = barEntry2.e;
                            Drawable drawable4 = barEntry2.c;
                            float[] fArr5 = barBuffer.b;
                            float f12 = (fArr5[length] + fArr5[length + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i8);
                            if (fArr4 != null) {
                                i = i8;
                                Drawable drawable5 = drawable4;
                                float f13 = f12;
                                barDataProvider = barDataProvider3;
                                i2 = i7;
                                int i9 = valueTextColor;
                                valueFormatter = valueFormatter4;
                                fArr = fArr4;
                                z = zIsDrawValueAboveBarEnabled;
                                int length2 = fArr.length * 2;
                                float[] fArr6 = new float[length2];
                                float f14 = -barEntry2.g;
                                float f15 = 0.0f;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length2) {
                                    float f16 = fArr[i11];
                                    if (f16 == 0.0f && (f15 == 0.0f || f14 == 0.0f)) {
                                        f4 = f14;
                                        f14 = f16;
                                    } else if (f16 >= 0.0f) {
                                        f15 += f16;
                                        f4 = f14;
                                        f14 = f15;
                                    } else {
                                        f4 = f14 - f16;
                                    }
                                    fArr6[i10 + 1] = f14 * 1.0f;
                                    i10 += 2;
                                    i11++;
                                    f14 = f4;
                                }
                                transformer.g(fArr6);
                                int i12 = 0;
                                while (i12 < length2) {
                                    float f17 = fArr[i12 / 2];
                                    int i13 = length2;
                                    float f18 = fArr6[i12 + 1] + (((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0 && (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1)) == 0 && (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1)) > 0) || (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) < 0 ? f11 : f10);
                                    if (!viewPortHandler2.f(f13)) {
                                        break;
                                    }
                                    if (viewPortHandler2.i(f18) && viewPortHandler2.e(f13)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            String strA = valueFormatter.a(f17, barEntry2);
                                            fArr2 = fArr6;
                                            i3 = i12;
                                            f3 = f18;
                                            k(canvas, strA, f13, f3, i9);
                                        } else {
                                            f3 = f18;
                                            fArr2 = fArr6;
                                            i3 = i12;
                                        }
                                        f2 = f13;
                                        i4 = i9;
                                        if (drawable5 != null && iBarDataSet.isDrawIconsEnabled()) {
                                            drawable = drawable5;
                                            Utils.d(canvas, drawable, (int) (f2 + mPPointF.b), (int) (mPPointF.c + f3), drawable5.getIntrinsicWidth(), drawable5.getIntrinsicHeight());
                                        }
                                        i12 = i3 + 2;
                                        drawable5 = drawable;
                                        fArr6 = fArr2;
                                        length2 = i13;
                                        f13 = f2;
                                        i9 = i4;
                                    } else {
                                        fArr2 = fArr6;
                                        i3 = i12;
                                        f2 = f13;
                                        i4 = i9;
                                    }
                                    drawable = drawable5;
                                    i12 = i3 + 2;
                                    drawable5 = drawable;
                                    fArr6 = fArr2;
                                    length2 = i13;
                                    f13 = f2;
                                    i9 = i4;
                                }
                            } else {
                                if (!viewPortHandler2.f(f12)) {
                                    break;
                                }
                                int i14 = length + 1;
                                i = i8;
                                if (viewPortHandler2.i(fArr5[i14]) && viewPortHandler2.e(f12)) {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        valueFormatter4.getClass();
                                        barDataProvider = barDataProvider3;
                                        valueFormatter = valueFormatter4;
                                        fArr3 = fArr5;
                                        i2 = i7;
                                        fArr = fArr4;
                                        drawable2 = drawable4;
                                        f5 = f12;
                                        z = zIsDrawValueAboveBarEnabled;
                                        barEntry = barEntry2;
                                        k(canvas, valueFormatter.b(barEntry2.a), f5, fArr5[i14] + (barEntry2.a >= 0.0f ? f10 : f11), valueTextColor);
                                    } else {
                                        drawable2 = drawable4;
                                        fArr3 = fArr5;
                                        f5 = f12;
                                        barDataProvider = barDataProvider3;
                                        z = zIsDrawValueAboveBarEnabled;
                                        i2 = i7;
                                        valueFormatter = valueFormatter4;
                                        barEntry = barEntry2;
                                        fArr = fArr4;
                                    }
                                    if (drawable2 != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Utils.d(canvas, drawable2, (int) (f5 + mPPointF.b), (int) (fArr3[i14] + (barEntry.a >= 0.0f ? f10 : f11) + mPPointF.c), drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                    }
                                } else {
                                    barDataProvider = barDataProvider3;
                                    i2 = i7;
                                    valueFormatter4 = valueFormatter4;
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    i8 = i;
                                    barDataProvider3 = barDataProvider;
                                    i7 = i2;
                                }
                            }
                            length = fArr == null ? length + 4 : (fArr.length * 4) + length;
                            i8 = i + 1;
                            valueFormatter4 = valueFormatter;
                            zIsDrawValueAboveBarEnabled = z;
                            barDataProvider3 = barDataProvider;
                            i7 = i2;
                        }
                    } else {
                        int i15 = 0;
                        while (true) {
                            float f19 = i15;
                            float[] fArr7 = barBuffer.b;
                            if (f19 >= fArr7.length * 1.0f) {
                                break;
                            }
                            float f20 = (fArr7[i15] + fArr7[i15 + 2]) / 2.0f;
                            if (!viewPortHandler2.f(f20)) {
                                break;
                            }
                            int i16 = i15 + 1;
                            if (viewPortHandler2.i(fArr7[i16]) && viewPortHandler2.e(f20)) {
                                int i17 = i15 / 4;
                                BarEntry barEntry3 = (BarEntry) iBarDataSet.getEntryForIndex(i17);
                                list2 = list3;
                                float f21 = barEntry3.a;
                                Drawable drawable6 = barEntry3.c;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    valueFormatter3.getClass();
                                    String strB = valueFormatter3.b(barEntry3.a);
                                    float f22 = f21 >= 0.0f ? fArr7[i16] + f10 : fArr7[i15 + 3] + f11;
                                    i6 = i15;
                                    f7 = f20;
                                    valueFormatter2 = valueFormatter3;
                                    f6 = fC;
                                    viewPortHandler = viewPortHandler2;
                                    float f23 = f22;
                                    drawable3 = drawable6;
                                    mPPointF2 = mPPointFC;
                                    k(canvas, strB, f7, f23, iBarDataSet.getValueTextColor(i17));
                                } else {
                                    i6 = i15;
                                    f7 = f20;
                                    valueFormatter2 = valueFormatter3;
                                    drawable3 = drawable6;
                                    f6 = fC;
                                    mPPointF2 = mPPointFC;
                                    viewPortHandler = viewPortHandler2;
                                }
                                if (drawable3 != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Utils.d(canvas, drawable3, (int) (mPPointF2.b + f7), (int) ((f21 >= 0.0f ? fArr7[i16] + f10 : fArr7[i6 + 3] + f11) + mPPointF2.c), drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
                                }
                            } else {
                                valueFormatter2 = valueFormatter3;
                                i6 = i15;
                                list2 = list3;
                                f6 = fC;
                                mPPointF2 = mPPointFC;
                                viewPortHandler = viewPortHandler2;
                            }
                            i15 = i6 + 4;
                            mPPointFC = mPPointF2;
                            viewPortHandler2 = viewPortHandler;
                            list3 = list2;
                            valueFormatter3 = valueFormatter2;
                            fC = f6;
                        }
                        list = list3;
                        f = fC;
                        mPPointF = mPPointFC;
                    }
                    barDataProvider2 = barDataProvider3;
                    z2 = zIsDrawValueAboveBarEnabled;
                    i5 = i7;
                    MPPointF.d(mPPointF);
                } else {
                    barDataProvider2 = barDataProvider3;
                    list = list3;
                    f = fC;
                    z2 = zIsDrawValueAboveBarEnabled;
                    i5 = i7;
                }
                i7 = i5 + 1;
                barChartRenderer = this;
                list3 = list;
                zIsDrawValueAboveBarEnabled = z2;
                barDataProvider3 = barDataProvider2;
                fC = f;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void f() {
        BarData barData = this.g.getBarData();
        this.i = new BarBuffer[barData.c()];
        for (int i = 0; i < this.i.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.b(i);
            this.i[i] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.c(), iBarDataSet.isStacked());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        Paint paint;
        YAxis.AxisDependency axisDependency = iBarDataSet.getAxisDependency();
        BarDataProvider barDataProvider = this.g;
        Transformer transformer = barDataProvider.getTransformer(axisDependency);
        int barBorderColor = iBarDataSet.getBarBorderColor();
        Paint paint2 = this.k;
        paint2.setColor(barBorderColor);
        paint2.setStrokeWidth(Utils.c(iBarDataSet.getBarBorderWidth()));
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        this.b.getClass();
        boolean zIsDrawBarShadowEnabled = barDataProvider.isDrawBarShadowEnabled();
        ViewPortHandler viewPortHandler = this.a;
        if (zIsDrawBarShadowEnabled) {
            int barShadowColor = iBarDataSet.getBarShadowColor();
            Paint paint3 = this.j;
            paint3.setColor(barShadowColor);
            float f = barDataProvider.getBarData().j / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * 1.0f), iBarDataSet.getEntryCount());
            for (int i2 = 0; i2 < iMin; i2++) {
                float f2 = ((BarEntry) iBarDataSet.getEntryForIndex(i2)).d;
                RectF rectF = this.l;
                rectF.left = f2 - f;
                rectF.right = f2 + f;
                transformer.a.mapRect(rectF);
                transformer.c.a.mapRect(rectF);
                transformer.b.mapRect(rectF);
                if (viewPortHandler.e(rectF.right)) {
                    if (!viewPortHandler.f(rectF.left)) {
                        break;
                    }
                    RectF rectF2 = viewPortHandler.b;
                    rectF.top = rectF2.top;
                    rectF.bottom = rectF2.bottom;
                    canvas.drawRect(rectF, paint3);
                }
            }
        }
        Canvas canvas2 = canvas;
        BarBuffer barBuffer = this.i[i];
        barBuffer.getClass();
        float[] fArr = barBuffer.b;
        barBuffer.d = barDataProvider.isInverted(iBarDataSet.getAxisDependency());
        barBuffer.e = barDataProvider.getBarData().j;
        barBuffer.b(iBarDataSet);
        transformer.g(fArr);
        boolean z2 = iBarDataSet.getColors().size() == 1;
        Paint paint4 = this.c;
        if (z2) {
            paint4.setColor(iBarDataSet.getColor());
        }
        int i3 = 0;
        while (i3 < fArr.length) {
            int i4 = i3 + 2;
            if (!viewPortHandler.e(fArr[i4])) {
                paint = paint4;
            } else {
                if (!viewPortHandler.f(fArr[i3])) {
                    return;
                }
                if (!z2) {
                    paint4.setColor(iBarDataSet.getColor(i3 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    GradientColor gradientColor = iBarDataSet.getGradientColor();
                    float f3 = fArr[i3];
                    paint4.setShader(new LinearGradient(f3, fArr[i3 + 3], f3, fArr[i3 + 1], gradientColor.a, gradientColor.b, Shader.TileMode.MIRROR));
                }
                if (iBarDataSet.getGradientColors() != null) {
                    float f4 = fArr[i3];
                    int i5 = i3 / 4;
                    paint4.setShader(new LinearGradient(f4, fArr[i3 + 3], f4, fArr[i3 + 1], iBarDataSet.getGradientColor(i5).a, iBarDataSet.getGradientColor(i5).b, Shader.TileMode.MIRROR));
                }
                int i6 = i3 + 1;
                int i7 = i3 + 3;
                paint = paint4;
                canvas2.drawRect(fArr[i3], fArr[i6], fArr[i4], fArr[i7], paint);
                if (z) {
                    canvas.drawRect(fArr[i3], fArr[i6], fArr[i4], fArr[i7], paint2);
                }
            }
            i3 += 4;
            canvas2 = canvas;
            paint4 = paint;
        }
    }

    public void k(Canvas canvas, String str, float f, float f2, int i) {
        Paint paint = this.e;
        paint.setColor(i);
        canvas.drawText(str, f, f2, paint);
    }

    public void l(float f, float f2, float f3, float f4, Transformer transformer) {
        float f5 = f - f4;
        float f6 = f + f4;
        RectF rectF = this.h;
        rectF.set(f5, f2, f6, f3);
        this.b.getClass();
        transformer.getClass();
        rectF.top *= 1.0f;
        rectF.bottom *= 1.0f;
        transformer.a.mapRect(rectF);
        transformer.c.a.mapRect(rectF);
        transformer.b.mapRect(rectF);
    }

    public void m(Highlight highlight, RectF rectF) {
        float fCenterX = rectF.centerX();
        float f = rectF.top;
        highlight.i = fCenterX;
        highlight.j = f;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void c(Canvas canvas) {
    }
}
