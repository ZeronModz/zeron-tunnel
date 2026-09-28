package defpackage;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t31 implements RetryPolicy {
    @Override // androidx.camera.core.RetryPolicy
    public final long getTimeoutInMillis() {
        int i = u31.a;
        return 0L;
    }

    @Override // androidx.camera.core.RetryPolicy
    public final v31 onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        int i = u31.a;
        return v31.d;
    }
}
