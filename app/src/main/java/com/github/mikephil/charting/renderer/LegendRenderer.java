package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.xj0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class LegendRenderer extends Renderer {
    public final Paint b;
    public final Paint c;
    public final Legend d;
    public final ArrayList e;
    public final Paint.FontMetrics f;
    public final Path g;

    public LegendRenderer(ViewPortHandler viewPortHandler, Legend legend) {
        super(viewPortHandler);
        this.e = new ArrayList(16);
        this.f = new Paint.FontMetrics();
        this.g = new Path();
        this.d = legend;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setTextSize(Utils.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.github.mikephil.charting.data.ChartData r27) {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.LegendRenderer.a(com.github.mikephil.charting.data.ChartData):void");
    }

    public final void b(Canvas canvas, float f, float f2, LegendEntry legendEntry, Legend legend) {
        Canvas canvas2;
        int i = legendEntry.f;
        float f3 = legendEntry.d;
        float f4 = legendEntry.c;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        Legend.LegendForm legendForm = legendEntry.b;
        if (legendForm == Legend.LegendForm.DEFAULT) {
            legendForm = legend.k;
        }
        Paint paint = this.c;
        paint.setColor(i);
        if (Float.isNaN(f4)) {
            f4 = legend.l;
        }
        float fC = Utils.c(f4);
        float f5 = fC / 2.0f;
        int i2 = xj0.d[legendForm.ordinal()];
        if (i2 == 3 || i2 == 4) {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        } else if (i2 != 5) {
            if (i2 == 6) {
                if (Float.isNaN(f3)) {
                    f3 = legend.m;
                }
                float fC2 = Utils.c(f3);
                DashPathEffect dashPathEffect = legendEntry.e;
                if (dashPathEffect == null) {
                    legend.getClass();
                    dashPathEffect = null;
                }
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fC2);
                paint.setPathEffect(dashPathEffect);
                Path path = this.g;
                path.reset();
                path.moveTo(f, f2);
                path.lineTo(f + fC, f2);
                canvas.drawPath(path, paint);
            }
            canvas2 = canvas;
        } else {
            paint.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f, f2 - f5, f + fC, f2 + f5, paint);
        }
        canvas2.restoreToCount(iSave);
    }

    public final void c(Canvas canvas) {
        Paint paint;
        float f;
        float f2;
        float f3;
        Canvas canvas2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        float f4;
        float f5;
        boolean z;
        float f6;
        float f7;
        float f8;
        String str;
        float f9;
        Canvas canvas3;
        Legend.LegendDirection legendDirection;
        float fMeasureText;
        Paint paint2;
        float f10;
        float fWidth;
        double d;
        double d2;
        LegendRenderer legendRenderer = this;
        Legend legend = legendRenderer.d;
        if (legend.a) {
            float f11 = legend.d;
            Paint paint3 = legendRenderer.b;
            paint3.setTextSize(f11);
            paint3.setColor(legend.e);
            DisplayMetrics displayMetrics = Utils.a;
            Paint.FontMetrics fontMetrics = legendRenderer.f;
            paint3.getFontMetrics(fontMetrics);
            float f12 = fontMetrics.descent - fontMetrics.ascent;
            paint3.getFontMetrics(fontMetrics);
            float fC = Utils.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float fA = f12 - (Utils.a(paint3, "ABC") / 2.0f);
            LegendEntry[] legendEntryArr = legend.f;
            float fC2 = Utils.c(legend.o);
            float fC3 = Utils.c(legend.n);
            Legend.LegendOrientation legendOrientation = legend.i;
            Legend.LegendHorizontalAlignment legendHorizontalAlignment = legend.g;
            Legend.LegendVerticalAlignment legendVerticalAlignment = legend.h;
            Legend.LegendDirection legendDirection2 = legend.j;
            float fC4 = Utils.c(legend.l);
            float fC5 = Utils.c(legend.p);
            float f13 = legend.c;
            float f14 = legend.b;
            int i2 = xj0.a[legendHorizontalAlignment.ordinal()];
            float f15 = fC5;
            ViewPortHandler viewPortHandler = legendRenderer.a;
            if (i2 == 1) {
                paint = paint3;
                f = f13;
                if (legendOrientation != Legend.LegendOrientation.VERTICAL) {
                    f14 += viewPortHandler.b.left;
                }
                f2 = legendDirection2 == Legend.LegendDirection.RIGHT_TO_LEFT ? f14 + legend.r : f14;
            } else if (i2 == 2) {
                paint = paint3;
                f = f13;
                f2 = (legendOrientation == Legend.LegendOrientation.VERTICAL ? viewPortHandler.c : viewPortHandler.b.right) - f14;
                if (legendDirection2 == Legend.LegendDirection.LEFT_TO_RIGHT) {
                    f2 -= legend.r;
                }
            } else if (i2 != 3) {
                paint = paint3;
                f = f13;
                f2 = 0.0f;
            } else {
                Legend.LegendOrientation legendOrientation2 = Legend.LegendOrientation.VERTICAL;
                if (legendOrientation == legendOrientation2) {
                    fWidth = viewPortHandler.c / 2.0f;
                    f = f13;
                } else {
                    RectF rectF = viewPortHandler.b;
                    f = f13;
                    fWidth = (rectF.width() / 2.0f) + rectF.left;
                }
                Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                f2 = fWidth + (legendDirection2 == legendDirection3 ? f14 : -f14);
                paint = paint3;
                if (legendOrientation == legendOrientation2) {
                    double d3 = f2;
                    float f16 = legend.r;
                    if (legendDirection2 == legendDirection3) {
                        d = d3;
                        d2 = (((double) (-f16)) / 2.0d) + ((double) f14);
                    } else {
                        d = d3;
                        d2 = (((double) f16) / 2.0d) - ((double) f14);
                    }
                    f2 = (float) (d + d2);
                }
            }
            int i3 = xj0.c[legendOrientation.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                int i4 = xj0.b[legendVerticalAlignment.ordinal()];
                if (i4 == 1) {
                    f5 = (legendHorizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? 0.0f : viewPortHandler.b.top) + f;
                } else if (i4 != 2) {
                    f5 = i4 != 3 ? 0.0f : ((viewPortHandler.d / 2.0f) - (legend.s / 2.0f)) + legend.c;
                } else {
                    f5 = (legendHorizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? viewPortHandler.d : viewPortHandler.b.bottom) - (legend.s + f);
                }
                float f17 = f5;
                boolean z2 = false;
                int i5 = 0;
                float f18 = 0.0f;
                while (i5 < legendEntryArr.length) {
                    LegendEntry legendEntry = legendEntryArr[i5];
                    Legend.LegendForm legendForm = legendEntry.b;
                    String str2 = legendEntry.a;
                    float f19 = legendEntry.c;
                    boolean z3 = legendForm != Legend.LegendForm.NONE;
                    float fC6 = Float.isNaN(f19) ? fC4 : Utils.c(f19);
                    if (z3) {
                        Legend.LegendDirection legendDirection4 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        float f20 = legendDirection2 == legendDirection4 ? f2 + f18 : f2 - (fC6 - f18);
                        f6 = f17;
                        str = str2;
                        z = z3;
                        f7 = fC;
                        f8 = f15;
                        f9 = f2;
                        legendDirection = legendDirection2;
                        legendRenderer.b(canvas, f20, f17 + fA, legendEntry, legendRenderer.d);
                        canvas3 = canvas;
                        fMeasureText = legendDirection == legendDirection4 ? f20 + fC6 : f20;
                    } else {
                        z = z3;
                        f6 = f17;
                        f7 = fC;
                        f8 = f15;
                        str = str2;
                        f9 = f2;
                        canvas3 = canvas;
                        legendDirection = legendDirection2;
                        fMeasureText = f9;
                    }
                    if (str != null) {
                        if (z && !z2) {
                            fMeasureText += legendDirection == Legend.LegendDirection.LEFT_TO_RIGHT ? fC2 : -fC2;
                        } else if (z2) {
                            fMeasureText = f9;
                        }
                        paint2 = paint;
                        if (legendDirection == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            fMeasureText -= (int) paint2.measureText(str);
                        }
                        if (z2) {
                            float f21 = f12 + f7 + f6;
                            canvas3.drawText(str, fMeasureText, f21 + f12, paint2);
                            f10 = f21;
                        } else {
                            canvas3.drawText(str, fMeasureText, f6 + f12, paint2);
                            f10 = f6;
                        }
                        f17 = f12 + f7 + f10;
                        f18 = 0.0f;
                    } else {
                        paint2 = paint;
                        f18 = fC6 + f8 + f18;
                        f17 = f6;
                        z2 = true;
                    }
                    i5++;
                    legendDirection2 = legendDirection;
                    paint = paint2;
                    f2 = f9;
                    fC = f7;
                    f15 = f8;
                }
                return;
            }
            Paint paint4 = paint;
            float f22 = f2;
            ArrayList arrayList3 = legend.w;
            ArrayList arrayList4 = legend.u;
            ArrayList arrayList5 = legend.v;
            int i6 = xj0.b[legendVerticalAlignment.ordinal()];
            float f23 = i6 != 1 ? i6 != 2 ? i6 != 3 ? 0.0f : ((viewPortHandler.d - legend.s) / 2.0f) + f : (viewPortHandler.d - f) - legend.s : f;
            int length = legendEntryArr.length;
            float f24 = f23;
            float f25 = f22;
            int i7 = 0;
            int i8 = 0;
            while (i8 < length) {
                LegendEntry legendEntry2 = legendEntryArr[i8];
                float f26 = f25;
                Legend.LegendForm legendForm2 = legendEntry2.b;
                int i9 = length;
                String str3 = legendEntry2.a;
                LegendEntry[] legendEntryArr2 = legendEntryArr;
                float f27 = legendEntry2.c;
                boolean z4 = legendForm2 != Legend.LegendForm.NONE;
                float fC7 = Float.isNaN(f27) ? fC4 : Utils.c(f27);
                if (i8 >= arrayList5.size() || !((Boolean) arrayList5.get(i8)).booleanValue()) {
                    f3 = f26;
                } else {
                    f24 = f12 + fC + f24;
                    f3 = f22;
                }
                if (f3 == f22 && legendHorizontalAlignment == Legend.LegendHorizontalAlignment.CENTER && i7 < arrayList3.size()) {
                    f3 += (legendDirection2 == Legend.LegendDirection.RIGHT_TO_LEFT ? ((FSize) arrayList3.get(i7)).b : -((FSize) arrayList3.get(i7)).b) / 2.0f;
                    i7++;
                }
                int i10 = i7;
                boolean z5 = str3 == null;
                if (z4) {
                    if (legendDirection2 == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f3 -= fC7;
                    }
                    ArrayList arrayList6 = arrayList5;
                    float f28 = f3;
                    arrayList2 = arrayList3;
                    i = i8;
                    arrayList = arrayList6;
                    canvas2 = canvas;
                    legendRenderer.b(canvas2, f28, f24 + fA, legendEntry2, legendRenderer.d);
                    f3 = legendDirection2 == Legend.LegendDirection.LEFT_TO_RIGHT ? f28 + fC7 : f28;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList5;
                    arrayList2 = arrayList3;
                    i = i8;
                }
                if (z5) {
                    f4 = legendDirection2 == Legend.LegendDirection.RIGHT_TO_LEFT ? -f15 : f15;
                } else {
                    if (z4) {
                        f3 += legendDirection2 == Legend.LegendDirection.RIGHT_TO_LEFT ? -fC2 : fC2;
                    }
                    Legend.LegendDirection legendDirection5 = Legend.LegendDirection.RIGHT_TO_LEFT;
                    if (legendDirection2 == legendDirection5) {
                        f3 -= ((FSize) arrayList4.get(i)).b;
                    }
                    canvas2.drawText(str3, f3, f24 + f12, paint4);
                    if (legendDirection2 == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f3 += ((FSize) arrayList4.get(i)).b;
                    }
                    f4 = legendDirection2 == legendDirection5 ? -fC3 : fC3;
                }
                f25 = f3 + f4;
                i8 = i + 1;
                legendRenderer = this;
                i7 = i10;
                length = i9;
                legendEntryArr = legendEntryArr2;
                arrayList5 = arrayList;
                arrayList3 = arrayList2;
            }
        }
    }
}
