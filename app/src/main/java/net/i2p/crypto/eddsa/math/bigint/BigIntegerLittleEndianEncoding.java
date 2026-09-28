package net.i2p.crypto.eddsa.math.bigint;

import defpackage.u7;
import java.io.Serializable;
import java.math.BigInteger;
import net.i2p.crypto.eddsa.math.Encoding;
import net.i2p.crypto.eddsa.math.Field;
import net.i2p.crypto.eddsa.math.FieldElement;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BigIntegerLittleEndianEncoding extends Encoding implements Serializable {
    private static final long serialVersionUID = 3984579843759837L;
    private BigInteger mask;

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public FieldElement decode(byte[] bArr) {
        Field field = this.f;
        if (field == null) {
            u7.p("field not set");
            return null;
        }
        if (bArr.length == field.getb() / 8) {
            return new BigIntegerFieldElement(this.f, toBigInteger(bArr).and(this.mask));
        }
        u7.r("Not a valid encoding");
        return null;
    }

    public byte[] encode(BigInteger bigInteger) {
        if (this.f == null) {
            u7.p("field not set");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int bVar = this.f.getb() / 8;
        byte[] bArr = new byte[bVar];
        for (int i = 0; i < byteArray.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        for (int length = byteArray.length; length < bVar; length++) {
            bArr[length] = 0;
        }
        return bArr;
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public boolean isNegative(FieldElement fieldElement) {
        return ((BigIntegerFieldElement) fieldElement).bi.testBit(0);
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public synchronized void setField(Field field) {
        super.setField(field);
        BigInteger bigInteger = BigInteger.ONE;
        this.mask = bigInteger.shiftLeft(field.getb() - 1).subtract(bigInteger);
    }

    public BigInteger toBigInteger(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - 1) - i];
        }
        return new BigInteger(1, bArr2);
    }

    @Override // net.i2p.crypto.eddsa.math.Encoding
    public byte[] encode(FieldElement fieldElement) {
        return encode(((BigIntegerFieldElement) fieldElement).bi.and(this.mask));
    }
}
