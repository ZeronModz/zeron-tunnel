package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class RadarHighlighter extends PieRadarHighlighter<RadarChart> {
    public RadarHighlighter(RadarChart radarChart) {
        super(radarChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    public final Highlight a(float f, float f2, int i) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        RadarChart radarChart = (RadarChart) this.a;
        radarChart.getAnimator().getClass();
        radarChart.getAnimator().getClass();
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
        for (int i2 = 0; i2 < ((RadarData) radarChart.getData()).c(); i2++) {
            IDataSet iDataSetB = ((RadarData) radarChart.getData()).b(i2);
            Entry entryForIndex = iDataSetB.getEntryForIndex(i);
            float fA = entryForIndex.a() - radarChart.getYChartMin();
            float f3 = i;
            Utils.e(radarChart.getCenterOffsets(), fA * factor * 1.0f, radarChart.getRotationAngle() + (sliceAngle * f3 * 1.0f), mPPointFB);
            arrayList.add(new Highlight(f3, entryForIndex.a(), mPPointFB.b, mPPointFB.c, i2, iDataSetB.getAxisDependency()));
        }
        float fL = radarChart.l(f, f2) / radarChart.getFactor();
        Highlight highlight = null;
        float f4 = Float.MAX_VALUE;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Highlight highlight2 = (Highlight) arrayList.get(i3);
            float fAbs = Math.abs(highlight2.b - fL);
            if (fAbs < f4) {
                highlight = highlight2;
                f4 = fAbs;
            }
        }
        return highlight;
    }
}
