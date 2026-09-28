package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.od;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BubbleChartRenderer extends BarLineScatterCandleBubbleRenderer {
    public final BubbleDataProvider g;
    public final float[] h;
    public final float[] i;
    public final float[] j;

    public BubbleChartRenderer(BubbleDataProvider bubbleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.h = new float[4];
        this.i = new float[2];
        this.j = new float[3];
        this.g = bubbleDataProvider;
        this.c.setStyle(Paint.Style.FILL);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(Utils.c(1.5f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        char c;
        BubbleDataProvider bubbleDataProvider = this.g;
        for (IBubbleDataSet iBubbleDataSet : bubbleDataProvider.getBubbleData().i) {
            if (iBubbleDataSet.isVisible()) {
                char c2 = 1;
                if (iBubbleDataSet.getEntryCount() >= 1) {
                    Transformer transformer = bubbleDataProvider.getTransformer(iBubbleDataSet.getAxisDependency());
                    this.b.getClass();
                    od odVar = this.f;
                    odVar.a(bubbleDataProvider, iBubbleDataSet);
                    float[] fArr = this.h;
                    char c3 = 0;
                    float f = 0.0f;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.g(fArr);
                    boolean zIsNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
                    float fAbs = Math.abs(fArr[2] - fArr[0]);
                    ViewPortHandler viewPortHandler = this.a;
                    RectF rectF = viewPortHandler.b;
                    float fMin = Math.min(Math.abs(rectF.bottom - rectF.top), fAbs);
                    int i = odVar.a;
                    while (i <= odVar.c + odVar.a) {
                        BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i);
                        float f2 = bubbleEntry.d;
                        char c4 = c2;
                        float[] fArr2 = this.i;
                        fArr2[c3] = f2;
                        fArr2[c4] = bubbleEntry.a * 1.0f;
                        transformer.g(fArr2);
                        float fSqrt = bubbleEntry.e;
                        float maxSize = iBubbleDataSet.getMaxSize();
                        if (!zIsNormalizeSizeEnabled) {
                            c = c3;
                        } else if (maxSize == f) {
                            c = c3;
                            fSqrt = 1.0f;
                        } else {
                            float f3 = fSqrt / maxSize;
                            c = c3;
                            fSqrt = (float) Math.sqrt(f3);
                        }
                        float f4 = (fSqrt * fMin) / 2.0f;
                        if (viewPortHandler.g(fArr2[c4] + f4) && viewPortHandler.d(fArr2[c4] - f4) && viewPortHandler.e(fArr2[c] + f4)) {
                            if (!viewPortHandler.f(fArr2[c] - f4)) {
                                break;
                            }
                            int color = iBubbleDataSet.getColor((int) bubbleEntry.d);
                            Paint paint = this.c;
                            paint.setColor(color);
                            canvas.drawCircle(fArr2[c], fArr2[c4], f4, paint);
                        }
                        i++;
                        c2 = c4;
                        c3 = c;
                        f = 0.0f;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r22, com.github.mikephil.charting.highlight.Highlight[] r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.BubbleChartRenderer.d(android.graphics.Canvas, com.github.mikephil.charting.highlight.Highlight[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void e(Canvas canvas) {
        BubbleDataProvider bubbleDataProvider;
        List list;
        Canvas canvas2;
        BubbleChartRenderer bubbleChartRenderer = this;
        BubbleDataProvider bubbleDataProvider2 = bubbleChartRenderer.g;
        BubbleData bubbleData = bubbleDataProvider2.getBubbleData();
        if (bubbleData != null && bubbleChartRenderer.g(bubbleDataProvider2)) {
            List list2 = bubbleData.i;
            Paint paint = bubbleChartRenderer.e;
            float fA = Utils.a(paint, "1");
            int i = 0;
            while (i < list2.size()) {
                IBubbleDataSet iBubbleDataSet = (IBubbleDataSet) list2.get(i);
                if (!BarLineScatterCandleBubbleRenderer.i(iBubbleDataSet) || iBubbleDataSet.getEntryCount() < 1) {
                    bubbleDataProvider = bubbleDataProvider2;
                    list = list2;
                } else {
                    bubbleChartRenderer.a(iBubbleDataSet);
                    bubbleChartRenderer.b.getClass();
                    float f = 1.0f;
                    float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
                    od odVar = bubbleChartRenderer.f;
                    odVar.a(bubbleDataProvider2, iBubbleDataSet);
                    Transformer transformer = bubbleDataProvider2.getTransformer(iBubbleDataSet.getAxisDependency());
                    int i2 = odVar.a;
                    int i3 = ((odVar.b - i2) + 1) * 2;
                    float[] fArr = transformer.e;
                    if (fArr.length != i3) {
                        fArr = new float[i3];
                        transformer.e = fArr;
                    }
                    int i4 = 0;
                    while (i4 < i3) {
                        float f2 = f;
                        ?? entryForIndex = iBubbleDataSet.getEntryForIndex((i4 / 2) + i2);
                        if (entryForIndex != 0) {
                            fArr[i4] = entryForIndex.b();
                            fArr[i4 + 1] = entryForIndex.a() * f2;
                        } else {
                            fArr[i4] = 0.0f;
                            fArr[i4 + 1] = 0.0f;
                        }
                        i4 += 2;
                        f = f2;
                    }
                    float f3 = f;
                    transformer.b().mapPoints(fArr);
                    float f4 = fMax == f3 ? f3 : fMax;
                    ValueFormatter valueFormatter = iBubbleDataSet.getValueFormatter();
                    MPPointF mPPointFC = MPPointF.c(iBubbleDataSet.getIconsOffset());
                    mPPointFC.b = Utils.c(mPPointFC.b);
                    mPPointFC.c = Utils.c(mPPointFC.c);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= fArr.length) {
                            bubbleDataProvider = bubbleDataProvider2;
                            list = list2;
                            break;
                        }
                        int i6 = i5 / 2;
                        int valueTextColor = iBubbleDataSet.getValueTextColor(odVar.a + i6);
                        bubbleDataProvider = bubbleDataProvider2;
                        list = list2;
                        int iArgb = Color.argb(Math.round(255.0f * f4), Color.red(valueTextColor), Color.green(valueTextColor), Color.blue(valueTextColor));
                        float f5 = fArr[i5];
                        float f6 = fArr[i5 + 1];
                        ViewPortHandler viewPortHandler = bubbleChartRenderer.a;
                        if (!viewPortHandler.f(f5)) {
                            break;
                        }
                        if (viewPortHandler.e(f5) && viewPortHandler.i(f6)) {
                            BubbleEntry bubbleEntry = (BubbleEntry) iBubbleDataSet.getEntryForIndex(i6 + odVar.a);
                            if (iBubbleDataSet.isDrawValuesEnabled()) {
                                valueFormatter.getClass();
                                paint.setColor(iArgb);
                                canvas2 = canvas;
                                canvas2.drawText(valueFormatter.b(bubbleEntry.e), f5, (0.5f * fA) + f6, paint);
                            } else {
                                canvas2 = canvas;
                            }
                            if (bubbleEntry.c != null && iBubbleDataSet.isDrawIconsEnabled()) {
                                Drawable drawable = bubbleEntry.c;
                                Utils.d(canvas2, drawable, (int) (f5 + mPPointFC.b), (int) (f6 + mPPointFC.c), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                        }
                        i5 += 2;
                        bubbleChartRenderer = this;
                        bubbleDataProvider2 = bubbleDataProvider;
                        list2 = list;
                    }
                    MPPointF.d(mPPointFC);
                }
                i++;
                bubbleChartRenderer = this;
                bubbleDataProvider2 = bubbleDataProvider;
                list2 = list;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void c(Canvas canvas) {
    }
}
