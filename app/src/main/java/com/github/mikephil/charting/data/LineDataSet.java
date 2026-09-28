package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.formatter.DefaultFillFormatter;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class LineDataSet extends LineRadarDataSet<Entry> implements ILineDataSet {
    public Mode C;
    public final ArrayList D;
    public final int E;
    public final float F;
    public final float G;
    public final float H;
    public final DefaultFillFormatter I;
    public boolean J;
    public final boolean K;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        this.C = Mode.LINEAR;
        this.D = null;
        this.E = -1;
        this.F = 8.0f;
        this.G = 4.0f;
        this.H = 0.2f;
        this.I = new DefaultFillFormatter();
        this.J = true;
        this.K = true;
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        arrayList.clear();
        arrayList.add(Integer.valueOf(Color.rgb(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255)));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final int getCircleColor(int i) {
        return ((Integer) this.D.get(i)).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final int getCircleColorCount() {
        return this.D.size();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final int getCircleHoleColor() {
        return this.E;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final float getCircleHoleRadius() {
        return this.G;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final float getCircleRadius() {
        return this.F;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final float getCubicIntensity() {
        return this.H;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final DashPathEffect getDashPathEffect() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final IFillFormatter getFillFormatter() {
        return this.I;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final Mode getMode() {
        return this.C;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final boolean isDashedLineEnabled() {
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final boolean isDrawCircleHoleEnabled() {
        return this.K;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final boolean isDrawCirclesEnabled() {
        return this.J;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final boolean isDrawCubicEnabled() {
        return this.C == Mode.CUBIC_BEZIER;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineDataSet
    public final boolean isDrawSteppedEnabled() {
        return this.C == Mode.STEPPED;
    }
}
