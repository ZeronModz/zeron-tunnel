package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ov0 extends mv0 {
    public ov0(int i, Surface surface) {
        super(new nv0(new OutputConfiguration(i, surface)));
    }

    @Override // defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((nv0) this.a).b;
    }

    @Override // defpackage.mv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Object obj = this.a;
        jx0.a(obj instanceof nv0);
        return ((nv0) obj).a;
    }

    @Override // defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final String getPhysicalCameraId() {
        return null;
    }

    @Override // defpackage.mv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j) {
        ((nv0) this.a).b = j;
    }

    @Override // defpackage.mv0, defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }
}
