package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ud3 extends cl1 {
    @Override // defpackage.cl1
    public final void n(Object obj, long j, byte b) {
        if (vd3.h) {
            vd3.d(obj, j, b);
        } else {
            vd3.e(obj, j, b);
        }
    }

    @Override // defpackage.cl1
    public final boolean o(Object obj, long j) {
        return vd3.h ? vd3.n(obj, j) : vd3.o(obj, j);
    }

    @Override // defpackage.cl1
    public final void p(Object obj, long j, boolean z) {
        if (vd3.h) {
            vd3.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            vd3.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.cl1
    public final float q(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.cl1
    public final void r(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.cl1
    public final double s(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.cl1
    public final void t(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.cl1
    public final byte u(long j) {
        return Memory.peekByte(j);
    }
}
