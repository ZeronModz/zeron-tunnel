package defpackage;

import com.google.android.gms.internal.ads.w8;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhba;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhjb;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhjp;
import com.google.android.gms.internal.ads.zzhjx;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n43 implements zzhjb {
    public static final /* synthetic */ n43 b = new n43(0);
    public static final /* synthetic */ n43 c = new n43(1);
    public static final /* synthetic */ n43 d = new n43(2);
    public static final /* synthetic */ n43 e = new n43(3);
    public static final /* synthetic */ n43 f = new n43(4);
    public static final /* synthetic */ n43 g = new n43(5);
    public static final /* synthetic */ n43 h = new n43(6);
    public static final /* synthetic */ n43 i = new n43(7);
    public static final /* synthetic */ n43 j = new n43(8);
    public static final /* synthetic */ n43 k = new n43(9);
    public static final /* synthetic */ n43 l = new n43(10);
    public static final /* synthetic */ n43 m = new n43(11);
    public static final /* synthetic */ n43 n = new n43(12);
    public final /* synthetic */ int a;

    public /* synthetic */ n43(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                s43 s43Var = (s43) zzhbpVar;
                p73 p73Var = p43.a;
                int i2 = s43Var.a;
                if (i2 != 16 && i2 != 32) {
                    zg1.m("AES key size must be 16 or 32 bytes");
                    return null;
                }
                t61 t61Var = new t61(19);
                t61Var.b = s43Var;
                t61Var.e = num;
                t61Var.c = ic3.b(i2);
                t61Var.d = ic3.b(s43Var.b);
                return t61Var.t();
            case 1:
                w43 w43Var = (w43) zzhbpVar;
                p73 p73Var2 = v43.a;
                int i3 = w43Var.a;
                if (i3 == 24) {
                    zg1.m("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                wp2 wp2Var = new wp2(3, false);
                wp2Var.b = w43Var;
                wp2Var.d = num;
                wp2Var.c = ic3.b(i3);
                return wp2Var.f();
            case 2:
                z43 z43Var = (z43) zzhbpVar;
                p73 p73Var3 = y43.a;
                int i4 = z43Var.a;
                if (i4 == 24) {
                    zg1.m("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                wp2 wp2Var2 = new wp2(4, false);
                wp2Var2.b = z43Var;
                wp2Var2.d = num;
                wp2Var2.c = ic3.b(i4);
                return wp2Var2.g();
            case 3:
                c53 c53Var = (c53) zzhbpVar;
                p73 p73Var4 = b53.a;
                wp2 wp2Var3 = new wp2(5, false);
                wp2Var3.b = c53Var;
                wp2Var3.d = num;
                wp2Var3.c = ic3.b(c53Var.a);
                return wp2Var3.h();
            case 4:
                p73 p73Var5 = e53.a;
                return d53.d(((f53) zzhbpVar).a, ic3.b(32), num);
            case 5:
                p73 p73Var6 = g53.a;
                return j53.d((k53) zzhbpVar, num);
            case 6:
                c73 c73Var = i53.a;
                return m53.d((n53) zzhbpVar, num);
            case 7:
                return s53.d((u53) zzhbpVar, ic3.b(32), num);
            case 8:
                p73 p73Var7 = w53.a;
                return v53.d(((x53) zzhbpVar).a, ic3.b(32), num);
            case 9:
                zzhjx zzhjxVar = zzhjx.b;
                x8 x8Var = ((zzhjp) zzhbpVar).a.b;
                zzhjc zzhjcVar = zzhjc.d;
                zzhba zzhbaVarD = zzhjcVar.d(x8Var.v());
                if (((Boolean) zzhjcVar.b.get(x8Var.v())).booleanValue()) {
                    w8 w8VarZzd = zzhbaVarD.zzd(x8Var.w());
                    return new zzhjo(s73.a(w8VarZzd.v(), w8VarZzd.w(), w8VarZzd.x(), x8Var.x(), num), i43.a);
                }
                zg1.m("Creating new keys is not allowed.");
                return null;
            case 10:
                c83 c83Var = (c83) zzhbpVar;
                p73 p73Var8 = b83.a;
                int i5 = c83Var.a;
                if (i5 != 32) {
                    zg1.m("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                wp2 wp2Var4 = new wp2(7, false);
                wp2Var4.b = c83Var;
                wp2Var4.c = ic3.b(i5);
                wp2Var4.d = num;
                return wp2Var4.i();
            case 11:
                k83 k83Var = (k83) zzhbpVar;
                p73 p73Var9 = h83.a;
                wp2 wp2Var5 = new wp2(9, false);
                wp2Var5.b = k83Var;
                wp2Var5.c = ic3.b(k83Var.a);
                wp2Var5.d = num;
                return wp2Var5.k();
            default:
                ya3 ya3Var = (ya3) zzhbpVar;
                p73 p73Var10 = ab3.a;
                byte[] bArrA = u73.a(32);
                if (bArrA.length == 32) {
                    return za3.d(bb3.d(ya3Var.a, hc3.a(Arrays.copyOf(z.k(z.q(bArrA)), 32)), num), new ic3(hc3.a(Arrays.copyOf(bArrA, bArrA.length)), 0));
                }
                u7.r("Given secret seed length is not 32");
                return null;
        }
    }
}
