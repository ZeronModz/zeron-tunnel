package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    public float G;
    public float H;
    public boolean I;
    public float J;

    public PieRadarChartBase(Context context) {
        super(context);
        this.G = 270.0f;
        this.H = 270.0f;
        this.I = true;
        this.J = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    @Override // com.github.mikephil.charting.charts.Chart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.a():void");
    }

    @Override // android.view.View
    public final void computeScroll() {
        ChartTouchListener chartTouchListener = this.n;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            PieRadarChartTouchListener pieRadarChartTouchListener = (PieRadarChartTouchListener) chartTouchListener;
            Chart chart = pieRadarChartTouchListener.e;
            if (pieRadarChartTouchListener.j == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) chart;
            pieRadarChartTouchListener.j = pieRadarChartBase.getDragDecelerationFrictionCoef() * pieRadarChartTouchListener.j;
            pieRadarChartBase.setRotationAngle((pieRadarChartTouchListener.j * ((jCurrentAnimationTimeMillis - pieRadarChartTouchListener.i) / 1000.0f)) + pieRadarChartBase.getRotationAngle());
            pieRadarChartTouchListener.i = jCurrentAnimationTimeMillis;
            if (Math.abs(pieRadarChartTouchListener.j) < 0.001d) {
                pieRadarChartTouchListener.j = 0.0f;
            } else {
                DisplayMetrics displayMetrics = Utils.a;
                chart.postInvalidateOnAnimation();
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void g() {
        super.g();
        this.n = new PieRadarChartTouchListener(this);
    }

    public float getDiameter() {
        RectF rectF = this.t.b;
        rectF.left = getExtraLeftOffset() + rectF.left;
        rectF.top = getExtraTopOffset() + rectF.top;
        rectF.right -= getExtraRightOffset();
        rectF.bottom -= getExtraBottomOffset();
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.b.d();
    }

    public float getMinOffset() {
        return this.J;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.H;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.G;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void h() {
        if (this.b == null) {
            return;
        }
        k();
        if (this.l != null) {
            this.q.a(this.b);
        }
        a();
    }

    public final float l(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.b;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float fSqrt = (float) Math.sqrt(Math.pow(f2 > centerOffsets.c ? f2 - r0 : r0 - f2, 2.0d) + Math.pow(f4, 2.0d));
        MPPointF.d(centerOffsets);
        return fSqrt;
    }

    public final float m(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.b;
        double d2 = f2 - centerOffsets.c;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d2 * d2) + (d * d))));
        if (f > centerOffsets.b) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        MPPointF.d(centerOffsets);
        return f3;
    }

    public abstract int n(float f);

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        return (!this.j || (chartTouchListener = this.n) == null) ? super.onTouchEvent(motionEvent) : chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f) {
        this.J = f;
    }

    public void setRotationAngle(float f) {
        this.H = f;
        DisplayMetrics displayMetrics = Utils.a;
        while (f < 0.0f) {
            f += 360.0f;
        }
        this.G = f % 360.0f;
    }

    public void setRotationEnabled(boolean z) {
        this.I = z;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 270.0f;
        this.H = 270.0f;
        this.I = true;
        this.J = 0.0f;
    }

    public void k() {
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G = 270.0f;
        this.H = 270.0f;
        this.I = true;
        this.J = 0.0f;
    }
}
