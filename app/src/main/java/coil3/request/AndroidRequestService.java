package coil3.request;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.BitmapImage;
import coil3.Extras;
import coil3.Image;
import coil3.ImageLoader;
import coil3.memory.MemoryCache;
import coil3.target.Target;
import coil3.target.ViewTarget;
import coil3.util.HardwareBitmapService;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import defpackage.ee;
import defpackage.i5;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/request/AndroidRequestService;", "Lcoil3/request/RequestService;", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/util/SystemCallbacks;", "systemCallbacks", "Lcoil3/util/Logger;", "logger", "<init>", "(Lcoil3/ImageLoader;Lcoil3/util/SystemCallbacks;Lcoil3/util/Logger;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidRequestService implements RequestService {
    public final ImageLoader a;
    public final SystemCallbacks b;
    public final Logger c;
    public final HardwareBitmapService d;

    public AndroidRequestService(ImageLoader imageLoader, SystemCallbacks systemCallbacks, Logger logger) {
        this.a = imageLoader;
        this.b = systemCallbacks;
        this.c = logger;
        this.d = coil3.util.b.a(logger);
    }

    public static Lifecycle a(ImageRequest imageRequest) {
        Target target = imageRequest.c;
        Object context = target instanceof ViewTarget ? ((ViewTarget) target).getView().getContext() : imageRequest.a;
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).getLifecycle();
    }

    public static boolean b(ImageRequest imageRequest, Bitmap.Config config) {
        if (!i5.k(config)) {
            return true;
        }
        if (!((Boolean) coil3.b.a(imageRequest, b.f)).booleanValue()) {
            return false;
        }
        Target target = imageRequest.c;
        if (!(target instanceof ViewTarget)) {
            return true;
        }
        View view = ((ViewTarget) target).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    @Override // coil3.request.RequestService
    public final boolean isCacheValueValidForHardware(ImageRequest imageRequest, MemoryCache.Value value) {
        Image image = value.a;
        BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
        if (bitmapImage == null) {
            return true;
        }
        Bitmap.Config config = bitmapImage.a.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return b(imageRequest, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    @Override // coil3.request.RequestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil3.request.Options options(coil3.request.ImageRequest r21, coil3.size.Size r22) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.request.AndroidRequestService.options(coil3.request.ImageRequest, coil3.size.Size):coil3.request.Options");
    }

    @Override // coil3.request.RequestService
    public final RequestDelegate requestDelegate(ImageRequest imageRequest, Job job, boolean z) {
        Target target = imageRequest.c;
        if (target instanceof ViewTarget) {
            Lifecycle lifecycleA = (Lifecycle) coil3.b.a(imageRequest, b.e);
            if (lifecycleA == null) {
                lifecycleA = a(imageRequest);
            }
            return new ViewTargetRequestDelegate(this.a, imageRequest, (ViewTarget) target, lifecycleA, job);
        }
        Lifecycle lifecycleA2 = (Lifecycle) coil3.b.a(imageRequest, b.e);
        if (lifecycleA2 == null) {
            lifecycleA2 = z ? a(imageRequest) : null;
        }
        return lifecycleA2 != null ? new LifecycleRequestDelegate(lifecycleA2, job) : new ee(job);
    }

    @Override // coil3.request.RequestService
    public final Options updateOptions(Options options) {
        boolean z;
        Extras extrasA = options.j;
        Extras.Key key = b.b;
        if (!i5.k((Bitmap.Config) coil3.b.b(options, key)) || this.d.getA()) {
            z = false;
        } else {
            extrasA.getClass();
            Extras.Builder builder = new Extras.Builder(extrasA);
            int i = Extras.Key.b;
            builder.b(key, Bitmap.Config.ARGB_8888);
            extrasA = builder.a();
            z = true;
        }
        return z ? new Options(options.a, options.b, options.c, options.d, options.e, options.f, options.g, options.h, options.i, extrasA) : options;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    @Override // coil3.request.RequestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil3.request.ImageRequest updateRequest(coil3.request.ImageRequest r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.request.AndroidRequestService.updateRequest(coil3.request.ImageRequest):coil3.request.ImageRequest");
    }
}
