package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.trilead.ssh2.sftp.AttribFlags;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ad3 extends bd3 {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public /* synthetic */ ad3(InputStream inputStream) {
        Charset charset = kd3.a;
        this.d = inputStream;
        this.e = new byte[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // defpackage.bd3
    public final int A() {
        return bd3.g(K());
    }

    @Override // defpackage.bd3
    public final long B() {
        return bd3.h(L());
    }

    @Override // defpackage.bd3
    public final int C(int i) throws zzicg {
        if (i < 0) {
            zg1.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            zg1.r("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.k;
        if (i2 > i3) {
            zg1.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i2;
        E();
        return i3;
    }

    public final void D(int i) throws zzicg {
        InputStream inputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i < 0) {
            zg1.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.j;
        int i6 = i5 + i3;
        int i7 = this.k;
        if (i6 + i > i7) {
            D((i7 - i5) - i3);
            zg1.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.j = i6;
        this.f = 0;
        this.h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzicg e) {
                    e.zza();
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i4;
                E();
                throw th;
            }
        }
        this.j += i4;
        E();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f;
        int i9 = i8 - this.h;
        this.h = i8;
        F(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f;
            if (i10 <= i11) {
                this.h = i10;
                return;
            } else {
                i9 += i11;
                this.h = i11;
                F(1);
            }
        }
    }

    public final void E() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void F(int i) throws zzicg {
        if (G(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.j) - this.h) {
            zg1.r("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            zg1.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean G(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            u7.p(vh.r(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.j + i2;
                this.j = i5;
                i4 = this.f - i2;
                this.f = i4;
                this.h = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > 4096) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
                    sb.append(strValueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(i6);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (i6 > 0) {
                    this.f += i6;
                    E();
                    if (this.f >= i || G(i)) {
                        return true;
                    }
                }
            } catch (zzicg e) {
                e.zza();
                throw e;
            }
        }
        return false;
    }

    public final byte[] H(int i) throws IOException {
        byte[] bArrI = I(i);
        if (bArrI != null) {
            return bArrI;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListJ = J(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return kd3.b;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            zg1.r("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.k;
        if (i4 > i5) {
            D((i5 - i2) - i3);
            zg1.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zzicg e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    zg1.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += i8;
                i6 += i8;
            } catch (zzicg e2) {
                e2.zza();
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    zg1.r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.h = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() throws zzicg {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                F(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            byte b = this.e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        zg1.r("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int N() throws zzicg {
        int i = this.h;
        if (this.f - i < 4) {
            F(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long O() throws zzicg {
        int i = this.h;
        if (this.f - i < 8) {
            F(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.bd3
    public final void a(int i) {
        this.k = i;
        E();
    }

    @Override // defpackage.bd3
    public final boolean b() {
        return this.h == this.f && !G(1);
    }

    @Override // defpackage.bd3
    public final int c() {
        return this.j + this.h;
    }

    @Override // defpackage.bd3
    public final int i() throws zzicg {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int iK = K();
        this.i = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        zg1.r("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.bd3
    public final void j(int i) throws zzicg {
        if (this.i == i) {
            return;
        }
        zg1.r("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.bd3
    public final boolean k(int i) throws zzicg {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                D(8);
                return true;
            }
            if (i2 == 2) {
                D(K());
                return true;
            }
            if (i2 == 3) {
                f();
                j(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    j(0);
                }
                return false;
            }
            if (i2 == 5) {
                D(4);
                return true;
            }
            zg1.q();
            return false;
        }
        int i3 = this.f - this.h;
        byte[] bArr = this.e;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            zg1.r("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.h == this.f) {
                F(1);
            }
            int i7 = this.h;
            this.h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        zg1.r("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.bd3
    public final double l() {
        return Double.longBitsToDouble(O());
    }

    @Override // defpackage.bd3
    public final float m() {
        return Float.intBitsToFloat(N());
    }

    @Override // defpackage.bd3
    public final long n() {
        return L();
    }

    @Override // defpackage.bd3
    public final long o() {
        return L();
    }

    @Override // defpackage.bd3
    public final int p() {
        return K();
    }

    @Override // defpackage.bd3
    public final long q() {
        return O();
    }

    @Override // defpackage.bd3
    public final int r() {
        return N();
    }

    @Override // defpackage.bd3
    public final boolean s() {
        return L() != 0;
    }

    @Override // defpackage.bd3
    public final String t() throws zzicg {
        int iK = K();
        byte[] bArr = this.e;
        if (iK > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iK <= i - i2) {
                String str = new String(bArr, i2, iK, kd3.a);
                this.h += iK;
                return str;
            }
        }
        if (iK == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iK < 0) {
            zg1.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iK > this.f) {
            return new String(H(iK), kd3.a);
        }
        F(iK);
        String str2 = new String(bArr, this.h, iK, kd3.a);
        this.h += iK;
        return str2;
    }

    @Override // defpackage.bd3
    public final String u() throws IOException {
        int iK = K();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrH = this.e;
        if (iK <= i3 && iK > 0) {
            this.h = i + iK;
        } else {
            if (iK == 0) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (iK < 0) {
                zg1.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iK <= i2) {
                F(iK);
                this.h = iK;
            } else {
                bArrH = H(iK);
            }
        }
        return cb.c(i, iK, bArrH);
    }

    @Override // defpackage.bd3
    public final zzian v() throws IOException {
        int iK = K();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iK <= i3 && iK > 0) {
            zzian zzianVarZzt = zzian.zzt(bArr, i2, iK, false);
            this.h += iK;
            return zzianVarZzt;
        }
        if (iK == 0) {
            return zzian.zza;
        }
        if (iK < 0) {
            zg1.r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrI = I(iK);
        if (bArrI != null) {
            return zzian.zzt(bArrI, 0, bArrI.length, false);
        }
        int i4 = this.h;
        int i5 = this.f;
        int i6 = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListJ = J(iK - i6);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListJ) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        return zzian.zzu(bArr2);
    }

    @Override // defpackage.bd3
    public final int w() {
        return K();
    }

    @Override // defpackage.bd3
    public final int x() {
        return K();
    }

    @Override // defpackage.bd3
    public final int y() {
        return N();
    }

    @Override // defpackage.bd3
    public final long z() {
        return O();
    }
}
