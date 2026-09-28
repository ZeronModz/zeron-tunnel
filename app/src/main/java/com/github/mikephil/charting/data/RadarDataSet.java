package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class RadarDataSet extends LineRadarDataSet<RadarEntry> implements IRadarDataSet {
    public boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final float I;

    public RadarDataSet(List<RadarEntry> list, String str) {
        super(list, str);
        this.C = false;
        this.D = -1;
        this.E = 1122867;
        this.F = 76;
        this.G = 3.0f;
        this.H = 4.0f;
        this.I = 2.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final int getHighlightCircleFillColor() {
        return this.D;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final float getHighlightCircleInnerRadius() {
        return this.G;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final float getHighlightCircleOuterRadius() {
        return this.H;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final int getHighlightCircleStrokeAlpha() {
        return this.F;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final int getHighlightCircleStrokeColor() {
        return this.E;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final float getHighlightCircleStrokeWidth() {
        return this.I;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final boolean isDrawHighlightCircleEnabled() {
        return this.C;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public final void setDrawHighlightCircleEnabled(boolean z) {
        this.C = z;
    }
}
