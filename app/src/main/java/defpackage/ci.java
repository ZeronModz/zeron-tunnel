package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.f;
import androidx.camera.camera2.internal.o;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ci implements CallbackToFutureAdapter$Resolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ ci(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(b bVar) {
        int i = this.a;
        Object[] objArr = 0;
        o oVar = this.b;
        switch (i) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList(oVar.a.a().b().c);
                    arrayList.add(oVar.B.f);
                    arrayList.add(new fi(oVar, bVar));
                    oVar.b.a.openCamera(oVar.j.a, oVar.c, cn0.w(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    oVar.f("Unable to open camera for configAndClose: " + e.getMessage());
                    bVar.d(e);
                    return "configAndCloseTask";
                }
            case 1:
                try {
                    oVar.c.execute(new r4(6, oVar, bVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    bVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            case 2:
                jx0.g("Camera can only be released once, so release completer should be null on creation.", oVar.p == null);
                oVar.p = bVar;
                return "Release[camera=" + oVar + "]";
            default:
                oVar.c.execute(new f(oVar, bVar, objArr == true ? 1 : 0));
                return "Release[request=" + oVar.n.getAndIncrement() + "]";
        }
    }
}
