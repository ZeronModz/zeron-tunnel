package defpackage;

import com.google.android.gms.internal.ads.zzhlx;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d83 implements zzhlx {
    public static d83 a(a83 a83Var, Provider provider) throws GeneralSecurityException {
        d83 d83Var = new d83();
        if (!dn0.N(1)) {
            zg1.m("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            a83Var.c.b();
            new SecretKeySpec(((hc3) a83Var.b.b).b(), "AES");
            return d83Var;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
