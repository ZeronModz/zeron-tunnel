package com.github.mikephil.charting.components;

import android.graphics.Paint;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class YAxis extends AxisBase {
    public final boolean A;
    public final float B;
    public final float C;
    public final YAxisLabelPosition D;
    public final AxisDependency E;
    public final float F;
    public final boolean z;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.z = true;
        this.A = true;
        this.B = 10.0f;
        this.C = 10.0f;
        this.D = YAxisLabelPosition.OUTSIDE_CHART;
        this.F = Float.POSITIVE_INFINITY;
        this.E = AxisDependency.LEFT;
        this.c = 0.0f;
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public final void a(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float fAbs = Math.abs(f2 - f);
        float f3 = this.v ? this.x : f - ((fAbs / 100.0f) * this.C);
        this.x = f3;
        float f4 = ((fAbs / 100.0f) * this.B) + f2;
        this.w = f4;
        this.y = Math.abs(f3 - f4);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.d);
        String strC = c();
        DisplayMetrics displayMetrics = Utils.a;
        float fMeasureText = (this.b * 2.0f) + ((int) paint.measureText(strC));
        float fC = this.F;
        if (fC > 0.0f && fC != Float.POSITIVE_INFINITY) {
            fC = Utils.c(fC);
        }
        if (fC <= 0.0d) {
            fC = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fC));
    }

    public final boolean f() {
        return this.a && this.q && this.D == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public YAxis(AxisDependency axisDependency) {
        this.z = true;
        this.A = true;
        this.B = 10.0f;
        this.C = 10.0f;
        this.D = YAxisLabelPosition.OUTSIDE_CHART;
        this.F = Float.POSITIVE_INFINITY;
        this.E = axisDependency;
        this.c = 0.0f;
    }
}
