package coil3.request;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcoil3/request/Disposable;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "dispose", "()V", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "getJob", "()Lkotlinx/coroutines/Deferred;", "job", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isDisposed", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Disposable {
    void dispose();

    Deferred<ImageResult> getJob();

    boolean isDisposed();
}
