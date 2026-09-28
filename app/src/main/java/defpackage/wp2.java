package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zao;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzemg;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 implements zzdmc {
    public static wp2 e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public wp2(wp2 wp2Var) {
        this.a = 6;
        this.b = Arrays.copyOf((long[]) wp2Var.b, 10);
        this.c = Arrays.copyOf((long[]) wp2Var.c, 10);
        this.d = Arrays.copyOf((long[]) wp2Var.d, 10);
    }

    public static void b(wp2 wp2Var, t63 t63Var) {
        wp2 wp2Var2 = t63Var.a;
        long[] jArr = (long[]) wp2Var.b;
        long[] jArr2 = (long[]) wp2Var2.b;
        long[] jArr3 = t63Var.b;
        n8.r0(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) wp2Var.c;
        long[] jArr5 = (long[]) wp2Var2.c;
        long[] jArr6 = (long[]) wp2Var2.d;
        n8.r0(jArr4, jArr5, jArr6);
        n8.r0((long[]) wp2Var.d, jArr6, jArr3);
    }

    public void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.b = Integer.valueOf(i);
    }

    public void c(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(vh.i(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.c = Integer.valueOf(i);
    }

    public synchronized void d(int i, int i2, long j, long j2) {
        ((r) this.b).k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        Task taskLog = ((zao) this.c).log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2))));
        an anVar = new an(this, jElapsedRealtime, 3);
        g gVar = (g) taskLog;
        gVar.getClass();
        gVar.c(a.a, anVar);
    }

    public byte[] e() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.d;
        n8.t0(jArr4, jArr14);
        n8.t0(jArr13, jArr4);
        n8.t0(jArr12, jArr13);
        n8.r0(jArr5, jArr12, jArr14);
        n8.r0(jArr6, jArr5, jArr4);
        n8.t0(jArr12, jArr6);
        n8.r0(jArr7, jArr12, jArr5);
        n8.t0(jArr12, jArr7);
        n8.t0(jArr13, jArr12);
        n8.t0(jArr12, jArr13);
        n8.t0(jArr13, jArr12);
        n8.t0(jArr12, jArr13);
        n8.r0(jArr8, jArr12, jArr7);
        n8.t0(jArr12, jArr8);
        n8.t0(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            n8.t0(jArr12, jArr13);
            n8.t0(jArr13, jArr12);
        }
        n8.r0(jArr9, jArr13, jArr8);
        n8.t0(jArr12, jArr9);
        n8.t0(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            n8.t0(jArr12, jArr13);
            n8.t0(jArr13, jArr12);
        }
        n8.r0(jArr12, jArr13, jArr9);
        n8.t0(jArr13, jArr12);
        n8.t0(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            n8.t0(jArr13, jArr12);
            n8.t0(jArr12, jArr13);
        }
        n8.r0(jArr10, jArr12, jArr8);
        n8.t0(jArr12, jArr10);
        n8.t0(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            n8.t0(jArr12, jArr13);
            n8.t0(jArr13, jArr12);
        }
        n8.r0(jArr11, jArr13, jArr10);
        n8.t0(jArr13, jArr11);
        n8.t0(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            n8.t0(jArr13, jArr12);
            n8.t0(jArr12, jArr13);
        }
        n8.r0(jArr13, jArr12, jArr11);
        n8.t0(jArr12, jArr13);
        n8.t0(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            n8.t0(jArr12, jArr13);
            n8.t0(jArr13, jArr12);
        }
        n8.r0(jArr12, jArr13, jArr10);
        n8.t0(jArr13, jArr12);
        n8.t0(jArr12, jArr13);
        n8.t0(jArr13, jArr12);
        n8.t0(jArr12, jArr13);
        n8.t0(jArr13, jArr12);
        n8.r0(jArr, jArr13, jArr6);
        n8.r0(jArr2, (long[]) this.b, jArr);
        n8.r0(jArr3, (long[]) this.c, jArr);
        byte[] bArrY0 = n8.y0(jArr3);
        bArrY0[31] = (byte) (bArrY0[31] ^ ((n8.y0(jArr2)[0] & 1) << 7));
        return bArrY0;
    }

    public t43 f() throws GeneralSecurityException {
        ic3 ic3Var;
        hc3 hc3VarB;
        w43 w43Var = (w43) this.b;
        if (w43Var == null || (ic3Var = (ic3) this.c) == null) {
            zg1.m("Cannot build without parameters and/or key material");
            return null;
        }
        if (w43Var.a != ((hc3) ic3Var.b).a.length) {
            zg1.m("Key size mismatch");
            return null;
        }
        if (w43Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((w43) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        e43 e43Var = ((w43) this.b).c;
        if (e43Var == e43.h) {
            hc3VarB = k73.a;
        } else if (e43Var == e43.g) {
            hc3VarB = k73.a(((Integer) this.d).intValue());
        } else {
            if (e43Var != e43.f) {
                u7.p("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(e43Var)));
                return null;
            }
            hc3VarB = k73.b(((Integer) this.d).intValue());
        }
        return new t43((w43) this.b, (ic3) this.c, hc3VarB, (Integer) this.d);
    }

    public x43 g() throws GeneralSecurityException {
        ic3 ic3Var;
        hc3 hc3VarB;
        z43 z43Var = (z43) this.b;
        if (z43Var == null || (ic3Var = (ic3) this.c) == null) {
            zg1.m("Cannot build without parameters and/or key material");
            return null;
        }
        if (z43Var.a != ((hc3) ic3Var.b).a.length) {
            zg1.m("Key size mismatch");
            return null;
        }
        if (z43Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((z43) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        q43 q43Var = ((z43) this.b).b;
        if (q43Var == q43.j) {
            hc3VarB = k73.a;
        } else if (q43Var == q43.i) {
            hc3VarB = k73.a(((Integer) this.d).intValue());
        } else {
            if (q43Var != q43.h) {
                u7.p("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(q43Var)));
                return null;
            }
            hc3VarB = k73.b(((Integer) this.d).intValue());
        }
        return new x43((z43) this.b, (ic3) this.c, hc3VarB, (Integer) this.d);
    }

    public a53 h() throws GeneralSecurityException {
        ic3 ic3Var;
        hc3 hc3VarB;
        c53 c53Var = (c53) this.b;
        if (c53Var == null || (ic3Var = (ic3) this.c) == null) {
            zg1.m("Cannot build without parameters and/or key material");
            return null;
        }
        if (c53Var.a != ((hc3) ic3Var.b).a.length) {
            zg1.m("Key size mismatch");
            return null;
        }
        if (c53Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((c53) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        r43 r43Var = ((c53) this.b).b;
        if (r43Var == r43.h) {
            hc3VarB = k73.a;
        } else if (r43Var == r43.g) {
            hc3VarB = k73.a(((Integer) this.d).intValue());
        } else {
            if (r43Var != r43.f) {
                u7.p("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(r43Var)));
                return null;
            }
            hc3VarB = k73.b(((Integer) this.d).intValue());
        }
        return new a53((c53) this.b, (ic3) this.c, hc3VarB, (Integer) this.d);
    }

    public a83 i() throws GeneralSecurityException {
        ic3 ic3Var;
        hc3 hc3VarA;
        c83 c83Var = (c83) this.b;
        if (c83Var == null || (ic3Var = (ic3) this.c) == null) {
            zg1.m("Cannot build without parameters and/or key material");
            return null;
        }
        if (c83Var.a != ((hc3) ic3Var.b).a.length) {
            zg1.m("Key size mismatch");
            return null;
        }
        if (c83Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((c83) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        e43 e43Var = ((c83) this.b).c;
        if (e43Var == e43.q) {
            hc3VarA = k73.a;
        } else if (e43Var == e43.p || e43Var == e43.o) {
            hc3VarA = k73.a(((Integer) this.d).intValue());
        } else {
            if (e43Var != e43.n) {
                u7.p("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(e43Var)));
                return null;
            }
            hc3VarA = k73.b(((Integer) this.d).intValue());
        }
        return new a83((c83) this.b, (ic3) this.c, hc3VarA, (Integer) this.d);
    }

    public c83 j() {
        Integer num = (Integer) this.b;
        if (num == null) {
            zg1.m("key size not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new c83(num.intValue(), ((Integer) this.c).intValue(), (e43) this.d);
        }
        zg1.m("tag size not set");
        return null;
    }

    public g83 k() throws GeneralSecurityException {
        ic3 ic3Var;
        hc3 hc3VarA;
        k83 k83Var = (k83) this.b;
        if (k83Var == null || (ic3Var = (ic3) this.c) == null) {
            zg1.m("Cannot build without parameters and/or key material");
            return null;
        }
        if (k83Var.a != ((hc3) ic3Var.b).a.length) {
            zg1.m("Key size mismatch");
            return null;
        }
        if (k83Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((k83) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        j83 j83Var = ((k83) this.b).c;
        if (j83Var == j83.e) {
            hc3VarA = k73.a;
        } else if (j83Var == j83.d || j83Var == j83.c) {
            hc3VarA = k73.a(((Integer) this.d).intValue());
        } else {
            if (j83Var != j83.b) {
                u7.p("Unknown HmacParameters.Variant: ".concat(String.valueOf(j83Var)));
                return null;
            }
            hc3VarA = k73.b(((Integer) this.d).intValue());
        }
        return new g83((k83) this.b, (ic3) this.c, hc3VarA, (Integer) this.d);
    }

    public va3 l() throws GeneralSecurityException {
        hc3 hc3VarA;
        ta3 ta3Var = (ta3) this.b;
        if (ta3Var == null) {
            zg1.m("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = (ECPoint) this.c;
        if (eCPoint == null) {
            zg1.m("Cannot build without public point");
            return null;
        }
        w63.a(eCPoint, ta3Var.b.b.getCurve());
        if (((ta3) this.b).a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((ta3) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        e43 e43Var = ((ta3) this.b).d;
        if (e43Var == e43.u) {
            hc3VarA = k73.a;
        } else if (e43Var == e43.t || e43Var == e43.s) {
            hc3VarA = k73.a(((Integer) this.d).intValue());
        } else {
            if (e43Var != e43.r) {
                u7.p("Unknown EcdsaParameters.Variant: ".concat(e43Var.b));
                return null;
            }
            hc3VarA = k73.b(((Integer) this.d).intValue());
        }
        return new va3((ta3) this.b, (ECPoint) this.c, hc3VarA, (Integer) this.d);
    }

    public ib3 m() {
        hc3 hc3VarA;
        if (((gb3) this.b) == null) {
            zg1.m("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            zg1.m("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        gb3 gb3Var = (gb3) this.b;
        int i = gb3Var.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(hz.n(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length())));
        }
        if (gb3Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((gb3) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        fb3 fb3Var = ((gb3) this.b).c;
        if (fb3Var == fb3.e) {
            hc3VarA = k73.a;
        } else if (fb3Var == fb3.d || fb3Var == fb3.c) {
            hc3VarA = k73.a(((Integer) this.d).intValue());
        } else {
            if (fb3Var != fb3.b) {
                u7.p("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(fb3Var)));
                return null;
            }
            hc3VarA = k73.b(((Integer) this.d).intValue());
        }
        return new ib3((gb3) this.b, (BigInteger) this.c, hc3VarA, (Integer) this.d);
    }

    public pb3 n() {
        hc3 hc3VarA;
        if (((nb3) this.b) == null) {
            zg1.m("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            zg1.m("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        nb3 nb3Var = (nb3) this.b;
        int i = nb3Var.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(hz.n(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length())));
        }
        if (nb3Var.a() && ((Integer) this.d) == null) {
            zg1.m("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((nb3) this.b).a() && ((Integer) this.d) != null) {
            zg1.m("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        mb3 mb3Var = ((nb3) this.b).c;
        if (mb3Var == mb3.e) {
            hc3VarA = k73.a;
        } else if (mb3Var == mb3.d || mb3Var == mb3.c) {
            hc3VarA = k73.a(((Integer) this.d).intValue());
        } else {
            if (mb3Var != mb3.b) {
                u7.p("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(mb3Var)));
                return null;
            }
            hc3VarA = k73.b(((Integer) this.d).intValue());
        }
        return new pb3((nb3) this.b, (BigInteger) this.c, hc3VarA, (Integer) this.d);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                mo2 mo2Var = (mo2) ((mo2) this.c).c;
                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                while (mo2Var != null) {
                    Object obj = mo2Var.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    mo2Var = (mo2) mo2Var.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        zzfjr zzfjrVar;
        try {
            zzfki zzfkiVar = (zzfki) ((zzekj) this.b).b;
            zzfkiVar.b(z);
            int i = ((zzemg) this.d).c.clientJarVersion;
            int iIntValue = ((Integer) zzbd.zzc().a(p32.o1)).intValue();
            zzbtw zzbtwVar = zzfkiVar.a;
            if (i < iIntValue) {
                try {
                    zzbtwVar.zzh();
                    return;
                } finally {
                }
            } else {
                try {
                    zzbtwVar.zzL(new com.google.android.gms.dynamic.a(context));
                    return;
                } finally {
                }
            }
        } catch (zzfjr e2) {
            zzo.zzh("Cannot show interstitial.");
            throw new zzdmb(e2.getCause());
        }
        zzo.zzh("Cannot show interstitial.");
        throw new zzdmb(e2.getCause());
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    /* JADX INFO: renamed from: zzb */
    public tt2 mo79zzb() {
        return (tt2) this.c;
    }

    public /* synthetic */ wp2(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wp2(int i) {
        this(new long[10], 6, new long[10], new long[10]);
        this.a = i;
        switch (i) {
            case 8:
                this.b = null;
                this.c = null;
                this.d = e43.q;
                break;
            default:
                break;
        }
    }

    public wp2(Context context, r rVar) {
        this.a = 1;
        this.d = new AtomicLong(-1L);
        this.c = new zao(context, new wd1("measurement:api"));
        this.b = rVar;
    }

    public wp2(zzemg zzemgVar, zzekj zzekjVar, tt2 tt2Var) {
        this.a = 0;
        this.b = zzekjVar;
        this.c = tt2Var;
        this.d = zzemgVar;
    }

    public wp2(String str) {
        this.a = 2;
        mo2 mo2Var = new mo2(11, false);
        this.c = mo2Var;
        this.d = mo2Var;
        this.b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wp2(t63 t63Var) {
        this(6);
        this.a = 6;
        b(this, t63Var);
    }

    public /* synthetic */ wp2(int i, boolean z) {
        this.a = i;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
