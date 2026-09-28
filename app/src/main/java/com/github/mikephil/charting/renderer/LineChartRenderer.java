package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.hk0;
import defpackage.od;
import defpackage.xm0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class LineChartRenderer extends LineRadarRenderer {
    public final LineDataProvider h;
    public final Paint i;
    public WeakReference j;
    public Canvas k;
    public final Bitmap.Config l;
    public final Path m;
    public final Path n;
    public float[] o;
    public final Path p;
    public final HashMap q;
    public final float[] r;

    public LineChartRenderer(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.l = Bitmap.Config.ARGB_8888;
        this.m = new Path();
        this.n = new Path();
        this.o = new float[4];
        this.p = new Path();
        this.q = new HashMap();
        this.r = new float[2];
        this.h = lineDataProvider;
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r10v37, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r28v1, types: [com.github.mikephil.charting.data.BaseEntry] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v40, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        Bitmap bitmap;
        Iterator it;
        Transformer transformer;
        Transformer transformer2;
        PathEffect pathEffect;
        Transformer transformer3;
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r32;
        ViewPortHandler viewPortHandler = this.a;
        int i6 = (int) viewPortHandler.c;
        int i7 = (int) viewPortHandler.d;
        WeakReference weakReference = this.j;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != i6 || bitmapCreateBitmap.getHeight() != i7) {
            if (i6 <= 0 || i7 <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i6, i7, this.l);
            this.j = new WeakReference(bitmapCreateBitmap);
            this.k = new Canvas(bitmapCreateBitmap);
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        int i8 = 0;
        bitmap2.eraseColor(0);
        LineDataProvider lineDataProvider = this.h;
        Iterator it2 = lineDataProvider.getLineData().i.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            Paint paint = this.c;
            if (!zHasNext) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                return;
            }
            ILineDataSet iLineDataSet = (ILineDataSet) it2.next();
            if (!iLineDataSet.isVisible() || iLineDataSet.getEntryCount() < 1) {
                bitmap = bitmap2;
                it = it2;
            } else {
                paint.setStrokeWidth(iLineDataSet.getLineWidth());
                paint.setPathEffect(iLineDataSet.getDashPathEffect());
                int i9 = hk0.a[iLineDataSet.getMode().ordinal()];
                Path path = this.m;
                Path path2 = this.n;
                od odVar = this.f;
                ChartAnimator chartAnimator = this.b;
                if (i9 == 3) {
                    bitmap = bitmap2;
                    it = it2;
                    chartAnimator.getClass();
                    Transformer transformer4 = lineDataProvider.getTransformer(iLineDataSet.getAxisDependency());
                    odVar.a(lineDataProvider, iLineDataSet);
                    float cubicIntensity = iLineDataSet.getCubicIntensity();
                    path.reset();
                    if (odVar.c >= 1) {
                        int i10 = odVar.a;
                        Object entryForIndex = iLineDataSet.getEntryForIndex(Math.max(i10 - 1, 0));
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(Math.max(i10, 0));
                        if (entryForIndex2 != 0) {
                            path.moveTo(entryForIndex2.b(), entryForIndex2.a() * 1.0f);
                            transformer = transformer4;
                            int i11 = -1;
                            int i12 = odVar.a + 1;
                            ?? r12 = entryForIndex2;
                            ?? r8 = entryForIndex2;
                            ?? r9 = entryForIndex;
                            while (true) {
                                ?? entryForIndex3 = r8;
                                if (i12 > odVar.c + odVar.a) {
                                    break;
                                }
                                if (i11 != i12) {
                                    entryForIndex3 = iLineDataSet.getEntryForIndex(i12);
                                }
                                int i13 = i12 + 1;
                                i11 = i13 < iLineDataSet.getEntryCount() ? i13 : i12;
                                ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i11);
                                path.cubicTo(r12.b() + ((entryForIndex3.b() - r9.b()) * cubicIntensity), (r12.a() + ((entryForIndex3.a() - r9.a()) * cubicIntensity)) * 1.0f, entryForIndex3.b() - ((entryForIndex4.b() - r12.b()) * cubicIntensity), (entryForIndex3.a() - ((entryForIndex4.a() - r12.a()) * cubicIntensity)) * 1.0f, entryForIndex3.b(), entryForIndex3.a() * 1.0f);
                                i12 = i13;
                                r9 = r12;
                                r12 = entryForIndex3;
                                r8 = entryForIndex4;
                            }
                        } else {
                            pathEffect = null;
                        }
                    } else {
                        transformer = transformer4;
                    }
                    if (iLineDataSet.isDrawFilledEnabled()) {
                        path2.reset();
                        path2.addPath(path);
                        transformer2 = transformer;
                        m(this.k, iLineDataSet, path2, transformer2, this.f);
                    } else {
                        transformer2 = transformer;
                    }
                    paint.setColor(iLineDataSet.getColor());
                    paint.setStyle(Paint.Style.STROKE);
                    transformer2.e(path);
                    this.k.drawPath(path, paint);
                    pathEffect = null;
                    paint.setPathEffect(null);
                } else if (i9 != 4) {
                    int entryCount = iLineDataSet.getEntryCount();
                    int i14 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED ? 1 : i8;
                    if (i14 != 0) {
                        i = 4;
                        c = 4;
                    } else {
                        c = 4;
                        i = 2;
                    }
                    Transformer transformer5 = lineDataProvider.getTransformer(iLineDataSet.getAxisDependency());
                    chartAnimator.getClass();
                    paint.setStyle(Paint.Style.STROKE);
                    Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.k : canvas;
                    odVar.a(lineDataProvider, iLineDataSet);
                    if (!iLineDataSet.isDrawFilledEnabled() || entryCount <= 0) {
                        i2 = entryCount;
                        i3 = i14;
                        bitmap = bitmap2;
                        i4 = i8;
                        it = it2;
                    } else {
                        i4 = i8;
                        int i15 = odVar.a;
                        int i16 = odVar.c + i15;
                        i2 = entryCount;
                        int i17 = i4;
                        while (true) {
                            i3 = i14;
                            int i18 = (i17 * 128) + i15;
                            int i19 = i17;
                            int i20 = i18 + 128;
                            if (i20 > i16) {
                                i20 = i16;
                            }
                            int i21 = i16;
                            if (i18 <= i20) {
                                float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, lineDataProvider);
                                i5 = i15;
                                it = it2;
                                int i22 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED ? 1 : i4;
                                Path path3 = this.p;
                                path3.reset();
                                ?? entryForIndex5 = iLineDataSet.getEntryForIndex(i18);
                                int i23 = i22;
                                path3.moveTo(entryForIndex5.b(), fillLinePosition);
                                bitmap = bitmap2;
                                path3.lineTo(entryForIndex5.b(), entryForIndex5.a() * 1.0f);
                                int i24 = i18 + 1;
                                ?? r10 = 0;
                                ?? r28 = entryForIndex5;
                                while (i24 <= i20) {
                                    ?? entryForIndex6 = iLineDataSet.getEntryForIndex(i24);
                                    int i25 = i24;
                                    if (i23 != 0) {
                                        r32 = entryForIndex6;
                                        path3.lineTo(entryForIndex6.b(), r28.a() * 1.0f);
                                    } else {
                                        r32 = entryForIndex6;
                                    }
                                    path3.lineTo(r32.b(), r32.a() * 1.0f);
                                    i24 = i25 + 1;
                                    ?? r102 = r32;
                                    r28 = r102;
                                    r10 = r102;
                                }
                                if (r10 != 0) {
                                    path3.lineTo(r10.b(), fillLinePosition);
                                }
                                path3.close();
                                transformer5.e(path3);
                                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                                if (fillDrawable != null) {
                                    l(canvas, path3, fillDrawable);
                                } else {
                                    LineRadarRenderer.k(canvas, path3, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                                }
                            } else {
                                bitmap = bitmap2;
                                i5 = i15;
                                it = it2;
                            }
                            int i26 = i19 + 1;
                            if (i18 > i20) {
                                break;
                            }
                            i17 = i26;
                            i14 = i3;
                            i16 = i21;
                            i15 = i5;
                            it2 = it;
                            bitmap2 = bitmap;
                        }
                    }
                    int size = iLineDataSet.getColors().size();
                    float[] fArr = this.o;
                    if (size > 1) {
                        int length = fArr.length;
                        int i27 = i * 2;
                        if (length <= i27) {
                            this.o = new float[i * 4];
                        }
                        int i28 = odVar.a;
                        while (i28 <= odVar.c + odVar.a) {
                            ?? entryForIndex7 = iLineDataSet.getEntryForIndex(i28);
                            if (entryForIndex7 != 0) {
                                this.o[i4] = entryForIndex7.b();
                                this.o[1] = entryForIndex7.a() * 1.0f;
                                if (i28 < odVar.b) {
                                    ?? entryForIndex8 = iLineDataSet.getEntryForIndex(i28 + 1);
                                    if (entryForIndex8 == 0) {
                                        break;
                                    }
                                    float[] fArr2 = this.o;
                                    if (i3 != 0) {
                                        fArr2[2] = entryForIndex8.b();
                                        float[] fArr3 = this.o;
                                        float f = fArr3[1];
                                        fArr3[3] = f;
                                        fArr3[c] = fArr3[2];
                                        fArr3[5] = f;
                                        fArr3[6] = entryForIndex8.b();
                                        this.o[7] = entryForIndex8.a() * 1.0f;
                                    } else {
                                        fArr2[2] = entryForIndex8.b();
                                        this.o[3] = entryForIndex8.a() * 1.0f;
                                    }
                                } else {
                                    float[] fArr4 = this.o;
                                    fArr4[2] = fArr4[i4];
                                    fArr4[3] = fArr4[1];
                                }
                                transformer5.g(this.o);
                                if (!viewPortHandler.f(this.o[i4])) {
                                    break;
                                }
                                if (viewPortHandler.e(this.o[2]) && (viewPortHandler.g(this.o[1]) || viewPortHandler.d(this.o[3]))) {
                                    paint.setColor(iLineDataSet.getColor(i28));
                                    canvas2.drawLines(this.o, i4, i27, paint);
                                }
                            }
                            i28++;
                            i4 = 0;
                        }
                    } else {
                        int length2 = fArr.length;
                        int i29 = i2 * i;
                        if (length2 < Math.max(i29, i) * 2) {
                            this.o = new float[Math.max(i29, i) * 4];
                        }
                        if (iLineDataSet.getEntryForIndex(odVar.a) != null) {
                            int i30 = odVar.a;
                            int i31 = 0;
                            while (i30 <= odVar.c + odVar.a) {
                                ?? entryForIndex9 = iLineDataSet.getEntryForIndex(i30 == 0 ? 0 : i30 - 1);
                                ?? entryForIndex10 = iLineDataSet.getEntryForIndex(i30);
                                if (entryForIndex9 != 0 && entryForIndex10 != 0) {
                                    this.o[i31] = entryForIndex9.b();
                                    int i32 = i31 + 2;
                                    this.o[i31 + 1] = entryForIndex9.a() * 1.0f;
                                    if (i3 != 0) {
                                        this.o[i32] = entryForIndex10.b();
                                        this.o[i31 + 3] = entryForIndex9.a() * 1.0f;
                                        this.o[i31 + 4] = entryForIndex10.b();
                                        i32 = i31 + 6;
                                        this.o[i31 + 5] = entryForIndex9.a() * 1.0f;
                                    }
                                    this.o[i32] = entryForIndex10.b();
                                    this.o[i32 + 1] = entryForIndex10.a() * 1.0f;
                                    i31 = i32 + 2;
                                }
                                i30++;
                            }
                            if (i31 > 0) {
                                transformer5.g(this.o);
                                int iMax = Math.max((odVar.c + 1) * i, i) * 2;
                                paint.setColor(iLineDataSet.getColor());
                                canvas2.drawLines(this.o, 0, iMax, paint);
                            }
                        }
                    }
                    pathEffect = null;
                    paint.setPathEffect(null);
                } else {
                    bitmap = bitmap2;
                    it = it2;
                    chartAnimator.getClass();
                    Transformer transformer6 = lineDataProvider.getTransformer(iLineDataSet.getAxisDependency());
                    odVar.a(lineDataProvider, iLineDataSet);
                    path.reset();
                    if (odVar.c >= 1) {
                        ?? entryForIndex11 = iLineDataSet.getEntryForIndex(odVar.a);
                        path.moveTo(entryForIndex11.b(), entryForIndex11.a() * 1.0f);
                        int i33 = odVar.a + 1;
                        ?? r3 = entryForIndex11;
                        while (i33 <= odVar.c + odVar.a) {
                            ?? entryForIndex12 = iLineDataSet.getEntryForIndex(i33);
                            float fB = ((entryForIndex12.b() - r3.b()) / 2.0f) + r3.b();
                            path.cubicTo(fB, r3.a() * 1.0f, fB, entryForIndex12.a() * 1.0f, entryForIndex12.b(), entryForIndex12.a() * 1.0f);
                            i33++;
                            r3 = entryForIndex12;
                        }
                    }
                    if (iLineDataSet.isDrawFilledEnabled()) {
                        path2.reset();
                        path2.addPath(path);
                        transformer3 = transformer6;
                        m(this.k, iLineDataSet, path2, transformer3, this.f);
                    } else {
                        transformer3 = transformer6;
                    }
                    paint.setColor(iLineDataSet.getColor());
                    paint.setStyle(Paint.Style.STROKE);
                    transformer3.e(path);
                    this.k.drawPath(path, paint);
                    pathEffect = null;
                    paint.setPathEffect(null);
                }
                paint.setPathEffect(pathEffect);
            }
            it2 = it;
            bitmap2 = bitmap;
            i8 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.LineChartRenderer.c(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void d(Canvas canvas, Highlight[] highlightArr) {
        LineDataProvider lineDataProvider = this.h;
        LineData lineData = lineDataProvider.getLineData();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.b(highlight.f);
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iLineDataSet.getEntryForXValue(highlight.a, highlight.b);
                if (h(entryForXValue, iLineDataSet)) {
                    Transformer transformer = lineDataProvider.getTransformer(iLineDataSet.getAxisDependency());
                    float fB = entryForXValue.b();
                    float fA = entryForXValue.a();
                    this.b.getClass();
                    xm0 xm0VarA = transformer.a(fB, fA * 1.0f);
                    float f = (float) xm0VarA.b;
                    float f2 = (float) xm0VarA.c;
                    highlight.i = f;
                    highlight.j = f2;
                    j(canvas, f, f2, iLineDataSet);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void e(Canvas canvas) {
        LineDataProvider lineDataProvider;
        List list;
        LineDataProvider lineDataProvider2;
        List list2;
        Canvas canvas2;
        LineDataProvider lineDataProvider3 = this.h;
        if (g(lineDataProvider3)) {
            List list3 = lineDataProvider3.getLineData().i;
            int i = 0;
            while (i < list3.size()) {
                ILineDataSet iLineDataSet = (ILineDataSet) list3.get(i);
                if (!BarLineScatterCandleBubbleRenderer.i(iLineDataSet) || iLineDataSet.getEntryCount() < 1) {
                    lineDataProvider = lineDataProvider3;
                    list = list3;
                } else {
                    a(iLineDataSet);
                    Transformer transformer = lineDataProvider3.getTransformer(iLineDataSet.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    od odVar = this.f;
                    odVar.a(lineDataProvider3, iLineDataSet);
                    this.b.getClass();
                    int i2 = odVar.a;
                    int i3 = (((int) ((odVar.b - i2) * 1.0f)) + 1) * 2;
                    float[] fArr = transformer.f;
                    if (fArr.length != i3) {
                        fArr = new float[i3];
                        transformer.f = fArr;
                    }
                    for (int i4 = 0; i4 < i3; i4 += 2) {
                        ?? entryForIndex = iLineDataSet.getEntryForIndex((i4 / 2) + i2);
                        if (entryForIndex != 0) {
                            fArr[i4] = entryForIndex.b();
                            fArr[i4 + 1] = entryForIndex.a() * 1.0f;
                        } else {
                            fArr[i4] = 0.0f;
                            fArr[i4 + 1] = 0.0f;
                        }
                    }
                    transformer.b().mapPoints(fArr);
                    ValueFormatter valueFormatter = iLineDataSet.getValueFormatter();
                    MPPointF mPPointFC = MPPointF.c(iLineDataSet.getIconsOffset());
                    mPPointFC.b = Utils.c(mPPointFC.b);
                    mPPointFC.c = Utils.c(mPPointFC.c);
                    int i5 = 0;
                    while (i5 < fArr.length) {
                        float f = fArr[i5];
                        float f2 = fArr[i5 + 1];
                        ViewPortHandler viewPortHandler = this.a;
                        if (!viewPortHandler.f(f)) {
                            break;
                        }
                        if (viewPortHandler.e(f) && viewPortHandler.i(f2)) {
                            int i6 = i5 / 2;
                            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(odVar.a + i6);
                            if (iLineDataSet.isDrawValuesEnabled()) {
                                valueFormatter.getClass();
                                lineDataProvider2 = lineDataProvider3;
                                int valueTextColor = iLineDataSet.getValueTextColor(i6);
                                list2 = list3;
                                Paint paint = this.e;
                                paint.setColor(valueTextColor);
                                canvas2 = canvas;
                                canvas2.drawText(valueFormatter.b(entryForIndex2.a()), f, f2 - circleRadius, paint);
                            } else {
                                canvas2 = canvas;
                                lineDataProvider2 = lineDataProvider3;
                                list2 = list3;
                            }
                            if (entryForIndex2.c != null && iLineDataSet.isDrawIconsEnabled()) {
                                Drawable drawable = entryForIndex2.c;
                                Utils.d(canvas2, drawable, (int) (f + mPPointFC.b), (int) (f2 + mPPointFC.c), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                        } else {
                            lineDataProvider2 = lineDataProvider3;
                            list2 = list3;
                        }
                        i5 += 2;
                        lineDataProvider3 = lineDataProvider2;
                        list3 = list2;
                    }
                    lineDataProvider = lineDataProvider3;
                    list = list3;
                    MPPointF.d(mPPointFC);
                }
                i++;
                lineDataProvider3 = lineDataProvider;
                list3 = list;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    public final void m(Canvas canvas, ILineDataSet iLineDataSet, Path path, Transformer transformer, od odVar) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.h);
        path.lineTo(iLineDataSet.getEntryForIndex(odVar.a + odVar.c).b(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(odVar.a).b(), fillLinePosition);
        path.close();
        transformer.e(path);
        Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            l(canvas, path, fillDrawable);
        } else {
            LineRadarRenderer.k(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
    }
}
