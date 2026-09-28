package defpackage;

import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 implements ListenableFuture {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(n1.class.getName());
    public static final mc2 f;
    public static final Object g;
    public volatile Object a;
    public volatile j1 b;
    public volatile m1 c;

    static {
        mc2 l1Var;
        try {
            l1Var = new k1(AtomicReferenceFieldUpdater.newUpdater(m1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(m1.class, m1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n1.class, m1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(n1.class, j1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            l1Var = new l1(4);
        }
        f = l1Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(n1 n1Var) {
        m1 m1Var;
        j1 j1Var;
        j1 j1Var2;
        j1 j1Var3;
        do {
            m1Var = n1Var.c;
        } while (!f.h(n1Var, m1Var, m1.c));
        while (true) {
            j1Var = null;
            if (m1Var == null) {
                break;
            }
            Thread thread = m1Var.a;
            if (thread != null) {
                m1Var.a = null;
                LockSupport.unpark(thread);
            }
            m1Var = m1Var.b;
        }
        n1Var.b();
        do {
            j1Var2 = n1Var.b;
        } while (!f.f(n1Var, j1Var2, j1.d));
        while (true) {
            j1Var3 = j1Var;
            j1Var = j1Var2;
            if (j1Var == null) {
                break;
            }
            j1Var2 = j1Var.c;
            j1Var.c = j1Var3;
        }
        while (j1Var3 != null) {
            j1 j1Var4 = j1Var3.c;
            d(j1Var3.a, j1Var3.b);
            j1Var3 = j1Var4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof i1) {
            Throwable th = ((i1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a) {
            throw new ExecutionException(((a) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        j1 j1Var = this.b;
        j1 j1Var2 = j1.d;
        if (j1Var != j1Var2) {
            j1 j1Var3 = new j1(runnable, executor);
            do {
                j1Var3.c = j1Var;
                if (f.f(this, j1Var, j1Var3)) {
                    return;
                } else {
                    j1Var = this.b;
                }
            } while (j1Var != j1Var2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (f.g(this, obj, d ? new i1(new CancellationException("Future.cancel() was called."), z) : z ? i1.c : i1.d)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        m1 m1Var = m1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            m1 m1Var2 = this.c;
            if (m1Var2 != m1Var) {
                m1 m1Var3 = new m1();
                do {
                    mc2 mc2Var = f;
                    mc2Var.z(m1Var3, m1Var2);
                    if (mc2Var.h(this, m1Var2, m1Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(m1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                h(m1Var3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        m1Var2 = this.c;
                    }
                } while (m1Var2 != m1Var);
            }
            return e(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbW = vh.w(j, "Waited ", " ");
        sbW.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbW.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = vh.j(nanos2, strConcat, " nanoseconds ");
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(vh.m(string3, " for ", string));
    }

    public final void h(m1 m1Var) {
        m1Var.a = null;
        while (true) {
            m1 m1Var2 = this.c;
            if (m1Var2 == m1.c) {
                return;
            }
            m1 m1Var3 = null;
            while (m1Var2 != null) {
                m1 m1Var4 = m1Var2.b;
                if (m1Var2.a != null) {
                    m1Var3 = m1Var2;
                } else if (m1Var3 != null) {
                    m1Var3.b = m1Var4;
                    if (m1Var3.a == null) {
                        break;
                    }
                } else if (!f.h(this, m1Var2, m1Var4)) {
                    break;
                }
                m1Var2 = m1Var4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.g(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof i1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!f.g(this, null, new a(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof i1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e2) {
                strG = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                vh.A(sb, "PENDING, info=[", strG, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        m1 m1Var = m1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return e(obj2);
            }
            m1 m1Var2 = this.c;
            if (m1Var2 != m1Var) {
                m1 m1Var3 = new m1();
                do {
                    mc2 mc2Var = f;
                    mc2Var.z(m1Var3, m1Var2);
                    if (mc2Var.h(this, m1Var2, m1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(m1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    m1Var2 = this.c;
                } while (m1Var2 != m1Var);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
