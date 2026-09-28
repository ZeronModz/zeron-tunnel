package defpackage;

import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.l;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.streamsharing.StreamSharing;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements UseCaseConfig.Builder {
    public final k a;

    public ra1(k kVar) {
        Object objRetrieveOption;
        this.a = kVar;
        try {
            objRetrieveOption = kVar.retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        Class cls = (Class) objRetrieveOption;
        if (cls != null && !cls.equals(StreamSharing.class)) {
            oq.h("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        this.a.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.STREAM_SHARING);
        a(StreamSharing.class);
    }

    public final void a(Class cls) {
        Object objRetrieveOption;
        jq jqVar = TargetConfig.OPTION_TARGET_CLASS;
        k kVar = this.a;
        kVar.insertOption(jqVar, cls);
        try {
            objRetrieveOption = kVar.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        if (objRetrieveOption == null) {
            kVar.insertOption(TargetConfig.OPTION_TARGET_NAME, cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final Object build() {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final MutableConfig getMutableConfig() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final UseCaseConfig getUseCaseConfig() {
        return new sa1(l.a(this.a));
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureOptionUnpacker(CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
        this.a.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultCaptureConfig(el elVar) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultSessionConfig(v61 v61Var) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setHighResolutionDisabled(boolean z) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSessionOptionUnpacker(SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSurfaceOccupancyPriority(int i) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
        a(cls);
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final Object setTargetName(String str) {
        this.a.insertOption(TargetConfig.OPTION_TARGET_NAME, str);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setZslDisabled(boolean z) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }
}
