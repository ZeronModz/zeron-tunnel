package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class MarkerImage implements IMarker {
    public final Drawable a;
    public final MPPointF b = new MPPointF();
    public final MPPointF c = new MPPointF();
    public final FSize d = new FSize();
    public final Rect e = new Rect();

    public MarkerImage(Context context, int i) {
        this.a = context.getResources().getDrawable(i, null);
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final void draw(Canvas canvas, float f, float f2) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        FSize fSize = this.d;
        float intrinsicWidth = fSize.b;
        float intrinsicHeight = fSize.c;
        if (intrinsicWidth == 0.0f) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0.0f) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        Rect rect = this.e;
        drawable.copyBounds(rect);
        int i = rect.left;
        int i2 = rect.top;
        drawable.setBounds(i, i2, ((int) intrinsicWidth) + i, ((int) intrinsicHeight) + i2);
        int iSave = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.b, f2 + offsetForDrawingAtPoint.c);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
        drawable.setBounds(rect);
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final MPPointF getOffset() {
        return this.b;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = this.b;
        float f3 = mPPointF.b;
        MPPointF mPPointF2 = this.c;
        mPPointF2.b = f3;
        mPPointF2.c = mPPointF.c;
        FSize fSize = this.d;
        float f4 = fSize.b;
        float f5 = fSize.c;
        Drawable drawable = this.a;
        if (f4 == 0.0f && drawable != null) {
            drawable.getIntrinsicWidth();
        }
        if (f5 == 0.0f && drawable != null) {
            drawable.getIntrinsicHeight();
        }
        if (mPPointF2.b + f < 0.0f) {
            mPPointF2.b = -f;
        }
        if (mPPointF2.c + f2 < 0.0f) {
            mPPointF2.c = -f2;
        }
        return mPPointF2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
    }
}
