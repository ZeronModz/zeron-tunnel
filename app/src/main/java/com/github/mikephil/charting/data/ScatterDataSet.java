package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ScatterDataSet extends LineScatterCandleRadarDataSet<Entry> implements IScatterDataSet {
    public final int A;
    public final float y;
    public final SquareShapeRenderer z;

    public ScatterDataSet(List<Entry> list, String str) {
        super(list, str);
        this.y = 15.0f;
        this.z = new SquareShapeRenderer();
        this.A = 1122867;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public final int getScatterShapeHoleColor() {
        return this.A;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public final float getScatterShapeHoleRadius() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public final float getScatterShapeSize() {
        return this.y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public final IShapeRenderer getShapeRenderer() {
        return this.z;
    }
}
