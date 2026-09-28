package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LineRadarRenderer extends LineScatterCandleRadarRenderer {
    public LineRadarRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
    }

    public static void k(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & FlexItem.MAX_SIZE) | (i2 << 24);
        DisplayMetrics displayMetrics = Utils.a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i3);
        canvas.restoreToCount(iSave);
    }

    public final void l(Canvas canvas, Path path, Drawable drawable) {
        DisplayMetrics displayMetrics = Utils.a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        RectF rectF = this.a.b;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
