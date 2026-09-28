package coil3;

import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hy;
import defpackage.i30;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcoil3/EventListener;", "Lcoil3/request/ImageRequest$Listener;", "<init>", "()V", "Factory", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EventListener implements ImageRequest.Listener {
    public static final i30 a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/EventListener$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/EventListener;", "NONE", "Lcoil3/EventListener;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcoil3/EventListener$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/request/ImageRequest;", "request", "Lcoil3/EventListener;", "create", "(Lcoil3/request/ImageRequest;)Lcoil3/EventListener;", "Companion", "coil3/a", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        public static final a Companion = a.a;
        public static final Factory NONE = new hy(15);

        EventListener create(ImageRequest request);
    }

    static {
        new Companion(null);
        a = new i30();
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onCancel(ImageRequest imageRequest) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onStart(ImageRequest imageRequest) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onError(ImageRequest imageRequest, ErrorResult errorResult) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
    }
}
