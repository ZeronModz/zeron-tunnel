package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class Highlight {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public int e;
    public final int f;
    public final int g;
    public final YAxis.AxisDependency h;
    public float i;
    public float j;

    public Highlight(float f, float f2, float f3, float f4, int i, YAxis.AxisDependency axisDependency) {
        this.e = -1;
        this.g = -1;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = i;
        this.h = axisDependency;
    }

    public final boolean a(Highlight highlight) {
        return highlight != null && this.f == highlight.f && this.a == highlight.a && this.g == highlight.g && this.e == highlight.e;
    }

    public final String toString() {
        return "Highlight, x: " + this.a + ", y: " + this.b + ", dataSetIndex: " + this.f + ", stackIndex (only stacked barentry): " + this.g;
    }

    public Highlight(float f, int i, int i2) {
        this(f, Float.NaN, i);
        this.g = i2;
    }

    public Highlight(float f, float f2, int i) {
        this.e = -1;
        this.g = -1;
        this.a = f;
        this.b = f2;
        this.f = i;
    }

    public Highlight(float f, float f2, float f3, float f4, int i, int i2, YAxis.AxisDependency axisDependency) {
        this(f, f2, f3, f4, i, axisDependency);
        this.g = i2;
    }
}
