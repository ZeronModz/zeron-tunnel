package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.k9;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.m9;
import com.google.android.gms.internal.ads.n9;
import com.google.android.gms.internal.ads.o9;
import com.google.android.gms.internal.ads.p9;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.s8;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhje;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhlg;
import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicd;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.internal.ads.zzicw;
import com.google.android.gms.internal.ads.zzis;
import com.google.android.gms.internal.ads.zzl;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb3 implements zzhjh, zzhje, zzhkm, zzhkj, zzgru, zzq, zzdy, zzl {
    public static final /* synthetic */ vb3 b = new vb3(0);
    public static final /* synthetic */ vb3 c = new vb3(1);
    public static final /* synthetic */ vb3 d = new vb3(2);
    public static final /* synthetic */ vb3 e = new vb3(3);
    public static final /* synthetic */ vb3 f = new vb3(4);
    public static final /* synthetic */ vb3 g = new vb3(5);
    public static final /* synthetic */ vb3 h = new vb3(6);
    public static final /* synthetic */ vb3 i = new vb3(7);
    public static final /* synthetic */ vb3 j = new vb3(8);
    public static final /* synthetic */ vb3 k = new vb3(9);
    public static final /* synthetic */ vb3 l = new vb3(10);
    public static final /* synthetic */ vb3 m = new vb3(11);
    public static final /* synthetic */ vb3 n = new vb3(12);
    public static final /* synthetic */ vb3 o = new vb3(13);
    public static final /* synthetic */ vb3 p = new vb3(14);
    public static final /* synthetic */ vb3 q = new vb3(20);
    public static final /* synthetic */ vb3 r = new vb3(21);
    public static final /* synthetic */ vb3 s = new vb3(22);
    public static final /* synthetic */ vb3 t = new vb3(23);
    public final /* synthetic */ int a;

    public /* synthetic */ vb3(int i2) {
        this.a = i2;
    }

    public static final zzicd a(Object obj, long j2) {
        zzicd zzicdVar = (zzicd) vd3.j(obj, j2);
        if (zzicdVar.zza()) {
            return zzicdVar;
        }
        int size = zzicdVar.size();
        zzicd zzicdVarZzh = zzicdVar.zzh(size == 0 ? 10 : size + size);
        vd3.k(obj, zzicdVarZzh, j2);
        return zzicdVarZzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(int i2, int i3, byte[] bArr) {
        int iD;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            iD = 0;
        } else {
            while (i2 < i3) {
                int i4 = i2 + 1;
                iD = bArr[i2];
                if (iD < 0) {
                    if (iD >= -32) {
                        if (iD >= -16) {
                            if (i4 < i3 - 2) {
                                int i5 = i2 + 2;
                                int i6 = bArr[i4];
                                if (i6 <= -65) {
                                    if ((((i6 + 112) + (iD << 28)) >> 30) == 0) {
                                        int i7 = i2 + 3;
                                        if (bArr[i5] <= -65) {
                                            i2 += 4;
                                            if (bArr[i7] > -65) {
                                            }
                                        }
                                    }
                                }
                                iD = -1;
                                break;
                            }
                            iD = cb.d(i4, i3, bArr);
                            break;
                        }
                        if (i4 < i3 - 1) {
                            int i8 = i2 + 2;
                            char c2 = bArr[i4];
                            if (c2 <= -65 && ((iD != -32 || c2 >= -96) && (iD != -19 || c2 < -96))) {
                                i2 += 3;
                                if (bArr[i8] > -65) {
                                }
                            }
                            iD = -1;
                            break;
                        }
                        iD = cb.d(i4, i3, bArr);
                        break;
                    }
                    if (i4 >= i3) {
                        break;
                    }
                    if (iD >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    iD = -1;
                    break;
                }
                i2 = i4;
            }
            iD = 0;
        }
        return iD == 0;
    }

    public static final zzicw c(Object obj, Object obj2) {
        zzicw zzicwVarZzc = (zzicw) obj;
        zzicw zzicwVar = (zzicw) obj2;
        if (!zzicwVar.isEmpty()) {
            if (!zzicwVarZzc.zze()) {
                zzicwVarZzc = zzicwVarZzc.zzc();
            }
            zzicwVarZzc.zzb(zzicwVar);
        }
        return zzicwVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhje
    public zzhaz zza(zzhlg zzhlgVar, i43 i43Var) throws GeneralSecurityException {
        int i2 = 11;
        int i3 = 12;
        boolean z = false;
        s73 s73Var = (s73) zzhlgVar;
        switch (this.a) {
            case 1:
                m73 m73Var = wb3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    u7.r("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar = s73Var.c;
                    gd3 gd3Var = gd3.b;
                    int i4 = wc3.a;
                    r8 r8VarY = r8.y(zzianVar, gd3.c);
                    if (r8VarY.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    s8 s8VarX = r8VarY.x();
                    if (s8VarX.v() == 0) {
                        return za3.d(bb3.d((xa3) wb3.g.b(s73Var.e), hc3.a(s8VarX.w().zzy()), s73Var.f), ic3.a(r8VarY.w().zzy()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzicg unused) {
                    zg1.m("Parsing Ed25519PrivateKey failed");
                    return null;
                }
            case 5:
                m73 m73Var2 = ac3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    u7.r("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar2 = s73Var.c;
                    gd3 gd3Var2 = gd3.b;
                    int i5 = wc3.a;
                    l9 l9VarY = l9.y(zzianVar2, gd3.c);
                    if (l9VarY.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, l9VarY.zzc().zzy());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = gb3.e;
                    db3 db3Var = new db3();
                    db3Var.c = (eb3) ac3.h.b(l9VarY.w().v());
                    db3Var.b = new BigInteger(1, l9VarY.x().zzy());
                    db3Var.a(iBitLength);
                    db3Var.d = (fb3) ac3.g.b(s73Var.e);
                    gb3 gb3VarB = db3Var.b();
                    wp2 wp2Var = new wp2(i2, z);
                    wp2Var.b = gb3VarB;
                    wp2Var.c = bigInteger;
                    wp2Var.d = s73Var.f;
                    return wp2Var.m();
                } catch (zzicg | IllegalArgumentException unused2) {
                    zg1.m("Parsing RsaSsaPkcs1PublicKey failed");
                    return null;
                }
            case 7:
                m73 m73Var3 = ac3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    u7.r("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar3 = s73Var.c;
                    gd3 gd3Var3 = gd3.b;
                    int i6 = wc3.a;
                    k9 k9VarB = k9.B(zzianVar3, gd3.c);
                    if (k9VarB.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    l9 l9VarW = k9VarB.w();
                    if (l9VarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, l9VarW.zzc().zzy());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, l9VarW.x().zzy());
                    BigInteger bigInteger5 = gb3.e;
                    db3 db3Var2 = new db3();
                    db3Var2.c = (eb3) ac3.h.b(l9VarW.w().v());
                    db3Var2.b = bigInteger4;
                    db3Var2.a(iBitLength2);
                    db3Var2.d = (fb3) ac3.g.b(s73Var.e);
                    gb3 gb3VarB2 = db3Var2.b();
                    wp2 wp2Var2 = new wp2(i2, z);
                    wp2Var2.b = gb3VarB2;
                    wp2Var2.c = bigInteger3;
                    wp2Var2.d = s73Var.f;
                    ib3 ib3VarM = wp2Var2.m();
                    z41 z41Var = new z41(3);
                    z41Var.b = ib3VarM;
                    ci2 ci2VarB = ac3.b(k9VarB.x());
                    ci2 ci2VarB2 = ac3.b(k9VarB.y());
                    z41Var.d = ci2VarB;
                    z41Var.e = ci2VarB2;
                    z41Var.c = ac3.b(k9VarB.zzc());
                    ci2 ci2VarB3 = ac3.b(k9VarB.zzg());
                    ci2 ci2VarB4 = ac3.b(k9VarB.z());
                    z41Var.f = ci2VarB3;
                    z41Var.g = ci2VarB4;
                    z41Var.h = ac3.b(k9VarB.A());
                    return z41Var.a();
                } catch (zzicg | IllegalArgumentException unused3) {
                    zg1.m("Parsing RsaSsaPkcs1PrivateKey failed");
                    return null;
                }
            case 11:
                m73 m73Var4 = cc3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    u7.r("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar4 = s73Var.c;
                    gd3 gd3Var4 = gd3.b;
                    int i7 = wc3.a;
                    p9 p9VarY = p9.y(zzianVar4, gd3.c);
                    if (p9VarY.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger6 = new BigInteger(1, p9VarY.zzc().zzy());
                    int iBitLength3 = bigInteger6.bitLength();
                    BigInteger bigInteger7 = nb3.g;
                    kb3 kb3Var = new kb3();
                    ne2 ne2Var = cc3.h;
                    kb3Var.c = (lb3) ne2Var.b(p9VarY.w().v());
                    kb3Var.d = (lb3) ne2Var.b(p9VarY.w().w());
                    kb3Var.b = new BigInteger(1, p9VarY.x().zzy());
                    kb3Var.a(iBitLength3);
                    kb3Var.b(p9VarY.w().x());
                    kb3Var.f = (mb3) cc3.g.b(s73Var.e);
                    nb3 nb3VarC = kb3Var.c();
                    wp2 wp2Var3 = new wp2(i3, z);
                    wp2Var3.b = nb3VarC;
                    wp2Var3.c = bigInteger6;
                    wp2Var3.d = s73Var.f;
                    return wp2Var3.n();
                } catch (zzicg | IllegalArgumentException unused4) {
                    zg1.m("Parsing RsaSsaPssPublicKey failed");
                    return null;
                }
            default:
                m73 m73Var5 = cc3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    u7.r("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar5 = s73Var.c;
                    gd3 gd3Var5 = gd3.b;
                    int i8 = wc3.a;
                    o9 o9VarB = o9.B(zzianVar5, gd3.c);
                    if (o9VarB.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p9 p9VarW = o9VarB.w();
                    if (p9VarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger8 = new BigInteger(1, p9VarW.zzc().zzy());
                    int iBitLength4 = bigInteger8.bitLength();
                    BigInteger bigInteger9 = new BigInteger(1, p9VarW.x().zzy());
                    BigInteger bigInteger10 = nb3.g;
                    kb3 kb3Var2 = new kb3();
                    ne2 ne2Var2 = cc3.h;
                    kb3Var2.c = (lb3) ne2Var2.b(p9VarW.w().v());
                    kb3Var2.d = (lb3) ne2Var2.b(p9VarW.w().w());
                    kb3Var2.b = bigInteger9;
                    kb3Var2.a(iBitLength4);
                    kb3Var2.b(p9VarW.w().x());
                    kb3Var2.f = (mb3) cc3.g.b(s73Var.e);
                    nb3 nb3VarC2 = kb3Var2.c();
                    wp2 wp2Var4 = new wp2(i3, z);
                    wp2Var4.b = nb3VarC2;
                    wp2Var4.c = bigInteger8;
                    wp2Var4.d = s73Var.f;
                    pb3 pb3VarN = wp2Var4.n();
                    z41 z41Var2 = new z41(4);
                    z41Var2.b = pb3VarN;
                    ci2 ci2VarC = cc3.c(o9VarB.x());
                    ci2 ci2VarC2 = cc3.c(o9VarB.y());
                    z41Var2.d = ci2VarC;
                    z41Var2.e = ci2VarC2;
                    z41Var2.c = cc3.c(o9VarB.zzc());
                    ci2 ci2VarC3 = cc3.c(o9VarB.zzg());
                    ci2 ci2VarC4 = cc3.c(o9VarB.z());
                    z41Var2.f = ci2VarC3;
                    z41Var2.g = ci2VarC4;
                    z41Var2.h = cc3.c(o9VarB.A());
                    return z41Var2.b();
                } catch (zzicg | IllegalArgumentException unused5) {
                    zg1.m("Parsing RsaSsaPssPrivateKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkj
    public zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException {
        t73 t73Var = (t73) zzhlgVar;
        switch (this.a) {
            case 3:
                m73 m73Var = ac3.a;
                boolean zEquals = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                x8 x8Var = t73Var.b;
                if (zEquals) {
                    try {
                        zzian zzianVarW = x8Var.w();
                        gd3 gd3Var = gd3.b;
                        int i2 = wc3.a;
                        i9 i9VarW = i9.w(zzianVarW, gd3.c);
                        BigInteger bigInteger = gb3.e;
                        db3 db3Var = new db3();
                        db3Var.c = (eb3) ac3.h.b(i9VarW.v().v());
                        db3Var.b = new BigInteger(1, i9VarW.zzc().zzy());
                        db3Var.a(i9VarW.zzb());
                        db3Var.d = (fb3) ac3.g.b(x8Var.x());
                        return db3Var.b();
                    } catch (zzicg e2) {
                        throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e2);
                    }
                }
                u7.r("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var.v())));
                return null;
            default:
                m73 m73Var2 = cc3.a;
                boolean zEquals2 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                x8 x8Var2 = t73Var.b;
                if (zEquals2) {
                    try {
                        zzian zzianVarW2 = x8Var2.w();
                        gd3 gd3Var2 = gd3.b;
                        int i3 = wc3.a;
                        m9 m9VarW = m9.w(zzianVarW2, gd3.c);
                        BigInteger bigInteger2 = nb3.g;
                        kb3 kb3Var = new kb3();
                        ne2 ne2Var = cc3.h;
                        kb3Var.c = (lb3) ne2Var.b(m9VarW.v().v());
                        kb3Var.d = (lb3) ne2Var.b(m9VarW.v().w());
                        kb3Var.b = new BigInteger(1, m9VarW.zzc().zzy());
                        kb3Var.a(m9VarW.zzb());
                        kb3Var.b(m9VarW.v().x());
                        kb3Var.f = (mb3) cc3.g.b(x8Var2.x());
                        return kb3Var.c();
                    } catch (zzicg e3) {
                        throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e3);
                    }
                }
                u7.r("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var2.v())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        return new zzis();
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        switch (this.a) {
            case 22:
                break;
            case 23:
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
            default:
                break;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                break;
            case 27:
                break;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjh
    public zzhlg zza(zzhaz zzhazVar, i43 i43Var) {
        switch (this.a) {
            case 0:
                za3 za3Var = (za3) zzhazVar;
                m73 m73Var = wb3.a;
                q93 q93VarZ = r8.z();
                s8 s8VarA = wb3.a(za3Var.a);
                q93VarZ.d();
                ((r8) q93VarZ.b).C(s8VarA);
                byte[] bArrB = ((hc3) za3Var.b.b).b();
                zzian zzianVarZzs = zzian.zzs(bArrB, 0, bArrB.length);
                q93VarZ.d();
                ((r8) q93VarZ.b).B(zzianVarZzs);
                zzian zzianVarZzaM = ((r8) q93VarZ.e()).zzaM();
                zzhqb zzhqbVar = zzhqb.ASYMMETRIC_PRIVATE;
                ne2 ne2Var = wb3.g;
                bb3 bb3Var = za3Var.a;
                return s73.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzianVarZzaM, zzhqbVar, (zzhqy) ne2Var.a(bb3Var.a.a), bb3Var.d);
            case 4:
                ib3 ib3Var = (ib3) zzhazVar;
                return s73.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", ac3.a(ib3Var).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) ac3.g.a(ib3Var.a.c), ib3Var.d);
            case 6:
                hb3 hb3Var = (hb3) zzhazVar;
                m73 m73Var2 = ac3.a;
                ia3 ia3VarC = k9.C();
                ia3VarC.d();
                ((k9) ia3VarC.b).E();
                l9 l9VarA = ac3.a(hb3Var.a);
                ia3VarC.d();
                ((k9) ia3VarC.b).F(l9VarA);
                byte[] bArrJ = qj1.J((BigInteger) hb3Var.b.b);
                zzian zzianVar = zzian.zza;
                zzian zzianVarZzs2 = zzian.zzs(bArrJ, 0, bArrJ.length);
                ia3VarC.d();
                ((k9) ia3VarC.b).G(zzianVarZzs2);
                byte[] bArrJ2 = qj1.J((BigInteger) hb3Var.c.b);
                zzian zzianVarZzs3 = zzian.zzs(bArrJ2, 0, bArrJ2.length);
                ia3VarC.d();
                ((k9) ia3VarC.b).H(zzianVarZzs3);
                byte[] bArrJ3 = qj1.J((BigInteger) hb3Var.d.b);
                zzian zzianVarZzs4 = zzian.zzs(bArrJ3, 0, bArrJ3.length);
                ia3VarC.d();
                ((k9) ia3VarC.b).I(zzianVarZzs4);
                byte[] bArrJ4 = qj1.J((BigInteger) hb3Var.e.b);
                zzian zzianVarZzs5 = zzian.zzs(bArrJ4, 0, bArrJ4.length);
                ia3VarC.d();
                ((k9) ia3VarC.b).J(zzianVarZzs5);
                byte[] bArrJ5 = qj1.J((BigInteger) hb3Var.f.b);
                zzian zzianVarZzs6 = zzian.zzs(bArrJ5, 0, bArrJ5.length);
                ia3VarC.d();
                ((k9) ia3VarC.b).K(zzianVarZzs6);
                byte[] bArrJ6 = qj1.J((BigInteger) hb3Var.g.b);
                zzian zzianVarZzs7 = zzian.zzs(bArrJ6, 0, bArrJ6.length);
                ia3VarC.d();
                ((k9) ia3VarC.b).L(zzianVarZzs7);
                zzian zzianVarZzaM2 = ((k9) ia3VarC.e()).zzaM();
                zzhqb zzhqbVar2 = zzhqb.ASYMMETRIC_PRIVATE;
                ne2 ne2Var2 = ac3.g;
                ib3 ib3Var2 = hb3Var.a;
                return s73.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzianVarZzaM2, zzhqbVar2, (zzhqy) ne2Var2.a(ib3Var2.a.c), ib3Var2.d);
            case 10:
                pb3 pb3Var = (pb3) zzhazVar;
                return s73.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", cc3.b(pb3Var).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) cc3.g.a(pb3Var.a.c), pb3Var.d);
            default:
                ob3 ob3Var = (ob3) zzhazVar;
                m73 m73Var3 = cc3.a;
                ma3 ma3VarC = o9.C();
                ma3VarC.d();
                ((o9) ma3VarC.b).E();
                p9 p9VarB = cc3.b(ob3Var.a);
                ma3VarC.d();
                ((o9) ma3VarC.b).F(p9VarB);
                byte[] bArrJ7 = qj1.J((BigInteger) ob3Var.b.b);
                zzian zzianVar2 = zzian.zza;
                zzian zzianVarZzs8 = zzian.zzs(bArrJ7, 0, bArrJ7.length);
                ma3VarC.d();
                ((o9) ma3VarC.b).G(zzianVarZzs8);
                byte[] bArrJ8 = qj1.J((BigInteger) ob3Var.c.b);
                zzian zzianVarZzs9 = zzian.zzs(bArrJ8, 0, bArrJ8.length);
                ma3VarC.d();
                ((o9) ma3VarC.b).H(zzianVarZzs9);
                byte[] bArrJ9 = qj1.J((BigInteger) ob3Var.d.b);
                zzian zzianVarZzs10 = zzian.zzs(bArrJ9, 0, bArrJ9.length);
                ma3VarC.d();
                ((o9) ma3VarC.b).I(zzianVarZzs10);
                byte[] bArrJ10 = qj1.J((BigInteger) ob3Var.e.b);
                zzian zzianVarZzs11 = zzian.zzs(bArrJ10, 0, bArrJ10.length);
                ma3VarC.d();
                ((o9) ma3VarC.b).J(zzianVarZzs11);
                byte[] bArrJ11 = qj1.J((BigInteger) ob3Var.f.b);
                zzian zzianVarZzs12 = zzian.zzs(bArrJ11, 0, bArrJ11.length);
                ma3VarC.d();
                ((o9) ma3VarC.b).K(zzianVarZzs12);
                byte[] bArrJ12 = qj1.J((BigInteger) ob3Var.g.b);
                zzian zzianVarZzs13 = zzian.zzs(bArrJ12, 0, bArrJ12.length);
                ma3VarC.d();
                ((o9) ma3VarC.b).L(zzianVarZzs13);
                zzian zzianVarZzaM3 = ((o9) ma3VarC.e()).zzaM();
                zzhqb zzhqbVar3 = zzhqb.ASYMMETRIC_PRIVATE;
                ne2 ne2Var3 = cc3.g;
                pb3 pb3Var2 = ob3Var.a;
                return s73.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzianVarZzaM3, zzhqbVar3, (zzhqy) ne2Var3.a(pb3Var2.a.c), pb3Var2.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkm
    public zzhlg zza(zzhbp zzhbpVar) {
        switch (this.a) {
            case 2:
                m73 m73Var = wb3.a;
                w93 w93VarZ = x8.z();
                w93VarZ.g("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                w93VarZ.h(q8.x().zzaM());
                w93VarZ.i((zzhqy) wb3.g.a(((ya3) zzhbpVar).a));
                return t73.a((x8) w93VarZ.e());
            case 8:
                gb3 gb3Var = (gb3) zzhbpVar;
                m73 m73Var2 = ac3.a;
                w93 w93VarZ2 = x8.z();
                w93VarZ2.g("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                ga3 ga3VarX = i9.x();
                ha3 ha3VarW = j9.w();
                zzhpt zzhptVar = (zzhpt) ac3.h.a(gb3Var.d);
                ha3VarW.d();
                ((j9) ha3VarW.b).y(zzhptVar);
                j9 j9Var = (j9) ha3VarW.e();
                ga3VarX.d();
                ((i9) ga3VarX.b).y(j9Var);
                int i2 = gb3Var.a;
                ga3VarX.d();
                ((i9) ga3VarX.b).z(i2);
                byte[] bArrJ = qj1.J(gb3Var.b);
                zzian zzianVar = zzian.zza;
                zzian zzianVarZzs = zzian.zzs(bArrJ, 0, bArrJ.length);
                ga3VarX.d();
                ((i9) ga3VarX.b).A(zzianVarZzs);
                w93VarZ2.h(((i9) ga3VarX.e()).zzaM());
                w93VarZ2.i((zzhqy) ac3.g.a(gb3Var.c));
                return t73.a((x8) w93VarZ2.e());
            default:
                nb3 nb3Var = (nb3) zzhbpVar;
                m73 m73Var3 = cc3.a;
                w93 w93VarZ3 = x8.z();
                w93VarZ3.g("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                ka3 ka3VarX = m9.x();
                n9 n9VarA = cc3.a(nb3Var);
                ka3VarX.d();
                ((m9) ka3VarX.b).y(n9VarA);
                int i3 = nb3Var.a;
                ka3VarX.d();
                ((m9) ka3VarX.b).z(i3);
                byte[] bArrJ2 = qj1.J(nb3Var.b);
                zzian zzianVar2 = zzian.zza;
                zzian zzianVarZzs2 = zzian.zzs(bArrJ2, 0, bArrJ2.length);
                ka3VarX.d();
                ((m9) ka3VarX.b).A(zzianVarZzs2);
                w93VarZ3.h(((m9) ka3VarX.e()).zzaM());
                w93VarZ3.i((zzhqy) cc3.g.a(nb3Var.c));
                return t73.a((x8) w93VarZ3.e());
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
    }
}
