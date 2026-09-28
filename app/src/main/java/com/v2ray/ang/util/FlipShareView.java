package com.v2ray.ang.util;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.flexbox.FlexItem;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class FlipShareView extends View {
    public static final /* synthetic */ int x = 0;
    public final int a;
    public final Paint b;
    public final Path c;
    public final Camera d;
    public final Matrix e;
    public int f;
    public int g;
    public final int h;
    public final RectF i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final View q;
    public final ArrayList r;
    public final ArrayList s;
    public int t;
    public final ArrayList u;
    public final ObjectAnimator v;
    public OnFlipClickListener w;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public @interface AnimType {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class Builder {
        public final View a;

        public Builder(Activity activity, View view) {
            new ArrayList();
            this.a = view;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface OnFlipClickListener {
        void dismiss();

        void onItemClick(int i);
    }

    public FlipShareView(Context context, Window window, View view) {
        super(context);
        this.a = 0;
        this.f = FlexItem.MAX_SIZE;
        this.g = 0;
        this.h = a(0.4f);
        int iA = a(190.0f);
        this.j = iA;
        this.k = a(50.0f);
        this.l = a(0.0f);
        this.m = a(50.0f);
        this.n = a(6.0f);
        this.o = a(4.0f);
        int iA2 = a(5.0f);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = 0;
        this.u = new ArrayList();
        this.q = view;
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        this.i = new RectF(0.0f, 0.0f, i, i2);
        window.addContentView(this, new WindowManager.LayoutParams(-1, -1));
        this.c = new Path();
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setTextSize((int) ((14.0f * getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f));
        this.d = new Camera();
        this.e = new Matrix();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.v = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.v.addListener(new b(this));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int left = view.getLeft();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = iArr[1];
        int i4 = measuredHeight / 2;
        int i5 = i3 - i4;
        int i6 = i4 + i3;
        int i7 = (measuredWidth / 2) + left;
        if (i3 < i2 / 2) {
            this.a = 1;
            int iA3 = a(5.0f) + i6;
            this.m = iA3;
            this.p = a(6.0f) + iA3;
        } else {
            this.a = 2;
            int iA4 = i5 - a(5.0f);
            this.m = iA4;
            this.p = iA4 - a(6.0f);
        }
        int i8 = iA / 2;
        if (i8 + i7 > i) {
            this.l = (i - iA) - iA2;
            return;
        }
        int i9 = i7 - i8;
        if (i9 < 0) {
            this.l = iA2;
        } else {
            this.l = i9;
        }
    }

    public final int a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b(Canvas canvas, int i) {
        ArrayList arrayList = this.r;
        Bitmap bitmap = ((ShareItem) arrayList.get(i)).d;
        if (bitmap != null) {
            int i2 = this.l + this.j;
            int i3 = this.k;
            int i4 = i3 / 2;
            float fA = (i2 - i4) - a(6.0f);
            Paint paint = this.b;
            int i5 = this.p;
            int i6 = this.a;
            if (i6 == 1) {
                float f = (i * i3) + (i3 / 4) + i5;
                float f2 = i4;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(fA, f, fA + f2, f2 + f), paint);
                return;
            }
            if (i6 == 2) {
                float size = i5 - ((((arrayList.size() - i) - 1) * i3) + (i3 / 4));
                float f3 = i4;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(fA - f3, size - f3, fA, size), paint);
            }
        }
    }

    public final void c(Canvas canvas, int i) {
        ShareItem shareItem = (ShareItem) this.r.get(i);
        int i2 = shareItem.b;
        Paint paint = this.b;
        paint.setColor(i2);
        int i3 = this.p;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = this.a;
        if (i6 == 1) {
            String str = shareItem.a;
            float fA = a(8.0f) + i4;
            String str2 = shareItem.a;
            paint.getTextBounds(str2, 0, str2.length(), new Rect());
            canvas.drawText(str, fA, ((r4.height() / 1.1f) / 2.0f) + i3 + (i5 / 2) + (i * i5), paint);
            return;
        }
        if (i6 == 2) {
            String str3 = shareItem.a;
            float fA2 = a(8.0f) + i4;
            String str4 = shareItem.a;
            paint.getTextBounds(str4, 0, str4.length(), new Rect());
            canvas.drawText(str3, fA2, (((r4.height() / 1.1f) / 2.0f) + i3) - ((((r0.size() - i) - 1) * i5) + (i5 / 2)), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instruction units count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.util.FlipShareView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.s;
                if (i >= arrayList.size()) {
                    break;
                }
                if (this.w != null) {
                    PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                    RectF rectF = (RectF) arrayList.get(i);
                    float f = pointF.x;
                    if (f >= rectF.left && f <= rectF.right) {
                        float f2 = pointF.y;
                        if (f2 >= rectF.top && f2 <= rectF.bottom) {
                            this.w.onItemClick(i);
                        }
                    }
                }
                i++;
            }
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
            ObjectAnimator objectAnimator = this.v;
            if (!objectAnimator.isRunning()) {
                objectAnimator.start();
            }
        }
        return true;
    }

    public void setAnimType(int i) {
        this.t = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f = i;
    }

    public void setOnFlipClickListener(OnFlipClickListener onFlipClickListener) {
        this.w = onFlipClickListener;
    }

    public void setSeparateLineColor(int i) {
        this.g = i;
    }

    public void setShareItemList(List<ShareItem> list) {
        ArrayList arrayList = this.r;
        arrayList.clear();
        for (ShareItem shareItem : list) {
            boolean zIsEmpty = TextUtils.isEmpty(shareItem.a);
            String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (zIsEmpty) {
                shareItem.a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                String str2 = shareItem.a;
                boolean z = shareItem.d != null;
                int length = str2.length();
                while (true) {
                    if (this.b.measureText(str2.substring(0, length).concat("...")) <= (this.j - a(10.0f)) - (z ? (this.k / 2) + a(6.0f) : 0)) {
                        break;
                    }
                    length--;
                    str = "...";
                }
                shareItem.a = str2.substring(0, length).concat(str);
            }
            arrayList.add(shareItem);
        }
    }

    public void setItemDuration(int i) {
    }
}
