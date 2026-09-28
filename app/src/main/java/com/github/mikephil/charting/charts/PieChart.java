package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.PieHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PieChart extends PieRadarChartBase<PieData> {
    public final RectF K;
    public boolean L;
    public float[] M;
    public float[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public CharSequence S;
    public final MPPointF T;
    public float U;
    public float V;
    public boolean W;
    public float a0;
    public float b0;
    public float c0;

    public PieChart(Context context) {
        super(context);
        this.K = new RectF();
        this.L = true;
        this.M = new float[1];
        this.N = new float[1];
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.T = MPPointF.b(0.0f, 0.0f);
        this.U = 50.0f;
        this.V = 55.0f;
        this.W = true;
        this.a0 = 100.0f;
        this.b0 = 360.0f;
        this.c0 = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void a() {
        super.a();
        if (this.b == null) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        MPPointF centerOffsets = getCenterOffsets();
        float selectionShift = ((PieData) this.b).j().getSelectionShift();
        float f = centerOffsets.b;
        float f2 = centerOffsets.c;
        this.K.set((f - diameter) + selectionShift, (f2 - diameter) + selectionShift, (f + diameter) - selectionShift, (f2 + diameter) - selectionShift);
        MPPointF.d(centerOffsets);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final float[] e(Highlight highlight) {
        MPPointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float holeRadius = (radius / 10.0f) * 3.6f;
        if (this.O) {
            holeRadius = (radius - (getHoleRadius() * (radius / 100.0f))) / 2.0f;
        }
        float f = radius - holeRadius;
        float rotationAngle = getRotationAngle();
        int i = (int) highlight.a;
        float f2 = this.M[i] / 2.0f;
        double d = f;
        float f3 = (this.N[i] + rotationAngle) - f2;
        this.u.getClass();
        float fCos = (float) ((Math.cos(Math.toRadians(f3 * 1.0f)) * d) + ((double) centerCircleBox.b));
        float f4 = (rotationAngle + this.N[i]) - f2;
        this.u.getClass();
        float fSin = (float) ((Math.sin(Math.toRadians(f4 * 1.0f)) * d) + ((double) centerCircleBox.c));
        MPPointF.d(centerCircleBox);
        return new float[]{fCos, fSin};
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void g() {
        super.g();
        this.r = new PieChartRenderer(this, this.u, this.t);
        this.i = null;
        this.s = new PieHighlighter(this);
    }

    public float[] getAbsoluteAngles() {
        return this.N;
    }

    public MPPointF getCenterCircleBox() {
        RectF rectF = this.K;
        return MPPointF.b(rectF.centerX(), rectF.centerY());
    }

    public CharSequence getCenterText() {
        return this.S;
    }

    public MPPointF getCenterTextOffset() {
        MPPointF mPPointF = this.T;
        return MPPointF.b(mPPointF.b, mPPointF.c);
    }

    public float getCenterTextRadiusPercent() {
        return this.a0;
    }

    public RectF getCircleBox() {
        return this.K;
    }

    public float[] getDrawAngles() {
        return this.M;
    }

    public float getHoleRadius() {
        return this.U;
    }

    public float getMaxAngle() {
        return this.b0;
    }

    public float getMinAngleForSlices() {
        return this.c0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.K;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.q.b.getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.V;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public XAxis getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final void k() {
        float f;
        int iD = ((PieData) this.b).d();
        float f2 = 0.0f;
        if (this.M.length != iD) {
            this.M = new float[iD];
        } else {
            for (int i = 0; i < iD; i++) {
                this.M[i] = 0.0f;
            }
        }
        if (this.N.length != iD) {
            this.N = new float[iD];
        } else {
            for (int i2 = 0; i2 < iD; i2++) {
                this.N[i2] = 0.0f;
            }
        }
        float fK = ((PieData) this.b).k();
        List list = ((PieData) this.b).i;
        float f3 = this.c0;
        boolean z = f3 != 0.0f && ((float) iD) * f3 <= this.b0;
        float[] fArr = new float[iD];
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((PieData) this.b).c(); i4++) {
            IPieDataSet iPieDataSet = (IPieDataSet) list.get(i4);
            int i5 = 0;
            while (i5 < iPieDataSet.getEntryCount()) {
                float fAbs = (Math.abs(iPieDataSet.getEntryForIndex(i5).a) / fK) * this.b0;
                if (z) {
                    float f6 = this.c0;
                    f = f2;
                    float f7 = fAbs - f6;
                    if (f7 <= f) {
                        fArr[i3] = f6;
                        f4 += -f7;
                    } else {
                        fArr[i3] = fAbs;
                        f5 += f7;
                    }
                } else {
                    f = f2;
                }
                this.M[i3] = fAbs;
                float[] fArr2 = this.N;
                if (i3 == 0) {
                    fArr2[i3] = fAbs;
                } else {
                    fArr2[i3] = fArr2[i3 - 1] + fAbs;
                }
                i3++;
                i5++;
                f2 = f;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < iD; i6++) {
                float f8 = fArr[i6];
                float f9 = f8 - (((f8 - this.c0) / f5) * f4);
                fArr[i6] = f9;
                float[] fArr3 = this.N;
                if (i6 == 0) {
                    fArr3[0] = fArr[0];
                } else {
                    fArr3[i6] = fArr3[i6 - 1] + f9;
                }
            }
            this.M = fArr;
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int n(float f) {
        float rotationAngle = f - getRotationAngle();
        DisplayMetrics displayMetrics = Utils.a;
        while (rotationAngle < 0.0f) {
            rotationAngle += 360.0f;
        }
        float f2 = rotationAngle % 360.0f;
        int i = 0;
        while (true) {
            float[] fArr = this.N;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > f2) {
                return i;
            }
            i++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DataRenderer dataRenderer = this.r;
        if (dataRenderer != null && (dataRenderer instanceof PieChartRenderer)) {
            PieChartRenderer pieChartRenderer = (PieChartRenderer) dataRenderer;
            Canvas canvas = pieChartRenderer.q;
            if (canvas != null) {
                canvas.setBitmap(null);
                pieChartRenderer.q = null;
            }
            WeakReference weakReference = pieChartRenderer.p;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                pieChartRenderer.p.clear();
                pieChartRenderer.p = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b == null) {
            return;
        }
        this.r.b(canvas);
        if (j()) {
            this.r.d(canvas, this.A);
        }
        this.r.c(canvas);
        this.r.e(canvas);
        this.q.c(canvas);
        b(canvas);
        c(canvas);
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.S = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            this.S = charSequence;
        }
    }

    public void setCenterTextColor(int i) {
        ((PieChartRenderer) this.r).j.setColor(i);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.a0 = f;
    }

    public void setCenterTextSize(float f) {
        ((PieChartRenderer) this.r).j.setTextSize(Utils.c(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((PieChartRenderer) this.r).j.setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((PieChartRenderer) this.r).j.setTypeface(typeface);
    }

    public void setDrawCenterText(boolean z) {
        this.W = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.L = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.O = z;
    }

    public void setDrawRoundedSlices(boolean z) {
        this.R = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.L = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.P = z;
    }

    public void setEntryLabelColor(int i) {
        ((PieChartRenderer) this.r).k.setColor(i);
    }

    public void setEntryLabelTextSize(float f) {
        ((PieChartRenderer) this.r).k.setTextSize(Utils.c(f));
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((PieChartRenderer) this.r).k.setTypeface(typeface);
    }

    public void setHoleColor(int i) {
        ((PieChartRenderer) this.r).g.setColor(i);
    }

    public void setHoleRadius(float f) {
        this.U = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.b0 = f;
    }

    public void setMinAngleForSlices(float f) {
        float f2 = this.b0;
        if (f > f2 / 2.0f) {
            f = f2 / 2.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.c0 = f;
    }

    public void setTransparentCircleAlpha(int i) {
        ((PieChartRenderer) this.r).h.setAlpha(i);
    }

    public void setTransparentCircleColor(int i) {
        Paint paint = ((PieChartRenderer) this.r).h;
        int alpha = paint.getAlpha();
        paint.setColor(i);
        paint.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.V = f;
    }

    public void setUsePercentValues(boolean z) {
        this.Q = z;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = new RectF();
        this.L = true;
        this.M = new float[1];
        this.N = new float[1];
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.T = MPPointF.b(0.0f, 0.0f);
        this.U = 50.0f;
        this.V = 55.0f;
        this.W = true;
        this.a0 = 100.0f;
        this.b0 = 360.0f;
        this.c0 = 0.0f;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K = new RectF();
        this.L = true;
        this.M = new float[1];
        this.N = new float[1];
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.T = MPPointF.b(0.0f, 0.0f);
        this.U = 50.0f;
        this.V = 55.0f;
        this.W = true;
        this.a0 = 100.0f;
        this.b0 = 360.0f;
        this.c0 = 0.0f;
    }
}
