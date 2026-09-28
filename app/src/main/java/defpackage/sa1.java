package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 implements UseCaseConfig, ImageOutputConfig, ThreadConfig {
    public static final xa b = new xa("camerax.core.streamSharing.captureTypes", List.class, null);
    public final l a;

    public sa1(l lVar) {
        this.a = lVar;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ boolean containsOption(jq jqVar) {
        return hz.a(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        hz.b(this, str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getAppTargetRotation(int i) {
        return lf0.a(this, i);
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public final Executor getBackgroundExecutor() {
        return (Executor) retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig$OptionUnpacker getCaptureOptionUnpacker() {
        return ec1.c(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ UseCaseConfigFactory.CaptureType getCaptureType() {
        return ec1.e(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ List getCustomOrderedResolutions() {
        return lf0.b(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ el getDefaultCaptureConfig() {
        return ec1.f(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size getDefaultResolution(Size size) {
        int i = lf0.a;
        return (Size) retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ v61 getDefaultSessionConfig() {
        return ec1.h(this);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final /* synthetic */ DynamicRange getDynamicRange() {
        return hz.c(this);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((Integer) retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size getMaxResolution(Size size) {
        int i = lf0.a;
        return (Size) retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getMirrorMode(int i) {
        return lf0.d(this, i);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Config.OptionPriority getOptionPriority(jq jqVar) {
        return hz.d(this, jqVar);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getPreviewStabilizationMode() {
        return ec1.j(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set getPriorities(jq jqVar) {
        return hz.e(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final l31 getResolutionSelector(l31 l31Var) {
        int i = lf0.a;
        return (l31) retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, l31Var);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig$OptionUnpacker getSessionOptionUnpacker() {
        return ec1.k(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final List getSupportedResolutions(List list) {
        int i = lf0.a;
        return (List) retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getSurfaceOccupancyPriority() {
        return ec1.m(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getTargetAspectRatio() {
        return lf0.e(this);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ Class getTargetClass() {
        return ec1.o(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ Range getTargetFrameRate() {
        return ec1.q(this);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ String getTargetName() {
        return ec1.s(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size getTargetResolution(Size size) {
        int i = lf0.a;
        return (Size) retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getTargetRotation() {
        return lf0.f(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getVideoStabilizationMode() {
        return ec1.u(this);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final boolean hasDynamicRange() {
        return containsOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final boolean hasTargetAspectRatio() {
        int i = lf0.a;
        return hz.a(this, ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ boolean isHighResolutionDisabled(boolean z) {
        return ec1.v(this, z);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ boolean isZslDisabled(boolean z) {
        return ec1.x(this, z);
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

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig$OptionUnpacker getCaptureOptionUnpacker(CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        return ec1.d(this, captureConfig$OptionUnpacker);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ List getCustomOrderedResolutions(List list) {
        return lf0.c(this, list);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ el getDefaultCaptureConfig(el elVar) {
        return ec1.g(this, elVar);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ v61 getDefaultSessionConfig(v61 v61Var) {
        return ec1.i(this, v61Var);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig$OptionUnpacker getSessionOptionUnpacker(SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        return ec1.l(this, sessionConfig$OptionUnpacker);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getSurfaceOccupancyPriority(int i) {
        return ec1.n(this, i);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ Class getTargetClass(Class cls) {
        return ec1.p(this, cls);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ Range getTargetFrameRate(Range range) {
        return ec1.r(this, range);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ String getTargetName(String str) {
        return ec1.t(this, str);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getTargetRotation(int i) {
        return lf0.g(this, i);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(jq jqVar, Object obj) {
        return hz.i(this, jqVar, obj);
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public final /* synthetic */ Executor getBackgroundExecutor(Executor executor) {
        return ec1.b(this, executor);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size getDefaultResolution() {
        int i = lf0.a;
        return (Size) retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size getMaxResolution() {
        int i = lf0.a;
        return (Size) retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final l31 getResolutionSelector() {
        int i = lf0.a;
        return (l31) retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final List getSupportedResolutions() {
        int i = lf0.a;
        return (List) retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final Size getTargetResolution() {
        int i = lf0.a;
        return (Size) retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION);
    }
}
