package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class MarkerView extends RelativeLayout implements IMarker {
    public MPPointF a;
    public final MPPointF b;
    public WeakReference c;

    public MarkerView(Context context, int i) {
        super(context);
        this.a = new MPPointF();
        this.b = new MPPointF();
        setupLayoutResource(i);
    }

    private void setupLayoutResource(int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final void draw(Canvas canvas, float f, float f2) {
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int iSave = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.b, f2 + offsetForDrawingAtPoint.c);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public Chart getChartView() {
        WeakReference weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return (Chart) weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return this.a;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF offset = getOffset();
        float f3 = offset.b;
        MPPointF mPPointF = this.b;
        mPPointF.b = f3;
        mPPointF.c = offset.c;
        Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        float f4 = mPPointF.b;
        if (f + f4 < 0.0f) {
            mPPointF.b = -f;
        } else if (chartView != null && f + width + f4 > chartView.getWidth()) {
            mPPointF.b = (chartView.getWidth() - f) - width;
        }
        float f5 = mPPointF.c;
        if (f2 + f5 < 0.0f) {
            mPPointF.c = -f2;
        } else if (chartView != null && f2 + height + f5 > chartView.getHeight()) {
            mPPointF.c = (chartView.getHeight() - f2) - height;
        }
        return mPPointF;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setChartView(Chart chart) {
        this.c = new WeakReference(chart);
    }

    public void setOffset(MPPointF mPPointF) {
        this.a = mPPointF;
        if (mPPointF == null) {
            this.a = new MPPointF();
        }
    }
}
