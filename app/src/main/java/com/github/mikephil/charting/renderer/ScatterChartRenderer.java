package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.xm0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    public final ScatterDataProvider h;
    public final float[] i;

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.i = new float[2];
        this.h = scatterDataProvider;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        ScatterDataProvider scatterDataProvider = this.h;
        for (IScatterDataSet iScatterDataSet : scatterDataProvider.getScatterData().i) {
            if (iScatterDataSet.isVisible() && iScatterDataSet.getEntryCount() >= 1) {
                Transformer transformer = scatterDataProvider.getTransformer(iScatterDataSet.getAxisDependency());
                this.b.getClass();
                IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
                if (shapeRenderer != null) {
                    int iMin = (int) Math.min(Math.ceil(iScatterDataSet.getEntryCount() * 1.0f), iScatterDataSet.getEntryCount());
                    for (int i = 0; i < iMin; i++) {
                        ?? entryForIndex = iScatterDataSet.getEntryForIndex(i);
                        float fB = entryForIndex.b();
                        float[] fArr = this.i;
                        fArr[0] = fB;
                        fArr[1] = entryForIndex.a() * 1.0f;
                        transformer.g(fArr);
                        float f = fArr[0];
                        ViewPortHandler viewPortHandler = this.a;
                        if (!viewPortHandler.f(f)) {
                            break;
                        }
                        if (viewPortHandler.e(fArr[0]) && viewPortHandler.i(fArr[1])) {
                            int color = iScatterDataSet.getColor(i / 2);
                            Paint paint = this.c;
                            paint.setColor(color);
                            shapeRenderer.renderShape(canvas, iScatterDataSet, this.a, fArr[0], fArr[1], paint);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void d(Canvas canvas, Highlight[] highlightArr) {
        ScatterDataProvider scatterDataProvider = this.h;
        ScatterData scatterData = scatterDataProvider.getScatterData();
        for (Highlight highlight : highlightArr) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) scatterData.b(highlight.f);
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iScatterDataSet.getEntryForXValue(highlight.a, highlight.b);
                if (h(entryForXValue, iScatterDataSet)) {
                    Transformer transformer = scatterDataProvider.getTransformer(iScatterDataSet.getAxisDependency());
                    float fB = entryForXValue.b();
                    float fA = entryForXValue.a();
                    this.b.getClass();
                    xm0 xm0VarA = transformer.a(fB, fA * 1.0f);
                    float f = (float) xm0VarA.b;
                    float f2 = (float) xm0VarA.c;
                    highlight.i = f;
                    highlight.j = f2;
                    j(canvas, f, f2, iScatterDataSet);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.ScatterChartRenderer.e(android.graphics.Canvas):void");
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void c(Canvas canvas) {
    }
}
