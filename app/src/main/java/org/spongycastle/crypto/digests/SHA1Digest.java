package org.spongycastle.crypto.digests;

import defpackage.vh;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    private int g(int i, int i2, int i3) {
        return ((i2 | i3) & i) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.X[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iB = this.H1;
        int iB2 = this.H2;
        int i3 = this.H3;
        int i4 = this.H4;
        int i5 = this.H5;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iB3 = vh.b(((iB << 5) | (iB >>> 27)) + f(iB2, i3, i4), this.X[i6], Y1, i5);
            int i8 = (iB2 >>> 2) | (iB2 << 30);
            int iB4 = vh.b(((iB3 << 5) | (iB3 >>> 27)) + f(iB, i8, i3), this.X[i6 + 1], Y1, i4);
            int i9 = (iB >>> 2) | (iB << 30);
            int iB5 = vh.b(((iB4 << 5) | (iB4 >>> 27)) + f(iB3, i9, i8), this.X[i6 + 2], Y1, i3);
            i5 = (iB3 >>> 2) | (iB3 << 30);
            int i10 = i6 + 4;
            iB2 = vh.b(((iB5 << 5) | (iB5 >>> 27)) + f(iB4, i5, i9), this.X[i6 + 3], Y1, i8);
            i4 = (iB4 >>> 2) | (iB4 << 30);
            i6 += 5;
            iB = vh.b(((iB2 << 5) | (iB2 >>> 27)) + f(iB5, i4, i5), this.X[i10], Y1, i9);
            i3 = (iB5 >>> 2) | (iB5 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iB6 = vh.b(((iB << 5) | (iB >>> 27)) + h(iB2, i3, i4), this.X[i6], Y2, i5);
            int i12 = (iB2 >>> 2) | (iB2 << 30);
            int iB7 = vh.b(((iB6 << 5) | (iB6 >>> 27)) + h(iB, i12, i3), this.X[i6 + 1], Y2, i4);
            int i13 = (iB >>> 2) | (iB << 30);
            int iB8 = vh.b(((iB7 << 5) | (iB7 >>> 27)) + h(iB6, i13, i12), this.X[i6 + 2], Y2, i3);
            i5 = (iB6 >>> 2) | (iB6 << 30);
            int i14 = i6 + 4;
            iB2 = vh.b(((iB8 << 5) | (iB8 >>> 27)) + h(iB7, i5, i13), this.X[i6 + 3], Y2, i12);
            i4 = (iB7 >>> 2) | (iB7 << 30);
            i6 += 5;
            iB = vh.b(((iB2 << 5) | (iB2 >>> 27)) + h(iB8, i4, i5), this.X[i14], Y2, i13);
            i3 = (iB8 >>> 2) | (iB8 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iB9 = vh.b(((iB << 5) | (iB >>> 27)) + g(iB2, i3, i4), this.X[i6], Y3, i5);
            int i16 = (iB2 >>> 2) | (iB2 << 30);
            int iB10 = vh.b(((iB9 << 5) | (iB9 >>> 27)) + g(iB, i16, i3), this.X[i6 + 1], Y3, i4);
            int i17 = (iB >>> 2) | (iB << 30);
            int iB11 = vh.b(((iB10 << 5) | (iB10 >>> 27)) + g(iB9, i17, i16), this.X[i6 + 2], Y3, i3);
            i5 = (iB9 >>> 2) | (iB9 << 30);
            int i18 = i6 + 4;
            iB2 = vh.b(((iB11 << 5) | (iB11 >>> 27)) + g(iB10, i5, i17), this.X[i6 + 3], Y3, i16);
            i4 = (iB10 >>> 2) | (iB10 << 30);
            i6 += 5;
            iB = vh.b(((iB2 << 5) | (iB2 >>> 27)) + g(iB11, i4, i5), this.X[i18], Y3, i17);
            i3 = (iB11 >>> 2) | (iB11 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iB12 = vh.b(((iB << 5) | (iB >>> 27)) + h(iB2, i3, i4), this.X[i6], Y4, i5);
            int i20 = (iB2 >>> 2) | (iB2 << 30);
            int iB13 = vh.b(((iB12 << 5) | (iB12 >>> 27)) + h(iB, i20, i3), this.X[i6 + 1], Y4, i4);
            int i21 = (iB >>> 2) | (iB << 30);
            int iB14 = vh.b(((iB13 << 5) | (iB13 >>> 27)) + h(iB12, i21, i20), this.X[i6 + 2], Y4, i3);
            i5 = (iB12 >>> 2) | (iB12 << 30);
            int i22 = i6 + 4;
            iB2 = vh.b(((iB14 << 5) | (iB14 >>> 27)) + h(iB13, i5, i21), this.X[i6 + 3], Y4, i20);
            i4 = (iB13 >>> 2) | (iB13 << 30);
            i6 += 5;
            iB = vh.b(((iB2 << 5) | (iB2 >>> 27)) + h(iB14, i4, i5), this.X[i22], Y4, i21);
            i3 = (iB14 >>> 2) | (iB14 << 30);
        }
        this.H1 += iB;
        this.H2 += iB2;
        this.H3 += i3;
        this.H4 += i4;
        this.H5 += i5;
        this.xOff = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.X[i23] = 0;
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.X;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 == 16) {
            processBlock();
        }
    }

    @Override // org.spongycastle.crypto.digests.GeneralDigest, org.spongycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        copyIn(sHA1Digest);
    }

    public SHA1Digest() {
        this.X = new int[80];
        reset();
    }
}
