package coil3.util;

import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcoil3/util/HardwareBitmapService;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "allowHardwareMainThread", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "Lcoil3/size/Size;", "allowHardwareWorkerThread", "Lcoil3/util/ImmutableHardwareBitmapService;", "Lcoil3/util/LimitedFileDescriptorHardwareBitmapService;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HardwareBitmapService {
    boolean allowHardwareMainThread(Size size);

    boolean allowHardwareWorkerThread();
}
