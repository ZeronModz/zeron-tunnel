package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f40 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public f40(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static f40 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(ExifInterface.P);
        return new f40(2, bytes.length, bytes);
    }

    public static f40 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.G[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j2 : jArr) {
            byteBufferWrap.putInt((int) j2);
        }
        return new f40(4, jArr.length, byteBufferWrap.array());
    }

    public static f40 c(h40[] h40VarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.G[5] * h40VarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (h40 h40Var : h40VarArr) {
            byteBufferWrap.putInt((int) h40Var.a);
            byteBufferWrap.putInt((int) h40Var.b);
        }
        return new f40(5, h40VarArr.length, byteBufferWrap.array());
    }

    public static f40 d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.G[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i2 : iArr) {
            byteBufferWrap.putShort((short) i2);
        }
        return new f40(3, iArr.length, byteBufferWrap.array());
    }

    public final double e(ByteOrder byteOrder) throws Throwable {
        Object objH = h(byteOrder);
        if (objH == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objH instanceof String) {
            return Double.parseDouble((String) objH);
        }
        if (objH instanceof long[]) {
            if (((long[]) objH).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objH instanceof int[]) {
            if (((int[]) objH).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objH instanceof double[]) {
            double[] dArr = (double[]) objH;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objH instanceof h40[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        h40[] h40VarArr = (h40[]) objH;
        if (h40VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        h40 h40Var = h40VarArr[0];
        return h40Var.a / h40Var.b;
    }

    public final int f(ByteOrder byteOrder) {
        Object objH = h(byteOrder);
        if (objH == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objH instanceof String) {
            return Integer.parseInt((String) objH);
        }
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objH instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objH;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String g(ByteOrder byteOrder) {
        Object objH = h(byteOrder);
        if (objH == null) {
            return null;
        }
        if (objH instanceof String) {
            return (String) objH;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objH instanceof int[]) {
            int[] iArr = (int[]) objH;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objH instanceof double[]) {
            double[] dArr = (double[]) objH;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objH instanceof h40[])) {
            return null;
        }
        h40[] h40VarArr = (h40[]) objH;
        while (i < h40VarArr.length) {
            sb.append(h40VarArr[i].a);
            sb.append('/');
            sb.append(h40VarArr[i].b);
            i++;
            if (i != h40VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:59|(2:61|(2:62|(2:64|(2:148|66)(1:67))(2:149|68)))|69|(2:71|(6:151|73|79|143|80|81)(3:74|(2:76|153)(2:77|152)|78))|150|79|143|80|81) */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [h40[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v16, types: [h40[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v18, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(java.nio.ByteOrder r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(ExifInterface.F[this.a]);
        sb.append(", data length:");
        return hz.q(this.d.length, ")", sb);
    }

    public f40(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}
