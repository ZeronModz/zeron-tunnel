package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet;
import java.util.List;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LineRadarDataSet<T extends Entry> extends LineScatterCandleRadarDataSet<T> implements ILineRadarDataSet<T> {
    public float A;
    public boolean B;
    public int y;
    public int z;

    public LineRadarDataSet(List<T> list, String str) {
        super(list, str);
        this.y = Color.rgb(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255);
        this.z = 85;
        this.A = 2.5f;
        this.B = false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public final int getFillAlpha() {
        return this.z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public final int getFillColor() {
        return this.y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public final Drawable getFillDrawable() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public final float getLineWidth() {
        return this.A;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public final boolean isDrawFilledEnabled() {
        return this.B;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public final void setDrawFilled(boolean z) {
        this.B = z;
    }
}
