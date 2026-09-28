package coil3.request;

import android.view.View;
import defpackage.kf2;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil3/request/ViewTargetDisposable;", "Lcoil3/request/Disposable;", "Landroid/view/View;", "view", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "job", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewTargetDisposable implements Disposable {
    public final View a;
    public volatile Deferred b;

    public ViewTargetDisposable(View view, Deferred<? extends ImageResult> deferred) {
        this.a = view;
        this.b = deferred;
    }

    @Override // coil3.request.Disposable
    public final void dispose() {
        if (isDisposed()) {
            return;
        }
        kf2.i(this.a).a();
    }

    @Override // coil3.request.Disposable
    /* JADX INFO: renamed from: getJob, reason: from getter */
    public final Deferred getB() {
        return this.b;
    }

    @Override // coil3.request.Disposable
    public final boolean isDisposed() {
        boolean z;
        ViewTargetRequestManager viewTargetRequestManagerI = kf2.i(this.a);
        synchronized (viewTargetRequestManagerI) {
            z = this != viewTargetRequestManagerI.b;
        }
        return z;
    }
}
