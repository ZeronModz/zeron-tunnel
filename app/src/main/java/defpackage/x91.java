package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x91 implements CoroutineStackFrame, Continuation {
    public static final x91 a = new x91();

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* JADX INFO: renamed from: getCallerFrame */
    public final CoroutineStackFrame getA() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getD() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* JADX INFO: renamed from: getStackTraceElement */
    public final StackTraceElement getB() {
        return new StackTraceElement(k02.l(Reflection.a(w91.class)).getName(), "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
