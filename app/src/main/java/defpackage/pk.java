package defpackage;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pk implements RetryPolicy {
    public final /* synthetic */ long a;

    public pk(long j) {
        this.a = j;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        return this.a;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final v31 onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return executionState.getStatus() == 1 ? v31.d : v31.e;
    }
}
