package coil3.size;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.ko1;
import defpackage.lo1;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil3/size/RealViewSizeResolver;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcoil3/size/ViewSizeResolver;", "view", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {
    public final View a;
    public final boolean b;

    public RealViewSizeResolver(T t, boolean z) {
        this.a = t;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealViewSizeResolver)) {
            return false;
        }
        RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj;
        return yg0.a(this.a, realViewSizeResolver.a) && this.b == realViewSizeResolver.b;
    }

    @Override // coil3.size.ViewSizeResolver
    /* JADX INFO: renamed from: getSubtractPadding, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // coil3.size.ViewSizeResolver
    /* JADX INFO: renamed from: getView, reason: from getter */
    public final View getA() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    @Override // coil3.size.ViewSizeResolver, coil3.size.SizeResolver
    public final Object size(Continuation continuation) {
        Size sizeB = ec1.B(this);
        if (sizeB != null) {
            return sizeB;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.c(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        lo1 lo1Var = new lo1(this, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(lo1Var);
        cancellableContinuationImpl.invokeOnCancellation(new ko1(this, viewTreeObserver, lo1Var));
        Object objM = cancellableContinuationImpl.m();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.a + ", subtractPadding=" + this.b + ')';
    }
}
