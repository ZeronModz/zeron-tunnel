package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ii3 extends cl1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii3(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.cl1
    public final void n(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!li3.g) {
                    li3.d(obj, j, b);
                } else {
                    li3.c(obj, j, b);
                }
                break;
            default:
                if (!li3.g) {
                    li3.d(obj, j, b);
                } else {
                    li3.c(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.cl1
    public final boolean o(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!li3.g) {
                }
                break;
            default:
                if (!li3.g) {
                }
                break;
        }
        return li3.l(obj, j);
    }

    @Override // defpackage.cl1
    public final void p(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!li3.g) {
                    li3.d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    li3.c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!li3.g) {
                    li3.d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    li3.c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.cl1
    public final float q(Object obj, long j) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // defpackage.cl1
    public final void r(Object obj, long j, float f) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.cl1
    public final double s(Object obj, long j) {
        int i = this.b;
        Unsafe unsafe = this.a;
        switch (i) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // defpackage.cl1
    public final void t(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
