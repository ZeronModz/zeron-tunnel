package defpackage;

import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.zzhas;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m63 implements zzhas {
    public final byte[] a;
    public final byte[] b;
    public final Provider c;

    public m63(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!dn0.N(1)) {
            zg1.m("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            p60.n("The key length in bytes must be 32.");
            throw null;
        }
        this.a = bArr;
        this.b = bArr2;
        this.c = provider;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            io0.e("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            zg1.m("ciphertext too short");
            return null;
        }
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] iArrD = i63.d(i63.c(this.a), i63.c(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrD.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = r7.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
