package com.trilead.ssh2.signature;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class RSAPublicKey {
    BigInteger e;
    BigInteger n;

    public RSAPublicKey(BigInteger bigInteger, BigInteger bigInteger2) {
        this.e = bigInteger;
        this.n = bigInteger2;
    }

    public BigInteger getE() {
        return this.e;
    }

    public BigInteger getN() {
        return this.n;
    }
}
