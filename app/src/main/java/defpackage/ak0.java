package defpackage;

import android.os.Build;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ak0 implements LifecycleObserver, Camera {
    public final LifecycleOwner b;
    public final CameraUseCaseAdapter c;
    public final Object a = new Object();
    public boolean d = false;

    public ak0(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.b = lifecycleOwner;
        this.c = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getD().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.b();
        } else {
            cameraUseCaseAdapter.i();
        }
        lifecycleOwner.getLifecycle().a(this);
    }

    public final void a(Collection collection) {
        synchronized (this.a) {
            this.c.a(collection);
        }
    }

    public final LifecycleOwner b() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.a) {
            lifecycleOwner = this.b;
        }
        return lifecycleOwner;
    }

    public final List c() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.c.n());
        }
        return listUnmodifiableList;
    }

    public final boolean d(k kVar) {
        boolean zContains;
        synchronized (this.a) {
            zContains = ((ArrayList) this.c.n()).contains(kVar);
        }
        return zContains;
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                onStop(this.b);
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Collection collection) {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.c.n());
            this.c.t(arrayList);
        }
    }

    public final void g() {
        synchronized (this.a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.c;
            cameraUseCaseAdapter.t((ArrayList) cameraUseCaseAdapter.n());
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControl getCameraControl() {
        return this.c.q;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.c.r;
    }

    @Override // androidx.camera.core.Camera
    public final CameraConfig getExtendedConfig() {
        return this.c.getExtendedConfig();
    }

    public final void h() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    this.d = false;
                    if (this.b.getLifecycle().getD().isAtLeast(Lifecycle.State.STARTED)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(k... kVarArr) {
        return this.c.isUseCasesCombinationSupported(true, kVarArr);
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupportedByFramework(k... kVarArr) {
        return this.c.isUseCasesCombinationSupported(false, kVarArr);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.c;
            cameraUseCaseAdapter.t((ArrayList) cameraUseCaseAdapter.n());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.c.a.setActiveResumingMode(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.c.a.setActiveResumingMode(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final boolean isUseCasesCombinationSupported(boolean z, k... kVarArr) {
        return this.c.isUseCasesCombinationSupported(z, kVarArr);
    }
}
