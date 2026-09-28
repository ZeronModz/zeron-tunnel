package defpackage;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.g7;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g33 extends j03 {
    public static final Unsafe q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                zu0.l("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(h0.b);
        }
        try {
            s = unsafe.objectFieldOffset(g7.class.getDeclaredField("c"));
            r = unsafe.objectFieldOffset(g7.class.getDeclaredField("b"));
            t = unsafe.objectFieldOffset(g7.class.getDeclaredField("a"));
            u = unsafe.objectFieldOffset(h33.class.getDeclaredField("a"));
            v = unsafe.objectFieldOffset(h33.class.getDeclaredField("b"));
            q = unsafe;
        } catch (NoSuchFieldException e2) {
            p60.l(e2);
        }
    }

    @Override // defpackage.j03
    public final void C(h33 h33Var, Thread thread) {
        q.putObject(h33Var, u, thread);
    }

    @Override // defpackage.j03
    public final void F(h33 h33Var, h33 h33Var2) {
        q.putObject(h33Var, v, h33Var2);
    }

    @Override // defpackage.j03
    public final boolean I(g7 g7Var, h33 h33Var, h33 h33Var2) {
        while (true) {
            Unsafe unsafe = q;
            long j = s;
            g7 g7Var2 = g7Var;
            h33 h33Var3 = h33Var;
            h33 h33Var4 = h33Var2;
            if (unsafe.compareAndSwapObject(g7Var2, j, h33Var3, h33Var4)) {
                return true;
            }
            if (unsafe.getObject(g7Var2, j) != h33Var3) {
                return false;
            }
            g7Var = g7Var2;
            h33Var = h33Var3;
            h33Var2 = h33Var4;
        }
    }

    @Override // defpackage.j03
    public final boolean K(f7 f7Var, d33 d33Var, d33 d33Var2) {
        while (true) {
            Unsafe unsafe = q;
            long j = r;
            f7 f7Var2 = f7Var;
            d33 d33Var3 = d33Var;
            d33 d33Var4 = d33Var2;
            if (unsafe.compareAndSwapObject(f7Var2, j, d33Var3, d33Var4)) {
                return true;
            }
            if (unsafe.getObject(f7Var2, j) != d33Var3) {
                return false;
            }
            f7Var = f7Var2;
            d33Var = d33Var3;
            d33Var2 = d33Var4;
        }
    }

    @Override // defpackage.j03
    public final h33 O(f7 f7Var) {
        h33 h33Var;
        h33 h33Var2 = h33.c;
        do {
            h33Var = f7Var.c;
            if (h33Var2 == h33Var) {
                break;
            }
        } while (!I(f7Var, h33Var, h33Var2));
        return h33Var;
    }

    @Override // defpackage.j03
    public final d33 Q(f7 f7Var) {
        d33 d33Var;
        d33 d33Var2 = d33.d;
        do {
            d33Var = f7Var.b;
            if (d33Var2 == d33Var) {
                break;
            }
        } while (!K(f7Var, d33Var, d33Var2));
        return d33Var;
    }

    @Override // defpackage.j03
    public final boolean S(g7 g7Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = q;
            long j = t;
            g7 g7Var2 = g7Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(g7Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(g7Var2, j) != obj3) {
                return false;
            }
            g7Var = g7Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }
}
