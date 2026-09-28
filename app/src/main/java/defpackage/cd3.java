package defpackage;

import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zziau;
import com.google.android.gms.internal.ads.zzidc;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cd3 extends ed3 {
    public final byte[] c;
    public final int d;
    public int e;

    public cd3(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            u7.r(vh.g(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    public final void A(int i, int i2, byte[] bArr) throws zziau {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(this.e, this.d, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void a(int i, int i2, byte[] bArr) throws zziau {
        A(i, i2, bArr);
    }

    @Override // defpackage.ed3
    public final void e(int i, int i2) throws zziau {
        v((i << 3) | i2);
    }

    @Override // defpackage.ed3
    public final void f(int i, int i2) throws zziau {
        v(i << 3);
        u(i2);
    }

    @Override // defpackage.ed3
    public final void g(int i, int i2) throws zziau {
        v(i << 3);
        v(i2);
    }

    @Override // defpackage.ed3
    public final void h(int i, int i2) throws zziau {
        v((i << 3) | 5);
        w(i2);
    }

    @Override // defpackage.ed3
    public final void i(int i, long j) throws zziau {
        v(i << 3);
        x(j);
    }

    @Override // defpackage.ed3
    public final int j() {
        return this.d - this.e;
    }

    @Override // defpackage.ed3
    public final void k(int i, long j) throws zziau {
        v((i << 3) | 1);
        y(j);
    }

    @Override // defpackage.ed3
    public final void l(int i, boolean z) throws zziau {
        v(i << 3);
        t(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.ed3
    public final void m(int i, String str) throws zziau {
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
    public final void p(int i, byte[] bArr) throws zziau {
        v(i);
        A(0, i, bArr);
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
    public final void t(byte b) throws zziau {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zziau(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.ed3
    public final void u(int i) throws zziau {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.ed3
    public final void v(int i) throws zziau {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zziau(i2, this.d, 1, e);
                }
            }
            throw new zziau(i2, this.d, 1, e);
        }
    }

    @Override // defpackage.ed3
    public final void w(int i) throws zziau {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(i2, this.d, 4, e);
        }
    }

    @Override // defpackage.ed3
    public final void x(long j) throws zziau {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!ed3.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zziau(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zziau(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                vd3.l(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            vd3.l(bArr, i2, (byte) j);
        }
        this.e = i;
    }

    @Override // defpackage.ed3
    public final void y(long j) throws zziau {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(i, this.d, 8, e);
        }
    }

    @Override // defpackage.ed3
    public final void z(String str) throws zziau {
        int i = this.e;
        try {
            int iB = ed3.b(str.length() * 3);
            int iB2 = ed3.b(str.length());
            int i2 = this.d;
            byte[] bArr = this.c;
            if (iB2 != iB) {
                v(cb.a(str));
                int i3 = this.e;
                this.e = cb.b(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iB2;
                this.e = i4;
                int iB3 = cb.b(str, bArr, i4, i2 - i4);
                this.e = i;
                v((iB3 - i) - iB2);
                this.e = iB3;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(e);
        }
    }
}
