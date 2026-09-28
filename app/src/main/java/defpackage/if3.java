package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.widget.WithHint;
import androidx.core.internal.view.SupportMenu;
import androidx.navigation.NavController;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.zzalx;
import com.google.android.gms.internal.ads.zzama;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzhxn;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.material.transition.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.b;
import kotlin.collections.AbstractList$Companion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class if3 {
    public static zzjl a;
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String[] e = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
    public static Boolean f;

    public static boolean A(int i, Parcel parcel) {
        S(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static float B(int i, Parcel parcel) {
        S(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder C(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iG);
        return strongBinder;
    }

    public static int D(int i, Parcel parcel) {
        S(parcel, i, 4);
        return parcel.readInt();
    }

    public static long E(int i, Parcel parcel) {
        S(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long F(int i, Parcel parcel) {
        int iG = G(i, parcel);
        if (iG == 0) {
            return null;
        }
        Z(parcel, iG, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int G(int i, Parcel parcel) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static String H(Source source, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = xm.a;
        }
        source.getClass();
        charset.getClass();
        return charset.equals(xm.a) ? w91.y(source) : ii2.f(charset.newDecoder(), source);
    }

    public static String I(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = j2 - timeUnit.toMillis(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = (millis2 - timeUnit2.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j2 - timeUnit.toMillis(j3)) - timeUnit2.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis3)));
    }

    public static long J(long j, long j2) {
        if (j2 < 0) {
            return e(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (e(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    public static void K(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + G(i, parcel));
    }

    public static final void L(SerialDescriptor serialDescriptor, int i, int i2) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.getElementName(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, serialDescriptor.getA());
    }

    public static final byte[] M(String str, Charset charset) throws CharacterCodingException {
        str.getClass();
        charset.getClass();
        Charset charset2 = xm.a;
        if (!charset.equals(charset2)) {
            return ay2.e(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        AbstractList$Companion abstractList$Companion = kotlin.collections.a.Companion;
        int length2 = str.length();
        abstractList$Companion.getClass();
        AbstractList$Companion.a(0, length, length2);
        CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            bArrArray.getClass();
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                bArrArray2.getClass();
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static String N(int i, long j) {
        cn0.b(i, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i >= 2 && i <= 36);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            long jS = (i & 1) == 0 ? (j >>> 1) / ((long) (i >>> 1)) : s(j, i);
            long j2 = i;
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (j - (jS * j2)), i);
            while (jS > 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (jS % j2), i);
                jS /= j2;
            }
            i2 = i4;
        }
        return new String(cArr, i2, 64 - i2);
    }

    public static int O(Parcel parcel) {
        int i = parcel.readInt();
        int iG = G(i, parcel);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iG + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new SafeParcelReader$ParseException(hz.n(iDataPosition, i2, "Size read is invalid start=", " end=", new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length())), parcel);
    }

    public static void P(Sink sink, CharSequence charSequence) {
        long j;
        long j2;
        int length = charSequence.length();
        Charset charset = xm.a;
        sink.getClass();
        charSequence.getClass();
        charset.getClass();
        String string = charSequence.toString();
        string.getClass();
        a(string.length(), 0L, length);
        Buffer buffer = sink.getC();
        int i = 0;
        while (i < length) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            char cCharAt = string.charAt(i);
            ref$IntRef.element = cCharAt;
            if (cCharAt < 128) {
                Segment segmentE = buffer.e(1);
                byte[] bArr = segmentE.a;
                int i2 = -i;
                int iMin = Math.min(length, segmentE.a() + i);
                bArr[segmentE.c + i + i2] = (byte) ref$IntRef.element;
                i++;
                while (i < iMin) {
                    char cCharAt2 = string.charAt(i);
                    ref$IntRef.element = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[segmentE.c + i + i2] = (byte) cCharAt2;
                    i++;
                }
                int i3 = i2 + i;
                if (i3 == 1) {
                    segmentE.c += i3;
                    buffer.c += (long) i3;
                } else if (i3 < 0 || i3 > segmentE.a()) {
                    u7.n(segmentE.a(), vh.v(i3, "Invalid number of bytes written: ", ". Should be in 0.."));
                    return;
                } else if (i3 != 0) {
                    segmentE.c += i3;
                    buffer.c += (long) i3;
                } else if (dn0.v(segmentE)) {
                    buffer.c();
                }
            } else {
                if (cCharAt < 2048) {
                    Segment segmentE2 = buffer.e(2);
                    int i4 = ref$IntRef.element;
                    byte[] bArr2 = segmentE2.a;
                    int i5 = segmentE2.c;
                    bArr2[i5] = (byte) ((i4 >> 6) | 192);
                    bArr2[i5 + 1] = (byte) ((i4 & 63) | 128);
                    segmentE2.c = i5 + 2;
                    j = buffer.c;
                    j2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Segment segmentE3 = buffer.e(3);
                    int i6 = ref$IntRef.element;
                    byte[] bArr3 = segmentE3.a;
                    int i7 = segmentE3.c;
                    bArr3[i7] = (byte) ((i6 >> 12) | 224);
                    bArr3[i7 + 1] = (byte) (((i6 >> 6) & 63) | 128);
                    bArr3[i7 + 2] = (byte) ((i6 & 63) | 128);
                    segmentE3.c = i7 + 3;
                    j = buffer.c;
                    j2 = 3;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < length ? string.charAt(i8) : (char) 0;
                    int i9 = ref$IntRef.element;
                    if (i9 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte((byte) 63);
                        i = i8;
                    } else {
                        int i10 = (((i9 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentE4 = buffer.e(4);
                        byte[] bArr4 = segmentE4.a;
                        int i11 = segmentE4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        segmentE4.c = i11 + 4;
                        buffer.c += 4;
                        i += 2;
                    }
                }
                buffer.c = j + j2;
                i++;
            }
        }
        sink.hintEmit();
    }

    public static zzr Q(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfis zzfisVar = (zzfis) it.next();
            if (zzfisVar.c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfisVar.a, zzfisVar.b));
            }
        }
        return new zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static Provider R() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(e[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static void S(Parcel parcel, int i, int i2) {
        int iG = G(i, parcel);
        if (iG == i2) {
            return;
        }
        String hexString = Integer.toHexString(iG);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iG).length() + 4 + 1);
        hz.C(i2, iG, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(vh.t(sb, " (0x", hexString, ")"), parcel);
    }

    public static void T(zzama zzamaVar, zzdr zzdrVar) {
        for (int i = 0; i < zzamaVar.zza(); i++) {
            long jZzb = zzamaVar.zzb(i);
            List listZzc = zzamaVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzamaVar.zza() - 1) {
                    zg1.h();
                    return;
                } else {
                    long jZzb2 = zzamaVar.zzb(i + 1) - zzamaVar.zzb(i);
                    if (jZzb2 > 0) {
                        zzdrVar.zza(new zzalx(listZzc, jZzb, jZzb2));
                    }
                }
            }
        }
    }

    public static synchronized void V(zzjl zzjlVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = zzjlVar;
    }

    public static boolean W(String str) {
        return str == null || str.isEmpty();
    }

    public static String Y(zzhxn zzhxnVar) throws GeneralSecurityException {
        int iOrdinal = zzhxnVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzhxnVar.toString()));
    }

    public static void Z(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        hz.C(i2, i, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(vh.t(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(long j, long j2, long j3) {
        if (j2 < 0 || j3 > j) {
            StringBuilder sbW = vh.w(j2, "startIndex (", ") and endIndex (");
            sbW.append(j3);
            sbW.append(") are not within the range [0..size(");
            sbW.append(j);
            sbW.append("))");
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (j2 <= j3) {
            return;
        }
        StringBuilder sbW2 = vh.w(j2, "startIndex (", ") > endIndex (");
        sbW2.append(j3);
        sbW2.append(')');
        throw new IllegalArgumentException(sbW2.toString());
    }

    public static final ResolveInfo a0(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            zzt.zzh().f("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static final void b(long j, long j2) {
        if (0 > j || j < j2 || j2 < 0) {
            u7.r(vh.p(vh.w(j2, "offset (0) and byteCount (", ") are not within the range [0..size("), j, "))"));
        }
    }

    public static final Intent b0(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final void c(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                b.a(th, th2);
            }
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        long j4 = j2 ^ Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 > j4 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static BigDecimal g(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iG);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static Bundle h(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iG);
        return bundle;
    }

    public static byte[] i(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iG);
        return bArrCreateByteArray;
    }

    public static int[] j(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iG);
        return iArrCreateIntArray;
    }

    public static ArrayList k(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iG);
        return arrayList;
    }

    public static Parcelable l(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iG);
        return parcelable;
    }

    public static String m(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iG);
        return string;
    }

    public static String[] n(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iG);
        return strArrCreateStringArray;
    }

    public static ArrayList o(int i, Parcel parcel) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iG);
        return arrayListCreateStringArrayList;
    }

    public static Object[] p(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iG);
        return objArrCreateTypedArray;
    }

    public static ArrayList q(Parcel parcel, int i, Parcelable.Creator creator) {
        int iG = G(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iG == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iG);
        return arrayListCreateTypedArrayList;
    }

    public static void r(String str, String str2, Object obj) {
        if (Log.isLoggable(x(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static long s(long j, long j2) {
        if (j2 < 0) {
            return e(j, j2) < 0 ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + ((long) (e(j - (j3 * j2), j2) < 0 ? 0 : 1));
    }

    public static void t(int i, Parcel parcel) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(vh.i(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static int u(int i, int i2) {
        if (i2 < 0) {
            u7.g("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static NavController v(View view) {
        NavController navController;
        View view2 = view;
        while (true) {
            if (view2 == null) {
                navController = null;
                break;
            }
            Object tag = view2.getTag(R.id.nav_controller_view_tag);
            navController = tag instanceof WeakReference ? (NavController) ((WeakReference) tag).get() : tag instanceof NavController ? (NavController) tag : null;
            if (navController != null) {
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (navController != null) {
            return navController;
        }
        io0.n("View ", view, " does not have a NavController set");
        return null;
    }

    public static final WorkGenerationalId w(WorkSpec workSpec) {
        workSpec.getClass();
        return new WorkGenerationalId(workSpec.a, workSpec.t);
    }

    public static String x(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static void y(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof WithHint) {
                editorInfo.hintText = ((WithHint) parent).getHint();
                return;
            }
        }
    }

    public static final void z(Source source, Function1 function1) {
        source.getClass();
        function1.getClass();
        Buffer buffer = source.getC();
        if (buffer.exhausted()) {
            u7.r("Buffer is empty");
            return;
        }
        Segment segment = buffer.a;
        segment.getClass();
        byte[] bArr = segment.a;
        int i = segment.b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, segment.c - i);
        byteBufferWrap.getClass();
        function1.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i;
        if (iPosition != 0) {
            if (iPosition < 0) {
                u7.p("Returned negative read bytes count");
            } else if (iPosition <= segment.b()) {
                buffer.skip(iPosition);
            } else {
                u7.p("Returned too many bytes");
            }
        }
    }

    public abstract void U(h7 h7Var, Set set);

    public abstract int X(h7 h7Var);
}
