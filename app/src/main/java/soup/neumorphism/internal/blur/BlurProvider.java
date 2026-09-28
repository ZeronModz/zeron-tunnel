package soup.neumorphism.internal.blur;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.math.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsoup/neumorphism/internal/blur/BlurProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class BlurProvider {
    public final WeakReference a;
    public final int b;

    public BlurProvider(Context context) {
        float f;
        context.getClass();
        this.a = new WeakReference(context);
        if (Build.VERSION.SDK_INT >= 24) {
            f = DisplayMetrics.DENSITY_DEVICE_STABLE / 160.0f;
        } else {
            Resources resources = context.getResources();
            resources.getClass();
            f = resources.getDisplayMetrics().density;
        }
        this.b = Math.min(25, a.b(f * 10.0f));
    }

    public static Bitmap a(BlurProvider blurProvider, Bitmap bitmap) throws Throwable {
        Bitmap bitmap2;
        boolean z;
        int i;
        Bitmap bitmapB;
        int i2 = blurProvider.b;
        blurProvider.getClass();
        BlurFactor blurFactor = new BlurFactor(bitmap.getWidth(), bitmap.getHeight(), i2, 1, 0, 16, null);
        int i3 = blurFactor.c;
        int i4 = blurFactor.a;
        int i5 = blurFactor.d;
        int i6 = i4 / i5;
        int i7 = blurFactor.b;
        int i8 = i7 / i5;
        if (i6 == 0 || i8 == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i8, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = 1.0f / i5;
        canvas.scale(f, f);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(blurFactor.e, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            bitmapB = blurProvider.b(bitmapCreateBitmap, i3);
            z = true;
            bitmap2 = null;
        } catch (RSRuntimeException unused) {
            if (i3 < 1) {
                z = true;
                bitmapCreateBitmap = null;
                bitmap2 = null;
            } else {
                int width = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                int i9 = width * height;
                int[] iArr = new int[i9];
                bitmapCreateBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                int i10 = width - 1;
                int i11 = height - 1;
                int i12 = i3 + i3;
                int i13 = i12 + 1;
                bitmap2 = null;
                int[] iArr2 = new int[i9];
                z = true;
                int[] iArr3 = new int[i9];
                int[] iArr4 = new int[i9];
                int[] iArr5 = new int[Math.max(width, height)];
                int i14 = (i12 + 2) >> 1;
                int i15 = i14 * i14;
                int i16 = i15 * 256;
                int[] iArr6 = new int[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    iArr6[i17] = i17 / i15;
                }
                int[][] iArr7 = new int[i13][];
                int i18 = 0;
                while (i18 < i13) {
                    int[][] iArr8 = iArr7;
                    iArr8[i18] = new int[3];
                    i18++;
                    iArr7 = iArr8;
                }
                int[][] iArr9 = iArr7;
                int i19 = i3 + 1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < height) {
                    int i23 = i19;
                    int i24 = -i3;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    while (i24 <= i3) {
                        int i34 = i20;
                        int[] iArr10 = iArr2;
                        int i35 = iArr[Math.min(i10, Math.max(i24, 0)) + i21];
                        int[] iArr11 = iArr9[i24 + i3];
                        iArr11[0] = (i35 & 16711680) >> 16;
                        iArr11[1] = (i35 & 65280) >> 8;
                        iArr11[2] = i35 & 255;
                        int iAbs = i23 - Math.abs(i24);
                        int i36 = iArr11[0];
                        i25 = (i36 * iAbs) + i25;
                        int i37 = iArr11[1];
                        i26 = (i37 * iAbs) + i26;
                        int i38 = iArr11[2];
                        i27 = (iAbs * i38) + i27;
                        if (i24 > 0) {
                            i31 += i36;
                            i32 += i37;
                            i33 += i38;
                        } else {
                            i28 += i36;
                            i29 += i37;
                            i30 += i38;
                        }
                        i24++;
                        i20 = i34;
                        iArr2 = iArr10;
                    }
                    int i39 = i20;
                    int[] iArr12 = iArr2;
                    int i40 = i3;
                    int i41 = 0;
                    while (i41 < width) {
                        iArr12[i21] = iArr6[i25];
                        iArr3[i21] = iArr6[i26];
                        iArr4[i21] = iArr6[i27];
                        int i42 = i25 - i28;
                        int i43 = i26 - i29;
                        int i44 = i27 - i30;
                        int[] iArr13 = iArr9[((i40 - i3) + i13) % i13];
                        int i45 = i28 - iArr13[0];
                        int i46 = i29 - iArr13[1];
                        int i47 = i30 - iArr13[2];
                        if (i39 == 0) {
                            i = i41;
                            iArr5[i] = Math.min(i41 + i3 + 1, i10);
                        } else {
                            i = i41;
                        }
                        int i48 = iArr[i22 + iArr5[i]];
                        int i49 = (i48 & 16711680) >> 16;
                        iArr13[0] = i49;
                        int i50 = (i48 & 65280) >> 8;
                        iArr13[1] = i50;
                        int i51 = i48 & 255;
                        iArr13[2] = i51;
                        int i52 = i31 + i49;
                        int i53 = i32 + i50;
                        int i54 = i33 + i51;
                        i25 = i42 + i52;
                        i26 = i43 + i53;
                        i27 = i44 + i54;
                        i40 = (i40 + 1) % i13;
                        int[] iArr14 = iArr9[i40 % i13];
                        int i55 = iArr14[0];
                        i28 = i45 + i55;
                        int i56 = iArr14[1];
                        i29 = i46 + i56;
                        int i57 = iArr14[2];
                        i30 = i47 + i57;
                        i31 = i52 - i55;
                        i32 = i53 - i56;
                        i33 = i54 - i57;
                        i21++;
                        i41 = i + 1;
                    }
                    i22 += width;
                    i20 = i39 + 1;
                    i19 = i23;
                    iArr2 = iArr12;
                }
                int i58 = i19;
                int[] iArr15 = iArr2;
                int i59 = 0;
                while (i59 < width) {
                    int i60 = -i3;
                    int i61 = i60 * width;
                    int i62 = 0;
                    int i63 = 0;
                    int i64 = 0;
                    int i65 = 0;
                    int i66 = 0;
                    int i67 = 0;
                    int i68 = 0;
                    int i69 = 0;
                    int i70 = 0;
                    while (i60 <= i3) {
                        int i71 = i59;
                        int iMax = Math.max(0, i61) + i71;
                        int[] iArr16 = iArr9[i60 + i3];
                        iArr16[0] = iArr15[iMax];
                        iArr16[1] = iArr3[iMax];
                        iArr16[2] = iArr4[iMax];
                        int iAbs2 = i58 - Math.abs(i60);
                        i62 = (iArr15[iMax] * iAbs2) + i62;
                        i63 = (iArr3[iMax] * iAbs2) + i63;
                        i64 = (iArr4[iMax] * iAbs2) + i64;
                        if (i60 > 0) {
                            i68 += iArr16[0];
                            i69 += iArr16[1];
                            i70 += iArr16[2];
                        } else {
                            i65 += iArr16[0];
                            i66 += iArr16[1];
                            i67 += iArr16[2];
                        }
                        if (i60 < i11) {
                            i61 += width;
                        }
                        i60++;
                        i59 = i71;
                    }
                    int i72 = i59;
                    int i73 = i3;
                    int i74 = i72;
                    for (int i75 = 0; i75 < height; i75++) {
                        iArr[i74] = (iArr[i74] & (-16777216)) | (iArr6[i62] << 16) | (iArr6[i63] << 8) | iArr6[i64];
                        int i76 = i62 - i65;
                        int i77 = i63 - i66;
                        int i78 = i64 - i67;
                        int[] iArr17 = iArr9[((i73 - i3) + i13) % i13];
                        int i79 = i65 - iArr17[0];
                        int i80 = i66 - iArr17[1];
                        int i81 = i67 - iArr17[2];
                        int i82 = i74;
                        if (i72 == 0) {
                            iArr5[i75] = Math.min(i75 + i58, i11) * width;
                        }
                        int i83 = i72 + iArr5[i75];
                        int i84 = iArr15[i83];
                        iArr17[0] = i84;
                        int i85 = iArr3[i83];
                        iArr17[1] = i85;
                        int i86 = iArr4[i83];
                        iArr17[2] = i86;
                        int i87 = i68 + i84;
                        int i88 = i69 + i85;
                        int i89 = i70 + i86;
                        i62 = i76 + i87;
                        i63 = i77 + i88;
                        i64 = i78 + i89;
                        i73 = (i73 + 1) % i13;
                        int[] iArr18 = iArr9[i73];
                        int i90 = iArr18[0];
                        i65 = i79 + i90;
                        int i91 = iArr18[1];
                        i66 = i80 + i91;
                        int i92 = iArr18[2];
                        i67 = i81 + i92;
                        i68 = i87 - i90;
                        i69 = i88 - i91;
                        i70 = i89 - i92;
                        i74 = i82 + width;
                    }
                    i59 = i72 + 1;
                }
                bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            }
            bitmapB = bitmapCreateBitmap;
        }
        if (bitmapB == null) {
            return bitmap2;
        }
        boolean z2 = z;
        if (i5 == z2) {
            return bitmapB;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapB, i4, i7, z2);
        bitmapB.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r6, int r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.ref.WeakReference r5 = r5.a
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            r0 = 0
            if (r5 == 0) goto L75
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L5c
            r5.getClass()     // Catch: java.lang.Throwable -> L58
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            r5.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L58
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L58
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L58
            r1.getClass()     // Catch: java.lang.Throwable -> L53
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L53
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: java.lang.Throwable -> L53
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L4e
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: java.lang.Throwable -> L4e
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L4e
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4e
            r0.setRadius(r7)     // Catch: java.lang.Throwable -> L4e
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L4e
            r2.copyTo(r6)     // Catch: java.lang.Throwable -> L4e
            r5.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r6
        L4e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L60
        L53:
            r6 = move-exception
            r2 = r0
        L55:
            r0 = r5
            r5 = r2
            goto L60
        L58:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto L55
        L5c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L60:
            if (r0 == 0) goto L65
            r0.destroy()
        L65:
            if (r1 == 0) goto L6a
            r1.destroy()
        L6a:
            if (r2 == 0) goto L6f
            r2.destroy()
        L6f:
            if (r5 == 0) goto L74
            r5.destroy()
        L74:
            throw r6
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: soup.neumorphism.internal.blur.BlurProvider.b(android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
