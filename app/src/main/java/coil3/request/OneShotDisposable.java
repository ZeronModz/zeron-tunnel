package coil3.request;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/request/OneShotDisposable;", "Lcoil3/request/Disposable;", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "job", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OneShotDisposable implements Disposable {
    public final Deferred a;

    public OneShotDisposable(Deferred<? extends ImageResult> deferred) {
        this.a = deferred;
    }

    @Override // coil3.request.Disposable
    public final void dispose() {
        if (isDisposed()) {
            return;
        }
        this.a.cancel((CancellationException) null);
    }

    @Override // coil3.request.Disposable
    /* JADX INFO: renamed from: getJob, reason: from getter */
    public final Deferred getA() {
        return this.a;
    }

    @Override // coil3.request.Disposable
    public final boolean isDisposed() {
        return !this.a.isActive();
    }
}
