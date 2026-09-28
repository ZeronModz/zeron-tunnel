package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.g;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zr {
    public static final ContextScope a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key) == null) {
            coroutineContext = coroutineContext.plus(g.a());
        }
        return new ContextScope(coroutineContext);
    }

    public static final void b(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getB().get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            oq.m(coroutineScope, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getB(), continuation);
        Object objU = ay2.u(scopeCoroutine, true, scopeCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objU;
    }
}
