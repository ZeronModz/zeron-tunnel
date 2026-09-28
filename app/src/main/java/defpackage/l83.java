package defpackage;

import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.u7;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjx;
import com.google.android.gms.internal.ads.zzhjz;
import com.google.android.gms.internal.ads.zzhkg;
import java.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l83 {
    static {
        int i = h9.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        u7 u7Var = u7.a;
        j73 j73Var = j73.b;
        j73Var.b(u7.a);
        j73Var.a(u7.b);
        j73Var.b(e83.a);
        int i = h83.f;
        if (!dn0.N(i)) {
            zg1.m("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        ne2 ne2Var = q83.a;
        zzhkg zzhkgVar = zzhkg.b;
        zzhkgVar.c(q83.c);
        zzhkgVar.d(q83.d);
        zzhkgVar.a(q83.e);
        zzhkgVar.b(q83.f);
        j73Var.a(h83.a);
        j73Var.a(h83.b);
        i73 i73Var = i73.b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", n83.a);
        t61 t61Var = new t61(22);
        t61Var.m(32);
        t61Var.q(16);
        j83 j83Var = j83.e;
        t61Var.e = j83Var;
        i83 i83Var = i83.d;
        t61Var.d = i83Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", t61Var.w());
        t61 t61Var2 = new t61(22);
        t61Var2.m(32);
        t61Var2.q(32);
        j83 j83Var2 = j83.b;
        t61Var2.e = j83Var2;
        t61Var2.d = i83Var;
        map.put("HMAC_SHA256_256BITTAG", t61Var2.w());
        t61 t61Var3 = new t61(22);
        t61Var3.m(32);
        t61Var3.q(32);
        t61Var3.e = j83Var;
        t61Var3.d = i83Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", t61Var3.w());
        t61 t61Var4 = new t61(22);
        t61Var4.m(64);
        t61Var4.q(16);
        t61Var4.e = j83Var2;
        i83 i83Var2 = i83.f;
        t61Var4.d = i83Var2;
        map.put("HMAC_SHA512_128BITTAG", t61Var4.w());
        t61 t61Var5 = new t61(22);
        t61Var5.m(64);
        t61Var5.q(16);
        t61Var5.e = j83Var;
        t61Var5.d = i83Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", t61Var5.w());
        t61 t61Var6 = new t61(22);
        t61Var6.m(64);
        t61Var6.q(32);
        t61Var6.e = j83Var2;
        t61Var6.d = i83Var2;
        map.put("HMAC_SHA512_256BITTAG", t61Var6.w());
        t61 t61Var7 = new t61(22);
        t61Var7.m(64);
        t61Var7.q(32);
        t61Var7.e = j83Var;
        t61Var7.d = i83Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", t61Var7.w());
        map.put("HMAC_SHA512_512BITTAG", n83.b);
        t61 t61Var8 = new t61(22);
        t61Var8.m(64);
        t61Var8.q(64);
        t61Var8.e = j83Var;
        t61Var8.d = i83Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", t61Var8.w());
        i73Var.b(DesugarCollections.unmodifiableMap(map));
        zzhjx zzhjxVar = zzhjx.b;
        zzhjxVar.a(h83.e, k83.class);
        zzhjz.b.a(h83.d, k83.class);
        zzhjc zzhjcVar = zzhjc.d;
        zzhjcVar.c(h83.c, i, true);
        if (q63.a()) {
            return;
        }
        p73 p73Var = b83.a;
        if (!dn0.N(1)) {
            zg1.m("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        zzhkgVar.c(o83.a);
        zzhkgVar.d(o83.b);
        zzhkgVar.a(o83.c);
        zzhkgVar.b(o83.d);
        zzhjxVar.a(n43.l, c83.class);
        j73Var.a(b83.a);
        j73Var.a(b83.b);
        HashMap map2 = new HashMap();
        c83 c83Var = n83.c;
        map2.put("AES_CMAC", c83Var);
        map2.put("AES256_CMAC", c83Var);
        wp2 wp2Var = new wp2(8);
        wp2Var.a(32);
        wp2Var.c(16);
        wp2Var.d = e43.q;
        map2.put("AES256_CMAC_RAW", wp2Var.j());
        i73Var.b(DesugarCollections.unmodifiableMap(map2));
        zzhjcVar.a(b83.c, true);
    }
}
