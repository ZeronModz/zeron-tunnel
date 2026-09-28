package com.trilead.ssh2.crypto.dh;

import com.trilead.ssh2.DHGexParameters;
import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import defpackage.u7;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DhGroupExchange {
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private final String hashAlgorithm;
    private BigInteger k;
    private BigInteger p;
    private BigInteger x;

    public DhGroupExchange(String str, BigInteger bigInteger, BigInteger bigInteger2) {
        this.p = bigInteger;
        this.g = bigInteger2;
        this.hashAlgorithm = str;
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, DHGexParameters dHGexParameters) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgorithm());
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
        if (dHGexParameters.getMin_group_len() > 0) {
            hashForSSH2Types.updateUINT32(dHGexParameters.getMin_group_len());
        }
        hashForSSH2Types.updateUINT32(dHGexParameters.getPref_group_len());
        if (dHGexParameters.getMax_group_len() > 0) {
            hashForSSH2Types.updateUINT32(dHGexParameters.getMax_group_len());
        }
        hashForSSH2Types.updateBigInt(this.p);
        hashForSSH2Types.updateBigInt(this.g);
        hashForSSH2Types.updateBigInt(this.e);
        hashForSSH2Types.updateBigInt(this.f);
        hashForSSH2Types.updateBigInt(this.k);
        return hashForSSH2Types.getDigest();
    }

    public BigInteger getE() {
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            return bigInteger;
        }
        u7.p("Not initialized!");
        return null;
    }

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public BigInteger getK() {
        BigInteger bigInteger = this.k;
        if (bigInteger != null) {
            return bigInteger;
        }
        u7.p("Shared secret not yet known, need f first!");
        return null;
    }

    public void init(SecureRandom secureRandom) {
        this.k = null;
        BigInteger bigInteger = new BigInteger(this.p.bitLength() - 1, secureRandom);
        this.x = bigInteger;
        this.e = this.g.modPow(bigInteger, this.p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.e == null) {
            u7.p("Not initialized!");
        } else if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.p.compareTo(bigInteger) <= 0) {
            u7.r("Invalid f specified!");
        } else {
            this.f = bigInteger;
            this.k = bigInteger.modPow(this.x, this.p);
        }
    }

    @Deprecated
    public DhGroupExchange(BigInteger bigInteger, BigInteger bigInteger2) {
        this("SHA1", bigInteger, bigInteger2);
    }
}
