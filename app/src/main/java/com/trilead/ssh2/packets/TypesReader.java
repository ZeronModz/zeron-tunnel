package com.trilead.ssh2.packets;

import com.trilead.ssh2.util.Tokenizer;
import defpackage.p60;
import defpackage.u7;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TypesReader {
    byte[] arr;
    int max;
    int pos;

    public TypesReader(byte[] bArr, int i, int i2) {
        this.arr = bArr;
        this.pos = i;
        int i3 = i2 + i;
        this.max = i3;
        if (i < 0 || i > bArr.length) {
            u7.r("Illegal offset.");
            throw null;
        }
        if (i3 < 0 || i3 > bArr.length) {
            u7.r("Illegal length.");
            throw null;
        }
    }

    public boolean readBoolean() throws IOException {
        int i = this.pos;
        if (i >= this.max) {
            p60.f("Packet too short.");
            return false;
        }
        byte[] bArr = this.arr;
        this.pos = i + 1;
        return bArr[i] != 0;
    }

    public int readByte() throws IOException {
        int i = this.pos;
        if (i >= this.max) {
            p60.f("Packet too short.");
            return 0;
        }
        byte[] bArr = this.arr;
        this.pos = i + 1;
        return bArr[i] & 255;
    }

    public byte[] readByteString() throws IOException {
        int uint32 = readUINT32();
        int i = this.pos;
        if (uint32 + i > this.max) {
            p60.f("Malformed SSH byte string.");
            return null;
        }
        byte[] bArr = new byte[uint32];
        System.arraycopy(this.arr, i, bArr, 0, uint32);
        this.pos += uint32;
        return bArr;
    }

    public byte[] readBytes(int i) throws IOException {
        int i2 = this.pos;
        if (i2 + i > this.max) {
            p60.f("Packet too short.");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.arr, i2, bArr, 0, i);
        this.pos += i;
        return bArr;
    }

    public BigInteger readMPINT() throws IOException {
        byte[] byteString = readByteString();
        return byteString.length == 0 ? BigInteger.ZERO : new BigInteger(byteString);
    }

    public String[] readNameList() throws IOException {
        return Tokenizer.parseTokens(readString(), ',');
    }

    public String readString(String str) throws IOException {
        int uint32 = readUINT32();
        int i = this.pos;
        if (uint32 + i > this.max) {
            p60.f("Malformed SSH string.");
            return null;
        }
        byte[] bArr = this.arr;
        String str2 = str == null ? new String(bArr, i, uint32) : new String(bArr, i, uint32, str);
        this.pos += uint32;
        return str2;
    }

    public int readUINT32() throws IOException {
        int i = this.pos;
        if (i + 4 > this.max) {
            p60.f("Packet too short.");
            return 0;
        }
        byte[] bArr = this.arr;
        int i2 = i + 1;
        this.pos = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.pos = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.pos = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.pos = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public long readUINT64() throws IOException {
        int i = this.pos;
        if (i + 8 > this.max) {
            p60.f("Packet too short.");
            return 0L;
        }
        byte[] bArr = this.arr;
        int i2 = i + 1;
        this.pos = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.pos = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.pos = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i + 4;
        this.pos = i8;
        long j = i7 | (bArr[i6] & 255);
        int i9 = i + 5;
        this.pos = i9;
        int i10 = (bArr[i8] & 255) << 24;
        int i11 = i + 6;
        this.pos = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        int i13 = i + 7;
        this.pos = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.pos = i + 8;
        return (((long) ((bArr[i13] & 255) | i14)) & 4294967295L) | (j << 32);
    }

    public int remain() {
        return this.max - this.pos;
    }

    public void readBytes(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.pos;
        if (i3 + i2 <= this.max) {
            System.arraycopy(this.arr, i3, bArr, i, i2);
            this.pos += i2;
        } else {
            p60.f("Packet too short.");
        }
    }

    public TypesReader(byte[] bArr, int i) {
        this.max = 0;
        this.arr = bArr;
        this.pos = i;
        this.max = bArr.length;
        if (i < 0 || i > bArr.length) {
            u7.r("Illegal offset.");
            throw null;
        }
    }

    public TypesReader(byte[] bArr) {
        this.max = 0;
        this.arr = bArr;
        this.pos = 0;
        this.max = bArr.length;
    }

    public String readString() throws IOException {
        int uint32 = readUINT32();
        int i = this.pos;
        if (uint32 + i <= this.max) {
            String str = new String(this.arr, i, uint32, "ISO-8859-1");
            this.pos += uint32;
            return str;
        }
        p60.f("Malformed SSH string.");
        return null;
    }
}
