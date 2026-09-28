package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pt0 extends AbstractCoroutineContextElement implements Job {
    public static final pt0 b = new pt0(Job.Key);

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        return qt0.a;
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return a20.a;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return qt0.a;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ void cancel() {
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return qt0.a;
    }

    @Override // kotlinx.coroutines.Job
    public final Job plus(Job job) {
        return job;
    }
}
