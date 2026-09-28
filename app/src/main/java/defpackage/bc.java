package defpackage;

import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends OutputSurfaceConfiguration {
    public final OutputSurface a;
    public final OutputSurface b;
    public final OutputSurface c;
    public final OutputSurface d;

    public bc(ac acVar, ac acVar2, ac acVar3, ac acVar4) {
        if (acVar == null) {
            io0.e("Null previewOutputSurface");
            throw null;
        }
        this.a = acVar;
        if (acVar2 == null) {
            io0.e("Null imageCaptureOutputSurface");
            throw null;
        }
        this.b = acVar2;
        this.c = acVar3;
        this.d = acVar4;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface a() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface b() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface c() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public final OutputSurface d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurfaceConfiguration)) {
            return false;
        }
        OutputSurfaceConfiguration outputSurfaceConfiguration = (OutputSurfaceConfiguration) obj;
        if (!this.a.equals(outputSurfaceConfiguration.d()) || !this.b.equals(outputSurfaceConfiguration.b())) {
            return false;
        }
        OutputSurface outputSurface = this.c;
        if (outputSurface == null) {
            if (outputSurfaceConfiguration.a() != null) {
                return false;
            }
        } else if (!outputSurface.equals(outputSurfaceConfiguration.a())) {
            return false;
        }
        OutputSurface outputSurface2 = this.d;
        return outputSurface2 == null ? outputSurfaceConfiguration.c() == null : outputSurface2.equals(outputSurfaceConfiguration.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        OutputSurface outputSurface = this.c;
        int iHashCode2 = (iHashCode ^ (outputSurface == null ? 0 : outputSurface.hashCode())) * 1000003;
        OutputSurface outputSurface2 = this.d;
        return iHashCode2 ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}
