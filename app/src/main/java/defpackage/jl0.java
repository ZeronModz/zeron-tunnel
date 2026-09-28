package defpackage;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import defpackage.ai0;
import defpackage.j60;
import defpackage.zr;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jl0 {
    public static final oh a(SerialExecutor serialExecutor, String str, Function0 function0) {
        serialExecutor.getClass();
        return yg0.x(new ls(serialExecutor, 3, str, function0));
    }

    public static oh b(final CoroutineContext coroutineContext, final Function2 function2) {
        final CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        coroutineContext.getClass();
        coroutineStart.getClass();
        return yg0.x(new CallbackToFutureAdapter$Resolver() { // from class: androidx.work.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.b bVar) {
                bVar.getClass();
                ai0 ai0Var = Job.Key;
                CoroutineContext coroutineContext2 = coroutineContext;
                bVar.a(new j60((Job) coroutineContext2.get(ai0Var), 7), DirectExecutor.INSTANCE);
                return c.d(zr.a(coroutineContext2), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(function2, bVar, null), 1);
            }
        });
    }
}
