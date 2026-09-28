package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarChartRenderer extends BarChartRenderer {
    public final RectF m;

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.m = new RectF();
        this.e.setTextAlign(Paint.Align.LEFT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public final void e(Canvas canvas) {
        List list;
        float f;
        boolean z;
        MPPointF mPPointF;
        BarDataProvider barDataProvider;
        IBarDataSet iBarDataSet;
        ValueFormatter valueFormatter;
        float[] fArr;
        int i;
        float f2;
        int i2;
        int i3;
        float f3;
        float[] fArr2;
        BarEntry barEntry;
        BarDataProvider barDataProvider2;
        int i4;
        List list2;
        int i5;
        Drawable drawable;
        float f4;
        boolean z2;
        ValueFormatter valueFormatter2;
        BarBuffer barBuffer;
        MPPointF mPPointF2;
        ViewPortHandler viewPortHandler;
        BarChartRenderer barChartRenderer = this;
        BarDataProvider barDataProvider3 = barChartRenderer.g;
        if (barChartRenderer.g(barDataProvider3)) {
            List list3 = barDataProvider3.getBarData().i;
            float fC = Utils.c(5.0f);
            boolean zIsDrawValueAboveBarEnabled = barDataProvider3.isDrawValueAboveBarEnabled();
            int i6 = 0;
            while (i6 < barDataProvider3.getBarData().c()) {
                IBarDataSet iBarDataSet2 = (IBarDataSet) list3.get(i6);
                if (BarLineScatterCandleBubbleRenderer.i(iBarDataSet2)) {
                    boolean zIsInverted = barDataProvider3.isInverted(iBarDataSet2.getAxisDependency());
                    barChartRenderer.a(iBarDataSet2);
                    Paint paint = barChartRenderer.e;
                    float f5 = 2.0f;
                    float fA = Utils.a(paint, "10") / 2.0f;
                    ValueFormatter valueFormatter3 = iBarDataSet2.getValueFormatter();
                    BarBuffer barBuffer2 = barChartRenderer.i[i6];
                    barChartRenderer.b.getClass();
                    MPPointF mPPointFC = MPPointF.c(iBarDataSet2.getIconsOffset());
                    mPPointFC.b = Utils.c(mPPointFC.b);
                    mPPointFC.c = Utils.c(mPPointFC.c);
                    boolean zIsStacked = iBarDataSet2.isStacked();
                    ViewPortHandler viewPortHandler2 = barChartRenderer.a;
                    if (zIsStacked) {
                        ValueFormatter valueFormatter4 = valueFormatter3;
                        list = list3;
                        f = fC;
                        z = zIsDrawValueAboveBarEnabled;
                        mPPointF = mPPointFC;
                        Transformer transformer = barDataProvider3.getTransformer(iBarDataSet2.getAxisDependency());
                        int i7 = 0;
                        int length = 0;
                        while (i7 < iBarDataSet2.getEntryCount() * 1.0f) {
                            BarEntry barEntry2 = (BarEntry) iBarDataSet2.getEntryForIndex(i7);
                            int valueTextColor = iBarDataSet2.getValueTextColor(i7);
                            float[] fArr3 = barEntry2.e;
                            Drawable drawable2 = barEntry2.c;
                            if (fArr3 == null) {
                                float[] fArr4 = barBuffer2.b;
                                int i8 = length + 1;
                                if (!viewPortHandler2.g(fArr4[i8])) {
                                    break;
                                }
                                if (viewPortHandler2.h(fArr4[length]) && viewPortHandler2.d(fArr4[i8])) {
                                    valueFormatter4.getClass();
                                    barDataProvider = barDataProvider3;
                                    valueFormatter = valueFormatter4;
                                    String strB = valueFormatter.b(barEntry2.a);
                                    float fMeasureText = (int) paint.measureText(strB);
                                    float f6 = z ? f : -(fMeasureText + f);
                                    float f7 = z ? -(fMeasureText + f) : f;
                                    if (zIsInverted) {
                                        f6 = (-f6) - fMeasureText;
                                        f7 = (-f7) - fMeasureText;
                                    }
                                    float f8 = f6;
                                    float f9 = f7;
                                    if (iBarDataSet2.isDrawValuesEnabled()) {
                                        iBarDataSet = iBarDataSet2;
                                        fArr = fArr3;
                                        fArr2 = fArr4;
                                        i = i6;
                                        barEntry = barEntry2;
                                        k(canvas, strB, fArr4[length + 2] + (barEntry2.a >= 0.0f ? f8 : f9), fArr4[i8] + fA, valueTextColor);
                                    } else {
                                        iBarDataSet = iBarDataSet2;
                                        fArr = fArr3;
                                        fArr2 = fArr4;
                                        i = i6;
                                        barEntry = barEntry2;
                                    }
                                    if (drawable2 != null && iBarDataSet.isDrawIconsEnabled()) {
                                        float f10 = fArr2[length + 2];
                                        if (barEntry.a < 0.0f) {
                                            f8 = f9;
                                        }
                                        Utils.d(canvas, drawable2, (int) (f10 + f8 + mPPointF.b), (int) (fArr2[i8] + mPPointF.c), drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                barDataProvider = barDataProvider3;
                                iBarDataSet = iBarDataSet2;
                                valueFormatter = valueFormatter4;
                                fArr = fArr3;
                                i = i6;
                                int length2 = fArr.length * 2;
                                float[] fArr5 = new float[length2];
                                float f11 = -barEntry2.g;
                                float f12 = 0.0f;
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < length2) {
                                    float f13 = fArr[i10];
                                    if (f13 == 0.0f && (f12 == 0.0f || f11 == 0.0f)) {
                                        float f14 = f11;
                                        f11 = f13;
                                        f3 = f14;
                                    } else if (f13 >= 0.0f) {
                                        f12 += f13;
                                        f3 = f11;
                                        f11 = f12;
                                    } else {
                                        f3 = f11 - f13;
                                    }
                                    fArr5[i9] = f11 * 1.0f;
                                    i9 += 2;
                                    i10++;
                                    f11 = f3;
                                }
                                transformer.g(fArr5);
                                int i11 = 0;
                                while (i11 < length2) {
                                    float f15 = fArr[i11 / 2];
                                    int i12 = i11;
                                    String strA = valueFormatter.a(f15, barEntry2);
                                    int i13 = length2;
                                    float fMeasureText2 = (int) paint.measureText(strA);
                                    float f16 = z ? f : -(fMeasureText2 + f);
                                    float[] fArr6 = fArr5;
                                    float f17 = z ? -(fMeasureText2 + f) : f;
                                    if (zIsInverted) {
                                        f16 = (-f16) - fMeasureText2;
                                        f17 = (-f17) - fMeasureText2;
                                    }
                                    boolean z3 = (f15 == 0.0f && f11 == 0.0f && f12 > 0.0f) || f15 < 0.0f;
                                    float f18 = fArr6[i12];
                                    if (z3) {
                                        f16 = f17;
                                    }
                                    float f19 = f18 + f16;
                                    float[] fArr7 = barBuffer2.b;
                                    float f20 = (fArr7[length + 1] + fArr7[length + 3]) / 2.0f;
                                    if (!viewPortHandler2.g(f20)) {
                                        break;
                                    }
                                    if (viewPortHandler2.h(f19) && viewPortHandler2.d(f20)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            f2 = f20;
                                            i2 = i12;
                                            k(canvas, strA, f19, f20 + fA, valueTextColor);
                                        } else {
                                            f2 = f20;
                                            i2 = i12;
                                        }
                                        i3 = valueTextColor;
                                        if (drawable2 != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Utils.d(canvas, drawable2, (int) (f19 + mPPointF.b), (int) (f2 + mPPointF.c), drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i2 = i12;
                                        i3 = valueTextColor;
                                    }
                                    i11 = i2 + 2;
                                    length2 = i13;
                                    fArr5 = fArr6;
                                    valueTextColor = i3;
                                }
                            }
                            length = fArr == null ? length + 4 : (fArr.length * 4) + length;
                            i7++;
                            iBarDataSet2 = iBarDataSet;
                            i6 = i;
                            valueFormatter4 = valueFormatter;
                            barDataProvider3 = barDataProvider;
                        }
                    } else {
                        int i14 = 0;
                        while (true) {
                            float f21 = i14;
                            float f22 = f5;
                            float[] fArr8 = barBuffer2.b;
                            if (f21 >= fArr8.length * 1.0f) {
                                break;
                            }
                            int i15 = i14 + 1;
                            float f23 = fArr8[i15];
                            float f24 = (f23 + fArr8[i14 + 3]) / f22;
                            if (!viewPortHandler2.g(f23)) {
                                break;
                            }
                            if (viewPortHandler2.h(fArr8[i14]) && viewPortHandler2.d(fArr8[i15])) {
                                BarEntry barEntry3 = (BarEntry) iBarDataSet2.getEntryForIndex(i14 / 4);
                                float f25 = barEntry3.a;
                                list2 = list3;
                                Drawable drawable3 = barEntry3.c;
                                valueFormatter3.getClass();
                                String strB2 = valueFormatter3.b(barEntry3.a);
                                ValueFormatter valueFormatter5 = valueFormatter3;
                                float fMeasureText3 = (int) paint.measureText(strB2);
                                float f26 = zIsDrawValueAboveBarEnabled ? fC : -(fMeasureText3 + fC);
                                float f27 = zIsDrawValueAboveBarEnabled ? -(fMeasureText3 + fC) : fC;
                                if (zIsInverted) {
                                    f26 = (-f26) - fMeasureText3;
                                    f27 = (-f27) - fMeasureText3;
                                }
                                float f28 = f26;
                                float f29 = f27;
                                if (iBarDataSet2.isDrawValuesEnabled()) {
                                    int i16 = i14;
                                    barBuffer = barBuffer2;
                                    drawable = drawable3;
                                    i5 = i16;
                                    f4 = fC;
                                    z2 = zIsDrawValueAboveBarEnabled;
                                    valueFormatter2 = valueFormatter5;
                                    mPPointF2 = mPPointFC;
                                    viewPortHandler = viewPortHandler2;
                                    k(canvas, strB2, fArr8[i14 + 2] + (f25 >= 0.0f ? f28 : f29), f24 + fA, iBarDataSet2.getValueTextColor(i16 / 2));
                                } else {
                                    i5 = i14;
                                    drawable = drawable3;
                                    f4 = fC;
                                    z2 = zIsDrawValueAboveBarEnabled;
                                    valueFormatter2 = valueFormatter5;
                                    barBuffer = barBuffer2;
                                    mPPointF2 = mPPointFC;
                                    viewPortHandler = viewPortHandler2;
                                }
                                if (drawable != null && iBarDataSet2.isDrawIconsEnabled()) {
                                    float f30 = fArr8[i5 + 2];
                                    if (f25 < 0.0f) {
                                        f28 = f29;
                                    }
                                    Utils.d(canvas, drawable, (int) (f30 + f28 + mPPointF2.b), (int) (f24 + mPPointF2.c), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                }
                            } else {
                                valueFormatter2 = valueFormatter3;
                                i5 = i14;
                                list2 = list3;
                                f4 = fC;
                                z2 = zIsDrawValueAboveBarEnabled;
                                barBuffer = barBuffer2;
                                mPPointF2 = mPPointFC;
                                viewPortHandler = viewPortHandler2;
                            }
                            i14 = i5 + 4;
                            barBuffer2 = barBuffer;
                            mPPointFC = mPPointF2;
                            viewPortHandler2 = viewPortHandler;
                            f5 = f22;
                            list3 = list2;
                            valueFormatter3 = valueFormatter2;
                            fC = f4;
                            zIsDrawValueAboveBarEnabled = z2;
                        }
                        list = list3;
                        f = fC;
                        z = zIsDrawValueAboveBarEnabled;
                        mPPointF = mPPointFC;
                    }
                    barDataProvider2 = barDataProvider3;
                    i4 = i6;
                    MPPointF.d(mPPointF);
                } else {
                    barDataProvider2 = barDataProvider3;
                    list = list3;
                    f = fC;
                    z = zIsDrawValueAboveBarEnabled;
                    i4 = i6;
                }
                i6 = i4 + 1;
                barChartRenderer = this;
                barDataProvider3 = barDataProvider2;
                list3 = list;
                fC = f;
                zIsDrawValueAboveBarEnabled = z;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
        BarData barData = this.g.getBarData();
        this.i = new HorizontalBarBuffer[barData.c()];
        for (int i = 0; i < this.i.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.b(i);
            this.i[i] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.c(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final boolean g(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().d()) < ((float) chartInterface.getMaxVisibleCount()) * this.a.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void j(Canvas canvas, IBarDataSet iBarDataSet, int i) {
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
                RectF rectF = this.m;
                rectF.top = f2 - f;
                rectF.bottom = f2 + f;
                transformer.a.mapRect(rectF);
                transformer.c.a.mapRect(rectF);
                transformer.b.mapRect(rectF);
                if (viewPortHandler.g(rectF.bottom)) {
                    if (!viewPortHandler.d(rectF.top)) {
                        break;
                    }
                    RectF rectF2 = viewPortHandler.b;
                    rectF.left = rectF2.left;
                    rectF.right = rectF2.right;
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
            int i4 = i3 + 3;
            if (!viewPortHandler.g(fArr[i4])) {
                return;
            }
            int i5 = i3 + 1;
            if (viewPortHandler.d(fArr[i5])) {
                if (!z2) {
                    paint4.setColor(iBarDataSet.getColor(i3 / 4));
                }
                int i6 = i3 + 2;
                paint = paint4;
                canvas2.drawRect(fArr[i3], fArr[i5], fArr[i6], fArr[i4], paint);
                if (z) {
                    canvas.drawRect(fArr[i3], fArr[i5], fArr[i6], fArr[i4], paint2);
                }
            } else {
                paint = paint4;
            }
            i3 += 4;
            canvas2 = canvas;
            paint4 = paint;
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void k(Canvas canvas, String str, float f, float f2, int i) {
        Paint paint = this.e;
        paint.setColor(i);
        canvas.drawText(str, f, f2, paint);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void l(float f, float f2, float f3, float f4, Transformer transformer) {
        float f5 = f - f4;
        float f6 = f + f4;
        RectF rectF = this.h;
        rectF.set(f2, f5, f3, f6);
        this.b.getClass();
        transformer.getClass();
        rectF.left *= 1.0f;
        rectF.right *= 1.0f;
        transformer.a.mapRect(rectF);
        transformer.c.a.mapRect(rectF);
        transformer.b.mapRect(rectF);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void m(Highlight highlight, RectF rectF) {
        float fCenterY = rectF.centerY();
        float f = rectF.right;
        highlight.i = fCenterY;
        highlight.j = f;
    }
}
