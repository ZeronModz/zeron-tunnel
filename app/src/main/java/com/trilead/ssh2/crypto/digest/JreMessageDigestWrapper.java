package com.trilead.ssh2.crypto.digest;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class JreMessageDigestWrapper implements Digest {
    private final MessageDigest digest;

    public JreMessageDigestWrapper(MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void digest(byte[] bArr) {
        System.arraycopy(this.digest.digest(), 0, bArr, 0, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public int getDigestLength() {
        return this.digest.getDigestLength();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void reset() {
        this.digest.reset();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte[] bArr) {
        this.digest.update(bArr);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void digest(byte[] bArr, int i) {
        System.arraycopy(this.digest.digest(), 0, bArr, i, bArr.length);
    }
}
