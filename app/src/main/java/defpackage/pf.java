package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pf {
    public final BitMatrix a;
    public final ResultPoint b;
    public final ResultPoint c;
    public final ResultPoint d;
    public final ResultPoint e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public pf(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        boolean z = resultPoint == null || resultPoint2 == null;
        boolean z2 = resultPoint3 == null || resultPoint4 == null;
        if (z && z2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z) {
            resultPoint = new ResultPoint(0.0f, resultPoint3.b);
            resultPoint2 = new ResultPoint(0.0f, resultPoint4.b);
        } else if (z2) {
            resultPoint3 = new ResultPoint(bitMatrix.a - 1, resultPoint.b);
            resultPoint4 = new ResultPoint(bitMatrix.a - 1, resultPoint2.b);
        }
        this.a = bitMatrix;
        this.b = resultPoint;
        this.c = resultPoint2;
        this.d = resultPoint3;
        this.e = resultPoint4;
        this.f = (int) Math.min(resultPoint.a, resultPoint2.a);
        this.g = (int) Math.max(resultPoint3.a, resultPoint4.a);
        this.h = (int) Math.min(resultPoint.b, resultPoint3.b);
        this.i = (int) Math.max(resultPoint2.b, resultPoint4.b);
    }

    public pf(pf pfVar) {
        this.a = pfVar.a;
        this.b = pfVar.b;
        this.c = pfVar.c;
        this.d = pfVar.d;
        this.e = pfVar.e;
        this.f = pfVar.f;
        this.g = pfVar.g;
        this.h = pfVar.h;
        this.i = pfVar.i;
    }
}
