package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class TriangleShapeRenderer implements IShapeRenderer {
    public final Path a = new Path();

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public final void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f, float f2, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f3 = scatterShapeSize / 2.0f;
        float fC = (scatterShapeSize - (Utils.c(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.a;
        path.reset();
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f + f3;
        float f6 = f2 + f3;
        path.lineTo(f5, f6);
        float f7 = f - f3;
        path.lineTo(f7, f6);
        double d = scatterShapeSize;
        if (d > 0.0d) {
            path.lineTo(f, f4);
            float f8 = f7 + fC;
            float f9 = f6 - fC;
            path.moveTo(f8, f9);
            path.lineTo(f5 - fC, f9);
            path.lineTo(f, f4 + fC);
            path.lineTo(f8, f9);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d <= 0.0d || scatterShapeHoleColor == 1122867) {
            return;
        }
        paint.setColor(scatterShapeHoleColor);
        path.moveTo(f, f4 + fC);
        float f10 = f6 - fC;
        path.lineTo(f5 - fC, f10);
        path.lineTo(f7 + fC, f10);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
