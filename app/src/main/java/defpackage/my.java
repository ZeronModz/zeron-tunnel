package defpackage;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.UndispatchedCoroutine;
import kotlinx.coroutines.d;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class my {
    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, Continuation continuation, boolean z) {
        Object objM36constructorimpl;
        Object objN = cancellableContinuationImpl.n();
        Throwable thC = cancellableContinuationImpl.c(objN);
        if (thC != null) {
            Result.Companion companion = Result.INSTANCE;
            objM36constructorimpl = vh.d(thC);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objM36constructorimpl = Result.m36constructorimpl(cancellableContinuationImpl.d(objN));
        }
        if (!z) {
            continuation.resumeWith(objM36constructorimpl);
            return;
        }
        continuation.getClass();
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Continuation continuation2 = dispatchedContinuation.e;
        Object obj = dispatchedContinuation.g;
        CoroutineContext d = continuation2.getB();
        Object objC = c.c(d, obj);
        UndispatchedCoroutine undispatchedCoroutineC = objC != c.a ? d.c(continuation2, d, objC) : null;
        try {
            continuation2.resumeWith(objM36constructorimpl);
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.N()) {
                c.a(d, objC);
            }
        } catch (Throwable th) {
            if (undispatchedCoroutineC == null || undispatchedCoroutineC.N()) {
                c.a(d, objC);
            }
            throw th;
        }
    }
}
