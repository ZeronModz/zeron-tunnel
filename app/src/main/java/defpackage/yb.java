package defpackage;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.processing.util.OutConfig;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yb extends OutConfig {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public yb(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            io0.e("Null getUuid");
            throw null;
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            io0.e("Null getCropRect");
            throw null;
        }
        this.d = rect;
        if (size == null) {
            io0.e("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final Rect a() {
        return this.d;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int c() {
        return this.f;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final Size d() {
        return this.e;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutConfig)) {
            return false;
        }
        OutConfig outConfig = (OutConfig) obj;
        return this.a.equals(outConfig.f()) && this.b == outConfig.e() && this.c == outConfig.b() && this.d.equals(outConfig.a()) && this.e.equals(outConfig.d()) && this.f == outConfig.c() && this.g == outConfig.g() && !outConfig.h();
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final UUID f() {
        return this.a;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean g() {
        return this.g;
    }

    @Override // androidx.camera.core.processing.util.OutConfig
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (((this.g ? 1231 : 1237) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.a + ", getTargets=" + this.b + ", getFormat=" + this.c + ", getCropRect=" + this.d + ", getSize=" + this.e + ", getRotationDegrees=" + this.f + ", isMirroring=" + this.g + ", shouldRespectInputCropRect=false}";
    }
}
