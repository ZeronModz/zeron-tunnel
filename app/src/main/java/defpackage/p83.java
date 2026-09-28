package defpackage;

import com.google.android.gms.internal.ads.ba;
import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.m8;
import com.google.android.gms.internal.ads.n8;
import com.google.android.gms.internal.ads.o8;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.s8;
import com.google.android.gms.internal.ads.t8;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.v8;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhje;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhjo;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhkt;
import com.google.android.gms.internal.ads.zzhlg;
import com.google.android.gms.internal.ads.zzhll;
import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p83 implements zzhje, zzhkm, zzhkt, zzhll, zzhkj, zzhjh {
    public final /* synthetic */ int a;
    public static final /* synthetic */ p83 b = new p83(0);
    public static final /* synthetic */ p83 c = new p83(1);
    public static final /* synthetic */ p83 d = new p83(2);
    public static final /* synthetic */ p83 e = new p83(3);
    public static final /* synthetic */ p83 f = new p83(4);
    public static final /* synthetic */ p83 g = new p83(5);
    public static final /* synthetic */ p83 h = new p83(6);
    public static final /* synthetic */ p83 i = new p83(7);
    public static final /* synthetic */ p83 j = new p83(8);
    public static final /* synthetic */ p83 k = new p83(9);
    public static final /* synthetic */ p83 l = new p83(10);
    public static final /* synthetic */ p83 m = new p83(11);
    public static final /* synthetic */ p83 n = new p83(12);
    public static final /* synthetic */ p83 o = new p83(13);
    public static final /* synthetic */ p83 p = new p83(14);
    public static final /* synthetic */ p83 q = new p83(15);
    public static final /* synthetic */ p83 r = new p83(16);
    public static final /* synthetic */ p83 s = new p83(17);
    public static final /* synthetic */ p83 t = new p83(18);
    public static final /* synthetic */ p83 u = new p83(19);
    public static final /* synthetic */ p83 v = new p83(20);
    public static final /* synthetic */ p83 w = new p83(21);
    public static final /* synthetic */ p83 x = new p83(22);
    public static final /* synthetic */ p83 y = new p83(23);
    public static final /* synthetic */ p83 z = new p83(24);
    public static final /* synthetic */ p83 A = new p83(25);
    public static final /* synthetic */ p83 B = new p83(26);
    public static final /* synthetic */ p83 C = new p83(27);
    public static final /* synthetic */ p83 D = new p83(28);
    public static final /* synthetic */ p83 E = new p83(29);

    public /* synthetic */ p83(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhje
    public zzhaz zza(zzhlg zzhlgVar, i43 i43Var) throws GeneralSecurityException {
        s73 s73Var = (s73) zzhlgVar;
        switch (this.a) {
            case 0:
                ne2 ne2Var = q83.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    u7.r("Wrong type URL in call to HmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzian zzianVar = s73Var.c;
                    gd3 gd3Var = gd3.b;
                    int i2 = wc3.a;
                    t8 t8VarX = t8.x(zzianVar, gd3.c);
                    if (t8VarX.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t61 t61Var = new t61(22);
                    t61Var.m(t8VarX.zzc().zzc());
                    t61Var.q(t8VarX.w().zzb());
                    t61Var.d = (i83) q83.b.b(t8VarX.w().v());
                    t61Var.e = (j83) q83.a.b(s73Var.e);
                    k83 k83VarW = t61Var.w();
                    wp2 wp2Var = new wp2(9, false);
                    wp2Var.b = k83VarW;
                    wp2Var.c = ic3.a(t8VarX.zzc().zzy());
                    wp2Var.d = s73Var.f;
                    return wp2Var.k();
                } catch (zzicg | IllegalArgumentException unused) {
                    zg1.m("Parsing HmacKey failed");
                    return null;
                }
            case 23:
                m73 m73Var = ub3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    u7.r("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar2 = s73Var.c;
                    gd3 gd3Var2 = gd3.b;
                    int i3 = wc3.a;
                    p8 p8VarY = p8.y(zzianVar2, gd3.c);
                    if (p8VarY.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t61 t61Var2 = new t61(23);
                    t61Var2.d = ub3.b(p8VarY.w().v());
                    t61Var2.b = ub3.h(p8VarY.w().zzh());
                    t61Var2.c = ub3.g(p8VarY.w().z());
                    t61Var2.e = ub3.c(s73Var.e);
                    ta3 ta3VarX = t61Var2.x();
                    wp2 wp2Var2 = new wp2(10, false);
                    wp2Var2.b = ta3VarX;
                    wp2Var2.c = new ECPoint(new BigInteger(1, p8VarY.zzc().zzy()), new BigInteger(1, p8VarY.x().zzy()));
                    wp2Var2.d = s73Var.f;
                    return wp2Var2.l();
                } catch (zzicg | IllegalArgumentException unused2) {
                    zg1.m("Parsing EcdsaPublicKey failed");
                    return null;
                }
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                m73 m73Var2 = ub3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    u7.r("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar3 = s73Var.c;
                    gd3 gd3Var3 = gd3.b;
                    int i4 = wc3.a;
                    o8 o8VarX = o8.x(zzianVar3, gd3.c);
                    if (o8VarX.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p8 p8VarW = o8VarX.w();
                    if (p8VarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t61 t61Var3 = new t61(23);
                    t61Var3.d = ub3.b(p8VarW.w().v());
                    t61Var3.b = ub3.h(p8VarW.w().zzh());
                    t61Var3.c = ub3.g(p8VarW.w().z());
                    t61Var3.e = ub3.c(s73Var.e);
                    ta3 ta3VarX2 = t61Var3.x();
                    wp2 wp2Var3 = new wp2(10, false);
                    wp2Var3.b = ta3VarX2;
                    wp2Var3.c = new ECPoint(new BigInteger(1, p8VarW.zzc().zzy()), new BigInteger(1, p8VarW.x().zzy()));
                    wp2Var3.d = s73Var.f;
                    va3 va3VarL = wp2Var3.l();
                    mo2 mo2Var = new mo2(17);
                    mo2Var.b = va3VarL;
                    mo2Var.c = new ci2(new BigInteger(1, o8VarX.zzc().zzy()), 18);
                    return mo2Var.j();
                } catch (zzicg | IllegalArgumentException unused3) {
                    zg1.m("Parsing EcdsaPrivateKey failed");
                    return null;
                }
            default:
                m73 m73Var3 = wb3.a;
                if (!s73Var.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    u7.r("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(s73Var.a)));
                    return null;
                }
                try {
                    zzian zzianVar4 = s73Var.c;
                    gd3 gd3Var4 = gd3.b;
                    int i5 = wc3.a;
                    s8 s8VarX = s8.x(zzianVar4, gd3.c);
                    if (s8VarX.v() == 0) {
                        return bb3.d((xa3) wb3.g.b(s73Var.e), hc3.a(s8VarX.w().zzy()), s73Var.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzicg unused4) {
                    zg1.m("Parsing Ed25519PublicKey failed");
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkj
    public zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException {
        t73 t73Var = (t73) zzhlgVar;
        switch (this.a) {
            case 21:
                m73 m73Var = ub3.a;
                boolean zEquals = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                x8 x8Var = t73Var.b;
                if (zEquals) {
                    try {
                        zzian zzianVarW = x8Var.w();
                        gd3 gd3Var = gd3.b;
                        int i2 = wc3.a;
                        m8 m8VarW = m8.w(zzianVarW, gd3.c);
                        t61 t61Var = new t61(23);
                        t61Var.d = ub3.b(m8VarW.v().v());
                        t61Var.b = ub3.h(m8VarW.v().zzh());
                        t61Var.c = ub3.g(m8VarW.v().z());
                        t61Var.e = ub3.c(x8Var.x());
                        return t61Var.x();
                    } catch (zzicg e2) {
                        throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e2);
                    }
                }
                u7.r("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var.v())));
                return null;
            default:
                m73 m73Var2 = wb3.a;
                boolean zEquals2 = t73Var.b.v().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                x8 x8Var2 = t73Var.b;
                if (zEquals2) {
                    try {
                        zzian zzianVarW2 = x8Var2.w();
                        gd3 gd3Var2 = gd3.b;
                        int i3 = wc3.a;
                        if (q8.w(zzianVarW2, gd3.c).v() == 0) {
                            return new ya3((xa3) wb3.g.b(x8Var2.x()));
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzicg e3) {
                        throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e3);
                    }
                }
                u7.r("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(x8Var2.v())));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkt
    public Object zza(zzhaz zzhazVar) throws GeneralSecurityException {
        switch (this.a) {
            case 2:
                za3 za3Var = (za3) zzhazVar;
                if (dn0.N(1)) {
                    try {
                        return xb3.a(za3Var);
                    } catch (GeneralSecurityException unused) {
                        ic3 ic3Var = za3Var.b;
                        bb3 bb3Var = za3Var.a;
                        byte[] bArrB = ((hc3) ic3Var.b).b();
                        bb3Var.c.b();
                        xa3 xa3Var = bb3Var.a.a;
                        xb3 xb3Var = new xb3(4);
                        if (dn0.N(1)) {
                            if (bArrB.length == 32) {
                                z.k(z.q(bArrB));
                                return xb3Var;
                            }
                            u7.r("Given private key's length is not 32");
                            return null;
                        }
                        zg1.m("Can not use Ed25519 in FIPS-mode.");
                        return null;
                    }
                }
                zg1.m("Can not use Ed25519 in FIPS-mode.");
                return null;
            case 3:
                bb3 bb3Var2 = (bb3) zzhazVar;
                if (dn0.N(1)) {
                    try {
                        return yb3.a(bb3Var2);
                    } catch (GeneralSecurityException unused2) {
                        return new ba(bb3Var2.b.b(), bb3Var2.c.b(), bb3Var2.a.a.equals(xa3.d) ? new byte[]{0} : new byte[0]);
                    }
                }
                zg1.m("Can not use Ed25519 in FIPS-mode.");
                return null;
            case 18:
                s73 s73Var = ((zzhjo) zzhazVar).a;
                int i2 = d73.b[s73Var.d.ordinal()];
                zb3.a(s73Var);
                s73Var.e.equals(zzhqy.LEGACY);
                return new xb3(2);
            case 19:
                s73 s73Var2 = ((zzhjo) zzhazVar).a;
                int i3 = d73.b[s73Var2.d.ordinal()];
                return new zb3((zzhbs) zzhjc.d.b(zzhbs.class, s73Var2.a).zza(s73Var2.c), zb3.a(s73Var2), s73Var2.e.equals(zzhqy.LEGACY) ? new byte[]{0} : new byte[0]);
            default:
                return fa.a((ib3) zzhazVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjh
    public zzhlg zza(zzhaz zzhazVar, i43 i43Var) throws GeneralSecurityException {
        switch (this.a) {
            case 22:
                va3 va3Var = (va3) zzhazVar;
                return s73.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", ub3.f(va3Var).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, ub3.a(va3Var.a.d), va3Var.d);
            case 23:
            default:
                bb3 bb3Var = (bb3) zzhazVar;
                return s73.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", wb3.a(bb3Var).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) wb3.g.a(bb3Var.a.a), bb3Var.d);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ua3 ua3Var = (ua3) zzhazVar;
                m73 m73Var = ub3.a;
                int iD = ub3.d(ua3Var.a.a.b);
                o93 o93VarY = o8.y();
                va3 va3Var2 = ua3Var.a;
                p8 p8VarF = ub3.f(va3Var2);
                o93VarY.d();
                ((o8) o93VarY.b).A(p8VarF);
                byte[] bArrM = qj1.M((BigInteger) ua3Var.b.b, iD);
                zzian zzianVar = zzian.zza;
                zzian zzianVarZzs = zzian.zzs(bArrM, 0, bArrM.length);
                o93VarY.d();
                ((o8) o93VarY.b).B(zzianVarZzs);
                return s73.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((o8) o93VarY.e()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, ub3.a(va3Var2.a.d), va3Var2.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkm
    public zzhlg zza(zzhbp zzhbpVar) throws GeneralSecurityException {
        switch (this.a) {
            case 1:
                k83 k83Var = (k83) zzhbpVar;
                ne2 ne2Var = q83.a;
                w93 w93VarZ = x8.z();
                w93VarZ.g("type.googleapis.com/google.crypto.tink.HmacKey");
                t93 t93VarY = u8.y();
                u93 u93VarW = v8.w();
                int i2 = k83Var.b;
                u93VarW.d();
                ((v8) u93VarW.b).z(i2);
                zzhpt zzhptVar = (zzhpt) q83.b.a(k83Var.d);
                u93VarW.d();
                ((v8) u93VarW.b).y(zzhptVar);
                v8 v8Var = (v8) u93VarW.e();
                t93VarY.d();
                ((u8) t93VarY.b).A(v8Var);
                int i3 = k83Var.a;
                t93VarY.d();
                ((u8) t93VarY.b).B(i3);
                w93VarZ.h(((u8) t93VarY.e()).zzaM());
                w93VarZ.i((zzhqy) q83.a.a(k83Var.c));
                return t73.a((x8) w93VarZ.e());
            default:
                ta3 ta3Var = (ta3) zzhbpVar;
                m73 m73Var = ub3.a;
                w93 w93VarZ2 = x8.z();
                w93VarZ2.g("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                m93 m93VarX = m8.x();
                n8 n8VarE = ub3.e(ta3Var);
                m93VarX.d();
                ((m8) m93VarX.b).y(n8VarE);
                w93VarZ2.h(((m8) m93VarX.e()).zzaM());
                w93VarZ2.i(ub3.a(ta3Var.d));
                return t73.a((x8) w93VarZ2.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhll
    public Object zza() {
        int i2 = this.a;
        mb3 mb3Var = mb3.b;
        fb3 fb3Var = fb3.b;
        eb3 eb3Var = eb3.b;
        switch (i2) {
            case 4:
                ta3 ta3Var = cb3.a;
                t61 t61Var = new t61(23);
                t61Var.d = q43.q;
                t61Var.c = sa3.d;
                t61Var.b = r43.s;
                t61Var.e = e43.r;
                return t61Var.x();
            case 5:
                ta3 ta3Var2 = cb3.a;
                BigInteger bigInteger = gb3.e;
                db3 db3Var = new db3();
                db3Var.c = eb3.d;
                db3Var.a(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
                db3Var.b = gb3.e;
                db3Var.d = fb3Var;
                return db3Var.b();
            case 6:
                ta3 ta3Var3 = cb3.a;
                BigInteger bigInteger2 = nb3.g;
                kb3 kb3Var = new kb3();
                lb3 lb3Var = lb3.b;
                kb3Var.c = lb3Var;
                kb3Var.d = lb3Var;
                kb3Var.b(32);
                kb3Var.a(3072);
                kb3Var.b = nb3.g;
                kb3Var.f = mb3Var;
                return kb3Var.c();
            case 7:
                ta3 ta3Var4 = cb3.a;
                BigInteger bigInteger3 = nb3.g;
                kb3 kb3Var2 = new kb3();
                lb3 lb3Var2 = lb3.d;
                kb3Var2.c = lb3Var2;
                kb3Var2.d = lb3Var2;
                kb3Var2.b(64);
                kb3Var2.a(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
                kb3Var2.b = nb3.g;
                kb3Var2.f = mb3Var;
                return kb3Var2.c();
            case 8:
                ta3 ta3Var5 = cb3.a;
                t61 t61Var2 = new t61(23);
                t61Var2.d = q43.q;
                t61Var2.c = sa3.e;
                t61Var2.b = r43.s;
                t61Var2.e = e43.r;
                return t61Var2.x();
            case 9:
                ta3 ta3Var6 = cb3.a;
                t61 t61Var3 = new t61(23);
                t61Var3.b = r43.r;
                t61Var3.c = sa3.c;
                t61Var3.d = q43.o;
                t61Var3.e = e43.r;
                return t61Var3.x();
            case 10:
                ta3 ta3Var7 = cb3.a;
                t61 t61Var4 = new t61(23);
                t61Var4.b = r43.r;
                t61Var4.c = sa3.d;
                t61Var4.d = q43.q;
                t61Var4.e = e43.r;
                return t61Var4.x();
            case 11:
                ta3 ta3Var8 = cb3.a;
                t61 t61Var5 = new t61(23);
                t61Var5.b = r43.r;
                t61Var5.c = sa3.c;
                t61Var5.d = q43.o;
                t61Var5.e = e43.u;
                return t61Var5.x();
            case 12:
                ta3 ta3Var9 = cb3.a;
                t61 t61Var6 = new t61(23);
                t61Var6.d = q43.q;
                t61Var6.c = sa3.e;
                t61Var6.b = r43.r;
                t61Var6.e = e43.r;
                return t61Var6.x();
            case 13:
                ta3 ta3Var10 = cb3.a;
                return new ya3(xa3.b);
            case 14:
                ta3 ta3Var11 = cb3.a;
                return new ya3(xa3.e);
            case 15:
                ta3 ta3Var12 = cb3.a;
                BigInteger bigInteger4 = gb3.e;
                db3 db3Var2 = new db3();
                db3Var2.c = eb3Var;
                db3Var2.a(3072);
                db3Var2.b = gb3.e;
                db3Var2.d = fb3Var;
                return db3Var2.b();
            case 16:
                ta3 ta3Var13 = cb3.a;
                BigInteger bigInteger5 = gb3.e;
                db3 db3Var3 = new db3();
                db3Var3.c = eb3Var;
                db3Var3.a(3072);
                db3Var3.b = gb3.e;
                db3Var3.d = fb3.e;
                return db3Var3.b();
            default:
                ta3 ta3Var14 = cb3.a;
                t61 t61Var7 = new t61(23);
                t61Var7.d = q43.o;
                t61Var7.c = sa3.c;
                t61Var7.b = r43.s;
                t61Var7.e = e43.r;
                return t61Var7.x();
        }
    }
}
