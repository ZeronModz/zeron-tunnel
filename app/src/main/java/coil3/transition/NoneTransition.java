package coil3.transition;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.request.ErrorResult;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.transition.Transition;
import defpackage.p60;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/transition/NoneTransition;", "Lcoil3/transition/Transition;", "Lcoil3/transition/TransitionTarget;", TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "<init>", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NoneTransition implements Transition {
    public final TransitionTarget a;
    public final ImageResult b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/transition/NoneTransition$Factory;", "Lcoil3/transition/Transition$Factory;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Transition.Factory {
        @Override // coil3.transition.Transition.Factory
        public final Transition create(TransitionTarget transitionTarget, ImageResult imageResult) {
            return new NoneTransition(transitionTarget, imageResult);
        }
    }

    public NoneTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this.a = transitionTarget;
        this.b = imageResult;
    }

    @Override // coil3.transition.Transition
    public final void transition() {
        ImageResult imageResult = this.b;
        boolean z = imageResult instanceof SuccessResult;
        TransitionTarget transitionTarget = this.a;
        if (z) {
            transitionTarget.onSuccess(((SuccessResult) imageResult).a);
        } else if (imageResult instanceof ErrorResult) {
            transitionTarget.onError(((ErrorResult) imageResult).a);
        } else {
            p60.b();
        }
    }
}
