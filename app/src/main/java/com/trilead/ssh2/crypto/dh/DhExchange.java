package com.trilead.ssh2.crypto.dh;

import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import com.trilead.ssh2.log.Logger;
import defpackage.hz;
import defpackage.u7;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DhExchange {
    BigInteger e;
    BigInteger f;
    private final String hashAlgorithm;
    BigInteger k;
    BigInteger p;
    BigInteger x;
    private static final Logger log = Logger.getLogger(DhExchange.class);
    static final BigInteger p1 = new BigInteger("179769313486231590770839156793787453197860296048756011706444423684197180216158519368947833795864925541502180565485980503646440548199239100050792877003355816639229553136239076508735759914822574862575007425302077447712589550957937778424442426617334727629299387668709205606050270810842907692932019128194467627007");
    static final BigInteger p14 = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
    static final BigInteger g = new BigInteger("2");

    @Deprecated
    public DhExchange() {
        this("SHA1");
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws UnsupportedEncodingException {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgorithm());
        Logger logger = log;
        if (logger.isEnabled()) {
            logger.log(90, "Client: '" + new String(bArr, "ISO-8859-1") + "'");
            logger.log(90, "Server: '" + new String(bArr2, "ISO-8859-1") + "'");
        }
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
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
        u7.p("DhDsaExchange not initialized!");
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

    public void init(int i, SecureRandom secureRandom) {
        this.k = null;
        if (i == 1) {
            this.p = p1;
        } else {
            if (i != 14) {
                u7.r(hz.o(i, "Unknown DH group "));
                return;
            }
            this.p = p14;
        }
        BigInteger bigInteger = new BigInteger(this.p.bitLength() - 1, secureRandom);
        this.x = bigInteger;
        this.e = g.modPow(bigInteger, this.p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.e == null) {
            u7.p("DhDsaExchange not initialized!");
        } else if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.p.compareTo(bigInteger) <= 0) {
            u7.r("Invalid f specified!");
        } else {
            this.f = bigInteger;
            this.k = bigInteger.modPow(this.x, this.p);
        }
    }

    public DhExchange(String str) {
        this.hashAlgorithm = str;
    }
}
