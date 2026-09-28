package defpackage;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zk {
    public static final void a(Throwable th, Continuation continuation) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m36constructorimpl(d.a(th)));
        throw th;
    }

    public static final void b(Continuation continuation, AbstractCoroutine abstractCoroutine) throws Throwable {
        try {
            Continuation continuationC = a.c(continuation);
            Result.Companion companion = Result.INSTANCE;
            ly.a(Result.m36constructorimpl(mk1.a), continuationC);
        } catch (Throwable th) {
            a(th, abstractCoroutine);
            throw null;
        }
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation) throws Throwable {
        try {
            Continuation continuationC = a.c(a.b(function2, obj, continuation));
            Result.Companion companion = Result.INSTANCE;
            ly.a(Result.m36constructorimpl(mk1.a), continuationC);
        } catch (Throwable th) {
            a(th, continuation);
            throw null;
        }
    }
}
