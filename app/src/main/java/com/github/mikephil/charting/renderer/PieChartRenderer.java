package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.trilead.ssh2.sftp.Packet;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PieChartRenderer extends DataRenderer {
    public final PieChart f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final TextPaint j;
    public final Paint k;
    public StaticLayout l;
    public CharSequence m;
    public final RectF n;
    public final RectF[] o;
    public WeakReference p;
    public Canvas q;
    public final Path r;
    public final RectF s;
    public final Path t;
    public final Path u;
    public final RectF v;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.n = new RectF();
        this.o = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.r = new Path();
        this.s = new RectF();
        this.t = new Path();
        this.u = new Path();
        this.v = new RectF();
        this.f = pieChart;
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAlpha(Packet.SSH_FXP_ATTRS);
        TextPaint textPaint = new TextPaint(1);
        this.j = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextSize(Utils.c(12.0f));
        this.e.setTextSize(Utils.c(13.0f));
        this.e.setColor(-1);
        Paint paint3 = this.e;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        Paint paint4 = new Paint(1);
        this.k = paint4;
        paint4.setColor(-1);
        paint4.setTextAlign(align);
        paint4.setTextSize(Utils.c(13.0f));
        Paint paint5 = new Paint(1);
        this.i = paint5;
        paint5.setStyle(Paint.Style.STROKE);
    }

    public static float h(MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = (((float) Math.cos(d)) * f) + mPPointF.b;
        float fSin = (((float) Math.sin(d)) * f) + mPPointF.c;
        double d2 = ((f6 / 2.0f) + f5) * 0.017453292f;
        float fCos2 = (((float) Math.cos(d2)) * f) + mPPointF.b;
        float fSin2 = (((float) Math.sin(d2)) * f) + mPPointF.c;
        return (float) (((double) (f - ((float) (Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(fSin - f4, 2.0d) + Math.pow(fCos - f3, 2.0d)) / 2.0d))))) - Math.sqrt(Math.pow(fSin2 - ((fSin + f4) / 2.0f), 2.0d) + Math.pow(fCos2 - ((fCos + f3) / 2.0f), 2.0d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        PieChart pieChart;
        Iterator it;
        float f;
        PieChart pieChart2;
        float f2;
        boolean z;
        float f3;
        Iterator it2;
        IPieDataSet iPieDataSet;
        float f4;
        int i;
        float[] fArr;
        float f5;
        float f6;
        float f7;
        RectF rectF;
        RectF rectF2;
        float f8;
        int i2;
        int i3;
        float f9;
        int i4;
        ViewPortHandler viewPortHandler = this.a;
        int i5 = (int) viewPortHandler.c;
        int i6 = (int) viewPortHandler.d;
        WeakReference weakReference = this.p;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != i5 || bitmapCreateBitmap.getHeight() != i6) {
            if (i5 <= 0 || i6 <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_4444);
            this.p = new WeakReference(bitmapCreateBitmap);
            this.q = new Canvas(bitmapCreateBitmap);
        }
        int i7 = 0;
        bitmapCreateBitmap.eraseColor(0);
        PieChart pieChart3 = this.f;
        Iterator it3 = ((PieData) pieChart3.getData()).i.iterator();
        while (it3.hasNext()) {
            IPieDataSet iPieDataSet2 = (IPieDataSet) it3.next();
            if (!iPieDataSet2.isVisible() || iPieDataSet2.getEntryCount() <= 0) {
                pieChart = pieChart3;
                it = it3;
            } else {
                float rotationAngle = pieChart3.getRotationAngle();
                this.b.getClass();
                RectF circleBox = pieChart3.getCircleBox();
                int entryCount = iPieDataSet2.getEntryCount();
                float[] drawAngles = pieChart3.getDrawAngles();
                MPPointF centerCircleBox = pieChart3.getCenterCircleBox();
                float radius = pieChart3.getRadius();
                int i8 = (!pieChart3.O || pieChart3.P) ? i7 : 1;
                float holeRadius = i8 != 0 ? (pieChart3.getHoleRadius() / 100.0f) * radius : 0.0f;
                float holeRadius2 = (radius - ((pieChart3.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                RectF rectF3 = new RectF();
                int i9 = (i8 == 0 || !pieChart3.R) ? i7 : 1;
                int i10 = i7;
                int i11 = i10;
                while (i10 < entryCount) {
                    if (Math.abs(iPieDataSet2.getEntryForIndex(i10).a) > Utils.d) {
                        i11++;
                    }
                    i10++;
                }
                float fI = i11 <= 1 ? 0.0f : i(iPieDataSet2);
                float f10 = 0.0f;
                int i12 = 0;
                while (i12 < entryCount) {
                    float f11 = drawAngles[i12];
                    if (Math.abs(iPieDataSet2.getEntryForIndex(i12).a()) <= Utils.d) {
                        f2 = (f11 * 1.0f) + f10;
                        f = fI;
                        pieChart2 = pieChart3;
                    } else {
                        if (pieChart3.j()) {
                            f = fI;
                            int i13 = 0;
                            while (true) {
                                Highlight[] highlightArr = pieChart3.A;
                                pieChart2 = pieChart3;
                                if (i13 >= highlightArr.length) {
                                    break;
                                }
                                if (((int) highlightArr[i13].a) != i12) {
                                    i13++;
                                    pieChart3 = pieChart2;
                                } else if (i9 == 0) {
                                    f2 = (f11 * 1.0f) + f10;
                                }
                            }
                        } else {
                            f = fI;
                            pieChart2 = pieChart3;
                        }
                        boolean z2 = f > 0.0f && f11 <= 180.0f;
                        int color = iPieDataSet2.getColor(i12);
                        Paint paint = this.c;
                        paint.setColor(color);
                        float f12 = i11 == 1 ? 0.0f : f / (radius * 0.017453292f);
                        float f13 = (((f12 / 2.0f) + f10) * 1.0f) + rotationAngle;
                        float f14 = (f11 - f12) * 1.0f;
                        if (f14 < 0.0f) {
                            z = z2;
                            f3 = 0.0f;
                        } else {
                            z = z2;
                            f3 = f14;
                        }
                        it2 = it3;
                        Path path = this.r;
                        path.reset();
                        iPieDataSet = iPieDataSet2;
                        if (i9 != 0) {
                            float f15 = radius - holeRadius2;
                            f4 = rotationAngle;
                            double d = f13 * 0.017453292f;
                            float fCos = (((float) Math.cos(d)) * f15) + centerCircleBox.b;
                            float fSin = (f15 * ((float) Math.sin(d))) + centerCircleBox.c;
                            i = entryCount;
                            fArr = drawAngles;
                            rectF3.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                        } else {
                            f4 = rotationAngle;
                            i = entryCount;
                            fArr = drawAngles;
                        }
                        double d2 = f13 * 0.017453292f;
                        float fCos2 = (((float) Math.cos(d2)) * radius) + centerCircleBox.b;
                        float fSin2 = (((float) Math.sin(d2)) * radius) + centerCircleBox.c;
                        if (f3 < 360.0f || f3 % 360.0f > Utils.d) {
                            f5 = fCos2;
                            f6 = 360.0f;
                            f7 = fSin2;
                            if (i9 != 0) {
                                path.arcTo(rectF3, f13 + 180.0f, -180.0f);
                            }
                            path.arcTo(circleBox, f13, f3);
                        } else {
                            f6 = 360.0f;
                            f5 = fCos2;
                            f7 = fSin2;
                            path.addCircle(centerCircleBox.b, centerCircleBox.c, radius, Path.Direction.CW);
                        }
                        float f16 = centerCircleBox.b;
                        float f17 = centerCircleBox.c;
                        float f18 = f3;
                        rectF = circleBox;
                        RectF rectF4 = this.s;
                        rectF4.set(f16 - holeRadius, f17 - holeRadius, f16 + holeRadius, f17 + holeRadius);
                        if (i8 == 0 || (holeRadius <= 0.0f && !z)) {
                            rectF2 = rectF3;
                            f8 = holeRadius;
                            i2 = i12;
                            i3 = i11;
                            float f19 = f7;
                            float f20 = f5;
                            if (f18 % f6 > Utils.d) {
                                if (z) {
                                    float fH = h(centerCircleBox, radius, f11 * 1.0f, f20, f19, f13, f18);
                                    double d3 = ((f18 / 2.0f) + f13) * 0.017453292f;
                                    path.lineTo((((float) Math.cos(d3)) * fH) + centerCircleBox.b, (fH * ((float) Math.sin(d3))) + centerCircleBox.c);
                                } else {
                                    path.lineTo(centerCircleBox.b, centerCircleBox.c);
                                }
                            }
                        } else {
                            if (z) {
                                rectF2 = rectF3;
                                f8 = holeRadius;
                                i2 = i12;
                                i3 = i11;
                                f9 = f18;
                                i4 = 1;
                                float fH2 = h(centerCircleBox, radius, f11 * 1.0f, f5, f7, f13, f9);
                                if (fH2 < 0.0f) {
                                    fH2 = -fH2;
                                }
                                holeRadius = Math.max(f8, fH2);
                            } else {
                                rectF2 = rectF3;
                                f8 = holeRadius;
                                i2 = i12;
                                i3 = i11;
                                f9 = f18;
                                i4 = 1;
                            }
                            float f21 = (i3 == i4 || holeRadius == 0.0f) ? 0.0f : f / (holeRadius * 0.017453292f);
                            float f22 = (((f21 / 2.0f) + f10) * 1.0f) + f4;
                            float f23 = (f11 - f21) * 1.0f;
                            if (f23 < 0.0f) {
                                f23 = 0.0f;
                            }
                            float f24 = f22 + f23;
                            if (f3 < 360.0f || f9 % f6 > Utils.d) {
                                float f25 = centerCircleBox.b;
                                if (i9 != 0) {
                                    float f26 = radius - holeRadius2;
                                    double d4 = f24 * 0.017453292f;
                                    float fCos3 = (((float) Math.cos(d4)) * f26) + f25;
                                    float fSin3 = (f26 * ((float) Math.sin(d4))) + centerCircleBox.c;
                                    rectF2.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                                    path.arcTo(rectF2, f24, 180.0f);
                                } else {
                                    double d5 = f24 * 0.017453292f;
                                    path.lineTo((((float) Math.cos(d5)) * holeRadius) + f25, (holeRadius * ((float) Math.sin(d5))) + centerCircleBox.c);
                                }
                                path.arcTo(rectF4, f24, -f23);
                            } else {
                                path.addCircle(centerCircleBox.b, centerCircleBox.c, holeRadius, Path.Direction.CCW);
                            }
                        }
                        path.close();
                        this.q.drawPath(path, paint);
                        f2 = (f11 * 1.0f) + f10;
                        f10 = f2;
                        i12 = i2 + 1;
                        holeRadius = f8;
                        rectF3 = rectF2;
                        i11 = i3;
                        it3 = it2;
                        fI = f;
                        pieChart3 = pieChart2;
                        iPieDataSet2 = iPieDataSet;
                        drawAngles = fArr;
                        rotationAngle = f4;
                        entryCount = i;
                        circleBox = rectF;
                    }
                    it2 = it3;
                    iPieDataSet = iPieDataSet2;
                    f4 = rotationAngle;
                    rectF = circleBox;
                    i = entryCount;
                    fArr = drawAngles;
                    rectF2 = rectF3;
                    f8 = holeRadius;
                    i2 = i12;
                    i3 = i11;
                    f10 = f2;
                    i12 = i2 + 1;
                    holeRadius = f8;
                    rectF3 = rectF2;
                    i11 = i3;
                    it3 = it2;
                    fI = f;
                    pieChart3 = pieChart2;
                    iPieDataSet2 = iPieDataSet;
                    drawAngles = fArr;
                    rotationAngle = f4;
                    entryCount = i;
                    circleBox = rectF;
                }
                pieChart = pieChart3;
                it = it3;
                MPPointF.d(centerCircleBox);
            }
            it3 = it;
            pieChart3 = pieChart;
            i7 = 0;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void c(Canvas canvas) {
        float radius;
        RectF rectF;
        PieChart pieChart = this.f;
        if (pieChart.O && this.q != null) {
            float radius2 = pieChart.getRadius();
            float holeRadius = (pieChart.getHoleRadius() / 100.0f) * radius2;
            MPPointF centerCircleBox = pieChart.getCenterCircleBox();
            Paint paint = this.g;
            if (Color.alpha(paint.getColor()) > 0) {
                this.q.drawCircle(centerCircleBox.b, centerCircleBox.c, holeRadius, paint);
            }
            Paint paint2 = this.h;
            if (Color.alpha(paint2.getColor()) > 0 && pieChart.getTransparentCircleRadius() > pieChart.getHoleRadius()) {
                int alpha = paint2.getAlpha();
                float transparentCircleRadius = (pieChart.getTransparentCircleRadius() / 100.0f) * radius2;
                this.b.getClass();
                paint2.setAlpha((int) (alpha * 1.0f * 1.0f));
                Path path = this.t;
                path.reset();
                path.addCircle(centerCircleBox.b, centerCircleBox.c, transparentCircleRadius, Path.Direction.CW);
                path.addCircle(centerCircleBox.b, centerCircleBox.c, holeRadius, Path.Direction.CCW);
                this.q.drawPath(path, paint2);
                paint2.setAlpha(alpha);
            }
            MPPointF.d(centerCircleBox);
        }
        canvas.drawBitmap((Bitmap) this.p.get(), 0.0f, 0.0f, (Paint) null);
        CharSequence centerText = pieChart.getCenterText();
        if (!pieChart.W || centerText == null) {
            return;
        }
        MPPointF centerCircleBox2 = pieChart.getCenterCircleBox();
        MPPointF centerTextOffset = pieChart.getCenterTextOffset();
        float f = centerCircleBox2.b + centerTextOffset.b;
        float f2 = centerCircleBox2.c + centerTextOffset.c;
        if (!pieChart.O || pieChart.P) {
            radius = pieChart.getRadius();
        } else {
            radius = (pieChart.getHoleRadius() / 100.0f) * pieChart.getRadius();
        }
        RectF[] rectFArr = this.o;
        RectF rectF2 = rectFArr[0];
        rectF2.left = f - radius;
        rectF2.top = f2 - radius;
        rectF2.right = f + radius;
        rectF2.bottom = f2 + radius;
        RectF rectF3 = rectFArr[1];
        rectF3.set(rectF2);
        float centerTextRadiusPercent = pieChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF3.inset((rectF3.width() - (rectF3.width() * centerTextRadiusPercent)) / 2.0f, (rectF3.height() - (rectF3.height() * centerTextRadiusPercent)) / 2.0f);
        }
        boolean zEquals = centerText.equals(this.m);
        RectF rectF4 = this.n;
        if (zEquals && rectF3.equals(rectF4)) {
            rectF = rectF2;
        } else {
            rectF4.set(rectF3);
            this.m = centerText;
            rectF = rectF2;
            this.l = new StaticLayout(centerText, 0, centerText.length(), this.j, (int) Math.max(Math.ceil(rectF4.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.l.getHeight();
        canvas.save();
        Path path2 = this.u;
        path2.reset();
        path2.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(rectF3.left, ((rectF3.height() - height) / 2.0f) + rectF3.top);
        this.l.draw(canvas);
        canvas.restore();
        MPPointF.d(centerCircleBox2);
        MPPointF.d(centerTextOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void d(Canvas canvas, Highlight[] highlightArr) {
        float f;
        IPieDataSet iPieDataSetJ;
        PieChart pieChart;
        boolean z;
        float f2;
        float[] fArr;
        float f3;
        Paint paint;
        float f4;
        RectF rectF;
        int i;
        float f5;
        float f6;
        float fH;
        int i2;
        RectF rectF2;
        Paint paint2;
        float fMax;
        Highlight[] highlightArr2 = highlightArr;
        PieChart pieChart2 = this.f;
        boolean z2 = pieChart2.O && !pieChart2.P;
        if (z2 && pieChart2.R) {
            return;
        }
        this.b.getClass();
        float rotationAngle = pieChart2.getRotationAngle();
        float[] drawAngles = pieChart2.getDrawAngles();
        float[] absoluteAngles = pieChart2.getAbsoluteAngles();
        MPPointF centerCircleBox = pieChart2.getCenterCircleBox();
        float radius = pieChart2.getRadius();
        float f7 = 0.0f;
        float holeRadius = z2 ? (pieChart2.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF3 = this.v;
        rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i3 = 0;
        while (i3 < highlightArr2.length) {
            int i4 = (int) highlightArr2[i3].a;
            if (i4 >= drawAngles.length) {
                pieChart = pieChart2;
                z = z2;
                f2 = rotationAngle;
                fArr = drawAngles;
                f = f7;
            } else {
                PieData pieData = (PieData) pieChart2.getData();
                f = f7;
                if (highlightArr2[i3].f == 0) {
                    iPieDataSetJ = pieData.j();
                } else {
                    pieData.getClass();
                    iPieDataSetJ = null;
                }
                if (iPieDataSetJ == null || !iPieDataSetJ.isHighlightEnabled()) {
                    pieChart = pieChart2;
                    z = z2;
                    f2 = rotationAngle;
                    fArr = drawAngles;
                } else {
                    int entryCount = iPieDataSetJ.getEntryCount();
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < entryCount) {
                        PieChart pieChart3 = pieChart2;
                        if (Math.abs(iPieDataSetJ.getEntryForIndex(i6).a) > Utils.d) {
                            i5++;
                        }
                        i6++;
                        pieChart2 = pieChart3;
                    }
                    pieChart = pieChart2;
                    float f8 = i4 == 0 ? f : absoluteAngles[i4 - 1] * 1.0f;
                    float sliceSpace = i5 <= 1 ? f : iPieDataSetJ.getSliceSpace();
                    float f9 = drawAngles[i4];
                    float selectionShift = iPieDataSetJ.getSelectionShift();
                    float f10 = radius + selectionShift;
                    z = z2;
                    rectF3.set(pieChart.getCircleBox());
                    float f11 = -selectionShift;
                    rectF3.inset(f11, f11);
                    boolean z3 = sliceSpace > f && f9 <= 180.0f;
                    int color = iPieDataSetJ.getColor(i4);
                    Paint paint3 = this.c;
                    paint3.setColor(color);
                    float f12 = i5 == 1 ? f : sliceSpace / (radius * 0.017453292f);
                    float f13 = i5 == 1 ? f : sliceSpace / (f10 * 0.017453292f);
                    float f14 = (((f12 / 2.0f) + f8) * 1.0f) + rotationAngle;
                    float f15 = (f9 - f12) * 1.0f;
                    if (f15 < f) {
                        f15 = f;
                    }
                    float f16 = (((f13 / 2.0f) + f8) * 1.0f) + rotationAngle;
                    float f17 = (f9 - f13) * 1.0f;
                    if (f17 < f) {
                        f17 = f;
                    }
                    boolean z4 = z3;
                    Path path = this.r;
                    path.reset();
                    if (f15 < 360.0f || f15 % 360.0f > Utils.d) {
                        f3 = f8;
                        f2 = rotationAngle;
                        double d = f16 * 0.017453292f;
                        path.moveTo((((float) Math.cos(d)) * f10) + centerCircleBox.b, (((float) Math.sin(d)) * f10) + centerCircleBox.c);
                        path.arcTo(rectF3, f16, f17);
                    } else {
                        f3 = f8;
                        path.addCircle(centerCircleBox.b, centerCircleBox.c, f10, Path.Direction.CW);
                        f2 = rotationAngle;
                    }
                    if (z4) {
                        double d2 = f14 * 0.017453292f;
                        float fCos = (((float) Math.cos(d2)) * radius) + centerCircleBox.b;
                        float fSin = (((float) Math.sin(d2)) * radius) + centerCircleBox.c;
                        paint = paint3;
                        f5 = f15;
                        f4 = holeRadius;
                        rectF = rectF3;
                        i = i3;
                        f6 = f14;
                        fH = h(centerCircleBox, radius, f9 * 1.0f, fCos, fSin, f6, f5);
                    } else {
                        paint = paint3;
                        f4 = holeRadius;
                        rectF = rectF3;
                        i = i3;
                        f5 = f15;
                        f6 = f14;
                        fH = f;
                    }
                    float f18 = centerCircleBox.b;
                    i2 = i;
                    float f19 = centerCircleBox.c;
                    rectF2 = rectF;
                    fArr = drawAngles;
                    RectF rectF4 = this.s;
                    rectF4.set(f18 - f4, f19 - f4, f18 + f4, f19 + f4);
                    if (!z || (f4 <= f && !z4)) {
                        paint2 = paint;
                        if (f5 % 360.0f > Utils.d) {
                            float f20 = centerCircleBox.b;
                            if (z4) {
                                double d3 = ((f5 / 2.0f) + f6) * 0.017453292f;
                                path.lineTo((((float) Math.cos(d3)) * fH) + f20, (fH * ((float) Math.sin(d3))) + centerCircleBox.c);
                            } else {
                                path.lineTo(f20, centerCircleBox.c);
                            }
                        }
                    } else {
                        if (z4) {
                            if (fH < f) {
                                fH = -fH;
                            }
                            fMax = Math.max(f4, fH);
                        } else {
                            fMax = f4;
                        }
                        float f21 = (i5 == 1 || fMax == f) ? f : sliceSpace / (fMax * 0.017453292f);
                        float f22 = (((f21 / 2.0f) + f3) * 1.0f) + f2;
                        float f23 = (f9 - f21) * 1.0f;
                        if (f23 < f) {
                            f23 = f;
                        }
                        float f24 = f22 + f23;
                        if (f15 < 360.0f || f5 % 360.0f > Utils.d) {
                            double d4 = f24 * 0.017453292f;
                            paint2 = paint;
                            path.lineTo((((float) Math.cos(d4)) * fMax) + centerCircleBox.b, (fMax * ((float) Math.sin(d4))) + centerCircleBox.c);
                            path.arcTo(rectF4, f24, -f23);
                        } else {
                            path.addCircle(centerCircleBox.b, centerCircleBox.c, fMax, Path.Direction.CCW);
                            paint2 = paint;
                        }
                    }
                    path.close();
                    this.q.drawPath(path, paint2);
                    i3 = i2 + 1;
                    highlightArr2 = highlightArr;
                    holeRadius = f4;
                    f7 = f;
                    pieChart2 = pieChart;
                    z2 = z;
                    drawAngles = fArr;
                    rectF3 = rectF2;
                    rotationAngle = f2;
                }
            }
            f4 = holeRadius;
            rectF2 = rectF3;
            i2 = i3;
            i3 = i2 + 1;
            highlightArr2 = highlightArr;
            holeRadius = f4;
            f7 = f;
            pieChart2 = pieChart;
            z2 = z;
            drawAngles = fArr;
            rectF3 = rectF2;
            rotationAngle = f2;
        }
        MPPointF.d(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[PHI: r3
      0x005e: PHI (r3v4 float) = (r3v3 float), (r3v29 float), (r3v29 float) binds: [B:3:0x003a, B:5:0x0043, B:7:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.graphics.Canvas r51) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.PieChartRenderer.e(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float i(IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        float sliceSpace = iPieDataSet.getSliceSpace();
        RectF rectF = this.a.b;
        if (sliceSpace / Math.min(rectF.width(), rectF.height()) > (iPieDataSet.getYMin() / ((PieData) this.f.getData()).k()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
    }
}
