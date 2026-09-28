package coil3.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.RealImageLoader;
import coil3.memory.MemoryCache;
import coil3.util.Logger;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks;", "Lcoil3/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil3/RealImageLoader;", "imageLoader", "<init>", "(Lcoil3/RealImageLoader;)V", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidSystemCallbacks implements SystemCallbacks, ComponentCallbacks2 {
    public final WeakReference a;
    public Context b;
    public boolean c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public AndroidSystemCallbacks(RealImageLoader realImageLoader) {
        this.a = new WeakReference(realImageLoader);
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.a.get()) == null) {
            shutdown();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        MemoryCache memoryCache;
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.a.get();
            if (realImageLoader != null) {
                Logger logger = realImageLoader.a.g;
                if (logger != null) {
                    Logger.Level level = Logger.Level.Verbose;
                    if (logger.getA().compareTo(level) <= 0) {
                        logger.log("AndroidSystemCallbacks", level, "trimMemory, level=" + i, null);
                    }
                }
                if (i >= 40) {
                    MemoryCache memoryCache2 = realImageLoader.getMemoryCache();
                    if (memoryCache2 != null) {
                        memoryCache2.clear();
                    }
                } else if (i >= 10 && (memoryCache = realImageLoader.getMemoryCache()) != null) {
                    memoryCache.trimToSize(memoryCache.getSize() / 2);
                }
            } else {
                shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil3.util.SystemCallbacks
    public final synchronized void registerMemoryPressureCallbacks() {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.a.get();
            if (realImageLoader == null) {
                shutdown();
            } else if (this.b == null) {
                Context context = realImageLoader.a.a;
                this.b = context;
                context.registerComponentCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil3.util.SystemCallbacks
    public final synchronized void shutdown() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            Context context = this.b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
