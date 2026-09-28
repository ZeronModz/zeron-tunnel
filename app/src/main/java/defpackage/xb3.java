package defpackage;

import com.google.android.gms.internal.ads.zzhbr;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 implements zzhbr {
    public static final byte[] b = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};
    public final /* synthetic */ int a;

    public /* synthetic */ xb3(int i) {
        this.a = i;
    }

    public static xb3 a(za3 za3Var) throws GeneralSecurityException {
        Provider providerR = if3.R();
        if (providerR == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        ic3 ic3Var = za3Var.b;
        bb3 bb3Var = za3Var.a;
        byte[] bArrB = ((hc3) ic3Var.b).b();
        bb3Var.c.b();
        xa3 xa3Var = bb3Var.a.a;
        xb3 xb3Var = new xb3(0);
        if (!dn0.N(1)) {
            zg1.m("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        if (bArrB.length == 32) {
            KeyFactory.getInstance("Ed25519", providerR).generatePrivate(new PKCS8EncodedKeySpec(kf2.G(b, bArrB)));
            return xb3Var;
        }
        u7.r("Given private key's length is not 32");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xb3 b(defpackage.ob3 r13) throws java.security.GeneralSecurityException {
        /*
            int r0 = defpackage.z73.a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L1d
            r0 = r3
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r1 = 23
            if (r0 > r1) goto L2d
            r0 = r3
            goto L31
        L2d:
            java.security.Provider r0 = defpackage.if3.R()
        L31:
            if (r0 == 0) goto La8
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r1, r0)
            pb3 r1 = r13.a
            nb3 r2 = r1.a
            java.security.spec.RSAPrivateCrtKeySpec r4 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r5 = r1.b
            java.math.BigInteger r6 = r2.b
            ci2 r7 = r13.b
            java.lang.Object r7 = r7.b
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            ci2 r8 = r13.c
            java.lang.Object r8 = r8.b
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            ci2 r9 = r13.d
            java.lang.Object r9 = r9.b
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            ci2 r10 = r13.e
            java.lang.Object r10 = r10.b
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            ci2 r11 = r13.f
            java.lang.Object r11 = r11.b
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            ci2 r13 = r13.g
            java.lang.Object r13 = r13.b
            r12 = r13
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.security.PrivateKey r13 = r0.generatePrivate(r4)
            java.security.interfaces.RSAPrivateCrtKey r13 = (java.security.interfaces.RSAPrivateCrtKey) r13
            xb3 r0 = new xb3
            lb3 r4 = r2.d
            lb3 r5 = r2.e
            int r2 = r2.f
            hc3 r1 = r1.c
            r1.b()
            r1 = 3
            r0.<init>(r1)
            r1 = 2
            boolean r1 = defpackage.dn0.N(r1)
            if (r1 == 0) goto La2
            java.math.BigInteger r1 = r13.getModulus()
            int r1 = r1.bitLength()
            defpackage.n8.d0(r1)
            java.math.BigInteger r13 = r13.getPublicExponent()
            defpackage.n8.l0(r13)
            defpackage.dc3.a(r4)
            defpackage.dc3.b(r4, r5, r2)
            return r0
        La2:
            java.lang.String r13 = "Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            defpackage.zg1.m(r13)
            return r3
        La8:
            java.security.NoSuchProviderException r13 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb3.b(ob3):xb3");
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            default:
                throw null;
        }
    }
}
