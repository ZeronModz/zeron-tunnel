package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PieDataSet extends DataSet<PieEntry> implements IPieDataSet {
    public final float A;
    public final float B;
    public final boolean C;
    public final float u;
    public final ValuePosition v;
    public final ValuePosition w;
    public final int x;
    public final float y;
    public final float z;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        this.u = 18.0f;
        ValuePosition valuePosition = ValuePosition.INSIDE_SLICE;
        this.v = valuePosition;
        this.w = valuePosition;
        this.x = -16777216;
        this.y = 1.0f;
        this.z = 75.0f;
        this.A = 0.3f;
        this.B = 0.4f;
        this.C = true;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public final void a(Entry entry) {
        PieEntry pieEntry = (PieEntry) entry;
        if (pieEntry == null) {
            return;
        }
        c(pieEntry);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final float getSelectionShift() {
        return this.u;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final float getSliceSpace() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final int getValueLineColor() {
        return this.x;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final float getValueLinePart1Length() {
        return this.A;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final float getValueLinePart1OffsetPercentage() {
        return this.z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final float getValueLinePart2Length() {
        return this.B;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final float getValueLineWidth() {
        return this.y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final ValuePosition getXValuePosition() {
        return this.v;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final ValuePosition getYValuePosition() {
        return this.w;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final boolean isAutomaticallyDisableSliceSpacingEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final boolean isUsingSliceColorAsValueLineColor() {
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IPieDataSet
    public final boolean isValueLineVariableLength() {
        return this.C;
    }
}
