package coil3.transition;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.Image;
import coil3.graphics.DataSource;
import coil3.request.ErrorResult;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.transition.Transition;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.j03;
import defpackage.p60;
import defpackage.u7;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcoil3/transition/CrossfadeTransition;", "Lcoil3/transition/Transition;", "Lcoil3/transition/TransitionTarget;", TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "durationMillis", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "preferExactIntrinsicSize", "<init>", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;IZ)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CrossfadeTransition implements Transition {
    public final TransitionTarget a;
    public final ImageResult b;
    public final int c;
    public final boolean d;

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z) {
        this.a = transitionTarget;
        this.b = imageResult;
        this.c = i;
        this.d = z;
        if (i > 0) {
            return;
        }
        u7.r("durationMillis must be > 0.");
        throw null;
    }

    @Override // coil3.transition.Transition
    public final void transition() {
        TransitionTarget transitionTarget = this.a;
        Drawable drawable = transitionTarget.getDrawable();
        ImageResult imageResult = this.b;
        Image a = imageResult.getA();
        boolean z = imageResult instanceof SuccessResult;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawable, a != null ? j03.b(a, transitionTarget.getView().getResources()) : null, imageResult.getB().v, this.c, (z && ((SuccessResult) imageResult).g) ? false : true, this.d);
        if (z) {
            transitionTarget.onSuccess(j03.c(crossfadeDrawable));
        } else if (imageResult instanceof ErrorResult) {
            transitionTarget.onError(j03.c(crossfadeDrawable));
        } else {
            p60.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/transition/CrossfadeTransition$Factory;", "Lcoil3/transition/Transition$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "durationMillis", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "preferExactIntrinsicSize", "<init>", "(IZ)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Transition.Factory {
        public final int a;
        public final boolean b;

        public Factory(int i, boolean z) {
            this.a = i;
            this.b = z;
            if (i > 0) {
                return;
            }
            u7.r("durationMillis must be > 0.");
            throw null;
        }

        @Override // coil3.transition.Transition.Factory
        public final Transition create(TransitionTarget transitionTarget, ImageResult imageResult) {
            return !(imageResult instanceof SuccessResult) ? Transition.Factory.NONE.create(transitionTarget, imageResult) : ((SuccessResult) imageResult).c == DataSource.MEMORY_CACHE ? Transition.Factory.NONE.create(transitionTarget, imageResult) : new CrossfadeTransition(transitionTarget, imageResult, this.a, this.b);
        }

        public Factory(int i) {
            this(i, false, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public /* synthetic */ Factory(int i, boolean z, int i2, xu xuVar) {
            this((i2 & 1) != 0 ? 200 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i) {
        this(transitionTarget, imageResult, i, false, 8, null);
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this(transitionTarget, imageResult, 0, false, 12, null);
    }

    public /* synthetic */ CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z, int i2, xu xuVar) {
        this(transitionTarget, imageResult, (i2 & 4) != 0 ? 200 : i, (i2 & 8) != 0 ? false : z);
    }
}
