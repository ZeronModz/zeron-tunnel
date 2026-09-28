package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.util.SizeF;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzian;
import com.google.common.util.concurrent.ListenableFuture;
import com.sandok.tunnel.core.VpnProfile;
import com.trilead.ssh2.sftp.AttribFlags;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cn0 {
    public static volatile Handler b;
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[] g = {R.attr.theme, dev.zeron.tunnel.R.attr.theme};
    public static final int[] h = {dev.zeron.tunnel.R.attr.materialThemeOverlay};
    public static final int[] i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] k = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, VpnProfile.DEFAULT_MSSFIX_SIZE, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE, 6144, 7680};
    public static final int[] l = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] m = {5, 8, 10, 12};
    public static final int[] n = {6, 9, 12, 15};
    public static final int[] o = {2, 4, 6, 8};
    public static final int[] p = {9, 11, 13, 16};
    public static final int[] q = {5, 8, 10, 12};
    public static final String[] r = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] s = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static Boolean t;
    public static Boolean u;
    public static Boolean v;
    public static Boolean w;
    public static Boolean x;
    public static Boolean y;
    public final /* synthetic */ int a = 21;

    public static int A(float f2, float f3) {
        jx0.b(f2 > 0.0f, "Focal length should be positive.");
        jx0.b(f3 > 0.0f, "Sensor length should be positive.");
        int degrees = (int) Math.toDegrees(Math.atan(f3 / (f2 * 2.0f)) * 2.0d);
        jx0.d(degrees, 0, "The provided focal length and sensor length result in an invalid view angle degrees.", 360);
        return degrees;
    }

    public static int B(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int C(ik ikVar, int i2) {
        int i3;
        try {
            for (String str : ikVar.a.getCameraIdList()) {
                rj rjVarB = ikVar.b(str);
                Integer num = (Integer) rjVarB.a(CameraCharacteristics.LENS_FACING);
                jx0.f(num, "Lens facing can not be null");
                int iIntValue = num.intValue();
                if (i2 != 0) {
                    i3 = 1;
                    if (i2 != 1) {
                        i3 = 2;
                        if (i2 != 2) {
                            throw new IllegalArgumentException("The given lens facing: " + i2 + " can not be recognized.");
                        }
                    }
                } else {
                    i3 = 0;
                }
                if (iIntValue == i3) {
                    float[] fArr = (float[]) rjVarB.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    jx0.f(fArr, "The focal lengths can not be empty.");
                    return A(fArr[0], E(rjVarB));
                }
            }
            u7.r("Unable to get the default focal length with the specified lens facing.");
            return 0;
        } catch (CameraAccessExceptionCompat unused) {
            u7.r("Unable to get the default focal length.");
            return 0;
        }
    }

    public static Handler D() {
        if (b != null) {
            return b;
        }
        synchronized (cn0.class) {
            try {
                if (b == null) {
                    b = w91.l(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static float E(rj rjVar) {
        SizeF sizeF = (SizeF) rjVar.a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) rjVar.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) rjVar.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer num = (Integer) rjVar.a(CameraCharacteristics.SENSOR_ORIENTATION);
        jx0.f(sizeF, "The sensor size can't be null.");
        jx0.f(num, "The sensor orientation can't be null.");
        jx0.f(rect, "The active array size can't be null.");
        jx0.f(size, "The pixel array size can't be null.");
        Size sizeD = cg1.d(rect);
        if (cg1.b(num.intValue())) {
            SizeF sizeF2 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeD.getHeight(), sizeD.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeD = size2;
            sizeF = sizeF2;
        }
        return (sizeF.getWidth() * sizeD.getWidth()) / size.getWidth();
    }

    public static void F(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!L(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !L(b4) && !L(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void G(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (L(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || L(b4)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static void H(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62 || L(b3)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static int I(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return oo.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean J(rj rjVar, int i2) {
        int[] iArr = (int[]) rjVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean K(Context context) {
        Boolean boolValueOf = v;
        if (boolValueOf == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            v = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean L(byte b2) {
        return b2 > -65;
    }

    public static boolean M(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            t = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean N(Context context) {
        if (M(context) && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (j0(context)) {
            return !j03.n() || j03.o();
        }
        return false;
    }

    public static float O(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static int P(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static int Q(int i2) {
        return (i2 + 1) * (i2 < 32 ? 4 : 2);
    }

    public static int R(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iX = k02.x(obj);
        int i5 = iX & i2;
        int iT = T(i5, obj3);
        if (iT == 0) {
            return -1;
        }
        int i6 = ~i2;
        int i7 = iX & i6;
        int i8 = -1;
        while (true) {
            i3 = iT - 1;
            i4 = iArr[i3];
            if ((i4 & i6) == i7 && y(obj, objArr[i3]) && (objArr2 == null || y(obj2, objArr2[i3]))) {
                break;
            }
            int i9 = i4 & i2;
            if (i9 == 0) {
                return -1;
            }
            i8 = i3;
            iT = i9;
        }
        int i10 = i4 & i2;
        if (i8 == -1) {
            U(i5, i10, obj3);
            return i3;
        }
        iArr[i8] = P(iArr[i8], i10, i2);
        return i3;
    }

    public static int S(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j2 < -2147483648L ? AttribFlags.SSH_FILEXFER_ATTR_EXTENDED : (int) j2;
    }

    public static int T(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void U(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static int V(int i2) {
        return Math.max(4, k02.d(i2 + 1, 1.0d));
    }

    public static final ArrayList W(List list) {
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    public static Context X(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return contextThemeWrapper;
    }

    public static float Y() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static int Z(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static String a(int i2, int i3, String str) {
        if (i2 < 0) {
            return j03.q("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return j03.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        u7.r(hz.o(i3, "negative size: "));
        return null;
    }

    public static String a0(zzian zzianVar) {
        StringBuilder sb = new StringBuilder(zzianVar.zzc());
        for (int i2 = 0; i2 < zzianVar.zzc(); i2++) {
            byte bZza = zzianVar.zza(i2);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void b(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        u7.r(j03.q(str, Integer.valueOf(i2)));
    }

    public static void b0(ListenableFuture listenableFuture, String str) {
        e43 e43Var = new e43(str, 7);
        listenableFuture.addListener(new s33(0, listenableFuture, e43Var), g3.g);
    }

    public static void c(long j2, String str, boolean z) {
        if (z) {
            return;
        }
        u7.r(j03.q(str, Long.valueOf(j2)));
    }

    public static boolean c0(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static void d(String str, int i2, int i3, boolean z) {
        if (z) {
            return;
        }
        u7.r(j03.q(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static byte[] d0(byte[] bArr, byte[] bArr2) {
        long jE0 = e0(0, bArr) & 67108863;
        int i2 = 3;
        long jE02 = (e0(3, bArr) >> 2) & 67108611;
        long jE03 = (e0(6, bArr) >> 4) & 67092735;
        long jE04 = (e0(9, bArr) >> 6) & 66076671;
        long jE05 = (e0(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j8 = j7 & 67108863;
                long j9 = j4 + (j7 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j5 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = ((j11 >> 26) * 5) + j6;
                long j14 = j13 >> 26;
                long j15 = j13 & 67108863;
                long j16 = j15 + 5;
                long j17 = (j3 & 67108863) + j14;
                long j18 = j17 + (j16 >> 26);
                long j19 = j8 + (j18 >> 26);
                long j20 = j10 + (j19 >> 26);
                long j21 = (j12 + (j20 >> 26)) - 67108864;
                long j22 = j21 >> 63;
                long j23 = ~j22;
                long j24 = (j17 & j22) | (j18 & 67108863 & j23);
                long j25 = (j8 & j22) | (j19 & 67108863 & j23);
                long j26 = (j10 & j22) | (j20 & 67108863 & j23);
                long j27 = (j12 & j22) | (j21 & j23);
                long jE06 = e0(16, bArr) + (((j16 & 67108863 & j23) | (j15 & j22) | (j24 << 26)) & 4294967295L);
                long jE07 = e0(20, bArr) + (((j24 >> 6) | (j25 << 20)) & 4294967295L);
                long jE08 = e0(24, bArr);
                long jE09 = e0(28, bArr) + (((j26 >> 18) | (j27 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                k0(jE06 & 4294967295L, bArr4, 0);
                long j28 = jE07 + (jE06 >> 32);
                k0(j28 & 4294967295L, bArr4, 4);
                long j29 = jE08 + (((j26 << 14) | (j25 >> 12)) & 4294967295L) + (j28 >> 32);
                k0(j29 & 4294967295L, bArr4, 8);
                k0((jE09 + (j29 >> 32)) & 4294967295L, bArr4, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j30 = jE05 * 5;
            long j31 = jE04 * 5;
            long j32 = jE03 * 5;
            long jE010 = j6 + (e0(0, bArr3) & 67108863);
            long jE011 = j3 + ((e0(i2, bArr3) >> 2) & 67108863);
            long jE012 = j2 + ((e0(6, bArr3) >> 4) & 67108863);
            long jE013 = j4 + ((e0(9, bArr3) >> 6) & 67108863);
            long j33 = jE02;
            long jE014 = j5 + (((e0(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j34 = jE011 * jE0;
            long j35 = jE011 * j33;
            long j36 = jE012 * jE0;
            long j37 = jE011 * jE03;
            long j38 = jE012 * j33;
            long j39 = jE013 * jE0;
            long j40 = jE011 * jE04;
            long j41 = jE012 * jE03;
            long j42 = jE013 * j33;
            long j43 = jE014 * jE0;
            long j44 = (jE02 * 5 * jE014) + (jE013 * j32) + (jE012 * j31) + (jE011 * j30) + (jE010 * jE0);
            long j45 = j44 & 67108863;
            long j46 = jE013 * j31;
            long j47 = j32 * jE014;
            long j48 = j47 + j46 + (jE012 * j30) + (jE010 * j33) + j34 + (j44 >> 26);
            long j49 = j31 * jE014;
            long j50 = j49 + (jE013 * j30) + (jE010 * jE03) + j35 + j36 + (j48 >> 26);
            long j51 = (jE014 * j30) + (jE010 * jE04) + j37 + j38 + j39 + (j50 >> 26);
            long j52 = (jE010 * jE05) + j40 + j41 + j42 + j43 + (j51 >> 26);
            long j53 = ((j52 >> 26) * 5) + j45;
            j3 = (j48 & 67108863) + (j53 >> 26);
            i3 += 16;
            j2 = j50 & 67108863;
            j4 = j51 & 67108863;
            j5 = j52 & 67108863;
            j6 = j53 & 67108863;
            jE02 = j33;
            i2 = 3;
        }
    }

    public static void e(boolean z) {
        if (z) {
            return;
        }
        s31.c();
    }

    public static long e0(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16))) & 4294967295L;
    }

    public static void f(boolean z, String str) {
        if (z) {
            return;
        }
        u7.r(str);
    }

    public static void g(boolean z, String str, long j2, TimeUnit timeUnit) {
        if (z) {
            return;
        }
        u7.r(j03.q(str, Long.valueOf(j2), timeUnit));
    }

    public static boolean g0(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void h(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        u7.r(j03.q(str, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h0(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn0.h0(byte[]):int");
    }

    public static void i(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        u7.r(j03.q(str, obj, obj2));
    }

    public static String i0(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static void j(int i2, int i3) {
        String strQ;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strQ = j03.q("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    u7.r(hz.o(i3, "negative size: "));
                    return;
                }
                strQ = j03.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }

    public static boolean j0(Context context) {
        Boolean boolValueOf = u;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            u = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static void k(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        new StringBuilder(strValueOf2.length() + strValueOf.length() + 56 + 1);
        throw new IllegalStateException(str);
    }

    public static void k0(long j2, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }

    public static void l(long j2, boolean z) {
        if (!z) {
            throw new ArithmeticException(vh.j(j2, "overflow: checkedMultiply(", ", 64)"));
        }
    }

    public static Pair l0(RandomAccessFile randomAccessFile, int i2) throws IOException {
        int i3;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i2, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        m0(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i3 = -1;
        } else {
            int i4 = iCapacity - 22;
            int iMin = Math.min(i4, 65535);
            for (int i5 = 0; i5 < iMin; i5++) {
                i3 = i4 - i5;
                if (byteBufferAllocate.getInt(i3) == 101010256 && ((char) byteBufferAllocate.getShort(i3 + 20)) == i5) {
                    break;
                }
            }
            i3 = -1;
        }
        if (i3 == -1) {
            return null;
        }
        byteBufferAllocate.position(i3);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i3)));
    }

    public static void m(String str, int i2, int i3, boolean z) {
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i2);
        sb.append(", ");
        throw new ArithmeticException(hz.q(i3, ")", sb));
    }

    public static void m0(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        u7.r("ByteBuffer byte order must be little endian");
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        io0.e(str);
    }

    public static int n0(zzeq zzeqVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzeqVar.g(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zzeqVar.h(iArr[i2]) + i4;
    }

    public static void o(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            u7.i(a(i2, i3, "index"));
        }
    }

    public static zzeq o0(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        int length = bArrCopyOf.length;
        zzeq zzeqVar = new zzeq(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(bArrCopyOf, length);
            while (zzeqVar2.b() >= 16) {
                zzeqVar2.f(2);
                int iH = zzeqVar2.h(14);
                int iMin = Math.min(8 - zzeqVar.c, 14);
                int i4 = zzeqVar.c;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = zzeqVar.a;
                int i6 = zzeqVar.b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                int i8 = iH & 16383;
                bArr3[i6] = (byte) (b5 | ((i8 >>> i7) << i5));
                int i9 = i6 + 1;
                while (true) {
                    bArr2 = zzeqVar.a;
                    if (i7 > 8) {
                        i7 -= 8;
                        bArr2[i9] = (byte) (i8 >>> i7);
                        i9++;
                    }
                }
                byte b6 = (byte) (bArr2[i9] & ((1 << r7) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i8 & ((1 << i7) - 1)) << (8 - i7)) | b6);
                zzeqVar.f(14);
                zzeqVar.m();
            }
        }
        int length2 = bArrCopyOf.length;
        zzeqVar.a = bArrCopyOf;
        zzeqVar.b = 0;
        zzeqVar.c = 0;
        zzeqVar.d = length2;
        return zzeqVar;
    }

    public static void p(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? a(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? a(i3, i4, "end index") : j03.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void q(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        u7.p(j03.q(str, Integer.valueOf(i2)));
    }

    public static void r(long j2, String str, boolean z) {
        if (z) {
            return;
        }
        u7.p(j03.q(str, Long.valueOf(j2)));
    }

    public static void s(String str, boolean z) {
        if (z) {
            return;
        }
        u7.p(str);
    }

    public static void t(boolean z) {
        if (z) {
            return;
        }
        zg1.h();
    }

    public static void u(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        u7.p(j03.q(str, obj));
    }

    public static int v(int i2, int i3) {
        d("min (%s) must be less than or equal to max (%s)", i3, 1073741823, i3 <= 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static CameraDevice.StateCallback w(ArrayList arrayList) {
        return arrayList.isEmpty() ? new bk() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new ak(arrayList);
    }

    public static Object x(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        u7.r(hz.o(i2, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String z(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i2 = 0; i2 < byteString.size(); i2++) {
            byte bByteAt = byteString.byteAt(i2);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public abstract Object f0();

    public String toString() {
        switch (this.a) {
            case 21:
                return f0().toString();
            default:
                return super.toString();
        }
    }
}
