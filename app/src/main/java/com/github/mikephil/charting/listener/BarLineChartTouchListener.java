package com.github.mikephil.charting.listener;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarLineChartTouchListener extends ChartTouchListener<BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>>> {
    public Matrix f;
    public final Matrix g;
    public final MPPointF h;
    public final MPPointF i;
    public float j;
    public float k;
    public float l;
    public IBarLineScatterCandleBubbleDataSet m;
    public VelocityTracker n;
    public long o;
    public final MPPointF p;
    public final MPPointF q;
    public final float r;
    public final float s;

    public BarLineChartTouchListener(BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> barLineChartBase, Matrix matrix, float f) {
        super(barLineChartBase);
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = MPPointF.b(0.0f, 0.0f);
        this.i = MPPointF.b(0.0f, 0.0f);
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = 1.0f;
        this.o = 0L;
        this.p = MPPointF.b(0.0f, 0.0f);
        this.q = MPPointF.b(0.0f, 0.0f);
        this.f = matrix;
        this.r = Utils.c(f);
        this.s = Utils.c(3.5f);
    }

    public static float f(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final MPPointF b(float f, float f2) {
        ViewPortHandler viewPortHandler = ((BarLineChartBase) this.e).getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        c();
        return MPPointF.b(f3, -((r0.getMeasuredHeight() - f2) - viewPortHandler.k()));
    }

    public final void c() {
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = this.m;
        Chart chart = this.e;
        if (iBarLineScatterCandleBubbleDataSet == null) {
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            barLineChartBase.a0.getClass();
            barLineChartBase.b0.getClass();
        }
        IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet2 = this.m;
        if (iBarLineScatterCandleBubbleDataSet2 != null) {
            ((BarLineChartBase) chart).isInverted(iBarLineScatterCandleBubbleDataSet2.getAxisDependency());
        }
    }

    public final void d(MotionEvent motionEvent, float f, float f2) {
        this.a = ChartTouchListener.ChartGesture.DRAG;
        this.f.set(this.g);
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.e).getOnChartGestureListener();
        c();
        this.f.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, f, f2);
        }
    }

    public final void e(MotionEvent motionEvent) {
        this.g.set(this.f);
        float x = motionEvent.getX();
        MPPointF mPPointF = this.h;
        mPPointF.b = x;
        mPPointF.c = motionEvent.getY();
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.e;
        Highlight highlightD = barLineChartBase.d(motionEvent.getX(), motionEvent.getY());
        this.m = highlightD != null ? (IBarLineScatterCandleBubbleDataSet) ((BarLineScatterCandleBubbleData) barLineChartBase.b).b(highlightD.f) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.a = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.e;
        OnChartGestureListener onChartGestureListener = barLineChartBase.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (barLineChartBase.J && ((BarLineScatterCandleBubbleData) barLineChartBase.getData()).d() > 0) {
            MPPointF mPPointFB = b(motionEvent.getX(), motionEvent.getY());
            float f = barLineChartBase.N ? 1.4f : 1.0f;
            float f2 = barLineChartBase.O ? 1.4f : 1.0f;
            float f3 = mPPointFB.b;
            float f4 = mPPointFB.c;
            ViewPortHandler viewPortHandler = barLineChartBase.t;
            Matrix matrix = barLineChartBase.i0;
            viewPortHandler.getClass();
            matrix.reset();
            matrix.set(viewPortHandler.a);
            matrix.postScale(f, f2, f3, -f4);
            barLineChartBase.t.l(matrix, barLineChartBase, false);
            barLineChartBase.a();
            barLineChartBase.postInvalidate();
            boolean z = barLineChartBase.a;
            MPPointF.d(mPPointFB);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a = ChartTouchListener.ChartGesture.FLING;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a = ChartTouchListener.ChartGesture.SINGLE_TAP;
        Chart chart = this.e;
        BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
        OnChartGestureListener onChartGestureListener = barLineChartBase.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!barLineChartBase.c) {
            return false;
        }
        Highlight highlightD = barLineChartBase.d(motionEvent.getX(), motionEvent.getY());
        if (highlightD == null || highlightD.a(this.c)) {
            chart.f(null);
            this.c = null;
        } else {
            chart.f(highlightD);
            this.c = highlightD;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.listener.BarLineChartTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
