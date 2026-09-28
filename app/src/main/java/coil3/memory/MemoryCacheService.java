package coil3.memory;

import coil3.BitmapImage;
import coil3.EventListener;
import coil3.Image;
import coil3.ImageLoader;
import coil3.b;
import coil3.key.Keyer;
import coil3.memory.MemoryCache;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.Options;
import coil3.request.RequestService;
import coil3.size.Dimension;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.Logger;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.cy;
import defpackage.fp0;
import defpackage.hz;
import defpackage.p60;
import defpackage.xu;
import defpackage.yg0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcoil3/memory/MemoryCacheService;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/request/RequestService;", "requestService", "Lcoil3/util/Logger;", "logger", "<init>", "(Lcoil3/ImageLoader;Lcoil3/request/RequestService;Lcoil3/util/Logger;)V", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MemoryCacheService {
    public final ImageLoader a;
    public final RequestService b;
    public final Logger c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcoil3/memory/MemoryCacheService$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TAG", "Ljava/lang/String;", "EXTRA_SIZE", "EXTRA_IS_SAMPLED", "EXTRA_DISK_CACHE_KEY", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public MemoryCacheService(ImageLoader imageLoader, RequestService requestService, Logger logger) {
        this.a = imageLoader;
        this.b = requestService;
        this.c = logger;
    }

    public final MemoryCache.Value a(ImageRequest imageRequest, MemoryCache.Key key, Size size, Scale scale) {
        int iAbs;
        double d;
        CachePolicy cachePolicy = imageRequest.n;
        Precision precision = imageRequest.w;
        Object obj = imageRequest.b;
        if (cachePolicy.getReadEnabled()) {
            MemoryCache memoryCache = this.a.getMemoryCache();
            MemoryCache.Value value = memoryCache != null ? memoryCache.get(key) : null;
            if (value != null) {
                boolean zIsCacheValueValidForHardware = this.b.isCacheValueValidForHardware(imageRequest, value);
                Logger logger = this.c;
                if (zIsCacheValueValidForHardware) {
                    String str = (String) key.b.get("coil#size");
                    if (str == null) {
                        Object obj2 = value.b.get("coil#is_sampled");
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Image image = value.a;
                        if (zBooleanValue || (!yg0.a(size, Size.c) && precision != Precision.INEXACT)) {
                            int b = image.getB();
                            int c = image.getC();
                            Size size2 = image instanceof BitmapImage ? (Size) b.a(imageRequest, coil3.request.a.b) : Size.c;
                            Dimension dimension = size.a;
                            int i = dimension instanceof cy ? ((cy) dimension).a : Integer.MAX_VALUE;
                            Dimension dimension2 = size2.a;
                            int iMin = Math.min(i, dimension2 instanceof cy ? ((cy) dimension2).a : Integer.MAX_VALUE);
                            Dimension dimension3 = size.b;
                            int i2 = dimension3 instanceof cy ? ((cy) dimension3).a : Integer.MAX_VALUE;
                            Dimension dimension4 = size2.b;
                            int iMin2 = Math.min(i2, dimension4 instanceof cy ? ((cy) dimension4).a : Integer.MAX_VALUE);
                            MemoryCache.Value value2 = value;
                            double d2 = ((double) iMin) / ((double) b);
                            double d3 = ((double) iMin2) / ((double) c);
                            int i3 = fp0.a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? Scale.FIT : scale).ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    p60.b();
                                    return null;
                                }
                                if (d2 < d3) {
                                    iAbs = Math.abs(iMin - b);
                                    d = d2;
                                } else {
                                    iAbs = Math.abs(iMin2 - c);
                                    d = d3;
                                }
                            } else if (d2 > d3) {
                                iAbs = Math.abs(iMin - b);
                                d = d2;
                            } else {
                                iAbs = Math.abs(iMin2 - c);
                                d = d3;
                            }
                            if (iAbs <= 1) {
                                return value2;
                            }
                            int i4 = fp0.b[precision.ordinal()];
                            if (i4 == 1) {
                                if (d == 1.0d) {
                                    return value2;
                                }
                                if (logger != null) {
                                    Logger.Level level = Logger.Level.Debug;
                                    if (logger.getA().compareTo(level) <= 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(obj);
                                        sb.append(": Memory cached image's size (");
                                        sb.append(b);
                                        sb.append(", ");
                                        sb.append(c);
                                        hz.C(iMin, iMin2, ") does not exactly match the target size (", ", ", sb);
                                        sb.append(").");
                                        logger.log("MemoryCacheService", level, sb.toString(), null);
                                        return null;
                                    }
                                }
                                return null;
                            }
                            if (i4 != 2) {
                                p60.b();
                                return null;
                            }
                            if (d <= 1.0d) {
                                return value2;
                            }
                            if (logger != null) {
                                Logger.Level level2 = Logger.Level.Debug;
                                if (logger.getA().compareTo(level2) <= 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(obj);
                                    sb2.append(": Memory cached image's size (");
                                    sb2.append(b);
                                    sb2.append(", ");
                                    sb2.append(c);
                                    hz.C(iMin, iMin2, ") is smaller than the target size (", ", ", sb2);
                                    sb2.append(").");
                                    logger.log("MemoryCacheService", level2, sb2.toString(), null);
                                    return null;
                                }
                            }
                            return null;
                        }
                    } else if (!str.equals(size.toString())) {
                        if (logger != null) {
                            Logger.Level level3 = Logger.Level.Debug;
                            if (logger.getA().compareTo(level3) <= 0) {
                                logger.log("MemoryCacheService", level3, obj + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + size + ").", null);
                                return null;
                            }
                        }
                    }
                    return value;
                }
                if (logger != null) {
                    Logger.Level level4 = Logger.Level.Debug;
                    if (logger.getA().compareTo(level4) <= 0) {
                        logger.log("MemoryCacheService", level4, obj + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final MemoryCache.Key b(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener) {
        String strKey;
        Logger logger;
        String str = imageRequest.e;
        Map map = imageRequest.f;
        if (str != null) {
            return new MemoryCache.Key(str, map);
        }
        List list = this.a.getE().c;
        int size = list.size();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i < size) {
                Pair pair = (Pair) list.get(i);
                Keyer keyer = (Keyer) pair.component1();
                if (((KClass) pair.component2()).isInstance(obj)) {
                    keyer.getClass();
                    strKey = keyer.key(obj, options);
                    if (strKey != null) {
                        break;
                    }
                    z = true;
                }
                i++;
            } else {
                if (!z && (logger = this.c) != null) {
                    Logger.Level level = Logger.Level.Warn;
                    if (logger.getA().compareTo(level) <= 0) {
                        logger.log("MemoryCacheService", level, "No keyer is registered for data with type '" + Reflection.a(obj.getClass()).getSimpleName() + "'. Register Keyer<" + Reflection.a(obj.getClass()).getSimpleName() + "> in the component registry to cache the output image in the memory cache.", null);
                    }
                }
                strKey = null;
            }
        }
        if (strKey == null) {
            return null;
        }
        if (((List) b.a(imageRequest, coil3.request.a.a)).isEmpty()) {
            return new MemoryCache.Key(strKey, map);
        }
        LinkedHashMap linkedHashMapK = d.k(map);
        linkedHashMapK.put("coil#size", options.b.toString());
        return new MemoryCache.Key(strKey, linkedHashMapK);
    }
}
