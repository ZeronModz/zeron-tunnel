package defpackage;

import com.google.android.gms.internal.ads.a8;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.internal.ads.e8;
import com.google.android.gms.internal.ads.f8;
import com.google.android.gms.internal.ads.f9;
import com.google.android.gms.internal.ads.g8;
import com.google.android.gms.internal.ads.h8;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l8;
import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.t8;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.v8;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.z7;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhje;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhkt;
import com.google.android.gms.internal.ads.zzhlg;
import com.google.android.gms.internal.ads.zzhll;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o53 implements zzhje, zzhkm, zzhll, zzhkt, zzhkj, zzhjh {
    public final /* synthetic */ int a;
    public static final /* synthetic */ o53 b = new o53(0);
    public static final /* synthetic */ o53 c = new o53(1);
    public static final /* synthetic */ o53 d = new o53(2);
    public static final /* synthetic */ o53 e = new o53(3);
    public static final /* synthetic */ o53 f = new o53(4);
    public static final /* synthetic */ o53 g = new o53(5);
    public static final /* synthetic */ o53 h = new o53(6);
    public static final /* synthetic */ o53 i = new o53(7);
    public static final /* synthetic */ o53 j = new o53(8);
    public static final /* synthetic */ o53 k = new o53(9);
    public static final /* synthetic */ o53 l = new o53(10);
    public static final /* synthetic */ o53 m = new o53(11);
    public static final /* synthetic */ o53 n = new o53(12);
    public static final /* synthetic */ o53 o = new o53(13);
    public static final /* synthetic */ o53 p = new o53(14);
    public static final /* synthetic */ o53 q = new o53(15);
    public static final /* synthetic */ o53 r = new o53(16);
    public static final /* synthetic */ o53 s = new o53(17);
    public static final /* synthetic */ o53 t = new o53(18);
    public static final /* synthetic */ o53 u = new o53(19);
    public static final /* synthetic */ o53 v = new o53(20);
    public static final /* synthetic */ o53 w = new o53(21);
    public static final /* synthetic */ o53 x = new o53(22);
    public static final /* synthetic */ o53 y = new o53(23);
    public static final /* synthetic */ o53 z = new o53(24);
    public static final /* synthetic */ o53 A = new o53(25);
    public static final /* synthetic */ o53 B = new o53(26);
    public static final /* synthetic */ o53 C = new o53(27);
    public static final /* synthetic */ o53 D = new o53(28);
    public static final /* synthetic */ o53 E = new o53(29);

    public /* synthetic */ o53(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhje
    public zzhaz zza(zzhlg zzhlgVar, i43 i43Var) throws GeneralSecurityException {
        s73 s73Var = (s73) zzhlgVar;
        switch (this.a) {
            case 0:
                m73 m73Var = q53.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    u7.r("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzian zzianVar = s73Var.c;
                    gd3 gd3Var = gd3.b;
                    int i2 = wc3.a;
                    f9 f9VarX = f9.x(zzianVar, gd3.c);
                    if (f9VarX.v() == 0) {
                        return m53.d(q53.b(f9VarX.w(), s73Var.e), s73Var.f);
                    }
                    String strValueOf = String.valueOf(f9VarX);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
                    sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb.append(strValueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (zzicg e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            case 15:
                m73 m73Var2 = y53.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    u7.r("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzian zzianVar2 = s73Var.c;
                    gd3 gd3Var2 = gd3.b;
                    int i3 = wc3.a;
                    y7 y7VarY = y7.y(zzianVar2, gd3.c);
                    if (y7VarY.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (y7VarY.w().v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (y7VarY.x().v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    fq0 fq0Var = new fq0();
                    fq0Var.c(y7VarY.w().zzc().zzc());
                    fq0Var.e(y7VarY.x().zzc().zzc());
                    fq0Var.g(y7VarY.w().w().v());
                    fq0Var.h(y7VarY.x().w().zzb());
                    fq0Var.e = y53.c(y7VarY.x().w().v());
                    fq0Var.f = y53.b(s73Var.e);
                    s43 s43VarI = fq0Var.i();
                    t61 t61Var = new t61(19);
                    t61Var.b = s43VarI;
                    t61Var.c = ic3.a(y7VarY.w().zzc().zzy());
                    t61Var.d = ic3.a(y7VarY.x().zzc().zzy());
                    t61Var.e = s73Var.f;
                    return t61Var.t();
                } catch (zzicg unused) {
                    zg1.m("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 19:
                m73 m73Var3 = z53.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    u7.r("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzian zzianVar3 = s73Var.c;
                    gd3 gd3Var3 = gd3.b;
                    int i4 = wc3.a;
                    d8 d8VarX = d8.x(zzianVar3, gd3.c);
                    if (d8VarX.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t61 t61Var2 = new t61(20);
                    t61Var2.m(d8VarX.zzc().zzc());
                    t61Var2.q(d8VarX.w().v());
                    t61Var2.s();
                    t61Var2.e = z53.b(s73Var.e);
                    w43 w43VarU = t61Var2.u();
                    wp2 wp2Var = new wp2(3, false);
                    wp2Var.b = w43VarU;
                    wp2Var.c = ic3.a(d8VarX.zzc().zzy());
                    wp2Var.d = s73Var.f;
                    return wp2Var.f();
                } catch (zzicg unused2) {
                    zg1.m("Parsing AesEaxcKey failed");
                    return null;
                }
            case 23:
                m73 m73Var4 = b63.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    u7.r("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzian zzianVar4 = s73Var.c;
                    gd3 gd3Var4 = gd3.b;
                    int i5 = wc3.a;
                    g8 g8VarX = g8.x(zzianVar4, gd3.c);
                    if (g8VarX.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t61 t61Var3 = new t61(21);
                    t61Var3.m(g8VarX.w().zzc());
                    t61Var3.p();
                    t61Var3.s();
                    t61Var3.e = b63.b(s73Var.e);
                    z43 z43VarV = t61Var3.v();
                    wp2 wp2Var2 = new wp2(4, false);
                    wp2Var2.b = z43VarV;
                    wp2Var2.c = ic3.a(g8VarX.w().zzy());
                    wp2Var2.d = s73Var.f;
                    return wp2Var2.g();
                } catch (zzicg unused3) {
                    zg1.m("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                m73 m73Var5 = d63.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    u7.r("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzian zzianVar5 = s73Var.c;
                    gd3 gd3Var5 = gd3.b;
                    int i6 = wc3.a;
                    i8 i8VarX = i8.x(zzianVar5, gd3.c);
                    if (i8VarX.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iZzc = i8VarX.w().zzc();
                    if (iZzc != 16 && iZzc != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iZzc)));
                    }
                    c53 c53Var = new c53(iZzc, d63.b(s73Var.e));
                    wp2 wp2Var3 = new wp2(5, false);
                    wp2Var3.b = c53Var;
                    wp2Var3.c = ic3.a(i8VarX.w().zzy());
                    wp2Var3.d = s73Var.f;
                    return wp2Var3.h();
                } catch (zzicg unused4) {
                    zg1.m("Parsing AesGcmSivKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkj
    public zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException {
        t73 t73Var = (t73) zzhlgVar;
        switch (this.a) {
            case 13:
                m73 m73Var = y53.a;
                boolean zEquals = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                x8 x8Var = t73Var.b;
                if (zEquals) {
                    try {
                        zzian zzianVarW = x8Var.w();
                        gd3 gd3Var = gd3.b;
                        int i2 = wc3.a;
                        z7 z7VarX = z7.x(zzianVarW, gd3.c);
                        if (z7VarX.w().w() == 0) {
                            fq0 fq0Var = new fq0();
                            fq0Var.c(z7VarX.v().zzb());
                            fq0Var.e(z7VarX.w().zzb());
                            fq0Var.g(z7VarX.v().v().v());
                            fq0Var.h(z7VarX.w().v().zzb());
                            fq0Var.e = y53.c(z7VarX.w().v().v());
                            fq0Var.f = y53.b(x8Var.x());
                            return fq0Var.i();
                        }
                        zg1.m("Only version 0 keys are accepted");
                        return null;
                    } catch (zzicg e2) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                    }
                }
                u7.r("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var.v())));
                return null;
            case 17:
                m73 m73Var2 = z53.a;
                boolean zEquals2 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.AesEaxKey");
                x8 x8Var2 = t73Var.b;
                if (zEquals2) {
                    try {
                        zzian zzianVarW2 = x8Var2.w();
                        gd3 gd3Var2 = gd3.b;
                        int i3 = wc3.a;
                        e8 e8VarW = e8.w(zzianVarW2, gd3.c);
                        t61 t61Var = new t61(20);
                        t61Var.m(e8VarW.zzb());
                        t61Var.q(e8VarW.v().v());
                        t61Var.s();
                        t61Var.e = z53.b(x8Var2.x());
                        return t61Var.u();
                    } catch (zzicg e3) {
                        throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e3);
                    }
                }
                u7.r("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var2.v())));
                return null;
            case 21:
                m73 m73Var3 = b63.a;
                boolean zEquals3 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.AesGcmKey");
                x8 x8Var3 = t73Var.b;
                if (zEquals3) {
                    try {
                        zzian zzianVarW3 = x8Var3.w();
                        gd3 gd3Var3 = gd3.b;
                        int i4 = wc3.a;
                        h8 h8VarW = h8.w(zzianVarW3, gd3.c);
                        if (h8VarW.zzb() == 0) {
                            t61 t61Var2 = new t61(21);
                            t61Var2.m(h8VarW.v());
                            t61Var2.p();
                            t61Var2.s();
                            t61Var2.e = b63.b(x8Var3.x());
                            return t61Var2.v();
                        }
                        zg1.m("Only version 0 parameters are accepted");
                        return null;
                    } catch (zzicg e4) {
                        throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e4);
                    }
                }
                u7.r("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var3.v())));
                return null;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                m73 m73Var4 = d63.a;
                boolean zEquals4 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                x8 x8Var4 = t73Var.b;
                if (zEquals4) {
                    try {
                        zzian zzianVarW4 = x8Var4.w();
                        gd3 gd3Var4 = gd3.b;
                        int i5 = wc3.a;
                        j8 j8VarW = j8.w(zzianVarW4, gd3.c);
                        if (j8VarW.zzb() == 0) {
                            int iV = j8VarW.v();
                            if (iV != 16 && iV != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iV)));
                            }
                            return new c53(iV, d63.b(x8Var4.x()));
                        }
                        zg1.m("Only version 0 parameters are accepted");
                        return null;
                    } catch (zzicg e5) {
                        throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e5);
                    }
                }
                u7.r("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var4.v())));
                return null;
            default:
                m73 m73Var5 = h63.a;
                boolean zEquals5 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                x8 x8Var5 = t73Var.b;
                if (zEquals5) {
                    try {
                        zzian zzianVarW5 = x8Var5.w();
                        gd3 gd3Var5 = gd3.b;
                        int i6 = wc3.a;
                        l8.v(zzianVarW5, gd3.c);
                        return new f53(h63.b(x8Var5.x()));
                    } catch (zzicg e6) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e6);
                    }
                }
                u7.r("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var5.v())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjh
    public zzhlg zza(zzhaz zzhazVar, i43 i43Var) throws GeneralSecurityException {
        switch (this.a) {
            case 14:
                m43 m43Var = (m43) zzhazVar;
                m73 m73Var = y53.a;
                x83 x83VarZ = y7.z();
                z83 z83VarX = a8.x();
                b93 b93VarW = c8.w();
                int i2 = m43Var.a.c;
                b93VarW.d();
                ((c8) b93VarW.b).y(i2);
                c8 c8Var = (c8) b93VarW.e();
                z83VarX.d();
                ((a8) z83VarX.b).z(c8Var);
                byte[] bArrB = ((hc3) m43Var.b.b).b();
                zzian zzianVarZzs = zzian.zzs(bArrB, 0, bArrB.length);
                z83VarX.d();
                ((a8) z83VarX.b).A(zzianVarZzs);
                a8 a8Var = (a8) z83VarX.e();
                x83VarZ.d();
                ((y7) x83VarZ.b).B(a8Var);
                s93 s93VarY = t8.y();
                s43 s43Var = m43Var.a;
                v8 v8VarD = y53.d(s43Var);
                s93VarY.d();
                ((t8) s93VarY.b).B(v8VarD);
                byte[] bArrB2 = ((hc3) m43Var.c.b).b();
                zzian zzianVarZzs2 = zzian.zzs(bArrB2, 0, bArrB2.length);
                s93VarY.d();
                ((t8) s93VarY.b).C(zzianVarZzs2);
                t8 t8Var = (t8) s93VarY.e();
                x83VarZ.d();
                ((y7) x83VarZ.b).C(t8Var);
                return s73.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((y7) x83VarZ.e()).zzaM(), zzhqb.SYMMETRIC, y53.a(s43Var.e), m43Var.e);
            case 18:
                t43 t43Var = (t43) zzhazVar;
                m73 m73Var2 = z53.a;
                c93 c93VarY = d8.y();
                w43 w43Var = t43Var.a;
                e93 e93VarW = f8.w();
                int i3 = w43Var.b;
                e93VarW.d();
                ((f8) e93VarW.b).y(i3);
                f8 f8Var = (f8) e93VarW.e();
                c93VarY.d();
                ((d8) c93VarY.b).A(f8Var);
                byte[] bArrB3 = ((hc3) t43Var.b.b).b();
                zzian zzianVarZzs3 = zzian.zzs(bArrB3, 0, bArrB3.length);
                c93VarY.d();
                ((d8) c93VarY.b).B(zzianVarZzs3);
                return s73.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((d8) c93VarY.e()).zzaM(), zzhqb.SYMMETRIC, z53.a(t43Var.a.c), t43Var.d);
            case 22:
                x43 x43Var = (x43) zzhazVar;
                m73 m73Var3 = b63.a;
                f93 f93VarY = g8.y();
                byte[] bArrB4 = ((hc3) x43Var.b.b).b();
                zzian zzianVarZzs4 = zzian.zzs(bArrB4, 0, bArrB4.length);
                f93VarY.d();
                ((g8) f93VarY.b).A(zzianVarZzs4);
                return s73.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((g8) f93VarY.e()).zzaM(), zzhqb.SYMMETRIC, b63.a(x43Var.a.b), x43Var.d);
            default:
                a53 a53Var = (a53) zzhazVar;
                m73 m73Var4 = d63.a;
                h93 h93VarY = i8.y();
                byte[] bArrB5 = ((hc3) a53Var.b.b).b();
                zzian zzianVarZzs5 = zzian.zzs(bArrB5, 0, bArrB5.length);
                h93VarY.d();
                ((i8) h93VarY.b).A(zzianVarZzs5);
                return s73.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((i8) h93VarY.e()).zzaM(), zzhqb.SYMMETRIC, d63.a(a53Var.a.b), a53Var.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkm
    public zzhlg zza(zzhbp zzhbpVar) throws GeneralSecurityException {
        zzhqy zzhqyVar;
        switch (this.a) {
            case 1:
                n53 n53Var = (n53) zzhbpVar;
                m73 m73Var = q53.a;
                w93 w93VarZ = x8.z();
                w93VarZ.g("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                w93VarZ.h(q53.a(n53Var).zzaM());
                e43 e43Var = n53Var.a;
                if (e43.l == e43Var) {
                    zzhqyVar = zzhqy.TINK;
                } else {
                    if (e43.m != e43Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(e43Var)));
                    }
                    zzhqyVar = zzhqy.RAW;
                }
                w93VarZ.i(zzhqyVar);
                return t73.a((x8) w93VarZ.e());
            case 16:
                s43 s43Var = (s43) zzhbpVar;
                m73 m73Var2 = y53.a;
                w93 w93VarZ2 = x8.z();
                w93VarZ2.g("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                y83 y83VarY = z7.y();
                a93 a93VarW = b8.w();
                b93 b93VarW = c8.w();
                int i2 = s43Var.c;
                b93VarW.d();
                ((c8) b93VarW.b).y(i2);
                c8 c8Var = (c8) b93VarW.e();
                a93VarW.d();
                ((b8) a93VarW.b).y(c8Var);
                int i3 = s43Var.a;
                a93VarW.d();
                ((b8) a93VarW.b).z(i3);
                b8 b8Var = (b8) a93VarW.e();
                y83VarY.d();
                ((z7) y83VarY.b).z(b8Var);
                t93 t93VarY = u8.y();
                v8 v8VarD = y53.d(s43Var);
                t93VarY.d();
                ((u8) t93VarY.b).A(v8VarD);
                int i4 = s43Var.b;
                t93VarY.d();
                ((u8) t93VarY.b).B(i4);
                u8 u8Var = (u8) t93VarY.e();
                y83VarY.d();
                ((z7) y83VarY.b).A(u8Var);
                w93VarZ2.h(((z7) y83VarY.e()).zzaM());
                w93VarZ2.i(y53.a(s43Var.e));
                return t73.a((x8) w93VarZ2.e());
            case 20:
                w43 w43Var = (w43) zzhbpVar;
                m73 m73Var3 = z53.a;
                w93 w93VarZ3 = x8.z();
                w93VarZ3.g("type.googleapis.com/google.crypto.tink.AesEaxKey");
                d93 d93VarX = e8.x();
                e93 e93VarW = f8.w();
                int i5 = w43Var.b;
                e93VarW.d();
                ((f8) e93VarW.b).y(i5);
                f8 f8Var = (f8) e93VarW.e();
                d93VarX.d();
                ((e8) d93VarX.b).y(f8Var);
                int i6 = w43Var.a;
                d93VarX.d();
                ((e8) d93VarX.b).z(i6);
                w93VarZ3.h(((e8) d93VarX.e()).zzaM());
                w93VarZ3.i(z53.a(w43Var.c));
                return t73.a((x8) w93VarZ3.e());
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                z43 z43Var = (z43) zzhbpVar;
                m73 m73Var4 = b63.a;
                w93 w93VarZ4 = x8.z();
                w93VarZ4.g("type.googleapis.com/google.crypto.tink.AesGcmKey");
                g93 g93VarX = h8.x();
                int i7 = z43Var.a;
                g93VarX.d();
                ((h8) g93VarX.b).y(i7);
                w93VarZ4.h(((h8) g93VarX.e()).zzaM());
                w93VarZ4.i(b63.a(z43Var.b));
                return t73.a((x8) w93VarZ4.e());
            default:
                c53 c53Var = (c53) zzhbpVar;
                m73 m73Var5 = d63.a;
                w93 w93VarZ5 = x8.z();
                w93VarZ5.g("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                i93 i93VarX = j8.x();
                int i8 = c53Var.a;
                i93VarX.d();
                ((j8) i93VarX.b).y(i8);
                w93VarZ5.h(((j8) i93VarX.e()).zzaM());
                w93VarZ5.i(d63.a(c53Var.b));
                return t73.a((x8) w93VarZ5.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhll
    public Object zza() throws GeneralSecurityException {
        switch (this.a) {
            case 2:
                z43 z43Var = r53.a;
                t61 t61Var = new t61(21);
                t61Var.p();
                t61Var.m(32);
                t61Var.s();
                t61Var.e = q43.h;
                return t61Var.v();
            case 3:
                z43 z43Var2 = r53.a;
                t61 t61Var2 = new t61(20);
                t61Var2.q(16);
                t61Var2.m(16);
                t61Var2.s();
                t61Var2.e = e43.f;
                return t61Var2.u();
            case 4:
                z43 z43Var3 = r53.a;
                t61 t61Var3 = new t61(20);
                t61Var3.q(16);
                t61Var3.m(32);
                t61Var3.s();
                t61Var3.e = e43.f;
                return t61Var3.u();
            case 5:
                z43 z43Var4 = r53.a;
                fq0 fq0Var = new fq0();
                fq0Var.c(16);
                fq0Var.e(32);
                fq0Var.h(16);
                fq0Var.g(16);
                fq0Var.e = q43.e;
                fq0Var.f = r43.c;
                return fq0Var.i();
            case 6:
                z43 z43Var5 = r53.a;
                fq0 fq0Var2 = new fq0();
                fq0Var2.c(32);
                fq0Var2.e(32);
                fq0Var2.h(32);
                fq0Var2.g(16);
                fq0Var2.e = q43.e;
                fq0Var2.f = r43.c;
                return fq0Var2.i();
            case 7:
                z43 z43Var6 = r53.a;
                return u53.b(12, q43.m);
            case 8:
                z43 z43Var7 = r53.a;
                return u53.b(12, q43.n);
            case 9:
                z43 z43Var8 = r53.a;
                return u53.b(8, q43.n);
            default:
                z43 z43Var9 = r53.a;
                t61 t61Var4 = new t61(21);
                t61Var4.p();
                t61Var4.m(16);
                t61Var4.s();
                t61Var4.e = q43.h;
                return t61Var4.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkt
    public Object zza(zzhaz zzhazVar) {
        switch (this.a) {
            case 11:
                s53 s53Var = (s53) zzhazVar;
                u53 u53Var = s53Var.a;
                return new k63(((hc3) s53Var.b.b).b(), s53Var.c, s53Var.a.b);
            default:
                v53 v53Var = (v53) zzhazVar;
                p73 p73Var = w53.a;
                try {
                    r7.a();
                    return new m63(((hc3) v53Var.b.b).b(), v53Var.c.b(), r7.a().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new aa(((hc3) v53Var.b.b).b(), 1, v53Var.c.b());
                }
        }
    }
}
