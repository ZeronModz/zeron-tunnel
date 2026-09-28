package defpackage;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig$OutputConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oc extends SessionConfig$OutputConfig {
    public final DeferrableSurface a;
    public final List b;
    public final int c;
    public final int d;
    public final DynamicRange e;

    public oc(DeferrableSurface deferrableSurface, List list, int i, int i2, DynamicRange dynamicRange) {
        this.a = deferrableSurface;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig$OutputConfig
    public final DynamicRange b() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.SessionConfig$OutputConfig
    public final int c() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.SessionConfig$OutputConfig
    public final String d() {
        return null;
    }

    @Override // androidx.camera.core.impl.SessionConfig$OutputConfig
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionConfig$OutputConfig)) {
            return false;
        }
        SessionConfig$OutputConfig sessionConfig$OutputConfig = (SessionConfig$OutputConfig) obj;
        return this.a.equals(sessionConfig$OutputConfig.f()) && this.b.equals(sessionConfig$OutputConfig.e()) && sessionConfig$OutputConfig.d() == null && this.c == sessionConfig$OutputConfig.c() && this.d == sessionConfig$OutputConfig.g() && this.e.equals(sessionConfig$OutputConfig.b());
    }

    @Override // androidx.camera.core.impl.SessionConfig$OutputConfig
    public final DeferrableSurface f() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.SessionConfig$OutputConfig
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
