package defpackage;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uv0 {
    public static final ErrorCorrection a = new ErrorCorrection();

    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pf a(defpackage.ix r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv0.a(ix):pf");
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0481  */
    /* JADX WARN: Type inference failed for: r6v11, types: [byte[], java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.common.DecoderResult b(int[] r24, int r25, int[] r26) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv0.b(int[], int, int[]):com.google.zxing.common.DecoderResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qd c(com.google.zxing.common.BitMatrix r20, int r21, int r22, boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv0.c(com.google.zxing.common.BitMatrix, int, int, boolean, int, int, int, int):qd");
    }

    public static ix d(BitMatrix bitMatrix, pf pfVar, ResultPoint resultPoint, boolean z, int i, int i2) {
        boolean z2 = z;
        ix ixVar = new ix(pfVar, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int i5 = (int) resultPoint.a;
            int i6 = (int) resultPoint.b;
            while (i6 <= pfVar.i && i6 >= pfVar.h) {
                qd qdVarC = c(bitMatrix, 0, bitMatrix.a, z2, i5, i6, i, i2);
                if (qdVarC != null) {
                    ((qd[]) ixVar.c)[ixVar.m(i6)] = qdVarC;
                    i5 = z ? qdVarC.b : qdVarC.c;
                }
                i6 += i4;
                z2 = z;
            }
            i3++;
            z2 = z;
        }
        return ixVar;
    }
}
