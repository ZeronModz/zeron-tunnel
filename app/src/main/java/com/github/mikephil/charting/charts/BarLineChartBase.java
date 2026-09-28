package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.BarLineChartTouchListener;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnDrawListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.nd;
import defpackage.xm0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BarLineChartBase<T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> extends Chart<T> implements BarLineScatterCandleBubbleDataProvider {
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Paint P;
    public Paint Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public OnDrawListener W;
    public YAxis a0;
    public YAxis b0;
    public YAxisRenderer c0;
    public YAxisRenderer d0;
    public Transformer e0;
    public Transformer f0;
    public XAxisRenderer g0;
    public final RectF h0;
    public final Matrix i0;
    public final xm0 j0;
    public final xm0 k0;
    public final float[] l0;

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G = 100;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = 15.0f;
        this.V = false;
        this.h0 = new RectF();
        this.i0 = new Matrix();
        new Matrix();
        this.j0 = xm0.b(0.0d, 0.0d);
        this.k0 = xm0.b(0.0d, 0.0d);
        this.l0 = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void a() {
        RectF rectF = this.h0;
        l(rectF);
        float fE = rectF.left + 0.0f;
        float f = rectF.top + 0.0f;
        float fE2 = rectF.right + 0.0f;
        float f2 = rectF.bottom + 0.0f;
        if (this.a0.f()) {
            fE += this.a0.e(this.c0.e);
        }
        if (this.b0.f()) {
            fE2 += this.b0.e(this.d0.e);
        }
        XAxis xAxis = this.i;
        if (xAxis.a && xAxis.q) {
            float f3 = xAxis.A + xAxis.c;
            XAxis.XAxisPosition xAxisPosition = xAxis.C;
            if (xAxisPosition == XAxis.XAxisPosition.BOTTOM) {
                f2 += f3;
            } else if (xAxisPosition == XAxis.XAxisPosition.TOP) {
                f += f3;
            } else if (xAxisPosition == XAxis.XAxisPosition.BOTH_SIDED) {
                f2 += f3;
                f += f3;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f;
        float extraRightOffset = getExtraRightOffset() + fE2;
        float extraBottomOffset = getExtraBottomOffset() + f2;
        float extraLeftOffset = getExtraLeftOffset() + fE;
        float fC = Utils.c(this.U);
        this.t.m(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), Math.max(fC, extraRightOffset), Math.max(fC, extraBottomOffset));
        if (this.a) {
            this.t.b.toString();
        }
        Transformer transformer = this.f0;
        this.b0.getClass();
        transformer.h();
        Transformer transformer2 = this.e0;
        this.a0.getClass();
        transformer2.h();
        m();
    }

    @Override // android.view.View
    public final void computeScroll() {
        ChartTouchListener chartTouchListener = this.n;
        if (chartTouchListener instanceof BarLineChartTouchListener) {
            BarLineChartTouchListener barLineChartTouchListener = (BarLineChartTouchListener) chartTouchListener;
            MPPointF mPPointF = barLineChartTouchListener.q;
            MPPointF mPPointF2 = barLineChartTouchListener.h;
            MPPointF mPPointF3 = barLineChartTouchListener.p;
            Chart chart = barLineChartTouchListener.e;
            if (mPPointF.b == 0.0f && mPPointF.c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            mPPointF.b = barLineChartBase.getDragDecelerationFrictionCoef() * mPPointF.b;
            float dragDecelerationFrictionCoef = barLineChartBase.getDragDecelerationFrictionCoef() * mPPointF.c;
            mPPointF.c = dragDecelerationFrictionCoef;
            float f = (jCurrentAnimationTimeMillis - barLineChartTouchListener.o) / 1000.0f;
            float f2 = mPPointF3.b + (mPPointF.b * f);
            mPPointF3.b = f2;
            float f3 = mPPointF3.c + (dragDecelerationFrictionCoef * f);
            mPPointF3.c = f3;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f2, f3, 0);
            barLineChartTouchListener.d(motionEventObtain, barLineChartBase.L ? mPPointF3.b - mPPointF2.b : 0.0f, barLineChartBase.M ? mPPointF3.c - mPPointF2.c : 0.0f);
            motionEventObtain.recycle();
            ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
            Matrix matrix = barLineChartTouchListener.f;
            viewPortHandler.l(matrix, chart, false);
            barLineChartTouchListener.f = matrix;
            barLineChartTouchListener.o = jCurrentAnimationTimeMillis;
            if (Math.abs(mPPointF.b) >= 0.01d || Math.abs(mPPointF.c) >= 0.01d) {
                DisplayMetrics displayMetrics = Utils.a;
                chart.postInvalidateOnAnimation();
            } else {
                barLineChartBase.a();
                barLineChartBase.postInvalidate();
                mPPointF.b = 0.0f;
                mPPointF.c = 0.0f;
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void g() {
        super.g();
        this.a0 = new YAxis(YAxis.AxisDependency.LEFT);
        this.b0 = new YAxis(YAxis.AxisDependency.RIGHT);
        this.e0 = new Transformer(this.t);
        this.f0 = new Transformer(this.t);
        this.c0 = new YAxisRenderer(this.t, this.a0, this.e0);
        this.d0 = new YAxisRenderer(this.t, this.b0, this.f0);
        this.g0 = new XAxisRenderer(this.t, this.i, this.e0);
        setHighlighter(new ChartHighlighter(this));
        this.n = new BarLineChartTouchListener(this, this.t.a, 3.0f);
        Paint paint = new Paint();
        this.P = paint;
        paint.setStyle(Paint.Style.FILL);
        this.P.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.Q = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.Q.setColor(-16777216);
        this.Q.setStrokeWidth(Utils.c(1.0f));
    }

    public final YAxis getAxis(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.a0 : this.b0;
    }

    public YAxis getAxisLeft() {
        return this.a0;
    }

    public YAxis getAxisRight() {
        return this.b0;
    }

    @Override // com.github.mikephil.charting.charts.Chart, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public /* bridge */ /* synthetic */ BarLineScatterCandleBubbleData getData() {
        return (BarLineScatterCandleBubbleData) super.getData();
    }

    public OnDrawListener getDrawListener() {
        return this.W;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        Transformer transformer = getTransformer(YAxis.AxisDependency.LEFT);
        RectF rectF = this.t.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        xm0 xm0Var = this.k0;
        transformer.d(f, f2, xm0Var);
        return (float) Math.min(this.i.w, xm0Var.b);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        Transformer transformer = getTransformer(YAxis.AxisDependency.LEFT);
        RectF rectF = this.t.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        xm0 xm0Var = this.j0;
        transformer.d(f, f2, xm0Var);
        return (float) Math.max(this.i.x, xm0Var.b);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.G;
    }

    public float getMinOffset() {
        return this.U;
    }

    public YAxisRenderer getRendererLeftYAxis() {
        return this.c0;
    }

    public YAxisRenderer getRendererRightYAxis() {
        return this.d0;
    }

    public XAxisRenderer getRendererXAxis() {
        return this.g0;
    }

    @Override // android.view.View
    public float getScaleX() {
        ViewPortHandler viewPortHandler = this.t;
        if (viewPortHandler == null) {
            return 1.0f;
        }
        return viewPortHandler.i;
    }

    @Override // android.view.View
    public float getScaleY() {
        ViewPortHandler viewPortHandler = this.t;
        if (viewPortHandler == null) {
            return 1.0f;
        }
        return viewPortHandler.j;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public final Transformer getTransformer(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.e0 : this.f0;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return Math.max(this.a0.w, this.b0.w);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return Math.min(this.a0.x, this.b0.x);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void h() {
        if (this.b == null) {
            return;
        }
        DataRenderer dataRenderer = this.r;
        if (dataRenderer != null) {
            dataRenderer.f();
        }
        k();
        YAxisRenderer yAxisRenderer = this.c0;
        YAxis yAxis = this.a0;
        yAxisRenderer.a(yAxis.x, yAxis.w);
        YAxisRenderer yAxisRenderer2 = this.d0;
        YAxis yAxis2 = this.b0;
        yAxisRenderer2.a(yAxis2.x, yAxis2.w);
        XAxisRenderer xAxisRenderer = this.g0;
        XAxis xAxis = this.i;
        xAxisRenderer.a(xAxis.x, xAxis.w);
        if (this.l != null) {
            this.q.a(this.b);
        }
        a();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public final boolean isInverted(YAxis.AxisDependency axisDependency) {
        getAxis(axisDependency).getClass();
        return false;
    }

    public void k() {
        XAxis xAxis = this.i;
        ChartData chartData = this.b;
        xAxis.a(((BarLineScatterCandleBubbleData) chartData).d, ((BarLineScatterCandleBubbleData) chartData).c);
        YAxis yAxis = this.a0;
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) this.b;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.a(barLineScatterCandleBubbleData.h(axisDependency), ((BarLineScatterCandleBubbleData) this.b).g(axisDependency));
        YAxis yAxis2 = this.b0;
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData2 = (BarLineScatterCandleBubbleData) this.b;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.a(barLineScatterCandleBubbleData2.h(axisDependency2), ((BarLineScatterCandleBubbleData) this.b).g(axisDependency2));
    }

    public final void l(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = this.l;
        if (legend == null || !legend.a) {
            return;
        }
        int i = nd.c[legend.i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            int i2 = nd.a[this.l.h.ordinal()];
            if (i2 == 1) {
                float f = rectF.top;
                Legend legend2 = this.l;
                rectF.top = Math.min(legend2.s, this.t.d * legend2.q) + this.l.c + f;
                return;
            } else {
                if (i2 != 2) {
                    return;
                }
                float f2 = rectF.bottom;
                Legend legend3 = this.l;
                rectF.bottom = Math.min(legend3.s, this.t.d * legend3.q) + this.l.c + f2;
                return;
            }
        }
        int i3 = nd.b[this.l.g.ordinal()];
        if (i3 == 1) {
            float f3 = rectF.left;
            Legend legend4 = this.l;
            rectF.left = Math.min(legend4.r, this.t.c * legend4.q) + this.l.b + f3;
            return;
        }
        if (i3 == 2) {
            float f4 = rectF.right;
            Legend legend5 = this.l;
            rectF.right = Math.min(legend5.r, this.t.c * legend5.q) + this.l.b + f4;
        } else {
            if (i3 != 3) {
                return;
            }
            int i4 = nd.a[this.l.h.ordinal()];
            if (i4 == 1) {
                float f5 = rectF.top;
                Legend legend6 = this.l;
                rectF.top = Math.min(legend6.s, this.t.d * legend6.q) + this.l.c + f5;
            } else {
                if (i4 != 2) {
                    return;
                }
                float f6 = rectF.bottom;
                Legend legend7 = this.l;
                rectF.bottom = Math.min(legend7.s, this.t.d * legend7.q) + this.l.c + f6;
            }
        }
    }

    public void m() {
        if (this.a) {
            XAxis xAxis = this.i;
            float f = xAxis.x;
            float f2 = xAxis.w;
            float f3 = xAxis.y;
        }
        Transformer transformer = this.f0;
        XAxis xAxis2 = this.i;
        float f4 = xAxis2.x;
        float f5 = xAxis2.y;
        YAxis yAxis = this.b0;
        transformer.i(f4, f5, yAxis.y, yAxis.x);
        Transformer transformer2 = this.e0;
        XAxis xAxis3 = this.i;
        float f6 = xAxis3.x;
        float f7 = xAxis3.y;
        YAxis yAxis2 = this.a0;
        transformer2.i(f6, f7, yAxis2.y, yAxis2.x);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b == null) {
            return;
        }
        System.currentTimeMillis();
        if (this.R) {
            canvas.drawRect(this.t.b, this.P);
        }
        if (this.S) {
            canvas.drawRect(this.t.b, this.Q);
        }
        if (this.H) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) this.b;
            Iterator it = barLineScatterCandleBubbleData.i.iterator();
            while (it.hasNext()) {
                ((IDataSet) it.next()).calcMinMaxY(lowestVisibleX, highestVisibleX);
            }
            barLineScatterCandleBubbleData.a();
            XAxis xAxis = this.i;
            BarLineScatterCandleBubbleData barLineScatterCandleBubbleData2 = (BarLineScatterCandleBubbleData) this.b;
            xAxis.a(barLineScatterCandleBubbleData2.d, barLineScatterCandleBubbleData2.c);
            YAxis yAxis = this.a0;
            if (yAxis.a) {
                BarLineScatterCandleBubbleData barLineScatterCandleBubbleData3 = (BarLineScatterCandleBubbleData) this.b;
                YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
                yAxis.a(barLineScatterCandleBubbleData3.h(axisDependency), ((BarLineScatterCandleBubbleData) this.b).g(axisDependency));
            }
            YAxis yAxis2 = this.b0;
            if (yAxis2.a) {
                BarLineScatterCandleBubbleData barLineScatterCandleBubbleData4 = (BarLineScatterCandleBubbleData) this.b;
                YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
                yAxis2.a(barLineScatterCandleBubbleData4.h(axisDependency2), ((BarLineScatterCandleBubbleData) this.b).g(axisDependency2));
            }
            a();
        }
        YAxis yAxis3 = this.a0;
        if (yAxis3.a) {
            this.c0.a(yAxis3.x, yAxis3.w);
        }
        YAxis yAxis4 = this.b0;
        if (yAxis4.a) {
            this.d0.a(yAxis4.x, yAxis4.w);
        }
        XAxis xAxis2 = this.i;
        if (xAxis2.a) {
            this.g0.a(xAxis2.x, xAxis2.w);
        }
        this.g0.i(canvas);
        this.c0.h(canvas);
        this.d0.h(canvas);
        if (this.i.s) {
            this.g0.j(canvas);
        }
        if (this.a0.s) {
            this.c0.i(canvas);
        }
        if (this.b0.s) {
            this.d0.i(canvas);
        }
        boolean z = this.i.a;
        boolean z2 = this.a0.a;
        boolean z3 = this.b0.a;
        int iSave = canvas.save();
        canvas.clipRect(this.t.b);
        this.r.b(canvas);
        if (!this.i.s) {
            this.g0.j(canvas);
        }
        if (!this.a0.s) {
            this.c0.i(canvas);
        }
        if (!this.b0.s) {
            this.d0.i(canvas);
        }
        if (j()) {
            this.r.d(canvas, this.A);
        }
        canvas.restoreToCount(iSave);
        this.r.c(canvas);
        if (this.i.a) {
            this.g0.k(canvas);
        }
        if (this.a0.a) {
            this.c0.j(canvas);
        }
        if (this.b0.a) {
            this.d0.j(canvas);
        }
        this.g0.h(canvas);
        this.c0.g(canvas);
        this.d0.g(canvas);
        if (this.T) {
            int iSave2 = canvas.save();
            canvas.clipRect(this.t.b);
            this.r.e(canvas);
            canvas.restoreToCount(iSave2);
        } else {
            this.r.e(canvas);
        }
        this.q.c(canvas);
        b(canvas);
        c(canvas);
        if (this.a) {
            System.currentTimeMillis();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.l0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.V) {
            RectF rectF = this.t.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            getTransformer(YAxis.AxisDependency.LEFT).f(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.V) {
            getTransformer(YAxis.AxisDependency.LEFT).g(fArr);
            this.t.a(this, fArr);
        } else {
            ViewPortHandler viewPortHandler = this.t;
            viewPortHandler.l(viewPortHandler.a, this, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = this.n;
        if (chartTouchListener == null || this.b == null || !this.j) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.H = z;
    }

    public void setBorderColor(int i) {
        this.Q.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.Q.setStrokeWidth(Utils.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.T = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.J = z;
    }

    public void setDragEnabled(boolean z) {
        this.L = z;
        this.M = z;
    }

    public void setDragOffsetX(float f) {
        ViewPortHandler viewPortHandler = this.t;
        viewPortHandler.getClass();
        viewPortHandler.l = Utils.c(f);
    }

    public void setDragOffsetY(float f) {
        ViewPortHandler viewPortHandler = this.t;
        viewPortHandler.getClass();
        viewPortHandler.m = Utils.c(f);
    }

    public void setDragXEnabled(boolean z) {
        this.L = z;
    }

    public void setDragYEnabled(boolean z) {
        this.M = z;
    }

    public void setDrawBorders(boolean z) {
        this.S = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.R = z;
    }

    public void setGridBackgroundColor(int i) {
        this.P.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.K = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.V = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.G = i;
    }

    public void setMinOffset(float f) {
        this.U = f;
    }

    public void setOnDrawListener(OnDrawListener onDrawListener) {
        this.W = onDrawListener;
    }

    public void setPinchZoom(boolean z) {
        this.I = z;
    }

    public void setRendererLeftYAxis(YAxisRenderer yAxisRenderer) {
        this.c0 = yAxisRenderer;
    }

    public void setRendererRightYAxis(YAxisRenderer yAxisRenderer) {
        this.d0 = yAxisRenderer;
    }

    public void setScaleEnabled(boolean z) {
        this.N = z;
        this.O = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.N = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.O = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.i.y / f;
        ViewPortHandler viewPortHandler = this.t;
        viewPortHandler.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        viewPortHandler.g = f2;
        viewPortHandler.j(viewPortHandler.a, viewPortHandler.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.i.y / f;
        ViewPortHandler viewPortHandler = this.t;
        viewPortHandler.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        viewPortHandler.h = f2;
        viewPortHandler.j(viewPortHandler.a, viewPortHandler.b);
    }

    public void setXAxisRenderer(XAxisRenderer xAxisRenderer) {
        this.g0 = xAxisRenderer;
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 100;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = 15.0f;
        this.V = false;
        this.h0 = new RectF();
        this.i0 = new Matrix();
        new Matrix();
        this.j0 = xm0.b(0.0d, 0.0d);
        this.k0 = xm0.b(0.0d, 0.0d);
        this.l0 = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.G = 100;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = 15.0f;
        this.V = false;
        this.h0 = new RectF();
        this.i0 = new Matrix();
        new Matrix();
        this.j0 = xm0.b(0.0d, 0.0d);
        this.k0 = xm0.b(0.0d, 0.0d);
        this.l0 = new float[2];
    }
}
