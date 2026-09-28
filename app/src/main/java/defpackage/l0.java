package defpackage;

import androidx.work.impl.utils.futures.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 implements ListenableFuture {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(l0.class.getName());
    public static final qj1 f;
    public static final Object g;
    public volatile Object a;
    public volatile b0 b;
    public volatile k0 c;

    static {
        qj1 g0Var;
        try {
            g0Var = new d0(AtomicReferenceFieldUpdater.newUpdater(k0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k0.class, k0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l0.class, k0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(l0.class, b0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            g0Var = new g0();
        }
        f = g0Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void b(l0 l0Var) {
        k0 k0Var;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        do {
            k0Var = l0Var.c;
        } while (!f.n(l0Var, k0Var, k0.c));
        while (true) {
            b0Var = null;
            if (k0Var == null) {
                break;
            }
            Thread thread = k0Var.a;
            if (thread != null) {
                k0Var.a = null;
                LockSupport.unpark(thread);
            }
            k0Var = k0Var.b;
        }
        do {
            b0Var2 = l0Var.b;
        } while (!f.l(l0Var, b0Var2, b0.d));
        while (true) {
            b0Var3 = b0Var;
            b0Var = b0Var2;
            if (b0Var == null) {
                break;
            }
            b0Var2 = b0Var.c;
            b0Var.c = b0Var3;
        }
        while (b0Var3 != null) {
            b0 b0Var4 = b0Var3.c;
            c(b0Var3.a, b0Var3.b);
            b0Var3 = b0Var4;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof z) {
            Throwable th = ((z) obj).a;
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

    public static Object e(l0 l0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = l0Var.get();
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
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objE == this ? "this future" : String.valueOf(objE));
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
        b0 b0Var = this.b;
        b0 b0Var2 = b0.d;
        if (b0Var != b0Var2) {
            b0 b0Var3 = new b0(runnable, executor);
            do {
                b0Var3.c = b0Var;
                if (f.l(this, b0Var, b0Var3)) {
                    return;
                } else {
                    b0Var = this.b;
                }
            } while (b0Var != b0Var2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.m(this, obj, d ? new z(new CancellationException("Future.cancel() was called."), z) : z ? z.b : z.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void f(k0 k0Var) {
        k0Var.a = null;
        while (true) {
            k0 k0Var2 = this.c;
            if (k0Var2 == k0.c) {
                return;
            }
            k0 k0Var3 = null;
            while (k0Var2 != null) {
                k0 k0Var4 = k0Var2.b;
                if (k0Var2.a != null) {
                    k0Var3 = k0Var2;
                } else if (k0Var3 != null) {
                    k0Var3.b = k0Var4;
                    if (k0Var3.a == null) {
                        break;
                    }
                } else if (!f.n(this, k0Var2, k0Var4)) {
                    break;
                }
                k0Var2 = k0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        k0 k0Var = k0.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k0 k0Var2 = this.c;
            if (k0Var2 != k0Var) {
                k0 k0Var3 = new k0();
                do {
                    qj1 qj1Var = f;
                    qj1Var.y(k0Var3, k0Var2);
                    if (qj1Var.n(this, k0Var2, k0Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(k0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return d(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                f(k0Var3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        k0Var2 = this.c;
                    }
                } while (k0Var2 != k0Var);
            }
            return d(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return d(obj3);
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof z;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof z) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                vh.A(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        k0 k0Var = k0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return d(obj2);
            }
            k0 k0Var2 = this.c;
            if (k0Var2 != k0Var) {
                k0 k0Var3 = new k0();
                do {
                    qj1 qj1Var = f;
                    qj1Var.y(k0Var3, k0Var2);
                    if (qj1Var.n(this, k0Var2, k0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                f(k0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    k0Var2 = this.c;
                } while (k0Var2 != k0Var);
            }
            return d(this.a);
        }
        throw new InterruptedException();
    }
}
