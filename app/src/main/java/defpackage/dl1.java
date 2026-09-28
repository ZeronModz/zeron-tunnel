package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dl1 {
    public static final Unsafe a;
    public static final Class b;
    public static final cl1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
        Unsafe unsafe;
        cl1 bl1Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new h0(3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = p4.a;
        boolean zD = d(Long.TYPE);
        boolean zD2 = d(Integer.TYPE);
        if (unsafe != null) {
            if (!p4.a()) {
                bl1Var = new bl1(unsafe);
            } else if (zD) {
                bl1Var = new al1(unsafe, 1);
            } else if (zD2) {
                bl1Var = new al1(unsafe, 0);
            }
        }
        c = bl1Var;
        d = bl1Var == null ? false : bl1Var.m();
        e = bl1Var == null ? false : bl1Var.l();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        g = (fieldC == null || bl1Var == null) ? -1L : bl1Var.a.objectFieldOffset(fieldC);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (p4.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Class cls) {
        if (!p4.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(long j, byte[] bArr) {
        return c.d(bArr, f + j);
    }

    public static byte f(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static long i(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static Object j(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger.getLogger(dl1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.i(bArr, f + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iH = h(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        o(obj, j2, ((255 & b2) << i) | (iH & (~(255 << i))));
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(obj, j2, ((255 & b2) << i) | (h(obj, j2) & (~(255 << i))));
    }

    public static void o(Object obj, long j, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void q(Object obj, Object obj2, long j) {
        c.a.putObject(obj, j, obj2);
    }
}
