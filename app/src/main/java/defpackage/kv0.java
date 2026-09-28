package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class kv0 extends d {
    public kv0(int i, Surface surface) {
        super(new jv0(new OutputConfiguration(i, surface)));
    }

    @Override // androidx.camera.camera2.internal.compat.params.d
    public boolean a() {
        return ((jv0) this.a).c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((jv0) this.a).c = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((jv0) this.a).d;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Object obj = this.a;
        jx0.a(obj instanceof jv0);
        return ((jv0) obj).a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return ((jv0) this.a).b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public List getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j) {
        ((jv0) this.a).d = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((jv0) this.a).b = str;
    }
}
