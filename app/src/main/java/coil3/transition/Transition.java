package coil3.transition;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.request.ImageResult;
import coil3.transition.NoneTransition;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcoil3/transition/Transition;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "transition", "()V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Transition {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcoil3/transition/Transition$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/transition/TransitionTarget;", TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "Lcoil3/transition/Transition;", "create", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;)Lcoil3/transition/Transition;", "Companion", "coil3/transition/a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        public static final a Companion = a.a;
        public static final Factory NONE = new NoneTransition.Factory();

        Transition create(TransitionTarget target, ImageResult result);
    }

    void transition();
}
