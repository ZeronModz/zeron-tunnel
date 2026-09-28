package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 extends cl1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.cl1
    public final void a(long j, byte[] bArr, long j2, long j3) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.cl1
    public final boolean b(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (dl1.h) {
                    if (dl1.f(obj, j) == 0) {
                    }
                } else if (dl1.g(obj, j) == 0) {
                }
                break;
            default:
                if (dl1.h) {
                    if (dl1.f(obj, j) == 0) {
                    }
                } else if (dl1.g(obj, j) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.cl1
    public final byte c(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.cl1
    public final byte d(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (!dl1.h) {
                }
                break;
            default:
                if (!dl1.h) {
                }
                break;
        }
        return dl1.g(obj, j);
    }

    @Override // defpackage.cl1
    public final double e(Object obj, long j) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.cl1
    public final float f(Object obj, long j) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.cl1
    public final long g(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.cl1
    public final void h(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!dl1.h) {
                    dl1.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    dl1.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!dl1.h) {
                    dl1.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    dl1.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.cl1
    public final void i(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!dl1.h) {
                    dl1.n(obj, j, b);
                } else {
                    dl1.m(obj, j, b);
                }
                break;
            default:
                if (!dl1.h) {
                    dl1.n(obj, j, b);
                } else {
                    dl1.m(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.cl1
    public final void j(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.cl1
    public final void k(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.cl1
    public final boolean m() {
        switch (this.b) {
        }
        return false;
    }
}
