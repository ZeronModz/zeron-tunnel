package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultFillFormatter implements IFillFormatter {
    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public final float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        float yChartMax = lineDataProvider.getYChartMax();
        float yChartMin = lineDataProvider.getYChartMin();
        LineData lineData = lineDataProvider.getLineData();
        if (iLineDataSet.getYMax() > 0.0f && iLineDataSet.getYMin() < 0.0f) {
            return 0.0f;
        }
        if (lineData.a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.b < 0.0f) {
            yChartMin = 0.0f;
        }
        return iLineDataSet.getYMin() >= 0.0f ? yChartMin : yChartMax;
    }
}
