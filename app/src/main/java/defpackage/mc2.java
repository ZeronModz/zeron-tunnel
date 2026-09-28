package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Base64;
import android.util.Rational;
import android.view.MotionEvent;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.internal.utils.a;
import androidx.camera.core.k;
import androidx.collection.SparseArrayCompat;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzaiy;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;
import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.http.URLProtocol;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.zip.Deflater;
import kotlinx.io.Buffer;
import kotlinx.io.Source;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mc2 {
    public static String b;
    public static final byte[] c = {0, 0, 0, -1, -1};
    public static final byte[] d = {0, 0, -1, -1};
    public static final Object e = new Object();
    public static final x40 f = new x40("gads:pan:experiment_id", 4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public final /* synthetic */ int a;

    public /* synthetic */ mc2(int i) {
        this.a = i;
    }

    public static final byte[] B(Source source) {
        source.getClass();
        return D(source, -1);
    }

    public static final byte[] C(Source source, int i) {
        long j = i;
        if (j >= 0) {
            return D(source, i);
        }
        zu0.e(vh.j(j, "byteCount (", ") < 0"));
        return null;
    }

    public static final byte[] D(Source source, int i) {
        if (i == -1) {
            for (long j = 2147483647L; source.getC().c < 2147483647L && source.request(j); j *= 2) {
            }
            if (source.getC().c >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + source.getC().c).toString());
            }
            i = (int) source.getC().c;
        } else {
            source.require(i);
        }
        byte[] bArr = new byte[i];
        E(source.getC(), bArr, 0, i);
        return bArr;
    }

    public static final void E(Source source, byte[] bArr, int i, int i2) throws EOFException {
        source.getClass();
        bArr.getClass();
        if3.a(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            int atMostTo = source.readAtMostTo(bArr, i3, i2);
            if (atMostTo == -1) {
                throw new EOFException("Source exhausted before reading " + (i2 - i) + " bytes. Only " + atMostTo + " bytes were read.");
            }
            i3 += atMostTo;
        }
    }

    public static float F(float f2, float f3, float f4, int i) {
        return i > 0 ? (f4 / 2.0f) + f3 : f2;
    }

    public static int G(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static long H(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (v23.a[roundingMode.ordinal()]) {
            case 1:
                kf2.I(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
            default:
                zu0.a();
                return 0L;
        }
        return j3 + ((long) i);
    }

    public static synchronized String I(Context context) {
        String str;
        String str2;
        try {
            str = b;
            if (str == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || w91.I()) {
                    string = "emulator";
                }
                for (int i = 0; i < 3; i++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str2 = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                        str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                str = str2;
                b = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static String J(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (P(jSONArrayOptJSONArray2, str) && !P(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static String K(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int L(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long M(long j, long j2) {
        kf2.E(j, "a");
        kf2.E(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static zzagk N(zzer zzerVar, boolean z, boolean z2) throws zzat {
        if (z) {
            V(3, zzerVar, false);
        }
        String strK = zzerVar.k((int) zzerVar.a(), StandardCharsets.UTF_8);
        int length = strK.length();
        long jA = zzerVar.a();
        String[] strArr = new String[(int) jA];
        int length2 = length + 15;
        for (int i = 0; i < jA; i++) {
            String strK2 = zzerVar.k((int) zzerVar.a(), StandardCharsets.UTF_8);
            strArr[i] = strK2;
            length2 = length2 + 4 + strK2.length();
        }
        if (z2 && (zzerVar.I() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzagk(strK, strArr, length2 + 1);
    }

    public static void O(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        o12 o12Var = new o12(j, str, i2);
        if ((priorityQueue.size() != i || (((o12) priorityQueue.peek()).c <= i2 && ((o12) priorityQueue.peek()).a <= j)) && !priorityQueue.contains(o12Var)) {
            priorityQueue.add(o12Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static boolean P(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e2) {
                    zzt.zzh().f("RtbAdapterMap.hasAtleastOneRegexMatch", e2);
                }
                if ((((Boolean) zzbd.zzc().a(p32.sc)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long Q(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static long R(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = j ^ j2;
        long j4 = (j3 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j5 = j * j2;
            if (j == 0 || j5 / j == j2) {
                return j5;
            }
        }
        return j4;
    }

    public static zzap S(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = wt2.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                ii2.K("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaia.a(new zzer(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    ii2.O("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zzaiy(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static String T(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzo.zzf("Unable to construct shingle");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static long U(int i, long j) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return (i & 1) == 0 ? U(i2, j2) % 1073807359 : ((U(i2, j2) % 1073807359) * j) % 1073807359;
    }

    public static boolean V(int i, zzer zzerVar, boolean z) throws zzat {
        if (zzerVar.B() < 7) {
            if (z) {
                return false;
            }
            int iB = zzerVar.B();
            StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 18);
            sb.append("too short header: ");
            sb.append(iB);
            throw zzat.zzb(sb.toString(), null);
        }
        if (zzerVar.I() != i) {
            if (z) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzerVar.I() == 118 && zzerVar.I() == 111 && zzerVar.I() == 114 && zzerVar.I() == 98 && zzerVar.I() == 105 && zzerVar.I() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }

    public static long W(int i, String[] strArr) {
        long jY = (((long) sb2.y(strArr[0])) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            jY = (((((long) sb2.y(strArr[i2])) + 2147483647L) % 1073807359) + ((jY * 16785407) % 1073807359)) % 1073807359;
        }
        return jY;
    }

    public static float a(float f2, float f3, int i) {
        return (Math.max(0, i - 1) * f3) + f2;
    }

    public static float b(float f2, float f3, int i) {
        return i > 0 ? (f3 / 2.0f) + f2 : f2;
    }

    public static final StackTraceElement c(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String d(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static HashMap e(Rect rect, boolean z, Rational rational, int i, int i2, int i3, HashMap map) {
        boolean z2 = false;
        jx0.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((StreamSpec) entry.getValue()).d().getWidth(), ((StreamSpec) entry.getValue()).d().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((k) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalB = a.b(rational, i);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalB.getNumerator(), rationalB.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    u7.p(hz.o(i2, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f2 = fCenterX + fCenterX;
                    rectF2 = new RectF(f2 - rectF6.right, rectF6.top, f2 - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f3 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f4 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f4 - rectF6.bottom, rectF6.right, f4 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f5 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f5 - rectF7.right, rectF7.top, f5 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((k) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Object j(SparseArrayCompat sparseArrayCompat, int i) {
        Object obj;
        sparseArrayCompat.getClass();
        int iC = w91.c(sparseArrayCompat.d, i, sparseArrayCompat.b);
        if (iC < 0 || (obj = sparseArrayCompat.c[iC]) == e) {
            return null;
        }
        return obj;
    }

    public static long k(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                j += (long) i;
                outputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z) {
                    i(inputStream);
                    i(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            i(inputStream);
            i(outputStream);
        }
        return j;
    }

    public static jp l(String str, String str2) {
        rb rbVar = new rb(str, str2);
        ip ipVarB = jp.b(rb.class);
        ipVarB.e = 1;
        ipVarB.f = new hp(rbVar, 0);
        return ipVarB.b();
    }

    public static oj0 m(Context context, float f2, float f3, y7 y7Var, int i) {
        float f4;
        float f5;
        float f6;
        mj0 mj0Var;
        float f7;
        float f8;
        if (i != 1) {
            return n(context, f2, f3, y7Var);
        }
        float fMin = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f2, y7Var.f);
        float f9 = fMin / 2.0f;
        float f10 = 0.0f - f9;
        float fB = b(0.0f, y7Var.b, y7Var.c);
        float F = F(0.0f, a(fB, y7Var.b, (int) Math.floor(y7Var.c / 2.0f)), y7Var.b, y7Var.c);
        float fB2 = b(F, y7Var.e, y7Var.d);
        float F2 = F(F, a(fB2, y7Var.e, (int) Math.floor(y7Var.d / 2.0f)), y7Var.e, y7Var.d);
        float f11 = y7Var.f;
        int i2 = y7Var.g;
        float fB3 = b(F2, f11, i2);
        float F3 = F(F2, a(fB3, y7Var.f, i2), y7Var.f, i2);
        float fB4 = b(F3, y7Var.e, y7Var.d);
        float fB5 = b(F(F3, a(fB4, y7Var.e, (int) Math.ceil(y7Var.d / 2.0f)), y7Var.e, y7Var.d), y7Var.b, y7Var.c);
        float f12 = f9 + f3;
        float fB6 = CarouselStrategy.b(fMin, y7Var.f, f2);
        float fB7 = CarouselStrategy.b(y7Var.b, y7Var.f, f2);
        float fB8 = CarouselStrategy.b(y7Var.e, y7Var.f, f2);
        mj0 mj0Var2 = new mj0(y7Var.f, f3);
        mj0Var2.a(f10, fB6, fMin, false, true);
        if (y7Var.c > 0) {
            f5 = fB3;
            float f13 = y7Var.b;
            int iFloor = (int) Math.floor(r0 / 2.0f);
            f7 = fB4;
            f4 = fB2;
            mj0Var2.c(fB, fB7, f13, iFloor, false);
            f6 = fB7;
            mj0Var = mj0Var2;
        } else {
            f4 = fB2;
            f5 = fB3;
            f6 = fB7;
            mj0Var = mj0Var2;
            f7 = fB4;
        }
        if (y7Var.d > 0) {
            mj0Var.c(f4, fB8, y7Var.e, (int) Math.floor(r9 / 2.0f), false);
            f8 = fB8;
        } else {
            f8 = fB8;
        }
        mj0Var.c(f5, 0.0f, y7Var.f, y7Var.g, true);
        if (y7Var.d > 0) {
            mj0 mj0Var3 = mj0Var;
            mj0Var3.c(f7, f8, y7Var.e, (int) Math.ceil(r1 / 2.0f), false);
        }
        if (y7Var.c > 0) {
            mj0Var.c(fB5, f6, y7Var.b, (int) Math.ceil(r0 / 2.0f), false);
        }
        mj0Var.a(f12, fB6, fMin, false, true);
        return mj0Var.d();
    }

    public static oj0 n(Context context, float f2, float f3, y7 y7Var) {
        float fMin = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f2, y7Var.f);
        float f4 = fMin / 2.0f;
        float f5 = 0.0f - f4;
        float f6 = y7Var.f;
        int i = y7Var.g;
        float fB = b(0.0f, f6, i);
        float F = F(0.0f, a(fB, y7Var.f, i), y7Var.f, i);
        float fB2 = b(F, y7Var.e, y7Var.d);
        float fB3 = b(F(F, fB2, y7Var.e, y7Var.d), y7Var.b, y7Var.c);
        float f7 = f4 + f3;
        float fB4 = CarouselStrategy.b(fMin, y7Var.f, f2);
        float fB5 = CarouselStrategy.b(y7Var.b, y7Var.f, f2);
        float fB6 = CarouselStrategy.b(y7Var.e, y7Var.f, f2);
        mj0 mj0Var = new mj0(y7Var.f, f3);
        mj0Var.a(f5, fB4, fMin, false, true);
        mj0Var.c(fB, 0.0f, y7Var.f, y7Var.g, true);
        if (y7Var.d > 0) {
            mj0Var.a(fB2, fB6, y7Var.e, false, false);
        }
        int i2 = y7Var.c;
        if (i2 > 0) {
            mj0Var.c(fB3, fB5, y7Var.b, i2, false);
        }
        mj0Var.a(f7, fB4, fMin, false, true);
        return mj0Var.d();
    }

    public static final int o(Buffer buffer, Deflater deflater, ByteBuffer byteBuffer, boolean z) {
        byteBuffer.clear();
        int iDeflate = z ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        l02.K(buffer, byteBuffer);
        return iDeflate;
    }

    public static void p(Encoder encoder, SerializationStrategy serializationStrategy, Object obj) {
        serializationStrategy.getClass();
        if (serializationStrategy.getB().isNullable()) {
            encoder.encodeSerializableValue(serializationStrategy, obj);
        } else if (obj == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(serializationStrategy, obj);
        }
    }

    public static jp q(String str, LibraryVersionComponent$VersionExtractor libraryVersionComponent$VersionExtractor) {
        ip ipVarB = jp.b(rb.class);
        ipVarB.e = 1;
        ipVarB.a(kw.b(Context.class));
        ipVarB.f = new di(7, str, libraryVersionComponent$VersionExtractor);
        return ipVarB.b();
    }

    public static final void r(SparseArrayCompat sparseArrayCompat) {
        int i = sparseArrayCompat.d;
        int[] iArr = sparseArrayCompat.b;
        Object[] objArr = sparseArrayCompat.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.a = false;
        sparseArrayCompat.d = i2;
    }

    public static Object t(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return v1.f(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static boolean u(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final boolean v(URLProtocol uRLProtocol) {
        uRLProtocol.getClass();
        String str = uRLProtocol.a;
        return str.equals("https") || str.equals("wss");
    }

    public static int w(int[] iArr) {
        int i = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static void x(String str, StringBuilder sb) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    public static void y(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                x(str, sb);
            }
        }
    }

    public abstract void A(m1 m1Var, Thread thread);

    public abstract boolean f(n1 n1Var, j1 j1Var, j1 j1Var2);

    public abstract boolean g(n1 n1Var, Object obj, Object obj2);

    public abstract boolean h(n1 n1Var, m1 m1Var, m1 m1Var2);

    public abstract String s();

    public String toString() {
        switch (this.a) {
            case 12:
                return s();
            default:
                return super.toString();
        }
    }

    public abstract void z(m1 m1Var, m1 m1Var2);
}
