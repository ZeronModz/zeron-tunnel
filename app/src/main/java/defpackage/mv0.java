package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class mv0 extends kv0 {
    public mv0(int i, Surface surface) {
        super(new lv0(new OutputConfiguration(i, surface)));
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d
    public final boolean a() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((lv0) this.a).c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        try {
            Field declaredField = OutputConfiguration.class.getDeclaredField("MAX_SURFACES_COUNT");
            declaredField.setAccessible(true);
            return declaredField.getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            km0.c("OutputConfigCompat");
            return 1;
        }
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Object obj = this.a;
        jx0.a(obj instanceof lv0);
        return ((lv0) obj).a;
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return ((lv0) this.a).b;
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final List getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(Surface surface) {
        if (getSurface() == surface) {
            u7.r("Cannot remove surface associated with this output configuration");
            return;
        }
        try {
            OutputConfiguration outputConfiguration = (OutputConfiguration) getOutputConfiguration();
            Field declaredField = OutputConfiguration.class.getDeclaredField("mSurfaces");
            declaredField.setAccessible(true);
            if (((List) declaredField.get(outputConfiguration)).remove(surface)) {
            } else {
                throw new IllegalArgumentException("Surface is not part of this output configuration");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            km0.c("OutputConfigCompat");
        }
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j) {
        ((lv0) this.a).c = j;
    }

    @Override // defpackage.kv0, androidx.camera.camera2.internal.compat.params.d, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((lv0) this.a).b = str;
    }
}
