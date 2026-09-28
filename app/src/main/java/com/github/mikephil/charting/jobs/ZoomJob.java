package com.github.mikephil.charting.jobs;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ObjectPool$Poolable;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.ou0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ZoomJob extends ViewPortJob {
    public static final ou0 l;
    public final float h;
    public final float i;
    public final YAxis.AxisDependency j;
    public final Matrix k;

    static {
        ou0 ou0VarA = ou0.a(1, new ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        l = ou0VarA;
        ou0VarA.f = 0.5f;
    }

    public ZoomJob(ViewPortHandler viewPortHandler, float f, float f2, float f3, float f4, Transformer transformer, YAxis.AxisDependency axisDependency, View view) {
        super(viewPortHandler, f3, f4, transformer, view);
        this.k = new Matrix();
        this.h = f;
        this.i = f2;
        this.j = axisDependency;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new ZoomJob(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPortHandler viewPortHandler = this.c;
        viewPortHandler.getClass();
        Matrix matrix = this.k;
        matrix.reset();
        matrix.set(viewPortHandler.a);
        matrix.postScale(this.h, this.i);
        this.c.l(matrix, this.g, false);
        float f = ((BarLineChartBase) this.g).getAxis(this.j).y / this.c.j;
        float f2 = this.d - ((((BarLineChartBase) this.g).getXAxis().y / this.c.i) / 2.0f);
        float[] fArr = this.b;
        fArr[0] = f2;
        fArr[1] = (f / 2.0f) + this.e;
        this.f.g(fArr);
        this.c.n(fArr, matrix);
        this.c.l(matrix, this.g, false);
        ((BarLineChartBase) this.g).a();
        this.g.postInvalidate();
        l.c(this);
    }
}
