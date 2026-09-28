package com.trilead.ssh2.crypto;

import defpackage.hz;
import defpackage.p60;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SimpleDERReader {
    byte[] buffer;
    int count;
    int pos;

    public SimpleDERReader(byte[] bArr) {
        resetInput(bArr);
    }

    private byte readByte() throws IOException {
        int i = this.count;
        if (i <= 0) {
            p60.f("DER byte array: out of data");
            return (byte) 0;
        }
        this.count = i - 1;
        byte[] bArr = this.buffer;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return bArr[i2];
    }

    private byte[] readBytes(int i) throws IOException {
        if (i > this.count) {
            p60.f("DER byte array: out of data");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, this.pos, bArr, 0, i);
        this.pos += i;
        this.count -= i;
        return bArr;
    }

    private int readLength() throws IOException {
        byte b = readByte();
        int i = b & 255;
        if ((b & 128) == 0) {
            return i;
        }
        int i2 = b & 127;
        if (i2 == 0 || i2 > 4) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 8) | (readByte() & 255);
            i2--;
        }
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    public int available() {
        return this.count;
    }

    public int ignoreNextObject() throws IOException {
        int i = readByte() & 255;
        int length = readLength();
        if (length < 0 || length > available()) {
            p60.f(hz.p(length, "Illegal len in DER object (", ")"));
            return 0;
        }
        readBytes(length);
        return i;
    }

    public SimpleDERReader readConstructed() throws IOException {
        int length = readLength();
        if (length < 0 || length > available()) {
            p60.f(hz.p(length, "Illegal length in DER object (", ")"));
            return null;
        }
        SimpleDERReader simpleDERReader = new SimpleDERReader(this.buffer, this.pos, length);
        this.pos += length;
        this.count -= length;
        return simpleDERReader;
    }

    public int readConstructedType() throws IOException {
        byte b = readByte();
        int i = b & 255;
        if ((b & 32) == 32) {
            return b & 31;
        }
        p60.f(hz.o(i, "Expected constructed type, but was "));
        return 0;
    }

    public BigInteger readInt() throws IOException {
        int i = readByte() & 255;
        if (i != 2) {
            p60.f(hz.o(i, "Expected DER Integer, but found type "));
            return null;
        }
        int length = readLength();
        if (length >= 0 && length <= available()) {
            return new BigInteger(1, readBytes(length));
        }
        p60.f(hz.p(length, "Illegal len in DER object (", ")"));
        return null;
    }

    public byte[] readOctetString() throws IOException {
        int i = readByte() & 255;
        if (i != 4 && i != 3) {
            p60.f(hz.o(i, "Expected DER Octetstring, but found type "));
            return null;
        }
        int length = readLength();
        if (length >= 0 && length <= available()) {
            return readBytes(length);
        }
        p60.f(hz.p(length, "Illegal len in DER object (", ")"));
        return null;
    }

    public String readOid() throws IOException {
        int i = readByte() & 255;
        if (i != 6) {
            p60.f(hz.o(i, "Expected DER OID, but found type "));
            return null;
        }
        int length = readLength();
        if (length < 1 || length > available()) {
            p60.f(hz.p(length, "Illegal len in DER object (", ")"));
            return null;
        }
        byte[] bytes = readBytes(length);
        StringBuilder sb = new StringBuilder(64);
        int i2 = bytes[0] / 40;
        if (i2 == 0) {
            sb.append('0');
        } else if (i2 != 1) {
            sb.append('2');
            bytes[0] = (byte) (bytes[0] - 80);
        } else {
            sb.append('1');
            bytes[0] = (byte) (bytes[0] - 40);
        }
        long j = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte b = bytes[i3];
            j = (j << 7) + ((long) (b & 127));
            if ((b & 128) == 0) {
                sb.append('.');
                sb.append(j);
                j = 0;
            }
        }
        return sb.toString();
    }

    public byte[] readSequenceAsByteArray() throws IOException {
        int i = readByte() & 255;
        if (i != 48) {
            p60.f(hz.o(i, "Expected DER Sequence, but found type "));
            return null;
        }
        int length = readLength();
        if (length >= 0 && length <= available()) {
            return readBytes(length);
        }
        p60.f(hz.p(length, "Illegal len in DER object (", ")"));
        return null;
    }

    public void resetInput(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.pos = i;
        this.count = i2;
    }

    public SimpleDERReader(byte[] bArr, int i, int i2) {
        resetInput(bArr, i, i2);
    }

    public void resetInput(byte[] bArr) {
        resetInput(bArr, 0, bArr.length);
    }
}
