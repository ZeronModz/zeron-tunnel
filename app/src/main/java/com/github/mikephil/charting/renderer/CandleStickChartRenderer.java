package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.od;
import defpackage.xm0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CandleStickChartRenderer extends LineScatterCandleRadarRenderer {
    public final CandleDataProvider h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;

    public CandleStickChartRenderer(CandleDataProvider candleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.i = new float[8];
        this.j = new float[4];
        this.k = new float[4];
        this.l = new float[4];
        this.m = new float[4];
        this.h = candleDataProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        CandleDataProvider candleDataProvider;
        CandleDataProvider candleDataProvider2 = this.h;
        for (ICandleDataSet iCandleDataSet : candleDataProvider2.getCandleData().i) {
            if (iCandleDataSet.isVisible()) {
                Transformer transformer = candleDataProvider2.getTransformer(iCandleDataSet.getAxisDependency());
                this.b.getClass();
                float barSpace = iCandleDataSet.getBarSpace();
                boolean showCandleBar = iCandleDataSet.getShowCandleBar();
                od odVar = this.f;
                odVar.a(candleDataProvider2, iCandleDataSet);
                float shadowWidth = iCandleDataSet.getShadowWidth();
                Paint paint = this.c;
                paint.setStrokeWidth(shadowWidth);
                int i = odVar.a;
                while (i <= odVar.c + odVar.a) {
                    CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(i);
                    if (candleEntry == null) {
                        candleDataProvider = candleDataProvider2;
                    } else {
                        float f = candleEntry.d;
                        float f2 = candleEntry.h;
                        float f3 = candleEntry.g;
                        float f4 = candleEntry.e;
                        float f5 = candleEntry.f;
                        if (showCandleBar) {
                            float[] fArr = this.i;
                            fArr[0] = f;
                            fArr[2] = f;
                            fArr[4] = f;
                            fArr[6] = f;
                            if (f2 > f3) {
                                fArr[1] = f4 * 1.0f;
                                fArr[3] = f2 * 1.0f;
                                fArr[5] = f5 * 1.0f;
                                fArr[7] = f3 * 1.0f;
                            } else if (f2 < f3) {
                                fArr[1] = f4 * 1.0f;
                                fArr[3] = f3 * 1.0f;
                                fArr[5] = f5 * 1.0f;
                                fArr[7] = f2 * 1.0f;
                            } else {
                                fArr[1] = f4 * 1.0f;
                                float f6 = f2 * 1.0f;
                                fArr[3] = f6;
                                fArr[5] = f5 * 1.0f;
                                fArr[7] = f6;
                            }
                            transformer.g(fArr);
                            if (!iCandleDataSet.getShadowColorSameAsCandle()) {
                                paint.setColor(iCandleDataSet.getShadowColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getShadowColor());
                            } else if (f2 > f3) {
                                paint.setColor(iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getDecreasingColor());
                            } else if (f2 < f3) {
                                paint.setColor(iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getIncreasingColor());
                            } else {
                                paint.setColor(iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getNeutralColor());
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            canvas.drawLines(fArr, paint);
                            float[] fArr2 = this.j;
                            fArr2[0] = (f - 0.5f) + barSpace;
                            fArr2[1] = f3 * 1.0f;
                            fArr2[2] = (f + 0.5f) - barSpace;
                            fArr2[3] = 1.0f * f2;
                            transformer.g(fArr2);
                            if (f2 > f3) {
                                if (iCandleDataSet.getDecreasingColor() == 1122867) {
                                    paint.setColor(iCandleDataSet.getColor(i));
                                } else {
                                    paint.setColor(iCandleDataSet.getDecreasingColor());
                                }
                                paint.setStyle(iCandleDataSet.getDecreasingPaintStyle());
                                canvas.drawRect(fArr2[0], fArr2[3], fArr2[2], fArr2[1], paint);
                            } else if (f2 < f3) {
                                if (iCandleDataSet.getIncreasingColor() == 1122867) {
                                    paint.setColor(iCandleDataSet.getColor(i));
                                } else {
                                    paint.setColor(iCandleDataSet.getIncreasingColor());
                                }
                                paint.setStyle(iCandleDataSet.getIncreasingPaintStyle());
                                canvas.drawRect(fArr2[0], fArr2[1], fArr2[2], fArr2[3], paint);
                            } else {
                                if (iCandleDataSet.getNeutralColor() == 1122867) {
                                    paint.setColor(iCandleDataSet.getColor(i));
                                } else {
                                    paint.setColor(iCandleDataSet.getNeutralColor());
                                }
                                canvas.drawLine(fArr2[0], fArr2[1], fArr2[2], fArr2[3], paint);
                            }
                            candleDataProvider = candleDataProvider2;
                        } else {
                            float[] fArr3 = this.k;
                            fArr3[0] = f;
                            fArr3[1] = f4 * 1.0f;
                            fArr3[2] = f;
                            fArr3[3] = f5 * 1.0f;
                            float[] fArr4 = this.l;
                            fArr4[0] = (f - 0.5f) + barSpace;
                            float f7 = f2 * 1.0f;
                            fArr4[1] = f7;
                            fArr4[2] = f;
                            fArr4[3] = f7;
                            candleDataProvider = candleDataProvider2;
                            float[] fArr5 = this.m;
                            fArr5[0] = (f + 0.5f) - barSpace;
                            float f8 = 1.0f * f3;
                            fArr5[1] = f8;
                            fArr5[2] = f;
                            fArr5[3] = f8;
                            transformer.g(fArr3);
                            transformer.g(fArr4);
                            transformer.g(fArr5);
                            paint.setColor(f2 > f3 ? iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getDecreasingColor() : f2 < f3 ? iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getIncreasingColor() : iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i) : iCandleDataSet.getNeutralColor());
                            canvas.drawLine(fArr3[0], fArr3[1], fArr3[2], fArr3[3], paint);
                            canvas.drawLine(fArr4[0], fArr4[1], fArr4[2], fArr4[3], paint);
                            canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], paint);
                        }
                    }
                    i++;
                    candleDataProvider2 = candleDataProvider;
                }
            }
            candleDataProvider2 = candleDataProvider2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void d(Canvas canvas, Highlight[] highlightArr) {
        CandleDataProvider candleDataProvider = this.h;
        CandleData candleData = candleDataProvider.getCandleData();
        for (Highlight highlight : highlightArr) {
            ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet = (ICandleDataSet) candleData.b(highlight.f);
            if (iLineScatterCandleRadarDataSet != null && iLineScatterCandleRadarDataSet.isHighlightEnabled()) {
                CandleEntry candleEntry = (CandleEntry) iLineScatterCandleRadarDataSet.getEntryForXValue(highlight.a, highlight.b);
                if (h(candleEntry, iLineScatterCandleRadarDataSet)) {
                    float f = candleEntry.f;
                    this.b.getClass();
                    xm0 xm0VarA = candleDataProvider.getTransformer(iLineScatterCandleRadarDataSet.getAxisDependency()).a(candleEntry.d, ((candleEntry.e * 1.0f) + (f * 1.0f)) / 2.0f);
                    float f2 = (float) xm0VarA.b;
                    float f3 = (float) xm0VarA.c;
                    highlight.i = f2;
                    highlight.j = f3;
                    j(canvas, f2, f3, iLineScatterCandleRadarDataSet);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void e(Canvas canvas) {
        CandleDataProvider candleDataProvider;
        List list;
        CandleDataProvider candleDataProvider2;
        List list2;
        Canvas canvas2;
        CandleDataProvider candleDataProvider3 = this.h;
        if (g(candleDataProvider3)) {
            List list3 = candleDataProvider3.getCandleData().i;
            int i = 0;
            while (i < list3.size()) {
                ICandleDataSet iCandleDataSet = (ICandleDataSet) list3.get(i);
                if (!BarLineScatterCandleBubbleRenderer.i(iCandleDataSet) || iCandleDataSet.getEntryCount() < 1) {
                    candleDataProvider = candleDataProvider3;
                    list = list3;
                } else {
                    a(iCandleDataSet);
                    Transformer transformer = candleDataProvider3.getTransformer(iCandleDataSet.getAxisDependency());
                    od odVar = this.f;
                    odVar.a(candleDataProvider3, iCandleDataSet);
                    this.b.getClass();
                    int i2 = odVar.a;
                    int i3 = ((int) (((odVar.b - i2) * 1.0f) + 1.0f)) * 2;
                    float[] fArr = transformer.g;
                    if (fArr.length != i3) {
                        fArr = new float[i3];
                        transformer.g = fArr;
                    }
                    for (int i4 = 0; i4 < i3; i4 += 2) {
                        CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex((i4 / 2) + i2);
                        if (candleEntry != null) {
                            fArr[i4] = candleEntry.d;
                            fArr[i4 + 1] = candleEntry.e * 1.0f;
                        } else {
                            fArr[i4] = 0.0f;
                            fArr[i4 + 1] = 0.0f;
                        }
                    }
                    transformer.b().mapPoints(fArr);
                    float fC = Utils.c(5.0f);
                    ValueFormatter valueFormatter = iCandleDataSet.getValueFormatter();
                    MPPointF mPPointFC = MPPointF.c(iCandleDataSet.getIconsOffset());
                    mPPointFC.b = Utils.c(mPPointFC.b);
                    mPPointFC.c = Utils.c(mPPointFC.c);
                    int i5 = 0;
                    while (i5 < fArr.length) {
                        float f = fArr[i5];
                        float f2 = fArr[i5 + 1];
                        ViewPortHandler viewPortHandler = this.a;
                        if (!viewPortHandler.f(f)) {
                            break;
                        }
                        if (viewPortHandler.e(f) && viewPortHandler.i(f2)) {
                            int i6 = i5 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) iCandleDataSet.getEntryForIndex(odVar.a + i6);
                            if (iCandleDataSet.isDrawValuesEnabled()) {
                                valueFormatter.getClass();
                                candleDataProvider2 = candleDataProvider3;
                                int valueTextColor = iCandleDataSet.getValueTextColor(i6);
                                list2 = list3;
                                Paint paint = this.e;
                                paint.setColor(valueTextColor);
                                canvas2 = canvas;
                                canvas2.drawText(valueFormatter.b(candleEntry2.e), f, f2 - fC, paint);
                            } else {
                                canvas2 = canvas;
                                candleDataProvider2 = candleDataProvider3;
                                list2 = list3;
                            }
                            if (candleEntry2.c != null && iCandleDataSet.isDrawIconsEnabled()) {
                                Drawable drawable = candleEntry2.c;
                                Utils.d(canvas2, drawable, (int) (f + mPPointFC.b), (int) (f2 + mPPointFC.c), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                        } else {
                            candleDataProvider2 = candleDataProvider3;
                            list2 = list3;
                        }
                        i5 += 2;
                        candleDataProvider3 = candleDataProvider2;
                        list3 = list2;
                    }
                    candleDataProvider = candleDataProvider3;
                    list = list3;
                    MPPointF.d(mPPointFC);
                }
                i++;
                candleDataProvider3 = candleDataProvider;
                list3 = list;
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
