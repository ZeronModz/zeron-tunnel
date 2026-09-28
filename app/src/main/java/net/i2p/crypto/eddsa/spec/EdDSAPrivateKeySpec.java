package net.i2p.crypto.eddsa.spec;

import defpackage.u7;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.GroupElement;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class EdDSAPrivateKeySpec implements KeySpec {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final GroupElement d;
    public final EdDSAParameterSpec e;

    public EdDSAPrivateKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            u7.r("seed length is wrong");
            throw null;
        }
        this.e = edDSAParameterSpec;
        this.a = bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(edDSAParameterSpec.getHashAlgorithm());
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            byte[] bArrDigest = messageDigest.digest(bArr);
            this.b = bArrDigest;
            bArrDigest[0] = (byte) (bArrDigest[0] & 248);
            int i = (bVar / 8) - 1;
            bArrDigest[i] = (byte) (bArrDigest[i] & 63);
            int i2 = (bVar / 8) - 1;
            bArrDigest[i2] = (byte) (bArrDigest[i2] | 64);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDigest, 0, bVar / 8);
            this.c = bArrCopyOfRange;
            this.d = edDSAParameterSpec.getB().scalarMultiply(bArrCopyOfRange);
        } catch (NoSuchAlgorithmException unused) {
            u7.r("Unsupported hash algorithm");
            throw null;
        }
    }

    public EdDSAPrivateKeySpec(EdDSAParameterSpec edDSAParameterSpec, byte[] bArr) {
        if (bArr.length == edDSAParameterSpec.getCurve().getField().getb() / 4) {
            this.a = null;
            this.b = bArr;
            this.e = edDSAParameterSpec;
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            bArr[0] = (byte) (bArr[0] & 248);
            int i = bVar / 8;
            int i2 = i - 1;
            byte b = (byte) (bArr[i2] & 63);
            bArr[i2] = b;
            bArr[i2] = (byte) (b | 64);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.c = bArrCopyOfRange;
            this.d = edDSAParameterSpec.getB().scalarMultiply(bArrCopyOfRange);
            return;
        }
        u7.r("hash length is wrong");
        throw null;
    }

    public EdDSAPrivateKeySpec(byte[] bArr, byte[] bArr2, byte[] bArr3, GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = groupElement;
        this.e = edDSAParameterSpec;
    }
}
