package coil3.request;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.ImageLoader;
import coil3.target.ViewTarget;
import coil3.util.c;
import defpackage.kf2;
import defpackage.mk1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Lcoil3/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/request/ImageRequest;", "initialRequest", "Lcoil3/target/ViewTarget;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil3/ImageLoader;Lcoil3/request/ImageRequest;Lcoil3/target/ViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewTargetRequestDelegate implements RequestDelegate, DefaultLifecycleObserver {
    public final ImageLoader a;
    public final ImageRequest b;
    public final ViewTarget c;
    public final Lifecycle d;
    public final Job e;

    public ViewTargetRequestDelegate(ImageLoader imageLoader, ImageRequest imageRequest, ViewTarget<?> viewTarget, Lifecycle lifecycle, Job job) {
        this.a = imageLoader;
        this.b = imageRequest;
        this.c = viewTarget;
        this.d = lifecycle;
        this.e = job;
    }

    @Override // coil3.request.RequestDelegate
    public final void assertActive() {
        ViewTarget viewTarget = this.c;
        if (viewTarget.getView().isAttachedToWindow()) {
            return;
        }
        ViewTargetRequestManager viewTargetRequestManagerI = kf2.i(viewTarget.getView());
        ViewTargetRequestDelegate viewTargetRequestDelegate = viewTargetRequestManagerI.d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        viewTargetRequestManagerI.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil3.request.RequestDelegate
    public final Object awaitStarted(Continuation continuation) {
        Object objA;
        mk1 mk1Var = mk1.a;
        Lifecycle lifecycle = this.d;
        return (lifecycle == null || (objA = c.a(lifecycle, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? mk1Var : objA;
    }

    @Override // coil3.request.RequestDelegate
    public final void dispose() {
        this.e.cancel((CancellationException) null);
        ViewTarget viewTarget = this.c;
        boolean z = viewTarget instanceof LifecycleObserver;
        Lifecycle lifecycle = this.d;
        if (z && lifecycle != null) {
            lifecycle.c((LifecycleObserver) viewTarget);
        }
        if (lifecycle != null) {
            lifecycle.c(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        kf2.i(this.c.getView()).a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
        Lifecycle lifecycle = this.d;
        if (lifecycle != null) {
            lifecycle.a(this);
        }
        ViewTarget viewTarget = this.c;
        if ((viewTarget instanceof LifecycleObserver) && lifecycle != null) {
            LifecycleObserver lifecycleObserver = (LifecycleObserver) viewTarget;
            lifecycle.c(lifecycleObserver);
            lifecycle.a(lifecycleObserver);
        }
        ViewTargetRequestManager viewTargetRequestManagerI = kf2.i(viewTarget.getView());
        ViewTargetRequestDelegate viewTargetRequestDelegate = viewTargetRequestManagerI.d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        viewTargetRequestManagerI.d = this;
    }

    @Override // coil3.request.RequestDelegate
    public final void complete() {
    }
}
