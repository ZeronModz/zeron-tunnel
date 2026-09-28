package com.github.mikephil.charting.components;

import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AxisBase extends ComponentBase {
    public ValueFormatter f;
    public int l;
    public int m;
    public final ArrayList r;
    public final int g = -7829368;
    public final float h = 1.0f;
    public final int i = -7829368;
    public final float j = 1.0f;
    public float[] k = new float[0];
    public final int n = 6;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    public final boolean s = true;
    public float t = 0.0f;
    public float u = 0.0f;
    public boolean v = false;
    public float w = 0.0f;
    public float x = 0.0f;
    public float y = 0.0f;

    public AxisBase() {
        this.d = Utils.c(10.0f);
        this.b = Utils.c(5.0f);
        this.c = Utils.c(5.0f);
        this.r = new ArrayList();
    }

    public void a(float f, float f2) {
        float f3 = this.v ? this.x : f - this.t;
        float f4 = f2 + this.u;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.x = f3;
        this.w = f4;
        this.y = Math.abs(f4 - f3);
    }

    public final String b(int i) {
        return (i < 0 || i >= this.k.length) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : d().b(this.k[i]);
    }

    public final String c() {
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        for (int i = 0; i < this.k.length; i++) {
            String strB = b(i);
            if (strB != null && str.length() < strB.length()) {
                str = strB;
            }
        }
        return str;
    }

    public final ValueFormatter d() {
        ValueFormatter valueFormatter = this.f;
        if (valueFormatter != null && (!(valueFormatter instanceof DefaultAxisValueFormatter) || ((DefaultAxisValueFormatter) valueFormatter).b == this.m)) {
            return valueFormatter;
        }
        DefaultAxisValueFormatter defaultAxisValueFormatter = new DefaultAxisValueFormatter(this.m);
        this.f = defaultAxisValueFormatter;
        return defaultAxisValueFormatter;
    }
}
