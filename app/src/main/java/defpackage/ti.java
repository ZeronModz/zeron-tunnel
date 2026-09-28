package defpackage;

import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.s;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.impl.utils.executor.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ti {
    public final int a;
    public final b b;
    public final jc0 c;
    public final androidx.camera.camera2.internal.b d;
    public final OverrideAeModeForStillCapture e;
    public final boolean f;
    public long g = 1000000000;
    public final ArrayList h = new ArrayList();
    public final s i = new s(this);

    public ti(int i, b bVar, jc0 jc0Var, androidx.camera.camera2.internal.b bVar2, boolean z, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
        this.a = i;
        this.b = bVar;
        this.c = jc0Var;
        this.d = bVar2;
        this.f = z;
        this.e = overrideAeModeForStillCapture;
    }

    public final ListenableFuture a(int i) {
        boolean zIsEmpty = this.h.isEmpty();
        ListenableFuture listenableFuture = rf0.c;
        if (zIsEmpty) {
            return listenableFuture;
        }
        if (this.i.isCaptureResultNeeded()) {
            t tVar = new t(null);
            androidx.camera.camera2.internal.b bVar = this.d;
            bVar.a(tVar);
            r4 r4Var = new r4(10, bVar, tVar);
            b bVar2 = bVar.b;
            oh ohVar = tVar.b;
            ohVar.b.addListener(r4Var, bVar2);
            listenableFuture = ohVar;
        }
        xa0 xa0VarA = xa0.a(listenableFuture);
        ri riVar = new ri(this, i);
        b bVar3 = this.b;
        return xg0.z(xg0.z(xa0VarA, riVar, bVar3), new b1(this, 4), bVar3);
    }
}
