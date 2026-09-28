package net.i2p.crypto.eddsa.math.bigint;

import java.math.BigInteger;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.ScalarOps;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BigIntegerScalarOps implements ScalarOps {
    public final BigInteger a;
    public final BigIntegerLittleEndianEncoding b;

    public BigIntegerScalarOps(Field field, BigInteger bigInteger) {
        this.a = bigInteger;
        BigIntegerLittleEndianEncoding bigIntegerLittleEndianEncoding = new BigIntegerLittleEndianEncoding();
        this.b = bigIntegerLittleEndianEncoding;
        bigIntegerLittleEndianEncoding.setField(field);
    }

    @Override // net.i2p.crypto.eddsa.math.ScalarOps
    public final byte[] multiplyAndAdd(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        BigIntegerLittleEndianEncoding bigIntegerLittleEndianEncoding = this.b;
        return bigIntegerLittleEndianEncoding.encode(bigIntegerLittleEndianEncoding.toBigInteger(bArr).multiply(bigIntegerLittleEndianEncoding.toBigInteger(bArr2)).add(bigIntegerLittleEndianEncoding.toBigInteger(bArr3)).mod(this.a));
    }

    @Override // net.i2p.crypto.eddsa.math.ScalarOps
    public final byte[] reduce(byte[] bArr) {
        BigIntegerLittleEndianEncoding bigIntegerLittleEndianEncoding = this.b;
        return bigIntegerLittleEndianEncoding.encode(bigIntegerLittleEndianEncoding.toBigInteger(bArr).mod(this.a));
    }
}
