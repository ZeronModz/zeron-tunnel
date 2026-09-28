package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.ViewGroup;
import androidx.camera.core.impl.CameraCaptureCallback;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzdq;
import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.http.Cookie;
import io.ktor.http.ParametersBuilderImpl;
import io.ktor.http.Url;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UInt$Companion;
import kotlin.ULong$Companion;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.g;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.Source;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sb2 {
    public static boolean E = true;
    public static Method F;
    public static boolean G;
    public static AudioManager a;
    public static final char[] c;
    public static final char[] e;
    public static Method h;
    public static boolean i;
    public static final char[] b = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char[] d = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char[] f = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    public static final Object g = new Object();
    public static final x40 j = new x40("gads:afs:csa:experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 k = new x40("gads:app_index:experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 l = new x40("gads:block_autoclicks_experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 m = new x40("gads:sdk_core_experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 n = new x40("gads:spam_app_context:experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 o = new x40("gads:temporary_experiment_id:1", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 p = new x40("gads:temporary_experiment_id:10", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 q = new x40("gads:temporary_experiment_id:11", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 r = new x40("gads:temporary_experiment_id:12", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 s = new x40("gads:temporary_experiment_id:13", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 t = new x40("gads:temporary_experiment_id:14", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 u = new x40("gads:temporary_experiment_id:15", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 v = new x40("gads:temporary_experiment_id:2", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 w = new x40("gads:temporary_experiment_id:3", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 x = new x40("gads:temporary_experiment_id:4", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 y = new x40("gads:temporary_experiment_id:5", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 z = new x40("gads:temporary_experiment_id:6", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 A = new x40("gads:temporary_experiment_id:7", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 B = new x40("gads:temporary_experiment_id:8", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 C = new x40("gads:temporary_experiment_id:9", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public static final x40 D = new x40("gads:corewebview:experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        c = cArr;
        e = cArr;
    }

    public static File A(String str, File file, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(J(file, str), str2);
    }

    public static ArrayList B(byte[] bArr) {
        long j2 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j2 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void C(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void D(Object obj) {
        if (obj != null) {
            return;
        }
        io0.e("Cannot return null from a non-@Nullable @Provides method");
    }

    public static byte[] E(byte[] bArr) {
        if (bArr.length != 16) {
            u7.r("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            byte b3 = (byte) ((b2 + b2) & 254);
            bArr2[i2] = b3;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i3] >> 7) & 1) | b3);
            }
            i2 = i3;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static int F(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (u23.a[roundingMode.ordinal()]) {
            case 1:
                kf2.I(false);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                zu0.a();
                return 0;
        }
        return i4 + i6;
    }

    public static Object G(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        u7.p(vh.s(hz.A("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static boolean H(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                mc2.i(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                mc2.i(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                mc2.i(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] I(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb2.I(java.lang.String, boolean):java.lang.String[]");
    }

    public static File J(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        K(file2, false);
        return file2;
    }

    public static void K(File file, boolean z2) {
        if (z2 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean L(File file) {
        boolean z2;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z2 = true;
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                File file2 = fileArrListFiles[i2];
                z2 = file2 != null && L(file2) && z2;
            }
        } else {
            z2 = true;
        }
        return file.delete() && z2;
    }

    public static long M(byte b2, byte b3) {
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        return ((long) i2) * ((long) (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? 10000 << (i5 & 1) : i6 == 3 ? 60000 : 10000 << i6));
    }

    public static ParametersBuilderImpl a() {
        return new ParametersBuilderImpl(8);
    }

    public static int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > i3) {
            i4 = i3;
            i3 = i4;
        }
        int i5 = 1;
        int i6 = 1;
        while (i2 > i3) {
            i5 *= i2;
            if (i6 <= i4) {
                i5 /= i6;
                i6++;
            }
            i2--;
        }
        while (i6 <= i4) {
            i5 /= i6;
            i6++;
        }
        return i5;
    }

    public static final String c(String str, Decoder decoder) {
        decoder.getClass();
        return "Cannot deserialize " + str + " with '" + Reflection.a(decoder.getClass()).getSimpleName() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final int d(int i2, int i3, int i4) {
        long j2 = ((long) i4) & 4294967295L;
        int i5 = (int) ((((long) i2) & 4294967295L) % j2);
        int i6 = (int) ((((long) i3) & 4294967295L) % j2);
        int iCompare = Integer.compare(i5 ^ AttribFlags.SSH_FILEXFER_ATTR_EXTENDED, Integer.MIN_VALUE ^ i6);
        int i7 = i5 - i6;
        UInt$Companion uInt$Companion = zj1.b;
        return iCompare >= 0 ? i7 : i7 + i4;
    }

    public static final long e(long j2, long j3, long j4) {
        if (j4 < 0) {
            if ((j2 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                j2 -= j4;
            }
        } else if (j2 >= 0) {
            j2 %= j4;
        } else {
            long j5 = j2 - ((((j2 >>> 1) / j4) << 1) * j4);
            j2 = j5 - ((j5 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? j4 : 0L);
        }
        if (j4 < 0) {
            if ((j3 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                j3 -= j4;
            }
        } else if (j3 >= 0) {
            j3 %= j4;
        } else {
            long j6 = j3 - ((((j3 >>> 1) / j4) << 1) * j4);
            j3 = j6 - ((j6 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? j4 : 0L);
        }
        int iCompare = Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
        long j7 = j2 - j3;
        ULong$Companion uLong$Companion = ck1.b;
        return iCompare >= 0 ? j7 : j7 + j4;
    }

    public static final String f(String str, Encoder encoder) {
        encoder.getClass();
        return "Cannot serialize " + str + " with '" + Reflection.a(encoder.getClass()).getSimpleName() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final Cookie g(Cookie cookie, Url url) {
        cookie.getClass();
        url.getClass();
        String str = cookie.g;
        if (str == null || !g.R(str, "/", false)) {
            cookie = Cookie.a(cookie, null, (String) url.m.getValue(), 959);
        }
        String str2 = cookie.f;
        return (str2 == null || g.B(str2)) ? Cookie.a(cookie, url.a, null, 991) : cookie;
    }

    public static Object h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        io0.e("Both parameters are null");
        return null;
    }

    public static int i(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        u7.r(hz.p(i2, "The given lens facing integer: ", " can not be recognized."));
        return 0;
    }

    public static int k(int[] iArr, int i2, boolean z2) {
        boolean z3;
        int[] iArr2 = iArr;
        int i3 = 0;
        for (int i4 : iArr2) {
            i3 += i4;
        }
        int length = iArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = length - 1;
            if (i5 >= i8) {
                return i6;
            }
            int i9 = 1 << i5;
            i7 |= i9;
            int i10 = 1;
            while (i10 < iArr2[i5]) {
                int i11 = i3 - i10;
                int i12 = length - i5;
                int i13 = i12 - 2;
                int iB = b(i11 - 1, i13);
                if (z2 && i7 == 0) {
                    int i14 = i12 - 1;
                    if (i11 - i14 >= i14) {
                        iB -= b(i11 - i12, i13);
                    }
                }
                boolean z4 = true;
                if (i12 - 1 > 1) {
                    int i15 = i11 - i13;
                    int iB2 = 0;
                    while (i15 > i2) {
                        iB2 += b((i11 - i15) - 1, i12 - 3);
                        i15--;
                        z4 = z4;
                    }
                    z3 = z4;
                    iB -= (i8 - i5) * iB2;
                } else {
                    z3 = true;
                    if (i11 > i2) {
                        iB--;
                    }
                }
                i6 += iB;
                i10++;
                i7 &= ~i9;
                iArr2 = iArr;
            }
            i3 -= i10;
            i5++;
            iArr2 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m(io.ktor.http.Cookie r8, io.ktor.http.Url r9) {
        /*
            r8.getClass()
            java.lang.String r0 = r8.g
            r9.getClass()
            java.lang.String r1 = r8.f
            r2 = 0
            if (r1 == 0) goto Laf
            java.lang.String r1 = defpackage.dn0.J(r1)
            r3 = 1
            char[] r4 = new char[r3]
            r5 = 46
            r4[r2] = r5
            int r5 = r1.length()
            r6 = r2
        L1d:
            if (r6 >= r5) goto L35
            char r7 = r1.charAt(r6)
            boolean r7 = kotlin.collections.b.d(r4, r7)
            if (r7 != 0) goto L32
            int r4 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r6, r4)
            goto L37
        L32:
            int r6 = r6 + 1
            goto L1d
        L35:
            java.lang.String r1 = ""
        L37:
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto Laf
            if (r0 == 0) goto La9
            r4 = 47
            boolean r5 = kotlin.text.g.v(r0, r4)
            java.lang.String r6 = "/"
            if (r5 == 0) goto L4a
            goto L4e
        L4a:
            java.lang.String r0 = r0.concat(r6)
        L4e:
            java.lang.String r5 = r9.a
            java.lang.String r5 = defpackage.dn0.J(r5)
            kotlin.Lazy r7 = r9.m
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r4 = kotlin.text.g.v(r7, r4)
            if (r4 == 0) goto L63
            goto L67
        L63:
            java.lang.String r7 = r7.concat(r6)
        L67:
            boolean r4 = r5.equals(r1)
            if (r4 != 0) goto L87
            io.ktor.http.parsing.regex.RegexParser r4 = defpackage.bh0.a
            r4.getClass()
            kotlin.text.Regex r4 = r4.a
            boolean r4 = r4.matches(r5)
            if (r4 != 0) goto La7
            java.lang.String r4 = "."
            java.lang.String r1 = r4.concat(r1)
            boolean r1 = kotlin.text.g.u(r5, r1, r2)
            if (r1 != 0) goto L87
            goto La7
        L87:
            boolean r1 = r0.equals(r6)
            if (r1 != 0) goto L9a
            boolean r1 = r7.equals(r0)
            if (r1 != 0) goto L9a
            boolean r0 = kotlin.text.g.R(r7, r0, r2)
            if (r0 != 0) goto L9a
            goto La7
        L9a:
            boolean r8 = r8.h
            if (r8 == 0) goto La8
            io.ktor.http.URLProtocol r8 = r9.l
            boolean r8 = defpackage.mc2.v(r8)
            if (r8 == 0) goto La7
            goto La8
        La7:
            return r2
        La8:
            return r3
        La9:
            java.lang.String r8 = "Path field should have the default value"
            defpackage.u7.p(r8)
            return r2
        Laf:
            java.lang.String r8 = "Domain field should have the default value"
            defpackage.u7.p(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb2.m(io.ktor.http.Cookie, io.ktor.http.Url):boolean");
    }

    public static void n(int i2, int i3, int[] iArr) {
        int i4 = ((i2 << 8) + i3) - 1;
        int i5 = i4 / 1600;
        iArr[0] = i5;
        int i6 = i4 - (i5 * 1600);
        int i7 = i6 / 40;
        iArr[1] = i7;
        iArr[2] = i6 - (i7 * 40);
    }

    public static final boolean o(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final int p(Source source, ByteBuffer byteBuffer) {
        source.getClass();
        byteBuffer.getClass();
        if (source.getC().c == 0) {
            source.request(8192L);
            if (source.getC().c == 0) {
                return -1;
            }
        }
        Buffer buffer = source.getC();
        buffer.getClass();
        if (buffer.exhausted()) {
            return -1;
        }
        if (buffer.exhausted()) {
            u7.r("Buffer is empty");
            return 0;
        }
        Segment segment = buffer.a;
        segment.getClass();
        byte[] bArr = segment.a;
        int i2 = segment.b;
        int iMin = Math.min(byteBuffer.remaining(), segment.c - i2);
        byteBuffer.put(bArr, i2, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            u7.p("Returned negative read bytes count");
            return 0;
        }
        if (iMin <= segment.b()) {
            buffer.skip(iMin);
            return iMin;
        }
        u7.p("Returned too many bytes");
        return 0;
    }

    public static void s(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            pn1.b(viewGroup, z2);
        } else if (E) {
            try {
                pn1.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                E = false;
            }
        }
    }

    public static final void t(String str, KClass kClass) {
        String string;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            string = vh.f('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbA = hz.A("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            hz.H(sbA, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbA.append(kClass.getSimpleName());
            sbA.append("' has to be sealed and '@Serializable'.");
            string = sbA.toString();
        }
        throw new SerializationException(string);
    }

    public static void u(CameraCaptureCallback cameraCaptureCallback, ArrayList arrayList) {
        if (cameraCaptureCallback instanceof ej) {
            Iterator it = ((ej) cameraCaptureCallback).a.iterator();
            while (it.hasNext()) {
                u((CameraCaptureCallback) it.next(), arrayList);
            }
        } else if (cameraCaptureCallback instanceof dl) {
            arrayList.add(((dl) cameraCaptureCallback).a);
        } else {
            arrayList.add(new cl(cameraCaptureCallback));
        }
    }

    public static tj1 v(Object obj) {
        return new tj1(obj.getClass().getSimpleName());
    }

    public static int w(int i2, int i3) {
        int i4 = i2 - (((i3 * 149) % 255) + 1);
        return i4 >= 0 ? i4 : i4 + 256;
    }

    public static int y(String str) {
        int i2;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = length & (-4);
            if (i3 >= i2) {
                break;
            }
            int i5 = ((bytes[i3] & 255) | ((bytes[i3 + 1] & 255) << 8) | ((bytes[i3 + 2] & 255) << 16) | (bytes[i3 + 3] << 24)) * (-862048943);
            int i6 = i4 ^ (((i5 >>> 17) | (i5 << 15)) * 461845907);
            i4 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
            i3 += 4;
        }
        int i7 = length & 3;
        if (i7 == 1) {
            int i8 = ((bytes[i2] & 255) | i) * (-862048943);
            i4 ^= ((i8 >>> 17) | (i8 << 15)) * 461845907;
        } else {
            if (i7 != 2) {
                i = i7 == 3 ? (bytes[i2 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i2 + 1] & 255) << 8;
            int i82 = ((bytes[i2] & 255) | i) * (-862048943);
            i4 ^= ((i82 >>> 17) | (i82 << 15)) * 461845907;
        }
        int i9 = i4 ^ length;
        int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
        return i11 ^ (i11 >>> 16);
    }

    public static synchronized AudioManager z(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                zzdq zzdqVar = new zzdq(zzdn.zza);
                ii2.B().execute(new s33(19, applicationContext, zzdqVar));
                zzdqVar.d();
                AudioManager audioManager2 = a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract InputFilter[] j(InputFilter[] inputFilterArr);

    public abstract boolean l();

    public abstract void q(boolean z2);

    public abstract void r(boolean z2);

    public abstract TransformationMethod x(TransformationMethod transformationMethod);
}
