package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 extends ov0 {
    public pv0(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    @Override // defpackage.ov0, defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final long getDynamicRangeProfile() {
        return ((OutputConfiguration) getOutputConfiguration()).getDynamicRangeProfile();
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final int getMirrorMode() {
        return ((OutputConfiguration) getOutputConfiguration()).getMirrorMode();
    }

    @Override // defpackage.ov0, defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final Object getOutputConfiguration() {
        Object obj = this.a;
        jx0.a(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final long getStreamUseCase() {
        return ((OutputConfiguration) getOutputConfiguration()).getStreamUseCase();
    }

    @Override // defpackage.ov0, defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void setDynamicRangeProfile(long j) {
        ((OutputConfiguration) getOutputConfiguration()).setDynamicRangeProfile(j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void setMirrorMode(int i) {
        ((OutputConfiguration) getOutputConfiguration()).setMirrorMode(i);
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void setStreamUseCase(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) getOutputConfiguration()).setStreamUseCase(j);
    }
}
