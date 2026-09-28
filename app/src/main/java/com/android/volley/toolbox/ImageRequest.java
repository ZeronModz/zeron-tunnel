package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response$ErrorListener;
import com.android.volley.Response$Listener;
import com.android.volley.VolleyLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ImageRequest extends Request<Bitmap> {
    public static final Object s = new Object();
    public final Object m;
    public final Response$Listener n;
    public final Bitmap.Config o;
    public final int p;
    public final int q;
    public final ImageView.ScaleType r;

    public ImageRequest(String str, Response$Listener<Bitmap> response$Listener, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, Response$ErrorListener response$ErrorListener) {
        super(0, str, response$ErrorListener);
        this.m = new Object();
        this.j = new DefaultRetryPolicy(1000, 2, 2.0f);
        this.n = response$Listener;
        this.o = config;
        this.p = i;
        this.q = i2;
        this.r = scaleType;
    }

    public static int q(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (((double) i3) * (((double) i2) / ((double) i4)));
                }
                if (i2 == 0) {
                    return i;
                }
                double d = ((double) i4) / ((double) i3);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d2 = i2;
                    return ((double) i) * d < d2 ? (int) (d2 / d) : i;
                }
                double d3 = i2;
                return ((double) i) * d > d3 ? (int) (d3 / d) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i3;
    }

    @Override // com.android.volley.Request
    public final void b(Object obj) {
        Response$Listener response$Listener;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.m) {
            response$Listener = this.n;
        }
        if (response$Listener != null) {
            response$Listener.onResponse(bitmap);
        }
    }

    @Override // com.android.volley.Request
    public final Request.Priority i() {
        return Request.Priority.LOW;
    }

    @Override // com.android.volley.Request
    public final com.android.volley.a n(NetworkResponse networkResponse) {
        com.android.volley.a aVarP;
        synchronized (s) {
            try {
                try {
                    aVarP = p(networkResponse);
                } catch (OutOfMemoryError e) {
                    VolleyLog.a("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.a.length), this.c);
                    return new com.android.volley.a(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarP;
    }

    public final com.android.volley.a p(NetworkResponse networkResponse) {
        Bitmap bitmapCreateScaledBitmap;
        byte[] bArr = networkResponse.a;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = this.q;
        int i2 = this.p;
        if (i2 == 0 && i == 0) {
            options.inPreferredConfig = this.o;
            bitmapCreateScaledBitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            ImageView.ScaleType scaleType = this.r;
            int iQ = q(i2, i, i3, i4, scaleType);
            int iQ2 = q(i, i2, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (f2 > Math.min(((double) i3) / ((double) iQ), ((double) i4) / ((double) iQ2))) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray == null || (bitmapDecodeByteArray.getWidth() <= iQ && bitmapDecodeByteArray.getHeight() <= iQ2)) {
                bitmapCreateScaledBitmap = bitmapDecodeByteArray;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iQ, iQ2, true);
                bitmapDecodeByteArray.recycle();
            }
        }
        return bitmapCreateScaledBitmap == null ? new com.android.volley.a(new ParseError(networkResponse)) : new com.android.volley.a(bitmapCreateScaledBitmap, HttpHeaderParser.a(networkResponse));
    }

    @Deprecated
    public ImageRequest(String str, Response$Listener<Bitmap> response$Listener, int i, int i2, Bitmap.Config config, Response$ErrorListener response$ErrorListener) {
        this(str, response$Listener, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, response$ErrorListener);
    }
}
