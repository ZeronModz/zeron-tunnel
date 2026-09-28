package defpackage;

import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj2 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = wt2.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0328 A[PHI: r1
      0x0328: PHI (r1v83 int) = (r1v82 int), (r1v86 int), (r1v87 int), (r1v88 int) binds: [B:187:0x0305, B:192:0x030f, B:194:0x0313, B:196:0x0317] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(defpackage.yk3 r30) {
        /*
            Method dump skipped, instruction units count: 2050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj2.b(yk3):android.util.Pair");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair c(String str, String[] strArr, tc3 tc3Var) {
        int i;
        Integer numValueOf;
        if (strArr.length < 4) {
            ec1.S(str, "Ignoring malformed HEVC codec string: ");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            ec1.S(str, "Ignoring malformed HEVC codec string: ");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            i = 6;
            if ("2".equals(strGroup)) {
                i = (tc3Var == null || tc3Var.c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                ec1.S(strGroup, "Unknown HEVC profile string: ");
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    numValueOf = !str2.equals("H30") ? null : 2;
                    break;
                case 70914:
                    numValueOf = !str2.equals("H60") ? null : 8;
                    break;
                case 70917:
                    numValueOf = !str2.equals("H63") ? null : 32;
                    break;
                case 71007:
                    numValueOf = !str2.equals("H90") ? null : 128;
                    break;
                case 71010:
                    numValueOf = !str2.equals("H93") ? null : 512;
                    break;
                case 74665:
                    numValueOf = !str2.equals("L30") ? null : 1;
                    break;
                case 74758:
                    numValueOf = !str2.equals("L60") ? null : 4;
                    break;
                case 74761:
                    numValueOf = !str2.equals("L63") ? null : 16;
                    break;
                case 74851:
                    numValueOf = !str2.equals("L90") ? null : 64;
                    break;
                case 74854:
                    numValueOf = !str2.equals("L93") ? null : 256;
                    break;
                case 2193639:
                    numValueOf = !str2.equals("H120") ? null : 2048;
                    break;
                case 2193642:
                    numValueOf = !str2.equals("H123") ? null : Integer.valueOf(AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                    break;
                case 2193732:
                    numValueOf = !str2.equals("H150") ? null : Integer.valueOf(AttribFlags.SSH_FILEXFER_ATTR_CTIME);
                    break;
                case 2193735:
                    numValueOf = !str2.equals("H153") ? null : 131072;
                    break;
                case 2193738:
                    numValueOf = !str2.equals("H156") ? null : 524288;
                    break;
                case 2193825:
                    numValueOf = !str2.equals("H180") ? null : 2097152;
                    break;
                case 2193828:
                    numValueOf = !str2.equals("H183") ? null : 8388608;
                    break;
                case 2193831:
                    numValueOf = !str2.equals("H186") ? null : 33554432;
                    break;
                case 2312803:
                    numValueOf = !str2.equals("L120") ? null : 1024;
                    break;
                case 2312806:
                    numValueOf = !str2.equals("L123") ? null : Integer.valueOf(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
                    break;
                case 2312896:
                    numValueOf = !str2.equals("L150") ? null : Integer.valueOf(AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME);
                    break;
                case 2312899:
                    numValueOf = !str2.equals("L153") ? null : 65536;
                    break;
                case 2312902:
                    numValueOf = !str2.equals("L156") ? null : 262144;
                    break;
                case 2312989:
                    numValueOf = !str2.equals("L180") ? null : 1048576;
                    break;
                case 2312992:
                    numValueOf = !str2.equals("L183") ? null : 4194304;
                    break;
                case 2312995:
                    numValueOf = !str2.equals("L186") ? null : 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i), numValueOf);
        }
        ec1.S(str2, "Unknown HEVC level string: ");
        return null;
    }
}
