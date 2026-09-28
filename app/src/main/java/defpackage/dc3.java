package defpackage;

import com.google.android.gms.internal.ads.zzhbs;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dc3 implements zzhbs {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public dc3(RSAPublicKey rSAPublicKey, lb3 lb3Var, lb3 lb3Var2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!dn0.N(2)) {
            zg1.m("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (!lb3Var.equals(lb3Var2)) {
            zg1.m("sigHash and mgf1Hash must be the same");
            throw null;
        }
        n8.d0(rSAPublicKey.getModulus().bitLength());
        n8.l0(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = a(lb3Var);
        this.c = b(lb3Var, lb3Var2, i);
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    public static String a(lb3 lb3Var) {
        if (lb3Var == lb3.b) {
            return "SHA256withRSA/PSS";
        }
        if (lb3Var == lb3.c) {
            return "SHA384withRSA/PSS";
        }
        if (lb3Var == lb3.d) {
            return "SHA512withRSA/PSS";
        }
        u7.r("Unsupported hash: ".concat(String.valueOf(lb3Var)));
        return null;
    }

    public static PSSParameterSpec b(lb3 lb3Var, lb3 lb3Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        lb3 lb3Var3 = lb3.d;
        lb3 lb3Var4 = lb3.c;
        lb3 lb3Var5 = lb3.b;
        if (lb3Var == lb3Var5) {
            str = "SHA-256";
        } else if (lb3Var == lb3Var4) {
            str = "SHA-384";
        } else {
            if (lb3Var != lb3Var3) {
                u7.r("Unsupported MD hash: ".concat(String.valueOf(lb3Var)));
                return null;
            }
            str = "SHA-512";
        }
        if (lb3Var2 == lb3Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (lb3Var2 == lb3Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (lb3Var2 != lb3Var3) {
                u7.r("Unsupported MGF1 hash: ".concat(String.valueOf(lb3Var2)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dc3 c(defpackage.pb3 r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            int r0 = defpackage.z73.a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r2 = 23
            if (r0 > r2) goto L2d
        L2b:
            r9 = r1
            goto L32
        L2d:
            java.security.Provider r1 = defpackage.if3.R()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.b
            nb3 r3 = r10.a
            java.math.BigInteger r4 = r3.b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            dc3 r2 = new dc3
            lb3 r4 = r3.d
            lb3 r5 = r3.e
            int r6 = r3.f
            hc3 r10 = r10.c
            byte[] r7 = r10.b()
            mb3 r10 = r3.c
            mb3 r1 = defpackage.mb3.d
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = defpackage.dc3.h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = defpackage.dc3.g
            goto L65
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L6f:
            java.security.NoSuchProviderException r10 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc3.c(pb3):dc3");
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (signature.verify(bArr, length2, length - length2)) {
            return;
        }
        zg1.m("signature verification failed");
    }
}
