package defpackage;

import com.google.common.util.concurrent.c;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends w91 {
    public static final Unsafe k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new h0(0));
            }
            try {
                m = unsafe.objectFieldOffset(c.class.getDeclaredField("c"));
                l = unsafe.objectFieldOffset(c.class.getDeclaredField("b"));
                n = unsafe.objectFieldOffset(c.class.getDeclaredField("a"));
                o = unsafe.objectFieldOffset(j0.class.getDeclaredField("a"));
                p = unsafe.objectFieldOffset(j0.class.getDeclaredField("b"));
                k = unsafe;
            } catch (NoSuchFieldException e) {
                p60.l(e);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (PrivilegedActionException e3) {
            zu0.l("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.w91
    public final boolean e(c cVar, a0 a0Var, a0 a0Var2) {
        while (true) {
            Unsafe unsafe = k;
            long j = l;
            c cVar2 = cVar;
            a0 a0Var3 = a0Var;
            a0 a0Var4 = a0Var2;
            if (unsafe.compareAndSwapObject(cVar2, j, a0Var3, a0Var4)) {
                return true;
            }
            if (unsafe.getObject(cVar2, j) != a0Var3) {
                return false;
            }
            cVar = cVar2;
            a0Var = a0Var3;
            a0Var2 = a0Var4;
        }
    }

    @Override // defpackage.w91
    public final boolean f(c cVar, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = k;
            long j = n;
            c cVar2 = cVar;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(cVar2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(cVar2, j) != obj3) {
                return false;
            }
            cVar = cVar2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // defpackage.w91
    public final boolean g(c cVar, j0 j0Var, j0 j0Var2) {
        while (true) {
            Unsafe unsafe = k;
            long j = m;
            c cVar2 = cVar;
            j0 j0Var3 = j0Var;
            j0 j0Var4 = j0Var2;
            if (unsafe.compareAndSwapObject(cVar2, j, j0Var3, j0Var4)) {
                return true;
            }
            if (unsafe.getObject(cVar2, j) != j0Var3) {
                return false;
            }
            cVar = cVar2;
            j0Var = j0Var3;
            j0Var2 = j0Var4;
        }
    }

    @Override // defpackage.w91
    public final a0 p(c cVar) {
        a0 a0Var;
        a0 a0Var2 = a0.d;
        do {
            a0Var = cVar.b;
            if (a0Var2 == a0Var) {
                break;
            }
        } while (!e(cVar, a0Var, a0Var2));
        return a0Var;
    }

    @Override // defpackage.w91
    public final j0 q(c cVar) {
        j0 j0Var;
        j0 j0Var2 = j0.c;
        do {
            j0Var = cVar.c;
            if (j0Var2 == j0Var) {
                break;
            }
        } while (!g(cVar, j0Var, j0Var2));
        return j0Var;
    }

    @Override // defpackage.w91
    public final void w(j0 j0Var, j0 j0Var2) {
        k.putObject(j0Var, p, j0Var2);
    }

    @Override // defpackage.w91
    public final void x(j0 j0Var, Thread thread) {
        k.putObject(j0Var, o, thread);
    }
}
