package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzq;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzx;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yk3 {
    public static final /* synthetic */ int N = 0;
    public final byte[] A;
    public final int B;
    public final tc3 C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    public final String a;
    public final String b;
    public final zzguf c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final zzap k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final List p;
    public final zzq q;
    public final long r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new yk3(new zzt());
        String str = wt2.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public yk3(zzt zztVar) {
        boolean z;
        String str;
        this.a = zztVar.a;
        String strO = wt2.o(zztVar.d);
        this.d = strO;
        if (zztVar.c.isEmpty() && zztVar.b != null) {
            this.c = zzguf.zzj(new zzx(strO, zztVar.b));
            this.b = zztVar.b;
        } else if (!zztVar.c.isEmpty() && zztVar.b == null) {
            zzguf zzgufVar = zztVar.c;
            this.c = zzgufVar;
            Iterator it = zzgufVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzx) zzgufVar.get(0)).b;
                    break;
                }
                zzx zzxVar = (zzx) it.next();
                if (TextUtils.equals(zzxVar.a, strO)) {
                    str = zzxVar.b;
                    break;
                }
            }
            this.b = str;
        } else if (zztVar.c.isEmpty() && zztVar.b == null) {
            z = true;
            n8.A0(z);
            this.c = zztVar.c;
            this.b = zztVar.b;
        } else {
            for (int i = 0; i < zztVar.c.size(); i++) {
                if (((zzx) zztVar.c.get(i)).b.equals(zztVar.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            n8.A0(z);
            this.c = zztVar.c;
            this.b = zztVar.b;
        }
        this.e = zztVar.e;
        this.f = zztVar.f;
        int i2 = zztVar.g;
        this.g = i2;
        int i3 = zztVar.h;
        this.h = i3;
        this.i = i3 != -1 ? i3 : i2;
        this.j = zztVar.i;
        this.k = zztVar.j;
        this.l = zztVar.k;
        this.m = zztVar.l;
        this.n = zztVar.m;
        this.o = zztVar.n;
        List list = zztVar.o;
        this.p = list == null ? Collections.EMPTY_LIST : list;
        zzq zzqVar = zztVar.p;
        this.q = zzqVar;
        this.r = zztVar.q;
        this.s = zztVar.r;
        this.t = zztVar.s;
        this.u = zztVar.t;
        this.v = zztVar.u;
        this.w = zztVar.v;
        this.x = zztVar.w;
        int i4 = zztVar.x;
        this.y = i4 == -1 ? 0 : i4;
        float f = zztVar.y;
        this.z = f == -1.0f ? 1.0f : f;
        this.A = zztVar.z;
        this.B = zztVar.A;
        this.C = zztVar.B;
        this.D = zztVar.C;
        this.E = zztVar.D;
        this.F = zztVar.E;
        this.G = zztVar.F;
        int i5 = zztVar.G;
        this.H = i5 == -1 ? 0 : i5;
        int i6 = zztVar.H;
        this.I = i6 != -1 ? i6 : 0;
        this.J = zztVar.I;
        this.K = zztVar.J;
        int i7 = zztVar.K;
        if (i7 != 0 || zzqVar == null) {
            this.L = i7;
        } else {
            this.L = 1;
        }
    }

    public static String c(yk3 yk3Var) {
        String strL;
        String string;
        int i;
        int i2;
        StringBuilder sbY = hz.y("id=");
        sbY.append(yk3Var.a);
        sbY.append(", mimeType=");
        sbY.append(yk3Var.m);
        String str = yk3Var.l;
        if (str != null) {
            sbY.append(", container=");
            sbY.append(str);
        }
        int i3 = yk3Var.i;
        if (i3 != -1) {
            sbY.append(", bitrate=");
            sbY.append(i3);
        }
        String str2 = yk3Var.j;
        if (str2 != null) {
            sbY.append(", codecs=");
            sbY.append(str2);
        }
        zzq zzqVar = yk3Var.q;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < zzqVar.d; i4++) {
                UUID uuid = zzqVar.a[i4].b;
                if (uuid.equals(fx2.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(fx2.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(fx2.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(fx2.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(fx2.a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb = new StringBuilder(string2.length() + 10);
                    sb.append("unknown (");
                    sb.append(string2);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            sbY.append(", drm=[");
            j03.H(sbY, linkedHashSet.iterator(), ",");
            sbY.append(']');
        }
        int i5 = yk3Var.t;
        if (i5 != -1 && (i2 = yk3Var.u) != -1) {
            hz.C(i5, i2, ", res=", "x", sbY);
        }
        int i6 = yk3Var.v;
        if (i6 != -1 && (i = yk3Var.w) != -1) {
            hz.C(i6, i, ", decRes=", "x", sbY);
        }
        float f = yk3Var.z;
        int i7 = t23.a;
        double d = f;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbY.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            String str3 = wt2.a;
            sbY.append(String.format(Locale.US, "%.3f", objArr));
        }
        tc3 tc3Var = yk3Var.C;
        if (tc3Var != null) {
            int i8 = tc3Var.f;
            int i9 = tc3Var.e;
            if ((i9 != -1 && i8 != -1) || tc3Var.d()) {
                sbY.append(", color=");
                if (tc3Var.d()) {
                    String strE = tc3.e(tc3Var.a);
                    String strG = tc3.g(tc3Var.b);
                    String strF = tc3.f(tc3Var.c);
                    String str4 = wt2.a;
                    Locale locale = Locale.US;
                    strL = ec1.L(strE, "/", strG, "/", strF);
                } else {
                    strL = "NA/NA/NA";
                }
                if (i9 == -1 || i8 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(wd3.a(i9, 1) + String.valueOf(i8).length());
                    sb2.append(i9);
                    sb2.append("/");
                    sb2.append(i8);
                    string = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(string.length() + strL.length() + 1);
                sb3.append(strL);
                sb3.append("/");
                sb3.append(string);
                sbY.append(sb3.toString());
            }
        }
        float f2 = yk3Var.x;
        if (f2 != -1.0f) {
            sbY.append(", fps=");
            sbY.append(f2);
        }
        int i10 = yk3Var.D;
        if (i10 != -1) {
            sbY.append(", maxSubLayers=");
            sbY.append(i10);
        }
        int i11 = yk3Var.E;
        if (i11 != -1) {
            sbY.append(", channels=");
            sbY.append(i11);
        }
        int i12 = yk3Var.F;
        if (i12 != -1) {
            sbY.append(", sample_rate=");
            sbY.append(i12);
        }
        String str5 = yk3Var.d;
        if (str5 != null) {
            sbY.append(", language=");
            sbY.append(str5);
        }
        zzguf zzgufVar = yk3Var.c;
        if (!zzgufVar.isEmpty()) {
            sbY.append(", labels=[");
            j03.H(sbY, z.u(zzgufVar, ox1.C).iterator(), ",");
            sbY.append("]");
        }
        int i13 = yk3Var.e;
        if (i13 != 0) {
            sbY.append(", selectionFlags=[");
            String str6 = wt2.a;
            ArrayList arrayList = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i13 & 2) != 0) {
                arrayList.add("forced");
            }
            j03.H(sbY, arrayList.iterator(), ",");
            sbY.append("]");
        }
        int i14 = yk3Var.f;
        if (i14 != 0) {
            sbY.append(", roleFlags=[");
            int i15 = i14 & AttribFlags.SSH_FILEXFER_ATTR_CTIME;
            String str7 = wt2.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i14 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i14 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i14 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i14 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i14 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i14 & AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i14 & AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i14 & AttribFlags.SSH_FILEXFER_ATTR_UNTRANSLATED_NAME) != 0) {
                arrayList2.add("trick-play");
            }
            if (i15 != 0) {
                arrayList2.add("auxiliary");
            }
            j03.H(sbY, arrayList2.iterator(), ",");
            sbY.append("]");
        }
        if ((i14 & AttribFlags.SSH_FILEXFER_ATTR_CTIME) != 0) {
            sbY.append(", auxiliaryTrackType=");
            String str8 = wt2.a;
            sbY.append(AdError.UNDEFINED_DOMAIN);
        }
        return sbY.toString();
    }

    public final zzt a() {
        return new zzt(this);
    }

    public final boolean b(yk3 yk3Var) {
        List list = this.p;
        int size = list.size();
        List list2 = yk3Var.p;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || yk3.class != obj.getClass()) {
            return false;
        }
        yk3 yk3Var = (yk3) obj;
        int i2 = this.M;
        return (i2 == 0 || (i = yk3Var.M) == 0 || i2 == i) && this.e == yk3Var.e && this.f == yk3Var.f && this.g == yk3Var.g && this.h == yk3Var.h && this.n == yk3Var.n && this.r == yk3Var.r && this.t == yk3Var.t && this.u == yk3Var.u && this.v == yk3Var.v && this.w == yk3Var.w && this.y == yk3Var.y && this.B == yk3Var.B && this.D == yk3Var.D && this.E == yk3Var.E && this.F == yk3Var.F && this.G == yk3Var.G && this.H == yk3Var.H && this.I == yk3Var.I && this.J == yk3Var.J && this.L == yk3Var.L && Float.compare(this.x, yk3Var.x) == 0 && Float.compare(this.z, yk3Var.z) == 0 && Objects.equals(this.a, yk3Var.a) && Objects.equals(this.b, yk3Var.b) && this.c.equals(yk3Var.c) && Objects.equals(this.j, yk3Var.j) && Objects.equals(this.l, yk3Var.l) && Objects.equals(this.m, yk3Var.m) && Objects.equals(this.d, yk3Var.d) && Arrays.equals(this.A, yk3Var.A) && Objects.equals(this.k, yk3Var.k) && Objects.equals(this.C, yk3Var.C) && Objects.equals(this.q, yk3Var.q) && b(yk3Var);
    }

    public final int hashCode() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = this.c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 961) + this.g) * 31) + this.h) * 31;
        String str4 = this.j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.k;
        int iHashCode5 = iHashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.l;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.z) + ((((Float.floatToIntBits(this.x) + ((((((((((((((iHashCode6 + (this.m != null ? r1.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.r)) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31)) * 31) + this.y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.L;
        this.M = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.C);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.l;
        int length3 = String.valueOf(str3).length();
        String str4 = this.m;
        int length4 = String.valueOf(str4).length();
        String str5 = this.j;
        int length5 = String.valueOf(str5).length();
        int i = this.i;
        int length6 = String.valueOf(i).length();
        String str6 = this.d;
        int length7 = String.valueOf(str6).length();
        int i2 = this.t;
        int length8 = String.valueOf(i2).length();
        int i3 = this.u;
        int length9 = String.valueOf(i3).length();
        float f = this.x;
        int length10 = String.valueOf(f).length();
        int length11 = strValueOf.length();
        int i4 = this.E;
        int length12 = String.valueOf(i4).length();
        int i5 = this.F;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i5).length() + 2);
        hz.H(sb, "Format(", str, ", ", str2);
        hz.H(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i4);
        return vh.r(sb, ", ", i5, "])");
    }
}
