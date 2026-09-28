package defpackage;

import android.os.Handler;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.internal.TargetConfig;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xk implements TargetConfig {
    public static final xa b = new xa("camerax.core.appConfig.cameraFactoryProvider", CameraFactory.Provider.class, null);
    public static final xa c = new xa("camerax.core.appConfig.deviceSurfaceManagerProvider", CameraDeviceSurfaceManager.Provider.class, null);
    public static final xa d = new xa("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.Provider.class, null);
    public static final xa e = new xa("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final xa f = new xa("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final xa g = new xa("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final xa h = new xa("camerax.core.appConfig.availableCamerasLimiter", qk.class, null);
    public static final xa i = new xa("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final xa j = new xa("camerax.core.appConfig.cameraProviderInitRetryPolicy", RetryPolicy.class, null);
    public static final xa k = new xa("camerax.core.appConfig.quirksSettings", m01.class, null);
    public final l a;

    public xk(l lVar) {
        this.a = lVar;
    }

    public final qk a() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.a.retrieveOption(h);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (qk) objRetrieveOption;
    }

    public final CameraFactory.Provider b() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.a.retrieveOption(b);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (CameraFactory.Provider) objRetrieveOption;
    }

    public final long c() {
        Object objRetrieveOption = -1L;
        try {
            objRetrieveOption = this.a.retrieveOption(i);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objRetrieveOption).longValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ boolean containsOption(jq jqVar) {
        return hz.a(this, jqVar);
    }

    public final CameraDeviceSurfaceManager.Provider d() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.a.retrieveOption(c);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (CameraDeviceSurfaceManager.Provider) objRetrieveOption;
    }

    public final UseCaseConfigFactory.Provider e() {
        Object objRetrieveOption;
        try {
            objRetrieveOption = this.a.retrieveOption(d);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        return (UseCaseConfigFactory.Provider) objRetrieveOption;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        hz.b(this, str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Config.OptionPriority getOptionPriority(jq jqVar) {
        return hz.d(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set getPriorities(jq jqVar) {
        return hz.e(this, jqVar);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ Class getTargetClass() {
        return ec1.o(this);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ String getTargetName() {
        return ec1.s(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set listOptions() {
        return hz.g(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(jq jqVar) {
        return hz.h(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOptionWithPriority(jq jqVar, Config.OptionPriority optionPriority) {
        return hz.j(this, jqVar, optionPriority);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ Class getTargetClass(Class cls) {
        return ec1.p(this, cls);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ String getTargetName(String str) {
        return ec1.t(this, str);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(jq jqVar, Object obj) {
        return hz.i(this, jqVar, obj);
    }
}
