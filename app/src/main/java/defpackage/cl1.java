package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cl1 {
    public final Unsafe a;

    public abstract void a(long j, byte[] bArr, long j2, long j3);

    public abstract boolean b(Object obj, long j);

    public abstract byte c(long j);

    public abstract byte d(Object obj, long j);

    public abstract double e(Object obj, long j);

    public abstract float f(Object obj, long j);

    public abstract long g(long j);

    public abstract void h(Object obj, long j, boolean z);

    public abstract void i(Object obj, long j, byte b);

    public abstract void j(Object obj, long j, double d);

    public abstract void k(Object obj, long j, float f);

    public boolean l() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            dl1.k(th);
            return false;
        }
    }

    public abstract boolean m();

    public abstract void n(Object obj, long j, byte b);

    public abstract boolean o(Object obj, long j);

    public abstract void p(Object obj, long j, boolean z);

    public abstract float q(Object obj, long j);

    public abstract void r(Object obj, long j, float f);

    public abstract double s(Object obj, long j);

    public abstract void t(Object obj, long j, double d);

    public abstract byte u(long j);
}
