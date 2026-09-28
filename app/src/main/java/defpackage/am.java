package defpackage;

import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

 
 
public final class am extends xa0 implements Runnable {
    public AsyncFunction c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public ListenableFuture f;
    public volatile ListenableFuture g;

    public am(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.c = asyncFunction;
        listenableFuture.getClass();
        this.f = listenableFuture;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
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
        return objTake;
    }

    @Override // defpackage.xa0, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture listenableFuture2 = this.g;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.xa0, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.e.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            ListenableFuture listenableFuture2 = this.g;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return this.a.get(j, timeUnit);
    }

     
     
     
     
     
     
     
     
     
     
     
     
     
     
    @Override // java.lang.Runnable
    public final void run() {
        am r5;
        boolean z = false;
        try {
            try {
                try {
                    try {
                        try {
                            ListenableFuture listenableFutureApply = this.c.apply(xg0.l(this.f));
                            this.g = listenableFutureApply;
                            if (this.a.isCancelled()) {
                                listenableFutureApply.cancel(((Boolean) b(this.d)).booleanValue());
                                this.g = null;
                            } else {
                                listenableFutureApply.addListener(new db0(this, 4, listenableFutureApply, z), fy.b());
                            }
                        } catch (Error e) {
                            b bVar = this.b;
                            r5 = this;
                            if (bVar != null) {
                                bVar.d(e);
                                r5 = this;
                            }
                        }
                    } catch (UndeclaredThrowableException e2) {
                        Throwable cause = e2.getCause();
                        b bVar2 = this.b;
                        r5 = this;
                        if (bVar2 != null) {
                            bVar2.d(cause);
                            r5 = this;
                        }
                    }
                } finally {
                    this.c = null;
                    this.f = null;
                    this.e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                b bVar3 = this.b;
                if (bVar3 != null) {
                    bVar3.d(cause2);
                }
            }
        } catch (Exception e4) {
            b bVar4 = this.b;
            r5 = this;
            if (bVar4 != null) {
                bVar4.d(e4);
                r5 = this;
            }
        }
    }

    @Override // defpackage.xa0, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.e.await();
            ListenableFuture listenableFuture2 = this.g;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.a.get();
    }
}
