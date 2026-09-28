package defpackage;

import android.os.Handler;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class va extends CameraThreadConfig {
    public final Executor a;
    public final Handler b;

    public va(Executor executor, Handler handler) {
        if (executor == null) {
            io0.e("Null cameraExecutor");
            throw null;
        }
        this.a = executor;
        if (handler != null) {
            this.b = handler;
        } else {
            io0.e("Null schedulerHandler");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public final Executor a() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public final Handler b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
        return this.a.equals(cameraThreadConfig.a()) && this.b.equals(cameraThreadConfig.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
