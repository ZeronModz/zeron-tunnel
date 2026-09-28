package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.Legend;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class LegendEntry {
    public final String a;
    public final Legend.LegendForm b;
    public final float c;
    public final float d;
    public final DashPathEffect e;
    public final int f;

    public LegendEntry() {
        this.b = Legend.LegendForm.DEFAULT;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = null;
        this.f = 1122867;
    }

    public LegendEntry(String str, Legend.LegendForm legendForm, float f, float f2, DashPathEffect dashPathEffect, int i) {
        Legend.LegendForm legendForm2 = Legend.LegendForm.NONE;
        this.a = str;
        this.b = legendForm;
        this.c = f;
        this.d = f2;
        this.e = dashPathEffect;
        this.f = i;
    }
}
