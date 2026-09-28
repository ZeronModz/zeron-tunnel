package defpackage;

import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.util.pipeline.SuspendFunctionGun;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uc1 implements Continuation, CoroutineStackFrame {
    public int a = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
    public final /* synthetic */ SuspendFunctionGun b;

    public uc1(SuspendFunctionGun suspendFunctionGun) {
        this.b = suspendFunctionGun;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* JADX INFO: renamed from: getCallerFrame */
    public final CoroutineStackFrame getA() {
        Continuation continuation = x91.a;
        int i = this.a;
        SuspendFunctionGun suspendFunctionGun = this.b;
        if (i == Integer.MIN_VALUE) {
            i = suspendFunctionGun.f;
            this.a = i;
        }
        if (i < 0) {
            this.a = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            continuation = null;
        } else {
            try {
                Continuation continuation2 = suspendFunctionGun.e[i];
                if (continuation2 != null) {
                    this.a = i - 1;
                    continuation = continuation2;
                }
            } catch (Throwable unused) {
            }
        }
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getD() {
        SuspendFunctionGun suspendFunctionGun = this.b;
        Continuation[] continuationArr = suspendFunctionGun.e;
        int i = suspendFunctionGun.f;
        Continuation continuation = continuationArr[i];
        if (continuation != this && continuation != null) {
            return continuation.getD();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            Continuation continuation2 = continuationArr[i2];
            if (continuation2 != this && continuation2 != null) {
                return continuation2.getD();
            }
            i2 = i3;
        }
        u7.p("Not started");
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* JADX INFO: renamed from: getStackTraceElement */
    public final StackTraceElement getB() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        boolean zM42isFailureimpl = Result.m42isFailureimpl(obj);
        SuspendFunctionGun suspendFunctionGun = this.b;
        if (!zM42isFailureimpl) {
            suspendFunctionGun.f(false);
            return;
        }
        Throwable thM39exceptionOrNullimpl = Result.m39exceptionOrNullimpl(obj);
        thM39exceptionOrNullimpl.getClass();
        suspendFunctionGun.g(Result.m36constructorimpl(new Result.Failure(thM39exceptionOrNullimpl)));
    }
}
