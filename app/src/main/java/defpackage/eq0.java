package defpackage;

import android.util.Range;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.k;
import androidx.camera.core.internal.TargetConfig;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 implements UseCaseConfig {
    public final k a;

    public eq0() {
        k kVarB = k.b();
        kVarB.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new dj());
        kVarB.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        kVarB.insertOption(TargetConfig.OPTION_TARGET_CLASS, fq0.class);
        kVarB.insertOption(TargetConfig.OPTION_TARGET_NAME, fq0.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = kVarB;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ boolean containsOption(jq jqVar) {
        return hz.a(this, jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final void findOptions(String str, Config.OptionMatcher optionMatcher) {
        this.a.findOptions(str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig$OptionUnpacker getCaptureOptionUnpacker() {
        return ec1.c(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final UseCaseConfigFactory.CaptureType getCaptureType() {
        return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ el getDefaultCaptureConfig() {
        return ec1.f(this);
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

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final Config.OptionPriority getOptionPriority(jq jqVar) {
        return this.a.getOptionPriority(jqVar);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getPreviewStabilizationMode() {
        return ec1.j(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final Set getPriorities(jq jqVar) {
        return this.a.getPriorities(jqVar);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig$OptionUnpacker getSessionOptionUnpacker() {
        return ec1.k(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getSurfaceOccupancyPriority() {
        return ec1.m(this);
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

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getVideoStabilizationMode() {
        return ec1.u(this);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final boolean hasDynamicRange() {
        return containsOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE);
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
    public final Set listOptions() {
        return this.a.listOptions();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final Object retrieveOption(jq jqVar) {
        return this.a.retrieveOption(jqVar);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final Object retrieveOptionWithPriority(jq jqVar, Config.OptionPriority optionPriority) {
        return this.a.retrieveOptionWithPriority(jqVar, optionPriority);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig$OptionUnpacker getCaptureOptionUnpacker(CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        return ec1.d(this, captureConfig$OptionUnpacker);
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

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(jq jqVar, Object obj) {
        return hz.i(this, jqVar, obj);
    }
}
