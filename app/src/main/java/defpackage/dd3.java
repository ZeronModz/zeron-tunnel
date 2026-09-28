package defpackage;

import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zziau;
import com.google.android.gms.internal.ads.zzidc;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dd3 extends ed3 {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    public dd3(OutputStream outputStream, int i) {
        if (i < 0) {
            u7.r("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.c = new byte[iMax];
        this.d = iMax;
        if (outputStream != null) {
            this.f = outputStream;
        } else {
            io0.e("out");
            throw null;
        }
    }

    public final void A(int i) {
        if (this.d - this.e < i) {
            B();
        }
    }

    public final void B() {
        this.f.write(this.c, 0, this.e);
        this.e = 0;
    }

    public final void C(int i) {
        boolean z = ed3.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.e;
                if (i2 == 0) {
                    this.e = i3 + 1;
                    vd3.l(bArr, i3, (byte) i);
                    return;
                } else {
                    this.e = i3 + 1;
                    vd3.l(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.e;
                if (i4 == 0) {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void D(long j) {
        boolean z = ed3.b;
        byte[] bArr = this.c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.e;
                if (j2 == 0) {
                    this.e = i2 + 1;
                    vd3.l(bArr, i2, (byte) i);
                    return;
                } else {
                    this.e = i2 + 1;
                    vd3.l(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.e;
                if (j3 == 0) {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.e = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void E(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void F(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    public final void G(int i, int i2, byte[] bArr) throws IOException {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.e = i4;
        B();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.e = i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void a(int i, int i2, byte[] bArr) throws IOException {
        G(i, i2, bArr);
    }

    @Override // defpackage.ed3
    public final void e(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // defpackage.ed3
    public final void f(int i, int i2) {
        A(20);
        C(i << 3);
        if (i2 >= 0) {
            C(i2);
        } else {
            D(i2);
        }
    }

    @Override // defpackage.ed3
    public final void g(int i, int i2) {
        A(20);
        C(i << 3);
        C(i2);
    }

    @Override // defpackage.ed3
    public final void h(int i, int i2) {
        A(14);
        C((i << 3) | 5);
        E(i2);
    }

    @Override // defpackage.ed3
    public final void i(int i, long j) {
        A(20);
        C(i << 3);
        D(j);
    }

    @Override // defpackage.ed3
    public final int j() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // defpackage.ed3
    public final void k(int i, long j) {
        A(18);
        C((i << 3) | 1);
        F(j);
    }

    @Override // defpackage.ed3
    public final void l(int i, boolean z) {
        A(11);
        C(i << 3);
        int i2 = this.e;
        this.c[i2] = z ? (byte) 1 : (byte) 0;
        this.e = i2 + 1;
    }

    @Override // defpackage.ed3
    public final void m(int i, String str) throws IOException {
        v((i << 3) | 2);
        z(str);
    }

    @Override // defpackage.ed3
    public final void n(int i, zzian zzianVar) throws IOException {
        v((i << 3) | 2);
        o(zzianVar);
    }

    @Override // defpackage.ed3
    public final void o(zzian zzianVar) throws IOException {
        v(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    @Override // defpackage.ed3
    public final void p(int i, byte[] bArr) throws IOException {
        v(i);
        G(0, i, bArr);
    }

    @Override // defpackage.ed3
    public final void q(int i, zzidc zzidcVar) throws IOException {
        v(11);
        g(2, i);
        v(26);
        s(zzidcVar);
        v(12);
    }

    @Override // defpackage.ed3
    public final void r(int i, zzian zzianVar) throws IOException {
        v(11);
        g(2, i);
        n(3, zzianVar);
        v(12);
    }

    @Override // defpackage.ed3
    public final void s(zzidc zzidcVar) throws IOException {
        v(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    @Override // defpackage.ed3
    public final void t(byte b) {
        if (this.e == this.d) {
            B();
        }
        int i = this.e;
        this.c[i] = b;
        this.e = i + 1;
    }

    @Override // defpackage.ed3
    public final void u(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.ed3
    public final void v(int i) {
        A(5);
        C(i);
    }

    @Override // defpackage.ed3
    public final void w(int i) {
        A(4);
        E(i);
    }

    @Override // defpackage.ed3
    public final void x(long j) {
        A(10);
        D(j);
    }

    @Override // defpackage.ed3
    public final void y(long j) {
        A(8);
        F(j);
    }

    @Override // defpackage.ed3
    public final void z(String str) throws IOException {
        int length = str.length() * 3;
        int iB = ed3.b(length);
        int i = iB + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iB2 = cb.b(str, bArr, 0, length);
            v(iB2);
            G(0, iB2, bArr);
            return;
        }
        if (i > i2 - this.e) {
            B();
        }
        int iB3 = ed3.b(str.length());
        int i3 = this.e;
        byte[] bArr2 = this.c;
        try {
            if (iB3 == iB) {
                int i4 = i3 + iB3;
                this.e = i4;
                int iB4 = cb.b(str, bArr2, i4, i2 - i4);
                this.e = i3;
                C((iB4 - i3) - iB3);
                this.e = iB4;
            } else {
                int iA = cb.a(str);
                C(iA);
                this.e = cb.b(str, bArr2, this.e, iA);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zziau(e);
        }
    }
}
