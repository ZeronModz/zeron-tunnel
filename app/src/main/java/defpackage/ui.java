package defpackage;

import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.r;
import androidx.camera.camera2.internal.t;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ui implements AsyncFunction, CallbackToFutureAdapter$Resolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ ui(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.a;
        u uVar = this.b;
        switch (i) {
            case 0:
                return uVar.a.g.c(true);
            case 1:
                return yg0.x(new ui(uVar, 4));
            case 2:
                return uVar.a.g.f();
            default:
                jc0 jc0Var = uVar.c;
                b bVar = uVar.a;
                t tVar = new t(new r(1));
                bVar.a(tVar);
                r4 r4Var = new r4(10, bVar, tVar);
                androidx.camera.core.impl.utils.executor.b bVar2 = bVar.b;
                oh ohVar = tVar.b;
                ohVar.b.addListener(r4Var, bVar2);
                return yg0.x(new ya0(ohVar, jc0Var, 2000L, 1));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.b bVar) {
        u uVar = this.b;
        if (!uVar.e.a()) {
            bVar.b(null);
            return "EnableTorchInternal";
        }
        km0.a("Camera2CapturePipeline");
        uVar.a.c(true);
        bVar.b(null);
        return "EnableTorchInternal";
    }
}
