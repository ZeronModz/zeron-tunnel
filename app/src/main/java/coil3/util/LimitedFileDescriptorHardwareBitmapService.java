package coil3.util;

import android.os.SystemClock;
import coil3.size.Dimension;
import coil3.size.Size;
import coil3.util.Logger;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.cy;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcoil3/util/LimitedFileDescriptorHardwareBitmapService;", "Lcoil3/util/HardwareBitmapService;", "Lcoil3/util/Logger;", "logger", "<init>", "(Lcoil3/util/Logger;)V", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LimitedFileDescriptorHardwareBitmapService implements HardwareBitmapService {
    public final Logger a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/util/LimitedFileDescriptorHardwareBitmapService$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "MIN_SIZE_DIMENSION", "I", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public LimitedFileDescriptorHardwareBitmapService(Logger logger) {
        this.a = logger;
    }

    @Override // coil3.util.HardwareBitmapService
    public final boolean allowHardwareMainThread(Size size) {
        Dimension dimension = size.a;
        if ((dimension instanceof cy ? ((cy) dimension).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        Dimension dimension2 = size.b;
        return (dimension2 instanceof cy ? ((cy) dimension2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // coil3.util.HardwareBitmapService
    /* JADX INFO: renamed from: allowHardwareWorkerThread */
    public final boolean getA() {
        boolean z;
        a aVar = a.a;
        Logger logger = this.a;
        synchronized (aVar) {
            try {
                int i = a.c;
                a.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > a.d + 30000) {
                    a.c = 0;
                    a.d = SystemClock.uptimeMillis();
                    String[] list = a.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z2 = length < 800;
                    a.e = z2;
                    if (!z2 && logger != null) {
                        Logger.Level level = Logger.Level.Warn;
                        if (logger.getA().compareTo(level) <= 0) {
                            logger.log("FileDescriptorCounter", level, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                        }
                    }
                }
                z = a.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
