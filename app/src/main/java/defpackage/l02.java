package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzgrs;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhyl;
import com.google.android.gms.internal.ads.zzhyq;
import com.google.android.gms.internal.ads.zzhzq;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzan;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzg;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import io.ktor.http.Parameters;
import io.ktor.http.ParametersBuilderImpl;
import java.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.text.a;
import kotlin.text.g;
import kotlinx.io.Segment;
import kotlinx.serialization.KSerializer;
import okio.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l02 {
    public static ClassLoader a;
    public static Thread b;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};
    public static final KSerializer[] d = new KSerializer[0];
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Method f;
    public static Method g;
    public static boolean h;
    public static String i;

    public static final boolean A(char c2) {
        if (c2 >= 0 && c2 < '\t') {
            return true;
        }
        if ('\n' <= c2 && c2 < ' ') {
            return true;
        }
        if (('0' <= c2 && c2 < ':') || c2 == ':') {
            return true;
        }
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        if ('A' > c2 || c2 >= '[') {
            return 127 <= c2 && c2 < 256;
        }
        return true;
    }

    public static final boolean B(char c2) {
        if (c2 < 0 || c2 >= '0') {
            return 'J' <= c2 && c2 < 256;
        }
        return true;
    }

    public static Parameters E(String str) {
        int i2;
        str.getClass();
        if (str.length() - 1 < 0) {
            Parameters.Companion.getClass();
            return z10.a;
        }
        aw0 aw0Var = Parameters.Companion;
        ParametersBuilderImpl parametersBuilderImplA = sb2.a();
        int length = str.length() - 1;
        int i3 = 0;
        int i4 = -1;
        if (length >= 0) {
            int i5 = 0;
            i2 = 0;
            int i6 = -1;
            while (i3 != 1000) {
                char cCharAt = str.charAt(i5);
                if (cCharAt == '&') {
                    a(parametersBuilderImplA, str, i2, i6, i5);
                    i2 = i5 + 1;
                    i3++;
                    i6 = -1;
                } else if (cCharAt == '=' && i6 == -1) {
                    i6 = i5;
                }
                if (i5 != length) {
                    i5++;
                } else {
                    i4 = i6;
                }
            }
            return parametersBuilderImplA.build();
        }
        i2 = 0;
        if (i3 != 1000) {
            a(parametersBuilderImplA, str, i2, i4, str.length());
        }
        return parametersBuilderImplA.build();
    }

    public static void F(Service service, String str, String str2) {
        try {
            Intent intent = new Intent();
            intent.setAction(str);
            intent.setPackage("dev.zeron.tunnel");
            intent.putExtra("key", 61);
            intent.putExtra("content", (Serializable) str2);
            service.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    public static char H(int i2) throws FormatException {
        if (i2 < 45) {
            return c[i2];
        }
        throw FormatException.getFormatInstance();
    }

    public static final String I(String str) {
        int i2;
        str.getClass();
        int i3 = 0;
        int i4 = -1;
        if (g.o(str, ":", false)) {
            InetAddress inetAddressJ = (g.R(str, "[", false) && g.u(str, "]", false)) ? j(1, str.length() - 1, str) : j(0, str.length(), str);
            if (inetAddressJ != null) {
                byte[] address = inetAddressJ.getAddress();
                if (address.length != 16) {
                    if (address.length == 4) {
                        return inetAddressJ.getHostAddress();
                    }
                    u7.g(vh.f('\'', "Invalid IPv6 address: '", str));
                    return null;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    if (i8 > i6 && i8 >= 4) {
                        i4 = i5;
                        i6 = i8;
                    }
                    i5 = i7 + 2;
                }
                Buffer buffer = new Buffer();
                while (i3 < address.length) {
                    if (i3 == i4) {
                        buffer.j(58);
                        i3 += i6;
                        if (i3 == 16) {
                            buffer.j(58);
                        }
                    } else {
                        if (i3 > 0) {
                            buffer.j(58);
                        }
                        byte b2 = address[i3];
                        byte[] bArr = sl1.a;
                        buffer.l(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                        i3 += 2;
                    }
                }
                return buffer.readUtf8();
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i2 < length; i2 + 1) {
                        char cCharAt = lowerCase.charAt(i2);
                        i2 = (yg0.q(cCharAt, 31) > 0 && yg0.q(cCharAt, 127) < 0 && g.y(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i2 + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static final String J(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static final void K(kotlinx.io.Buffer buffer, ByteBuffer byteBuffer) {
        buffer.getClass();
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            Segment segmentE = buffer.e(1);
            byte[] bArr = segmentE.a;
            int i2 = segmentE.c;
            int iMin = Math.min(iRemaining, bArr.length - i2);
            byteBuffer.get(bArr, i2, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                segmentE.c += iMin;
                buffer.c += (long) iMin;
            } else if (iMin < 0 || iMin > segmentE.a()) {
                u7.n(segmentE.a(), vh.v(iMin, "Invalid number of bytes written: ", ". Should be in 0.."));
                return;
            } else if (iMin != 0) {
                segmentE.c += iMin;
                buffer.c += (long) iMin;
            } else if (dn0.v(segmentE)) {
                buffer.c();
            }
        }
    }

    public static final int L(int i2, int i3, String str) {
        while (i3 > i2 && a.c(str.charAt(i3 - 1))) {
            i3--;
        }
        return i3;
    }

    public static final int M(int i2, int i3, String str) {
        while (i2 < i3 && a.c(str.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    public static long P(double d2) {
        n8.b0("not a normal value", Y(d2));
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[Catch: all -> 0x00a1, PHI: r1
      0x00a5: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v19 java.lang.Thread) binds: [B:7:0x000a, B:47:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x009b, B:62:0x00c5, B:12:0x001f, B:52:0x00a4, B:53:0x00a5, B:65:0x00c9, B:54:0x00a6, B:60:0x00c3, B:59:0x00b0, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x0099, B:18:0x003c), top: B:74:0x0003, inners: #4, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader Q() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l02.Q():java.lang.ClassLoader");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[EDGE_INSN: B:66:0x00be->B:43:0x00be BREAK  A[LOOP:1: B:29:0x0094->B:67:0x0094]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String R(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l02.R(android.content.Context):java.lang.String");
    }

    public static void S(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    public static boolean T(zzbch zzbchVar) {
        int iOrdinal = zzbchVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static boolean U(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 != length) {
            char cCharAt = str.charAt(i2);
            int i3 = i2 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i2 = i3;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(str.charAt(i3))) {
                    return false;
                }
                i2 += 2;
            }
        }
        return true;
    }

    public static final zzbch V(Context context, zzfvh zzfvhVar) {
        zzbch zzbchVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        String[] strArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgxn(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfvhVar != null) {
                    zzfvhVar.d(5017, "No .so");
                } else {
                    zzfvhVar = null;
                }
                zzbchVar = zzbch.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e2) {
                    c0(null, e2.toString(), zzfvhVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        c0(bArr, null, zzfvhVar);
                        zzbchVar = zzbch.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzbchVar = zzbch.X86;
                        } else if (s == 40) {
                            zzbchVar = zzbch.ARM7;
                        } else if (s == 62) {
                            zzbchVar = zzbch.X86_64;
                        } else if (s == 183) {
                            zzbchVar = zzbch.ARM64;
                        } else if (s != 243) {
                            c0(bArr, null, zzfvhVar);
                            zzbchVar = zzbch.UNSUPPORTED;
                        } else {
                            zzbchVar = zzbch.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbchVar = zzbch.UNSUPPORTED;
                }
            }
        } else {
            if (zzfvhVar != null) {
                zzfvhVar.d(5017, "No lib/");
            } else {
                zzfvhVar = null;
            }
            zzbchVar = zzbch.UNKNOWN;
        }
        if (zzbchVar == zzbch.UNKNOWN) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String strZza = zzgrs.OS_ARCH.zza();
            if (TextUtils.isEmpty(strZza) || !hashSet.contains(strZza)) {
                try {
                    strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                } catch (IllegalAccessException e3) {
                    if (zzfvhVar != null) {
                        zzfvhVar.c(2024, 0L, e3);
                    }
                } catch (NoSuchFieldException e4) {
                    if (zzfvhVar != null) {
                        zzfvhVar.c(2024, 0L, e4);
                    }
                }
                if (strArr == null || strArr.length <= 0) {
                    strZza = Build.CPU_ABI;
                    if (strZza == null) {
                        strZza = Build.CPU_ABI2;
                    }
                } else {
                    strZza = strArr[0];
                }
            }
            if (TextUtils.isEmpty(strZza)) {
                c0(null, "Empty dev arch", zzfvhVar);
                zzbchVar = zzbch.UNSUPPORTED;
            } else if (strZza.equalsIgnoreCase("i686") || strZza.equalsIgnoreCase("x86")) {
                zzbchVar = zzbch.X86;
            } else if (strZza.equalsIgnoreCase("x86_64")) {
                zzbchVar = zzbch.X86_64;
            } else if (strZza.equalsIgnoreCase("arm64-v8a")) {
                zzbchVar = zzbch.ARM64;
            } else if (strZza.equalsIgnoreCase("armeabi-v7a") || strZza.equalsIgnoreCase("armv71")) {
                zzbchVar = zzbch.ARM7;
            } else if (strZza.equalsIgnoreCase("riscv64")) {
                zzbchVar = zzbch.RISCV64;
            } else {
                c0(null, strZza, zzfvhVar);
                zzbchVar = zzbch.UNSUPPORTED;
            }
        }
        if (zzfvhVar != null) {
            zzfvhVar.d(5018, zzbchVar.name());
        }
        return zzbchVar;
    }

    public static zzhyl W(String str) throws IOException {
        try {
            zzhzq zzhzqVar = new zzhzq(new StringReader(str));
            zzhyq zzhyqVar = zzhyq.LEGACY_STRICT;
            Objects.requireNonNull(zzhyqVar);
            zzhzqVar.b = zzhyqVar;
            return s7.b(zzhzqVar);
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    public static zzao X(zzae zzaeVar, zzg zzgVar, List list, boolean z) {
        zzao zzaoVarA;
        n8.a0("reduce", 1, list);
        n8.g0("reduce", 2, list);
        zzao zzaoVarB = zzgVar.b.b(zzgVar, (zzao) list.get(0));
        if (!(zzaoVarB instanceof zzai)) {
            u7.r("Callback should be a method");
            return null;
        }
        if (list.size() == 2) {
            zzaoVarA = zzgVar.b.b(zzgVar, (zzao) list.get(1));
            if (zzaoVarA instanceof zzag) {
                u7.r("Failed to parse initial value");
                return null;
            }
        } else {
            if (zzaeVar.c() == 0) {
                u7.p("Empty array with no initial value error");
                return null;
            }
            zzaoVarA = null;
        }
        zzai zzaiVar = (zzai) zzaoVarB;
        int iC = zzaeVar.c();
        int i2 = z ? 0 : iC - 1;
        int i3 = z ? iC - 1 : 0;
        int i4 = true == z ? 1 : -1;
        if (zzaoVarA == null) {
            zzaoVarA = zzaeVar.d(i2);
            i2 += i4;
        }
        while ((i3 - i2) * i4 >= 0) {
            if (zzaeVar.f(i2)) {
                zzaoVarA = zzaiVar.a(zzgVar, Arrays.asList(zzaoVarA, zzaeVar.d(i2), new zzah(Double.valueOf(i2)), zzaeVar));
                if (zzaoVarA instanceof zzag) {
                    u7.p("Reduce operation failed");
                    return null;
                }
                i2 += i4;
            } else {
                i2 += i4;
            }
        }
        return zzaoVarA;
    }

    public static boolean Y(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static byte[] Z(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            u7.r("String must be of even-length");
            return null;
        }
        byte[] bArr = new byte[length >> 1];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public static final void a(ParametersBuilderImpl parametersBuilderImpl, String str, int i2, int i3, int i4) {
        if (i3 == -1) {
            int iM = M(i2, i4, str);
            int iL = L(iM, i4, str);
            if (iL > iM) {
                parametersBuilderImpl.appendAll(str.substring(iM, iL), EmptyList.INSTANCE);
                return;
            }
            return;
        }
        int iM2 = M(i2, i3, str);
        int iL2 = L(iM2, i3, str);
        if (iL2 > iM2) {
            String strSubstring = str.substring(iM2, iL2);
            int iM3 = M(i3 + 1, i4, str);
            parametersBuilderImpl.append(strSubstring, str.substring(iM3, L(iM3, i4, str)));
        }
    }

    public static zzafg a0(zzer zzerVar) {
        zzerVar.E(1);
        int iM = zzerVar.M();
        long j = zzerVar.b;
        long j2 = iM;
        int i2 = iM / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jD = zzerVar.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jD;
            jArrCopyOf2[i3] = zzerVar.d();
            zzerVar.E(2);
            i3++;
        }
        zzerVar.E((int) ((j + j2) - ((long) zzerVar.b)));
        return new zzafg(jArrCopyOf, jArrCopyOf2);
    }

    public static zzae b0(zzae zzaeVar, zzg zzgVar, zzan zzanVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itB = zzaeVar.b();
        while (itB.hasNext()) {
            int iIntValue = ((Integer) itB.next()).intValue();
            if (zzaeVar.f(iIntValue)) {
                zzao zzaoVarA = zzanVar.a(zzgVar, Arrays.asList(zzaeVar.d(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzaoVarA.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaoVarA.zze().equals(bool2)) {
                    zzaeVar2.e(iIntValue, zzaoVarA);
                }
            }
        }
        return zzaeVar2;
    }

    public static final void c0(byte[] bArr, String str, zzfvh zzfvhVar) {
        if (zzfvhVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzgrs.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            vh.A(sb, "dbg:", str, ";");
        }
        zzfvhVar.d(4007, sb.toString());
    }

    public static final byte d(char c2) {
        if (c2 < '~') {
            return om.b[c2];
        }
        return (byte) 0;
    }

    public static long d0(double d2, DisplayMetrics displayMetrics) {
        return Math.round(d2 / ((double) displayMetrics.density));
    }

    public static final void e(TypedArray typedArray, int i2) {
        if (typedArray.hasValue(i2)) {
            return;
        }
        u7.r("Attribute not defined in set.");
    }

    public static ViewModel f(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (ViewModel) objNewInstance;
        } catch (IllegalAccessException e2) {
            s31.h("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            s31.h("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            s31.h("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(com.google.zxing.common.BitSource r3, java.lang.StringBuilder r4, int r5, boolean r6) throws com.google.zxing.FormatException {
        /*
            int r0 = r4.length()
        L4:
            r1 = 1
            if (r5 <= r1) goto L2d
            int r1 = r3.a()
            r2 = 11
            if (r1 < r2) goto L28
            int r1 = r3.b(r2)
            int r2 = r1 / 45
            char r2 = H(r2)
            r4.append(r2)
            int r1 = r1 % 45
            char r1 = H(r1)
            r4.append(r1)
            int r5 = r5 + (-2)
            goto L4
        L28:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.getFormatInstance()
            throw r3
        L2d:
            if (r5 != r1) goto L47
            int r5 = r3.a()
            r2 = 6
            if (r5 < r2) goto L42
            int r3 = r3.b(r2)
            char r3 = H(r3)
            r4.append(r3)
            goto L47
        L42:
            com.google.zxing.FormatException r3 = com.google.zxing.FormatException.getFormatInstance()
            throw r3
        L47:
            if (r6 == 0) goto L72
        L49:
            int r3 = r4.length()
            if (r0 >= r3) goto L72
            char r3 = r4.charAt(r0)
            r5 = 37
            if (r3 != r5) goto L6f
            int r3 = r4.length()
            int r3 = r3 - r1
            if (r0 >= r3) goto L6a
            int r3 = r0 + 1
            char r6 = r4.charAt(r3)
            if (r6 != r5) goto L6a
            r4.deleteCharAt(r3)
            goto L6f
        L6a:
            r3 = 29
            r4.setCharAt(r0, r3)
        L6f:
            int r0 = r0 + 1
            goto L49
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l02.g(com.google.zxing.common.BitSource, java.lang.StringBuilder, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1 A[PHI: r17
      0x00f1: PHI (r17v2 int) = (r17v1 int), (r17v1 int), (r17v4 int), (r17v1 int) binds: [B:68:0x00d5, B:74:0x00e1, B:81:0x00ef, B:80:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109 A[PHI: r28
      0x0109: PHI (r28v6 boolean) = (r28v5 boolean), (r28v5 boolean), (r28v5 boolean), (r28v7 boolean), (r28v7 boolean), (r28v7 boolean) binds: [B:95:0x010f, B:97:0x0113, B:99:0x0117, B:86:0x00fb, B:88:0x00ff, B:90:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.google.zxing.common.BitSource r23, java.lang.StringBuilder r24, int r25, com.google.zxing.common.CharacterSetECI r26, java.util.ArrayList r27, java.util.Map r28) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l02.h(com.google.zxing.common.BitSource, java.lang.StringBuilder, int, com.google.zxing.common.CharacterSetECI, java.util.ArrayList, java.util.Map):void");
    }

    public static void i(BitSource bitSource, StringBuilder sb, int i2) throws FormatException {
        if (db1.c == null) {
            throw FormatException.getFormatInstance();
        }
        if (i2 * 13 > bitSource.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i2 * 2];
        int i3 = 0;
        while (i2 > 0) {
            int iB = bitSource.b(13);
            int i4 = (iB % 96) | ((iB / 96) << 8);
            int i5 = i4 + (i4 < 2560 ? 41377 : 42657);
            bArr[i3] = (byte) ((i5 >> 8) & 255);
            bArr[i3 + 1] = (byte) (i5 & 255);
            i3 += 2;
            i2--;
        }
        sb.append(new String(bArr, db1.c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress j(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l02.j(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void k(BitSource bitSource, StringBuilder sb, int i2) throws FormatException {
        if (db1.b == null) {
            throw FormatException.getFormatInstance();
        }
        if (i2 * 13 > bitSource.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i2 * 2];
        int i3 = 0;
        while (i2 > 0) {
            int iB = bitSource.b(13);
            int i4 = (iB % 192) | ((iB / 192) << 8);
            int i5 = i4 + (i4 < 7936 ? 33088 : 49472);
            bArr[i3] = (byte) (i5 >> 8);
            bArr[i3 + 1] = (byte) i5;
            i3 += 2;
            i2--;
        }
        sb.append(new String(bArr, db1.b));
    }

    public static void l(BitSource bitSource, StringBuilder sb, int i2) throws FormatException {
        while (i2 >= 3) {
            if (bitSource.a() < 10) {
                throw FormatException.getFormatInstance();
            }
            int iB = bitSource.b(10);
            if (iB >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(H(iB / 100));
            sb.append(H((iB / 10) % 10));
            sb.append(H(iB % 10));
            i2 -= 3;
        }
        if (i2 == 2) {
            if (bitSource.a() < 7) {
                throw FormatException.getFormatInstance();
            }
            int iB2 = bitSource.b(7);
            if (iB2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(H(iB2 / 10));
            sb.append(H(iB2 % 10));
            return;
        }
        if (i2 == 1) {
            if (bitSource.a() < 4) {
                throw FormatException.getFormatInstance();
            }
            int iB3 = bitSource.b(4);
            if (iB3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(H(iB3));
        }
    }

    public static void m(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                al.b(canvas);
                return;
            } else {
                al.a(canvas);
                return;
            }
        }
        if (i2 == 28) {
            u7.p("This method doesn't work on Pie!");
            return;
        }
        if (!h) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            h = true;
        }
        if (z) {
            try {
                Method method2 = f;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e2) {
                p60.l(e2.getCause());
                return;
            }
        }
        if (z || (method = g) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static View n(int i2, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static Set p() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final boolean x(char c2) {
        if (c2 == '\t') {
            return true;
        }
        if (' ' <= c2 && c2 < '0') {
            return true;
        }
        if (';' <= c2 && c2 < 'A') {
            return true;
        }
        if ('[' > c2 || c2 >= 'a') {
            return '{' <= c2 && c2 < 127;
        }
        return true;
    }

    public static final boolean y(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    public abstract boolean C(View view);

    public abstract boolean D(float f2, float f3);

    public abstract boolean G(View view, float f2);

    public abstract void N(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public abstract void O(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i2);

    public abstract int o(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract int u(View view);

    public abstract int v(CoordinatorLayout coordinatorLayout);

    public abstract int w();

    public abstract boolean z(float f2);
}
