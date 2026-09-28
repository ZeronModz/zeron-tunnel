package com.github.mikephil.charting.interfaces.datasets;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public interface IScatterDataSet extends ILineScatterCandleRadarDataSet<Entry> {
    int getScatterShapeHoleColor();

    float getScatterShapeHoleRadius();

    float getScatterShapeSize();

    IShapeRenderer getShapeRenderer();
}
