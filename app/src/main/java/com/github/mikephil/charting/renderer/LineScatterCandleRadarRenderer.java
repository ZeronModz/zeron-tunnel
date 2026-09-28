package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LineScatterCandleRadarRenderer extends BarLineScatterCandleBubbleRenderer {
    public final Path g;

    public LineScatterCandleRadarRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.g = new Path();
    }

    public final void j(Canvas canvas, float f, float f2, ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        this.d.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.d.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.d.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        boolean zIsVerticalHighlightIndicatorEnabled = iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled();
        ViewPortHandler viewPortHandler = this.a;
        Path path = this.g;
        if (zIsVerticalHighlightIndicatorEnabled) {
            path.reset();
            path.moveTo(f, viewPortHandler.b.top);
            path.lineTo(f, viewPortHandler.b.bottom);
            canvas.drawPath(path, this.d);
        }
        if (iLineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()) {
            path.reset();
            path.moveTo(viewPortHandler.b.left, f2);
            path.lineTo(viewPortHandler.b.right, f2);
            canvas.drawPath(path, this.d);
        }
    }
}
