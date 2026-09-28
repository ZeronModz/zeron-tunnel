package com.github.mikephil.charting.data;

import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CandleDataSet extends LineScatterCandleRadarDataSet<CandleEntry> implements ICandleDataSet {
    public final float A;
    public final Paint.Style B;
    public final Paint.Style C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final float y;
    public final boolean z;

    public CandleDataSet(List<CandleEntry> list, String str) {
        super(list, str);
        this.y = 3.0f;
        this.z = true;
        this.A = 0.1f;
        this.B = Paint.Style.STROKE;
        this.C = Paint.Style.FILL;
        this.D = 1122868;
        this.E = 1122868;
        this.F = 1122868;
        this.G = 1122868;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public final void a(Entry entry) {
        CandleEntry candleEntry = (CandleEntry) entry;
        float f = candleEntry.f;
        if (f < this.r) {
            this.r = f;
        }
        float f2 = candleEntry.e;
        if (f2 > this.q) {
            this.q = f2;
        }
        b(candleEntry);
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public final void c(Entry entry) {
        CandleEntry candleEntry = (CandleEntry) entry;
        float f = candleEntry.e;
        float f2 = this.r;
        if (f < f2) {
            this.r = f;
            f2 = f;
        }
        float f3 = this.q;
        if (f > f3) {
            this.q = f;
        } else {
            f = f3;
        }
        float f4 = candleEntry.f;
        if (f4 < f2) {
            this.r = f4;
        }
        if (f4 > f) {
            this.q = f4;
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final float getBarSpace() {
        return this.A;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final int getDecreasingColor() {
        return this.F;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final Paint.Style getDecreasingPaintStyle() {
        return this.C;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final int getIncreasingColor() {
        return this.E;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final Paint.Style getIncreasingPaintStyle() {
        return this.B;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final int getNeutralColor() {
        return this.D;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final int getShadowColor() {
        return this.G;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final boolean getShadowColorSameAsCandle() {
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final float getShadowWidth() {
        return this.y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public final boolean getShowCandleBar() {
        return this.z;
    }
}
