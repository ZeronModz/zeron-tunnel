package com.trilead.ssh2.signature;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DSASignature {
    private BigInteger r;
    private BigInteger s;

    public DSASignature(BigInteger bigInteger, BigInteger bigInteger2) {
        this.r = bigInteger;
        this.s = bigInteger2;
    }

    public BigInteger getR() {
        return this.r;
    }

    public BigInteger getS() {
        return this.s;
    }
}
