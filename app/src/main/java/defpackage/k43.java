package defpackage;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.p7;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjx;
import com.google.android.gms.internal.ads.zzhjz;
import com.google.android.gms.internal.ads.zzhkg;
import java.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k43 {
    static {
        int i = h9.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        p7 p7Var = p7.a;
        j73 j73Var = j73.b;
        j73Var.b(p7.a);
        j73Var.a(p7.b);
        l83.a();
        int i = p43.e;
        if (!dn0.N(i)) {
            zg1.m("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        m73 m73Var = y53.a;
        zzhkg zzhkgVar = zzhkg.b;
        zzhkgVar.c(y53.a);
        zzhkgVar.d(y53.b);
        zzhkgVar.a(y53.c);
        zzhkgVar.b(y53.d);
        j73Var.a(p43.a);
        i73 i73Var = i73.b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", r53.e);
        fq0 fq0Var = new fq0();
        fq0Var.c(16);
        fq0Var.e(32);
        fq0Var.h(16);
        fq0Var.g(16);
        q43 q43Var = q43.e;
        fq0Var.e = q43Var;
        r43 r43Var = r43.e;
        fq0Var.f = r43Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", fq0Var.i());
        map.put("AES256_CTR_HMAC_SHA256", r53.f);
        fq0 fq0Var2 = new fq0();
        fq0Var2.c(32);
        fq0Var2.e(32);
        fq0Var2.h(32);
        fq0Var2.g(16);
        fq0Var2.e = q43Var;
        fq0Var2.f = r43Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", fq0Var2.i());
        i73Var.b(DesugarCollections.unmodifiableMap(map));
        zzhjz zzhjzVar = zzhjz.b;
        zzhjzVar.a(p43.c, s43.class);
        zzhjx zzhjxVar = zzhjx.b;
        zzhjxVar.a(p43.d, s43.class);
        zzhjc zzhjcVar = zzhjc.d;
        zzhjcVar.c(p43.b, i, true);
        int i2 = y43.e;
        if (!dn0.N(i2)) {
            zg1.m("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        zzhkgVar.c(b63.a);
        zzhkgVar.d(b63.b);
        zzhkgVar.a(b63.c);
        zzhkgVar.b(b63.d);
        j73Var.a(y43.a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", r53.a);
        t61 t61Var = new t61(21);
        t61Var.p();
        t61Var.m(16);
        t61Var.s();
        q43 q43Var2 = q43.j;
        t61Var.e = q43Var2;
        map2.put("AES128_GCM_RAW", t61Var.v());
        map2.put("AES256_GCM", r53.b);
        t61 t61Var2 = new t61(21);
        t61Var2.p();
        t61Var2.m(32);
        t61Var2.s();
        t61Var2.e = q43Var2;
        map2.put("AES256_GCM_RAW", t61Var2.v());
        i73Var.b(DesugarCollections.unmodifiableMap(map2));
        zzhjzVar.a(y43.c, z43.class);
        zzhjxVar.a(y43.d, z43.class);
        zzhjcVar.c(y43.b, i2, true);
        if (q63.a()) {
            return;
        }
        p73 p73Var = v43.a;
        if (!dn0.N(1)) {
            zg1.m("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(z53.a);
        zzhkgVar.d(z53.b);
        zzhkgVar.a(z53.c);
        zzhkgVar.b(z53.d);
        j73Var.a(v43.a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", r53.c);
        t61 t61Var3 = new t61(20);
        t61Var3.q(16);
        t61Var3.m(16);
        t61Var3.s();
        e43 e43Var = e43.h;
        t61Var3.e = e43Var;
        map3.put("AES128_EAX_RAW", t61Var3.u());
        map3.put("AES256_EAX", r53.d);
        t61 t61Var4 = new t61(20);
        t61Var4.q(16);
        t61Var4.m(32);
        t61Var4.s();
        t61Var4.e = e43Var;
        map3.put("AES256_EAX_RAW", t61Var4.u());
        i73Var.b(DesugarCollections.unmodifiableMap(map3));
        zzhjxVar.a(v43.c, w43.class);
        zzhjcVar.a(v43.b, true);
        p73 p73Var2 = b53.a;
        r43 r43Var2 = r43.h;
        if (!dn0.N(1)) {
            zg1.m("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(d63.a);
        zzhkgVar.d(d63.b);
        zzhkgVar.a(d63.c);
        zzhkgVar.b(d63.d);
        HashMap map4 = new HashMap();
        r43 r43Var3 = r43.f;
        map4.put("AES128_GCM_SIV", new c53(16, r43Var3));
        map4.put("AES128_GCM_SIV_RAW", new c53(16, r43Var2));
        map4.put("AES256_GCM_SIV", new c53(32, r43Var3));
        map4.put("AES256_GCM_SIV_RAW", new c53(32, r43Var2));
        i73Var.b(DesugarCollections.unmodifiableMap(map4));
        zzhjzVar.a(o43.c, c53.class);
        zzhjxVar.a(n43.e, c53.class);
        j73Var.a(b53.a);
        zzhjcVar.a(b53.b, true);
        p73 p73Var3 = e53.a;
        if (!dn0.N(1)) {
            zg1.m("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(h63.a);
        zzhkgVar.d(h63.b);
        zzhkgVar.a(h63.c);
        zzhkgVar.b(h63.d);
        j73Var.a(e53.a);
        zzhjxVar.a(n43.f, f53.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new f53(e43.i));
        map5.put("CHACHA20_POLY1305_RAW", new f53(e43.k));
        i73Var.b(DesugarCollections.unmodifiableMap(map5));
        zzhjcVar.a(e53.b, true);
        p73 p73Var4 = g53.a;
        if (!dn0.N(1)) {
            zg1.m("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(l53.a);
        zzhkgVar.d(l53.b);
        zzhkgVar.a(l53.c);
        zzhkgVar.b(l53.d);
        j73Var.a(g53.a);
        zzhjxVar.a(g53.c, k53.class);
        zzhjcVar.a(g53.b, true);
        c73 c73Var = i53.a;
        if (!dn0.N(1)) {
            zg1.m("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(q53.a);
        zzhkgVar.d(q53.b);
        zzhkgVar.a(q53.c);
        zzhkgVar.b(q53.d);
        zzhjxVar.a(i53.b, n53.class);
        j73Var.a(i53.c);
        zzhjcVar.a(i53.a, true);
        p73 p73Var5 = w53.a;
        if (!dn0.N(1)) {
            zg1.m("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(n63.a);
        zzhkgVar.d(n63.b);
        zzhkgVar.a(n63.c);
        zzhkgVar.b(n63.d);
        j73Var.a(w53.a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new x53(r43.o));
        map6.put("XCHACHA20_POLY1305_RAW", new x53(r43.q));
        i73Var.b(DesugarCollections.unmodifiableMap(map6));
        zzhjxVar.a(w53.d, x53.class);
        zzhjzVar.a(w53.c, x53.class);
        zzhjcVar.a(w53.b, true);
        p73 p73Var6 = t53.a;
        zzhkgVar.c(l63.a);
        zzhkgVar.d(l63.b);
        zzhkgVar.a(l63.c);
        zzhkgVar.b(l63.d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", r53.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", r53.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", r53.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", r53.j);
        i73Var.b(DesugarCollections.unmodifiableMap(map7));
        j73Var.a(t53.a);
        zzhjxVar.a(n43.i, u53.class);
    }
}
