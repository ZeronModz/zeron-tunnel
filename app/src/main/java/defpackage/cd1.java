package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.c;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd1 implements CallbackToFutureAdapter$Resolver, AsyncFunction {
    public final /* synthetic */ SessionConfigurationCompat a;
    public final /* synthetic */ List b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cd1(dd1 dd1Var, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.c = dd1Var;
        this.d = cameraDevice;
        this.a = sessionConfigurationCompat;
        this.b = list;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return ((dd1) this.c).o((CameraDevice) this.d, this.a, this.b);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        String str;
        l0 l0Var = this.c;
        List list = this.b;
        c cVar = (c) this.d;
        SessionConfigurationCompat sessionConfigurationCompat = this.a;
        synchronized (l0Var.a) {
            l0Var.j(list);
            jx0.g("The openCaptureSessionCompleter can only set once!", l0Var.i == null);
            l0Var.i = bVar;
            cVar.a(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + l0Var + "]";
        }
        return str;
    }

    public /* synthetic */ cd1(l0 l0Var, List list, c cVar, SessionConfigurationCompat sessionConfigurationCompat) {
        this.c = l0Var;
        this.b = list;
        this.d = cVar;
        this.a = sessionConfigurationCompat;
    }
}
