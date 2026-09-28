package com.github.mikephil.charting.data;

import android.graphics.Color;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.sandok.tunnel.core.Connection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarDataSet extends BarLineScatterCandleBubbleDataSet<BarEntry> implements IBarDataSet {
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final String[] z;

    public BarDataSet(List<BarEntry> list, String str) {
        super(list, str);
        this.v = 1;
        this.w = Color.rgb(215, 215, 215);
        this.x = -16777216;
        this.y = Connection.CONNECTION_DEFAULT_TIMEOUT;
        this.z = new String[]{"Stack"};
        this.u = Color.rgb(0, 0, 0);
        for (int i = 0; i < list.size(); i++) {
            float[] fArr = list.get(i).e;
            if (fArr != null && fArr.length > this.v) {
                this.v = fArr.length;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            float[] fArr2 = list.get(i2).e;
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public final void a(Entry entry) {
        BarEntry barEntry = (BarEntry) entry;
        if (barEntry == null || Float.isNaN(barEntry.a)) {
            return;
        }
        if (barEntry.e == null) {
            float f = barEntry.a;
            if (f < this.r) {
                this.r = f;
            }
            if (f > this.q) {
                this.q = f;
            }
        } else {
            float f2 = -barEntry.g;
            if (f2 < this.r) {
                this.r = f2;
            }
            float f3 = barEntry.h;
            if (f3 > this.q) {
                this.q = f3;
            }
        }
        b(barEntry);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final int getBarBorderColor() {
        return this.x;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final float getBarBorderWidth() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final int getBarShadowColor() {
        return this.w;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final int getHighLightAlpha() {
        return this.y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final String[] getStackLabels() {
        return this.z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final int getStackSize() {
        return this.v;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarDataSet
    public final boolean isStacked() {
        return this.v > 1;
    }
}
