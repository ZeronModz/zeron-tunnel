package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hv extends ExecutorCoroutineDispatcher implements Executor {
    public static final hv c = new hv();
    public static final CoroutineDispatcher d;

    static {
        ok1 ok1Var = ok1.c;
        int i = md1.a;
        if (64 >= i) {
            i = 64;
        }
        d = ok1Var.d(mu.t(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        d.a(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void b(CoroutineContext coroutineContext, Runnable runnable) {
        d.b(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher d(int i) {
        return ok1.c.d(i);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: toString */
    public final String getE() {
        return "Dispatchers.IO";
    }
}
