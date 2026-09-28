package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.StreamSpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sc extends StreamSpec {
    public final Size b;
    public final DynamicRange c;
    public final Range d;
    public final Config e;
    public final boolean f;

    public sc(Size size, DynamicRange dynamicRange, Range range, Config config, boolean z) {
        this.b = size;
        this.c = dynamicRange;
        this.d = range;
        this.e = config;
        this.f = z;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final DynamicRange a() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Range b() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Config c() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Size d() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamSpec)) {
            return false;
        }
        StreamSpec streamSpec = (StreamSpec) obj;
        if (!this.b.equals(streamSpec.d()) || !this.c.equals(streamSpec.a()) || !this.d.equals(streamSpec.b())) {
            return false;
        }
        Config config = this.e;
        if (config == null) {
            if (streamSpec.c() != null) {
                return false;
            }
        } else if (!config.equals(streamSpec.c())) {
            return false;
        }
        return this.f == streamSpec.e();
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final rc f() {
        rc rcVar = new rc();
        rcVar.a = this.b;
        rcVar.b = this.c;
        rcVar.c = this.d;
        rcVar.d = this.e;
        rcVar.e = Boolean.valueOf(this.f);
        return rcVar;
    }

    public final int hashCode() {
        int iHashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Config config = this.e;
        return (this.f ? 1231 : 1237) ^ ((iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003);
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.b + ", dynamicRange=" + this.c + ", expectedFrameRateRange=" + this.d + ", implementationOptions=" + this.e + ", zslDisabled=" + this.f + "}";
    }
}
