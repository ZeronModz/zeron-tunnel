package com.github.mikephil.charting.listener;

import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PieRadarChartTouchListener extends ChartTouchListener<PieRadarChartBase<?>> {
    public final MPPointF f;
    public float g;
    public final ArrayList h;
    public long i;
    public float j;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class AngularVelocitySample {
        public final long a;
        public float b;

        public AngularVelocitySample(PieRadarChartTouchListener pieRadarChartTouchListener, long j, float f) {
            this.a = j;
            this.b = f;
        }
    }

    public PieRadarChartTouchListener(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.f = MPPointF.b(0.0f, 0.0f);
        this.g = 0.0f;
        this.h = new ArrayList();
        this.i = 0L;
        this.j = 0.0f;
    }

    public final void b(float f, float f2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        AngularVelocitySample angularVelocitySample = new AngularVelocitySample(this, jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.e).m(f, f2));
        ArrayList arrayList = this.h;
        arrayList.add(angularVelocitySample);
        for (int size = arrayList.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - ((AngularVelocitySample) arrayList.get(0)).a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.e).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a = ChartTouchListener.ChartGesture.SINGLE_TAP;
        Chart chart = this.e;
        PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) chart;
        OnChartGestureListener onChartGestureListener = pieRadarChartBase.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!pieRadarChartBase.c) {
            return false;
        }
        Highlight highlightD = pieRadarChartBase.d(motionEvent.getX(), motionEvent.getY());
        if (highlightD == null || highlightD.a(this.c)) {
            chart.f(null);
            this.c = null;
            return true;
        }
        chart.f(highlightD);
        this.c = highlightD;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.listener.PieRadarChartTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
