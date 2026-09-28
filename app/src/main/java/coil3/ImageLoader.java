package coil3;

import android.content.Context;
import coil3.EventListener;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.disk.DiskCache;
import coil3.memory.MemoryCache;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.util.Logger;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lcoil3/ImageLoader;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/request/ImageRequest;", "request", "Lcoil3/request/Disposable;", "enqueue", "(Lcoil3/request/ImageRequest;)Lcoil3/request/Disposable;", "Lcoil3/request/ImageResult;", "execute", "(Lcoil3/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk1;", "shutdown", "()V", "Lcoil3/ImageLoader$Builder;", "newBuilder", "()Lcoil3/ImageLoader$Builder;", "Lcoil3/request/ImageRequest$Defaults;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "defaults", "Lcoil3/ComponentRegistry;", "getComponents", "()Lcoil3/ComponentRegistry;", "components", "Lcoil3/memory/MemoryCache;", "getMemoryCache", "()Lcoil3/memory/MemoryCache;", "memoryCache", "Lcoil3/disk/DiskCache;", "getDiskCache", "()Lcoil3/disk/DiskCache;", "diskCache", "Builder", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ImageLoader {
    Disposable enqueue(ImageRequest request);

    Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation);

    /* JADX INFO: renamed from: getComponents */
    ComponentRegistry getE();

    ImageRequest.Defaults getDefaults();

    DiskCache getDiskCache();

    MemoryCache getMemoryCache();

    Builder newBuilder();

    void shutdown();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/ImageLoader$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil3/RealImageLoader$Options;", "options", "(Lcoil3/RealImageLoader$Options;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final Context a;
        public final ImageRequest.Defaults b;
        public final Lazy c;
        public final Lazy d;
        public final EventListener.Factory e;
        public final ComponentRegistry f;
        public final Logger g;
        public final Extras.Builder h;

        public Builder(RealImageLoader.Options options) {
            this.a = options.a;
            ImageRequest.Defaults defaults = options.b;
            this.b = defaults;
            this.c = options.c;
            this.d = options.d;
            this.e = options.e;
            this.f = options.f;
            this.g = options.g;
            Extras extras = defaults.n;
            extras.getClass();
            this.h = new Extras.Builder(extras);
        }

        public Builder(Context context) {
            this.a = context.getApplicationContext();
            this.b = ImageRequest.Defaults.o;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = new Extras.Builder();
        }
    }
}
