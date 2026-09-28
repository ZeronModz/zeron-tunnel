package defpackage;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.w9;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjx;
import com.google.android.gms.internal.ads.zzhjz;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhtu;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb3 {
    static {
        int i = h9.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        w9 w9Var = w9.a;
        j73 j73Var = j73.b;
        j73Var.b(w9.a);
        j73Var.a(w9.b);
        j73Var.b(zzhtu.a);
        j73Var.a(zzhtu.b);
        int i = wa3.f;
        if (!dn0.N(i)) {
            zg1.m("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        m73 m73Var = ub3.a;
        zzhkg zzhkgVar = zzhkg.b;
        zzhkgVar.c(ub3.a);
        zzhkgVar.d(ub3.b);
        zzhkgVar.a(ub3.c);
        zzhkgVar.b(ub3.d);
        zzhkgVar.a(ub3.e);
        zzhkgVar.b(ub3.f);
        i73 i73Var = i73.b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", cb3.a);
        map.put("ECDSA_P256_IEEE_P1363", cb3.d);
        t61 t61Var = new t61(23);
        t61Var.d = q43.o;
        t61Var.c = sa3.c;
        t61Var.b = r43.r;
        t61Var.e = e43.u;
        map.put("ECDSA_P256_RAW", t61Var.x());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", cb3.f);
        map.put("ECDSA_P384", cb3.b);
        map.put("ECDSA_P384_IEEE_P1363", cb3.e);
        t61 t61Var2 = new t61(23);
        t61Var2.d = q43.q;
        sa3 sa3Var = sa3.d;
        t61Var2.c = sa3Var;
        r43 r43Var = r43.s;
        t61Var2.b = r43Var;
        e43 e43Var = e43.r;
        t61Var2.e = e43Var;
        map.put("ECDSA_P384_SHA512", t61Var2.x());
        t61 t61Var3 = new t61(23);
        t61Var3.d = q43.p;
        t61Var3.c = sa3Var;
        t61Var3.b = r43Var;
        t61Var3.e = e43Var;
        map.put("ECDSA_P384_SHA384", t61Var3.x());
        map.put("ECDSA_P521", cb3.c);
        map.put("ECDSA_P521_IEEE_P1363", cb3.g);
        i73Var.b(DesugarCollections.unmodifiableMap(map));
        j73Var.a(wa3.a);
        j73Var.a(wa3.b);
        zzhjx zzhjxVar = zzhjx.b;
        zzhjxVar.a(wa3.e, ta3.class);
        zzhjc zzhjcVar = zzhjc.d;
        zzhjcVar.c(wa3.c, i, true);
        zzhjcVar.c(wa3.d, i, false);
        int i2 = jb3.f;
        if (!dn0.N(i2)) {
            zg1.m("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhkgVar.c(ac3.a);
        zzhkgVar.d(ac3.b);
        zzhkgVar.a(ac3.c);
        zzhkgVar.b(ac3.d);
        zzhkgVar.a(ac3.e);
        zzhkgVar.b(ac3.f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", cb3.h);
        BigInteger bigInteger = gb3.e;
        db3 db3Var = new db3();
        db3Var.c = eb3.b;
        db3Var.a(3072);
        BigInteger bigInteger2 = gb3.e;
        db3Var.b = bigInteger2;
        fb3 fb3Var = fb3.e;
        db3Var.d = fb3Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", db3Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", cb3.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", cb3.j);
        db3 db3Var2 = new db3();
        db3Var2.c = eb3.d;
        db3Var2.a(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
        db3Var2.b = bigInteger2;
        db3Var2.d = fb3Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", db3Var2.b());
        i73Var.b(map2);
        j73Var.a(jb3.a);
        j73Var.a(jb3.b);
        zzhjxVar.a(jb3.e, gb3.class);
        zzhjcVar.c(jb3.c, i2, true);
        zzhjcVar.c(jb3.d, i2, false);
        int i3 = qb3.f;
        if (!dn0.N(i3)) {
            zg1.m("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhkgVar.c(cc3.a);
        zzhkgVar.d(cc3.b);
        zzhkgVar.a(cc3.c);
        zzhkgVar.b(cc3.d);
        zzhkgVar.a(cc3.e);
        zzhkgVar.b(cc3.f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = nb3.g;
        kb3 kb3Var = new kb3();
        lb3 lb3Var = lb3.b;
        kb3Var.c = lb3Var;
        kb3Var.d = lb3Var;
        kb3Var.b(32);
        kb3Var.a(3072);
        BigInteger bigInteger4 = nb3.g;
        kb3Var.b = bigInteger4;
        mb3 mb3Var = mb3.b;
        kb3Var.f = mb3Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", kb3Var.c());
        kb3 kb3Var2 = new kb3();
        kb3Var2.c = lb3Var;
        kb3Var2.d = lb3Var;
        kb3Var2.b(32);
        kb3Var2.a(3072);
        kb3Var2.b = bigInteger4;
        mb3 mb3Var2 = mb3.e;
        kb3Var2.f = mb3Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", kb3Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", cb3.k);
        kb3 kb3Var3 = new kb3();
        lb3 lb3Var2 = lb3.d;
        kb3Var3.c = lb3Var2;
        kb3Var3.d = lb3Var2;
        kb3Var3.b(64);
        kb3Var3.a(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
        kb3Var3.b = bigInteger4;
        kb3Var3.f = mb3Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", kb3Var3.c());
        kb3 kb3Var4 = new kb3();
        kb3Var4.c = lb3Var2;
        kb3Var4.d = lb3Var2;
        kb3Var4.b(64);
        kb3Var4.a(AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
        kb3Var4.b = bigInteger4;
        kb3Var4.f = mb3Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", kb3Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", cb3.l);
        i73Var.b(DesugarCollections.unmodifiableMap(map3));
        j73Var.a(qb3.a);
        j73Var.a(qb3.b);
        zzhjxVar.a(qb3.e, nb3.class);
        zzhjcVar.c(qb3.c, i3, true);
        zzhjcVar.c(qb3.d, i3, false);
        if (q63.a()) {
            return;
        }
        p73 p73Var = ab3.a;
        if (!dn0.N(1)) {
            zg1.m("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(wb3.a);
        zzhkgVar.d(wb3.b);
        zzhkgVar.a(wb3.c);
        zzhkgVar.b(wb3.d);
        zzhkgVar.a(wb3.e);
        zzhkgVar.b(wb3.f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new ya3(xa3.b));
        xa3 xa3Var = xa3.e;
        map4.put("ED25519_RAW", new ya3(xa3Var));
        map4.put("ED25519WithRawOutput", new ya3(xa3Var));
        i73Var.b(DesugarCollections.unmodifiableMap(map4));
        zzhjxVar.a(ab3.f, ya3.class);
        zzhjz.b.a(ab3.e, ya3.class);
        j73Var.a(ab3.a);
        j73Var.a(ab3.b);
        zzhjcVar.a(ab3.c, true);
        zzhjcVar.a(ab3.d, false);
    }
}
