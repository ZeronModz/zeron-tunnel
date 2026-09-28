package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDataSet<T extends Entry> implements IDataSet<T> {
    public ArrayList a;
    public List b;
    public String c;
    public YAxis.AxisDependency d;
    public boolean e;
    public transient ValueFormatter f;
    public Typeface g;
    public final Legend.LegendForm h;
    public final float i;
    public final float j;
    public boolean k;
    public boolean l;
    public final MPPointF m;
    public float n;
    public boolean o;

    public BaseDataSet() {
        this.a = null;
        this.b = null;
        this.c = "DataSet";
        this.d = YAxis.AxisDependency.LEFT;
        this.e = true;
        this.h = Legend.LegendForm.DEFAULT;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = true;
        this.l = true;
        this.m = new MPPointF();
        this.n = 17.0f;
        this.o = true;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.a.add(Integer.valueOf(Color.rgb(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255)));
        this.b.add(-16777216);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean contains(Entry entry) {
        for (int i = 0; i < getEntryCount(); i++) {
            if (getEntryForIndex(i).equals(entry)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final YAxis.AxisDependency getAxisDependency() {
        return this.d;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getColor(int i) {
        ArrayList arrayList = this.a;
        return ((Integer) arrayList.get(i % arrayList.size())).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final List getColors() {
        return this.a;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final Legend.LegendForm getForm() {
        return this.h;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final DashPathEffect getFormLineDashEffect() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getFormLineWidth() {
        return this.j;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getFormSize() {
        return this.i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final GradientColor getGradientColor() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final List getGradientColors() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final MPPointF getIconsOffset() {
        return this.m;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getIndexInEntries(int i) {
        for (int i2 = 0; i2 < getEntryCount(); i2++) {
            if (i == getEntryForIndex(i2).b()) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final String getLabel() {
        return this.c;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final ValueFormatter getValueFormatter() {
        return needsFormatter() ? Utils.h : this.f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getValueTextColor(int i) {
        List list = this.b;
        return ((Integer) list.get(i % list.size())).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final float getValueTextSize() {
        return this.n;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final Typeface getValueTypeface() {
        return this.g;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean isDrawIconsEnabled() {
        return this.l;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean isDrawValuesEnabled() {
        return this.k;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean isHighlightEnabled() {
        return this.e;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean isVisible() {
        return this.o;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean needsFormatter() {
        return this.f == null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean removeEntry(int i) {
        return removeEntry(getEntryForIndex(i));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean removeEntryByXValue(float f) {
        return removeEntry(getEntryForXValue(f, Float.NaN));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean removeFirst() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(0));
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final boolean removeLast() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(getEntryCount() - 1));
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setAxisDependency(YAxis.AxisDependency axisDependency) {
        this.d = axisDependency;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setDrawIcons(boolean z) {
        this.l = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setDrawValues(boolean z) {
        this.k = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setHighlightEnabled(boolean z) {
        this.e = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setIconsOffset(MPPointF mPPointF) {
        float f = mPPointF.b;
        MPPointF mPPointF2 = this.m;
        mPPointF2.b = f;
        mPPointF2.c = mPPointF.c;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setLabel(String str) {
        this.c = str;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setValueFormatter(ValueFormatter valueFormatter) {
        if (valueFormatter == null) {
            return;
        }
        this.f = valueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setValueTextColor(int i) {
        this.b.clear();
        this.b.add(Integer.valueOf(i));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setValueTextColors(List list) {
        this.b = list;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setValueTextSize(float f) {
        this.n = Utils.c(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setValueTypeface(Typeface typeface) {
        this.g = typeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final void setVisible(boolean z) {
        this.o = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final GradientColor getGradientColor(int i) {
        throw null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getColor() {
        return ((Integer) this.a.get(0)).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public final int getValueTextColor() {
        return ((Integer) this.b.get(0)).intValue();
    }

    public BaseDataSet(String str) {
        this();
        this.c = str;
    }
}
