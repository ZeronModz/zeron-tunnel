package defpackage;

import com.google.android.gms.internal.ads.zzhbs;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yb3 implements zzhbs {
    public static final byte[] e = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final PublicKey a;
    public final byte[] b;
    public final byte[] c;
    public final Provider d;

    public yb3(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!dn0.N(1)) {
            zg1.m("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            u7.r("Given public key's length is not 32.");
            throw null;
        }
        this.a = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(kf2.G(e, bArr)));
        this.b = bArr2;
        this.c = bArr3;
        this.d = provider;
    }

    public static yb3 a(bb3 bb3Var) throws GeneralSecurityException {
        Provider providerR = if3.R();
        if (providerR == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (dn0.N(1)) {
            return new yb3(bb3Var.b.b(), bb3Var.c.b(), bb3Var.a.a.equals(xa3.d) ? new byte[]{0} : new byte[0], providerR);
        }
        zg1.m("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            zg1.m("Invalid signature length: 64");
            return;
        }
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance("Ed25519", this.d);
        signature.initVerify(this.a);
        signature.update(bArr2);
        signature.update(this.c);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        zg1.m("Signature check failed.");
    }
}
