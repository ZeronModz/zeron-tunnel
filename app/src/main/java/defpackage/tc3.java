package defpackage;

import com.google.android.gms.internal.ads.zzh;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tc3 {
    public static final tc3 h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        zzh zzhVar = new zzh();
        zzhVar.a = 1;
        zzhVar.b = 2;
        zzhVar.c = 3;
        h = zzhVar.a();
        zzh zzhVar2 = new zzh();
        zzhVar2.a = 1;
        zzhVar2.b = 1;
        zzhVar2.c = 2;
        zzhVar2.a();
        String str = wt2.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ tc3(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static boolean a(tc3 tc3Var) {
        if (tc3Var == null) {
            return true;
        }
        int i = tc3Var.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = tc3Var.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = tc3Var.c;
        if ((i3 != -1 && i3 != 3) || tc3Var.d != null) {
            return false;
        }
        int i4 = tc3Var.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = tc3Var.e;
        return i5 == -1 || i5 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? vh.i(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? vh.i(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? vh.i(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tc3.class == obj.getClass()) {
            tc3 tc3Var = (tc3) obj;
            if (this.a == tc3Var.a && this.b == tc3Var.b && this.c == tc3Var.c && Arrays.equals(this.d, tc3Var.d) && this.e == tc3Var.e && this.f == tc3Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.d) + ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.a);
        String strG = g(this.b);
        String strF = f(this.c);
        int i = this.e;
        String strQ = i != -1 ? hz.q(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i2 = this.f;
        String strQ2 = i2 != -1 ? hz.q(i2, "bit Chroma", new StringBuilder(String.valueOf(i2).length() + 10)) : "NA";
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(ec1.H(ec1.H(ec1.H(ec1.H(strE.length() + 12, 2, strG) + strF.length() + 2, 2, String.valueOf(z)), 2, strQ), 1, strQ2));
        sb.append("ColorInfo(");
        sb.append(strE);
        sb.append(", ");
        sb.append(strG);
        sb.append(", ");
        sb.append(strF);
        sb.append(", ");
        sb.append(z);
        hz.H(sb, ", ", strQ, ", ", strQ2);
        sb.append(")");
        return sb.toString();
    }
}
