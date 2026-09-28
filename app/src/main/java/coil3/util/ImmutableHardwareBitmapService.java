package coil3.util;

import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/util/ImmutableHardwareBitmapService;", "Lcoil3/util/HardwareBitmapService;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "allowHardware", "<init>", "(Z)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ImmutableHardwareBitmapService implements HardwareBitmapService {
    public final boolean a;

    public ImmutableHardwareBitmapService(boolean z) {
        this.a = z;
    }

    @Override // coil3.util.HardwareBitmapService
    public final boolean allowHardwareMainThread(Size size) {
        return this.a;
    }

    @Override // coil3.util.HardwareBitmapService
    /* JADX INFO: renamed from: allowHardwareWorkerThread, reason: from getter */
    public final boolean getA() {
        return this.a;
    }
}
