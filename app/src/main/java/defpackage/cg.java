package defpackage;

import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                CompletableDeferred completableDeferred = (CompletableDeferred) obj2;
                if (th == null) {
                    completableDeferred.complete(mk1Var);
                } else {
                    completableDeferred.completeExceptionally(th);
                }
                break;
            case 1:
                JobImpl jobImpl = (JobImpl) obj2;
                if (jobImpl.isActive()) {
                    jobImpl.e(new AbortFlowException(jobImpl));
                }
                break;
            case 2:
                ((RealCall) obj2).cancel();
                break;
            default:
                Result.Companion companion = Result.INSTANCE;
                ((CancellableContinuationImpl) obj2).resumeWith(Result.m36constructorimpl(mk1Var));
                break;
        }
        return mk1Var;
    }
}
