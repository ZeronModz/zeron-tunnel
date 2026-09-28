package com.trilead.ssh2.signature;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class RSAPrivateKey {
    private BigInteger d;
    private BigInteger e;
    private BigInteger n;

    public RSAPrivateKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.d = bigInteger;
        this.e = bigInteger2;
        this.n = bigInteger3;
    }

    public BigInteger getD() {
        return this.d;
    }

    public BigInteger getE() {
        return this.e;
    }

    public BigInteger getN() {
        return this.n;
    }

    public RSAPublicKey getPublicKey() {
        return new RSAPublicKey(this.e, this.n);
    }

    public KeyPair toJCEKeyPair() throws GeneralSecurityException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return new KeyPair(keyFactory.generatePublic(new RSAPublicKeySpec(getN(), getE())), keyFactory.generatePrivate(new RSAPrivateKeySpec(getN(), getD())));
    }
}
