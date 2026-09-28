package defpackage;

import com.google.common.util.concurrent.ExecutionList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kl0 extends FutureTask implements ListenableFuture {
    public final ExecutionList a;

    public kl0(hh hhVar) {
        super(hhVar);
        this.a = new ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        ExecutionList executionList = this.a;
        cn0.n(runnable, "Runnable was null.");
        cn0.n(executor, "Executor was null.");
        synchronized (executionList) {
            try {
                if (executionList.b) {
                    ExecutionList.a(runnable, executor);
                } else {
                    executionList.a = new tj1(runnable, 6, executor, executionList.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        ExecutionList executionList = this.a;
        synchronized (executionList) {
            try {
                if (executionList.b) {
                    return;
                }
                executionList.b = true;
                tj1 tj1Var = executionList.a;
                tj1 tj1Var2 = null;
                executionList.a = null;
                while (tj1Var != null) {
                    tj1 tj1Var3 = (tj1) tj1Var.d;
                    tj1Var.d = tj1Var2;
                    tj1Var2 = tj1Var;
                    tj1Var = tj1Var3;
                }
                while (tj1Var2 != null) {
                    ExecutionList.a((Runnable) tj1Var2.b, (Executor) tj1Var2.c);
                    tj1Var2 = (tj1) tj1Var2.d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
