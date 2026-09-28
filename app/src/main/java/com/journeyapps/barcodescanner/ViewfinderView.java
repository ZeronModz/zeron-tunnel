package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import dev.zeron.tunnel.R;
import com.google.zxing.ResultPoint;
import defpackage.a11;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewfinderView extends View {
    public static final int[] l = {0, 64, 128, 192, 255, 192, 128, 64};
    public final Paint a;
    public int b;
    public final int c;
    public final int d;
    public boolean e;
    public int f;
    public ArrayList g;
    public ArrayList h;
    public CameraPreview i;
    public Rect j;
    public Size k;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a11.b);
        this.b = typedArrayObtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.c = typedArrayObtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.d = typedArrayObtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.e = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f = 0;
        this.g = new ArrayList(20);
        this.h = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Size size;
        CameraPreview cameraPreview = this.i;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            Size previewSize = this.i.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.j = framingRect;
                this.k = previewSize;
            }
        }
        Rect rect = this.j;
        if (rect == null || (size = this.k) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i = this.b;
        Paint paint = this.a;
        paint.setColor(i);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f, height, paint);
        if (this.e) {
            paint.setColor(this.c);
            paint.setAlpha(l[this.f]);
            this.f = (this.f + 1) % 8;
            int iHeight = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, paint);
        }
        float width2 = getWidth() / size.a;
        float height2 = getHeight() / size.b;
        boolean zIsEmpty = this.h.isEmpty();
        int i2 = this.d;
        if (!zIsEmpty) {
            paint.setAlpha(80);
            paint.setColor(i2);
            for (ResultPoint resultPoint : this.h) {
                canvas.drawCircle((int) (resultPoint.a * width2), (int) (resultPoint.b * height2), 3.0f, paint);
            }
            this.h.clear();
        }
        if (!this.g.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i2);
            for (ResultPoint resultPoint2 : this.g) {
                canvas.drawCircle((int) (resultPoint2.a * width2), (int) (resultPoint2.b * height2), 6.0f, paint);
            }
            ArrayList arrayList = this.g;
            ArrayList arrayList2 = this.h;
            this.g = arrayList2;
            this.h = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.i = cameraPreview;
        cameraPreview.j.add(new e(this));
    }

    public void setLaserVisibility(boolean z) {
        this.e = z;
    }

    public void setMaskColor(int i) {
        this.b = i;
    }
}
