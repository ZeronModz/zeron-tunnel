package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 extends cl1 {
    @Override // defpackage.cl1
    public final void a(long j, byte[] bArr, long j2, long j3) {
        this.a.copyMemory((Object) null, j, bArr, dl1.f + j2, j3);
    }

    @Override // defpackage.cl1
    public final boolean b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // defpackage.cl1
    public final byte c(long j) {
        return this.a.getByte(j);
    }

    @Override // defpackage.cl1
    public final byte d(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    @Override // defpackage.cl1
    public final double e(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // defpackage.cl1
    public final float f(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // defpackage.cl1
    public final long g(long j) {
        return this.a.getLong(j);
    }

    @Override // defpackage.cl1
    public final void h(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // defpackage.cl1
    public final void i(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // defpackage.cl1
    public final void j(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // defpackage.cl1
    public final void k(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // defpackage.cl1
    public final boolean l() {
        if (!super.l()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            dl1.k(th);
            return false;
        }
    }

    @Override // defpackage.cl1
    public final boolean m() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (dl1.c() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        dl1.k(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                dl1.k(th2);
            }
        }
        return false;
    }
}
