package coil3.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config = Bitmap.Config.ARGB_8888;
            configArr = new Bitmap.Config[]{config, Bitmap.Config.RGBA_F16};
        } else {
            config = Bitmap.Config.ARGB_8888;
            configArr = new Bitmap.Config[]{config};
        }
        a = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        }
        b = config;
    }

    public static final int a(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[PHI: r0
      0x001d: PHI (r0v3 int) = (r0v2 int), (r0v4 int) binds: [B:5:0x000d, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(coil3.util.Logger.Level r2, java.lang.String r3, java.lang.String r4) {
        /*
            int[] r0 = coil3.util.e.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 2
            if (r2 == r0) goto L1e
            r0 = 3
            if (r2 == r1) goto L1d
            r1 = 4
            if (r2 == r0) goto L1e
            r0 = 5
            if (r2 == r1) goto L1d
            if (r2 != r0) goto L19
            r1 = 6
            goto L1e
        L19:
            defpackage.p60.b()
            return
        L1d:
            r1 = r0
        L1e:
            android.util.Log.println(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.f.c(coil3.util.Logger$Level, java.lang.String, java.lang.String):void");
    }
}
