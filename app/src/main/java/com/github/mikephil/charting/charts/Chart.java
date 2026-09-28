package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.IHighlighter;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LegendRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.kf;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Chart<T extends ChartData<? extends IDataSet<? extends Entry>>> extends ViewGroup implements ChartInterface {
    public Highlight[] A;
    public float B;
    public boolean C;
    public IMarker D;
    public final ArrayList E;
    public boolean F;
    public boolean a;
    public ChartData b;
    public boolean c;
    public boolean d;
    public float e;
    public final DefaultValueFormatter f;
    public Paint g;
    public Paint h;
    public XAxis i;
    public boolean j;
    public Description k;
    public Legend l;
    public OnChartValueSelectedListener m;
    public ChartTouchListener n;
    public String o;
    public OnChartGestureListener p;
    public LegendRenderer q;
    public DataRenderer r;
    public IHighlighter s;
    public ViewPortHandler t;
    public ChartAnimator u;
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    public Chart(Context context) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new DefaultValueFormatter(0);
        this.j = true;
        this.o = "No chart data available.";
        this.t = new ViewPortHandler();
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList();
        this.F = false;
        g();
    }

    public static void i(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                i(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public final void b(Canvas canvas) {
        Description description = this.k;
        if (description == null || !description.a) {
            return;
        }
        Paint paint = this.g;
        description.getClass();
        paint.setTypeface(null);
        this.g.setTextSize(this.k.d);
        this.g.setColor(this.k.e);
        this.g.setTextAlign(this.k.g);
        float width = getWidth();
        ViewPortHandler viewPortHandler = this.t;
        float f = (width - (viewPortHandler.c - viewPortHandler.b.right)) - this.k.b;
        float height = getHeight() - this.t.k();
        Description description2 = this.k;
        canvas.drawText(description2.f, f, height - description2.c, this.g);
    }

    public void c(Canvas canvas) {
        if (this.D == null || !this.C || !j()) {
            return;
        }
        int i = 0;
        while (true) {
            Highlight[] highlightArr = this.A;
            if (i >= highlightArr.length) {
                return;
            }
            Highlight highlight = highlightArr[i];
            IDataSet iDataSetB = this.b.b(highlight.f);
            Entry entryE = this.b.e(this.A[i]);
            int entryIndex = iDataSetB.getEntryIndex(entryE);
            if (entryE != null) {
                float f = entryIndex;
                float entryCount = iDataSetB.getEntryCount();
                this.u.getClass();
                if (f <= entryCount * 1.0f) {
                    float[] fArrE = e(highlight);
                    ViewPortHandler viewPortHandler = this.t;
                    float f2 = fArrE[0];
                    float f3 = fArrE[1];
                    if (viewPortHandler.h(f2) && viewPortHandler.i(f3)) {
                        this.D.refreshContent(entryE, highlight);
                        this.D.draw(canvas, fArrE[0], fArrE[1]);
                    }
                }
            }
            i++;
        }
    }

    public Highlight d(float f, float f2) {
        if (this.b == null) {
            return null;
        }
        return getHighlighter().getHighlight(f, f2);
    }

    public float[] e(Highlight highlight) {
        return new float[]{highlight.i, highlight.j};
    }

    public final void f(Highlight highlight) {
        Highlight[] highlightArr;
        Entry entry = null;
        if (highlight == null) {
            this.A = null;
            highlightArr = null;
        } else {
            if (this.a) {
                highlight.toString();
            }
            Entry entryE = this.b.e(highlight);
            if (entryE == null) {
                this.A = null;
                highlight = null;
                entry = entryE;
                highlightArr = null;
            } else {
                Highlight[] highlightArr2 = {highlight};
                this.A = highlightArr2;
                highlightArr = highlightArr2;
                entry = entryE;
            }
        }
        setLastHighlighted(highlightArr);
        if (this.m != null) {
            boolean zJ = j();
            OnChartValueSelectedListener onChartValueSelectedListener = this.m;
            if (zJ) {
                onChartValueSelectedListener.onValueSelected(entry, highlight);
            } else {
                onChartValueSelectedListener.onNothingSelected();
            }
        }
        invalidate();
    }

    public void g() {
        setWillNotDraw(false);
        this.u = new ChartAnimator(new kf(this, 1));
        Context context = getContext();
        DisplayMetrics displayMetrics = Utils.a;
        if (context == null) {
            Utils.b = ViewConfiguration.getMinimumFlingVelocity();
            Utils.c = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Utils.b = viewConfiguration.getScaledMinimumFlingVelocity();
            Utils.c = viewConfiguration.getScaledMaximumFlingVelocity();
            Utils.a = context.getResources().getDisplayMetrics();
        }
        this.B = Utils.c(500.0f);
        this.k = new Description();
        Legend legend = new Legend();
        this.l = legend;
        this.q = new LegendRenderer(this.t, legend);
        this.i = new XAxis();
        this.g = new Paint(1);
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setTextSize(Utils.c(12.0f));
    }

    public ChartAnimator getAnimator() {
        return this.u;
    }

    public MPPointF getCenter() {
        return MPPointF.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public MPPointF getCenterOfView() {
        return getCenter();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public MPPointF getCenterOffsets() {
        RectF rectF = this.t.b;
        return MPPointF.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public RectF getContentRect() {
        return this.t.b;
    }

    public T getData() {
        return (T) this.b;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public ValueFormatter getDefaultValueFormatter() {
        return this.f;
    }

    public Description getDescription() {
        return this.k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.e;
    }

    public float getExtraBottomOffset() {
        return this.x;
    }

    public float getExtraLeftOffset() {
        return this.y;
    }

    public float getExtraRightOffset() {
        return this.w;
    }

    public float getExtraTopOffset() {
        return this.v;
    }

    public Highlight[] getHighlighted() {
        return this.A;
    }

    public IHighlighter getHighlighter() {
        return this.s;
    }

    public ArrayList<Runnable> getJobs() {
        return this.E;
    }

    public Legend getLegend() {
        return this.l;
    }

    public LegendRenderer getLegendRenderer() {
        return this.q;
    }

    public IMarker getMarker() {
        return this.D;
    }

    @Deprecated
    public IMarker getMarkerView() {
        return getMarker();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getMaxHighlightDistance() {
        return this.B;
    }

    public OnChartGestureListener getOnChartGestureListener() {
        return this.p;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.n;
    }

    public DataRenderer getRenderer() {
        return this.r;
    }

    public ViewPortHandler getViewPortHandler() {
        return this.t;
    }

    public XAxis getXAxis() {
        return this.i;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMax() {
        return this.i.w;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMin() {
        return this.i.x;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXRange() {
        return this.i.y;
    }

    public float getYMax() {
        return this.b.a;
    }

    public float getYMin() {
        return this.b.b;
    }

    public abstract void h();

    public final boolean j() {
        Highlight[] highlightArr = this.A;
        return (highlightArr == null || highlightArr.length <= 0 || highlightArr[0] == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.F) {
            i(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.b == null) {
            if (TextUtils.isEmpty(this.o)) {
                return;
            }
            MPPointF center = getCenter();
            canvas.drawText(this.o, center.b, center.c, this.h);
            return;
        }
        if (this.z) {
            return;
        }
        a();
        this.z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) Utils.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            ViewPortHandler viewPortHandler = this.t;
            RectF rectF = viewPortHandler.b;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = viewPortHandler.c - rectF.right;
            float fK = viewPortHandler.k();
            viewPortHandler.d = i2;
            viewPortHandler.c = i;
            viewPortHandler.m(f, f2, f3, fK);
        }
        h();
        ArrayList arrayList = this.E;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            post((Runnable) it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(T t) {
        this.b = t;
        this.z = false;
        if (t == null) {
            return;
        }
        float f = t.b;
        float f2 = t.a;
        float fH = Utils.h((t == null || t.d() < 2) ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        int iCeil = Float.isInfinite(fH) ? 0 : ((int) Math.ceil(-Math.log10(fH))) + 2;
        DefaultValueFormatter defaultValueFormatter = this.f;
        defaultValueFormatter.d(iCeil);
        for (IDataSet iDataSet : this.b.i) {
            if (iDataSet.needsFormatter() || iDataSet.getValueFormatter() == defaultValueFormatter) {
                iDataSet.setValueFormatter(defaultValueFormatter);
            }
        }
        h();
    }

    public void setDescription(Description description) {
        this.k = description;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.d = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.e = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.C = z;
    }

    public void setExtraBottomOffset(float f) {
        this.x = Utils.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.y = Utils.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.w = Utils.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.v = Utils.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.c = z;
    }

    public void setHighlighter(ChartHighlighter chartHighlighter) {
        this.s = chartHighlighter;
    }

    public void setLastHighlighted(Highlight[] highlightArr) {
        Highlight highlight;
        if (highlightArr == null || highlightArr.length <= 0 || (highlight = highlightArr[0]) == null) {
            this.n.c = null;
        } else {
            this.n.c = highlight;
        }
    }

    public void setLogEnabled(boolean z) {
        this.a = z;
    }

    public void setMarker(IMarker iMarker) {
        this.D = iMarker;
    }

    @Deprecated
    public void setMarkerView(IMarker iMarker) {
        setMarker(iMarker);
    }

    public void setMaxHighlightDistance(float f) {
        this.B = Utils.c(f);
    }

    public void setNoDataText(String str) {
        this.o = str;
    }

    public void setNoDataTextColor(int i) {
        this.h.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setOnChartGestureListener(OnChartGestureListener onChartGestureListener) {
        this.p = onChartGestureListener;
    }

    public void setOnChartValueSelectedListener(OnChartValueSelectedListener onChartValueSelectedListener) {
        this.m = onChartValueSelectedListener;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.n = chartTouchListener;
    }

    public void setRenderer(DataRenderer dataRenderer) {
        if (dataRenderer != null) {
            this.r = dataRenderer;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.j = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.F = z;
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new DefaultValueFormatter(0);
        this.j = true;
        this.o = "No chart data available.";
        this.t = new ViewPortHandler();
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList();
        this.F = false;
        g();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = null;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = new DefaultValueFormatter(0);
        this.j = true;
        this.o = "No chart data available.";
        this.t = new ViewPortHandler();
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList();
        this.F = false;
        g();
    }
}
