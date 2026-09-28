package defpackage;

import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzauk;
import com.google.android.gms.internal.ads.zzauy;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzavf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 {
    public Object a;
    public long b;
    public double c;
    public zzauk d;
    public ArrayList e;
    public zzauy f;
    public int g = 1;

    public static mz1 a(Object obj) {
        mz1 mz1Var = new mz1();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        mz1Var.r();
        mz1Var.g = (i8 % 1937477084) ^ iF;
        mz1Var.a = obj;
        return mz1Var;
    }

    public static mz1 b(long j) {
        mz1 mz1Var = new mz1();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        mz1Var.r();
        mz1Var.g = (i8 % 327254586) ^ iF;
        mz1Var.b = j;
        return mz1Var;
    }

    public static mz1 c(double d) {
        mz1 mz1Var = new mz1();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        mz1Var.r();
        mz1Var.g = (i8 % 1605908235) ^ iF;
        mz1Var.c = d;
        return mz1Var;
    }

    public static mz1 d(zzauk zzaukVar) {
        mz1 mz1Var = new mz1();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        mz1Var.r();
        mz1Var.g = (i8 % 1402586708) ^ iF;
        mz1Var.d = zzaukVar;
        return mz1Var;
    }

    public static mz1 e(ArrayList arrayList) {
        mz1 mz1Var = new mz1();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        mz1Var.r();
        mz1Var.g = (i8 % 324763920) ^ iF;
        mz1Var.e = arrayList;
        return mz1Var;
    }

    public static mz1 f(zzauy zzauyVar) {
        mz1 mz1Var = new mz1();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        mz1Var.r();
        mz1Var.g = (i8 % 474613996) ^ iF;
        mz1Var.f = zzauyVar;
        return mz1Var;
    }

    public static mz1 g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof zzauk) {
            return d((zzauk) obj);
        }
        if (obj instanceof String) {
            zzauk zzaukVar = zzauk.b;
            return d(zzauk.e(((String) obj).getBytes(Charset.forName(iz1.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(g(arrayList2.get(i)));
        }
        return e(arrayList);
    }

    public static mz1 j(mz1 mz1Var) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 552812661;
        try {
            int i10 = mz1Var.g;
            int i11 = (i9 ^ iF) + i10;
            if (i10 == 0) {
                throw null;
            }
            switch (i11) {
                case 0:
                    return new mz1();
                case 1:
                    return a(mz1Var.l());
                case 2:
                    return b(mz1Var.m());
                case 3:
                    return d(mz1Var.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) mz1Var.o()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((mz1) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(mz1Var.p());
                case 6:
                    return c(mz1Var.q());
                default:
                    u7.g(iz1.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                    return null;
            }
        } catch (zzavd e) {
            throw new AssertionError(iz1.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public final Object h() throws zzavd {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iF = ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.g;
        int i10 = ((i8 % 473891334) ^ iF) + i9;
        if (i9 == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
            case 5:
                throw new zzavd();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) o()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((mz1) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                u7.g(iz1.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f4, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Class r19) throws com.google.android.gms.internal.ads.zzavd {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz1.i(java.lang.Class):java.lang.Object");
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) throws zzavd, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = (((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + j7;
        long j10 = j8 % 297598514;
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 1:
            case 5:
                throw new zzavd();
            case 2:
                zzaug.b(m(), new zzavf(byteArrayOutputStream, 1), true);
                return;
            case 3:
                byte[] bArr = n().a;
                zzaug.b(((long) bArr.length) * (j9 ^ j10), new zzavf(byteArrayOutputStream, 0), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                zzaug.b(arrayList.size(), new zzavf(byteArrayOutputStream, 2), true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((mz1) it.next()).k(byteArrayOutputStream);
                }
                return;
            case 6:
                double dQ = q();
                zzavf zzavfVar = new zzavf(byteArrayOutputStream, 3);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dQ);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b : byteBufferAllocate.array()) {
                    zzavfVar.a.write(b);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() throws zzavd {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 235745791) ^ ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.a;
    }

    public final long m() throws zzavd {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 733327814) ^ ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.b;
    }

    public final zzauk n() throws zzavd {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 1140384172) ^ ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.d;
    }

    public final List o() throws zzavd {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 1250801052) ^ ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.e;
    }

    public final zzauy p() throws zzavd {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 395191309) ^ ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.f;
    }

    public final double q() throws zzavd {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 846930886) ^ ec1.F((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.c;
    }

    public final void r() {
        this.g = 1;
        this.b = 0L;
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void s(int i) throws zzavd {
        if (i != this.g) {
            throw new zzavd();
        }
    }
}
