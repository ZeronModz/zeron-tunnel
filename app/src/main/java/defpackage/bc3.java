package defpackage;

import com.google.android.gms.internal.ads.zzhbs;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bc3 implements zzhbs {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public bc3(RSAPublicKey rSAPublicKey, eb3 eb3Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!dn0.N(2)) {
            zg1.m("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        n8.d0(rSAPublicKey.getModulus().bitLength());
        n8.l0(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = a(eb3Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = provider;
    }

    public static String a(eb3 eb3Var) throws GeneralSecurityException {
        if (eb3Var == eb3.b) {
            return "SHA256withRSA";
        }
        if (eb3Var == eb3.c) {
            return "SHA384withRSA";
        }
        if (eb3Var == eb3.d) {
            return "SHA512withRSA";
        }
        zg1.m("unknown hash type");
        return null;
    }

    public static bc3 b(ib3 ib3Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = ib3Var.b;
        gb3 gb3Var = ib3Var.a;
        return new bc3((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, gb3Var.b)), gb3Var.d, ib3Var.c.b(), gb3Var.c.equals(fb3.d) ? g : f, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.c;
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        zg1.m("Invalid signature");
    }
}
