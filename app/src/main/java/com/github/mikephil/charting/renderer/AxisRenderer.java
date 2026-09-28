package com.github.mikephil.charting.renderer;

import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.xm0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AxisRenderer extends Renderer {
    public final AxisBase b;
    public final Transformer c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;

    public AxisRenderer(ViewPortHandler viewPortHandler, Transformer transformer, AxisBase axisBase) {
        super(viewPortHandler);
        this.c = transformer;
        this.b = axisBase;
        if (this.a != null) {
            this.e = new Paint(1);
            Paint paint = new Paint();
            this.d = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.g = paint3;
            paint3.setStyle(style);
        }
    }

    public void a(float f, float f2) {
        ViewPortHandler viewPortHandler = this.a;
        if (viewPortHandler != null) {
            RectF rectF = viewPortHandler.b;
            if (rectF.width() > 10.0f && !viewPortHandler.c()) {
                float f3 = rectF.left;
                float f4 = rectF.top;
                Transformer transformer = this.c;
                xm0 xm0VarC = transformer.c(f3, f4);
                xm0 xm0VarC2 = transformer.c(rectF.left, rectF.bottom);
                float f5 = (float) xm0VarC2.c;
                float f6 = (float) xm0VarC.c;
                xm0.c(xm0VarC);
                xm0.c(xm0VarC2);
                f = f5;
                f2 = f6;
            }
        }
        b(f, f2);
    }

    public void b(float f, float f2) {
        int i;
        AxisBase axisBase = this.b;
        int i2 = axisBase.n;
        double dAbs = Math.abs(f2 - f);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            axisBase.k = new float[0];
            axisBase.l = 0;
            return;
        }
        double dH = Utils.h(dAbs / ((double) i2));
        double dH2 = Utils.h(Math.pow(10.0d, (int) Math.log10(dH)));
        if (((int) (dH / dH2)) > 5) {
            dH = Math.floor(dH2 * 10.0d);
        }
        double dCeil = dH == 0.0d ? 0.0d : Math.ceil(((double) f) / dH) * dH;
        double dG = dH == 0.0d ? 0.0d : Utils.g(Math.floor(((double) f2) / dH) * dH);
        if (dH != 0.0d) {
            i = 0;
            for (double d = dCeil; d <= dG; d += dH) {
                i++;
            }
        } else {
            i = 0;
        }
        axisBase.l = i;
        if (axisBase.k.length < i) {
            axisBase.k = new float[i];
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (dCeil == 0.0d) {
                dCeil = 0.0d;
            }
            axisBase.k[i3] = (float) dCeil;
            dCeil += dH;
        }
        if (dH < 1.0d) {
            axisBase.m = (int) Math.ceil(-Math.log10(dH));
        } else {
            axisBase.m = 0;
        }
    }
}
