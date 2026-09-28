package io.ktor.util;

import defpackage.qj1;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/Sha1;", "Lio/ktor/util/HashFunction;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Sha1 implements HashFunction {
    public long a;
    public int c;
    public final byte[] b = new byte[64];
    public final int[] d = new int[80];
    public int e = 1732584193;
    public int f = -271733879;
    public int g = -1732584194;
    public int h = 271733878;
    public int i = -1009589776;

    public final void a(int i, byte[] bArr) {
        int i2;
        int[] iArr;
        int iW;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            iArr = this.d;
            if (i5 >= 16) {
                break;
            }
            int i6 = i + 3;
            int i7 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
            i += 4;
            iArr[i5] = i7 | (bArr[i6] & 255);
            i5++;
        }
        for (i2 = 16; i2 < 80; i2++) {
            iArr[i2] = qj1.w(((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16], 1);
        }
        int i8 = this.e;
        int i9 = this.f;
        int iW2 = this.g;
        int i10 = this.h;
        int i11 = this.i;
        while (i4 < 80) {
            if (i4 < 20) {
                iW = qj1.w(i8, 5) + (((iW2 ^ i10) & i9) ^ i10) + i11 + 1518500249;
                i3 = iArr[i4];
            } else if (i4 < 40) {
                iW = qj1.w(i8, 5) + ((i9 ^ iW2) ^ i10) + i11 + 1859775393;
                i3 = iArr[i4];
            } else if (i4 < 60) {
                iW = ((qj1.w(i8, 5) + (((iW2 | i10) & i9) | (iW2 & i10))) + i11) - 1894007588;
                i3 = iArr[i4];
            } else {
                iW = ((qj1.w(i8, 5) + ((i9 ^ iW2) ^ i10)) + i11) - 899497514;
                i3 = iArr[i4];
            }
            int i12 = iW + i3;
            i4++;
            i11 = i10;
            i10 = iW2;
            iW2 = qj1.w(i9, 30);
            i9 = i8;
            i8 = i12;
        }
        this.e += i8;
        this.f += i9;
        this.g += iW2;
        this.h += i10;
        this.i += i11;
    }

    @Override // io.ktor.util.HashFunction
    public final byte[] digest() {
        int i = this.c;
        long j = this.a * 8;
        int i2 = i + 1;
        byte[] bArr = this.b;
        bArr[i] = -128;
        if (i2 > 56) {
            Arrays.fill(bArr, i2, 64, (byte) 0);
            a(0, bArr);
            Arrays.fill(bArr, 0, i2, (byte) 0);
        } else {
            Arrays.fill(bArr, i2, 56, (byte) 0);
        }
        bArr[56] = (byte) (j >>> 56);
        bArr[57] = (byte) (j >>> 48);
        bArr[58] = (byte) (j >>> 40);
        bArr[59] = (byte) (j >>> 32);
        bArr[60] = (byte) (j >>> 24);
        bArr[61] = (byte) (j >>> 16);
        bArr[62] = (byte) (j >>> 8);
        bArr[63] = (byte) j;
        a(0, bArr);
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int i6 = this.h;
        int i7 = this.i;
        this.a = 0L;
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        this.c = 0;
        int[] iArr = this.d;
        Arrays.fill(iArr, 0, iArr.length, 0);
        this.e = 1732584193;
        this.f = -271733879;
        this.g = -1732584194;
        this.h = 271733878;
        this.i = -1009589776;
        return new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3, (byte) (i4 >> 24), (byte) (i4 >> 16), (byte) (i4 >> 8), (byte) i4, (byte) (i5 >> 24), (byte) (i5 >> 16), (byte) (i5 >> 8), (byte) i5, (byte) (i6 >> 24), (byte) (i6 >> 16), (byte) (i6 >> 8), (byte) i6, (byte) (i7 >> 24), (byte) (i7 >> 16), (byte) (i7 >> 8), (byte) i7};
    }

    @Override // io.ktor.util.HashFunction
    public final void update(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a += (long) i2;
        int i3 = i + i2;
        int i4 = this.c;
        byte[] bArr2 = this.b;
        if (i4 > 0) {
            int i5 = i2 + i4;
            if (i5 < 64) {
                kotlin.collections.b.f(i4, i, i3, bArr, bArr2);
                this.c = i5;
                return;
            } else {
                int i6 = (64 - i4) + i;
                kotlin.collections.b.f(i4, i, i6, bArr, bArr2);
                a(0, bArr2);
                this.c = 0;
                i = i6;
            }
        }
        while (i < i3) {
            int i7 = i + 64;
            if (i7 > i3) {
                kotlin.collections.b.f(0, i, i3, bArr, bArr2);
                this.c = i3 - i;
                return;
            } else {
                a(i, bArr);
                i = i7;
            }
        }
    }
}
