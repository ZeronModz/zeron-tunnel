package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class KeyAlgorithm<U extends PublicKey, R extends PrivateKey> {
    private final String keyFormat;
    private final Class<R> keyType;
    private final Provider provider;
    private final String signatureAlgorithm;

    public KeyAlgorithm(String str, String str2, Class<R> cls, Provider provider) {
        this.signatureAlgorithm = str;
        this.keyFormat = str2;
        this.keyType = cls;
        this.provider = provider;
    }

    public abstract U decodePublicKey(byte[] bArr) throws IOException;

    public abstract byte[] decodeSignature(byte[] bArr) throws IOException;

    public abstract byte[] encodePublicKey(U u) throws IOException;

    public abstract byte[] encodeSignature(byte[] bArr) throws IOException;

    public byte[] generateSignature(byte[] bArr, R r, SecureRandom secureRandom) throws IOException {
        try {
            Provider provider = this.provider;
            String str = this.signatureAlgorithm;
            Signature signature = provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
            signature.initSign(r, secureRandom);
            signature.update(bArr);
            return signature.sign();
        } catch (GeneralSecurityException e) {
            throw new IOException("Could not generate signature", e);
        }
    }

    public abstract List<CertificateDecoder> getCertificateDecoders();

    public String getKeyFormat() {
        return this.keyFormat;
    }

    public boolean supportsKey(PrivateKey privateKey) {
        return this.keyType.isAssignableFrom(privateKey.getClass());
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, U u) throws IOException {
        try {
            Provider provider = this.provider;
            String str = this.signatureAlgorithm;
            Signature signature = provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
            signature.initVerify(u);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (GeneralSecurityException e) {
            throw new IOException("Could not verify signature", e);
        }
    }

    public KeyAlgorithm(String str, String str2, Class<R> cls) {
        this(str, str2, cls, null);
    }
}
