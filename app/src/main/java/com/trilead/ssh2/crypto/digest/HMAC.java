package com.trilead.ssh2.crypto.digest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class HMAC implements Digest {
    byte[] k_xor_ipad = new byte[64];
    byte[] k_xor_opad = new byte[64];
    Digest md;
    int size;
    byte[] tmp;

    public HMAC(Digest digest, byte[] bArr, int i) {
        this.md = digest;
        this.size = i;
        this.tmp = new byte[digest.getDigestLength()];
        if (bArr.length > 64) {
            digest.reset();
            digest.update(bArr);
            digest.digest(this.tmp);
            bArr = this.tmp;
        }
        int i2 = 0;
        System.arraycopy(bArr, 0, this.k_xor_ipad, 0, bArr.length);
        System.arraycopy(bArr, 0, this.k_xor_opad, 0, bArr.length);
        while (true) {
            byte[] bArr2 = this.k_xor_ipad;
            if (i2 >= 64) {
                digest.update(bArr2);
                return;
            }
            bArr2[i2] = (byte) (bArr2[i2] ^ 54);
            byte[] bArr3 = this.k_xor_opad;
            bArr3[i2] = (byte) (bArr3[i2] ^ 92);
            i2++;
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr, int i) {
        this.md.digest(this.tmp);
        this.md.update(this.k_xor_opad);
        this.md.update(this.tmp);
        this.md.digest(this.tmp);
        System.arraycopy(this.tmp, 0, bArr, i, this.size);
        this.md.update(this.k_xor_ipad);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final int getDigestLength() {
        return this.size;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void reset() {
        this.md.reset();
        this.md.update(this.k_xor_ipad);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte b) {
        this.md.update(b);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr) {
        this.md.update(bArr);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr, int i, int i2) {
        this.md.update(bArr, i, i2);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr) {
        digest(bArr, 0);
    }
}
