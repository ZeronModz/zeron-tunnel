package defpackage;

import androidx.camera.camera2.internal.m;
import androidx.camera.camera2.internal.n;
import androidx.camera.core.impl.utils.executor.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements Runnable {
    public final b a;
    public boolean b = false;
    public final /* synthetic */ n c;

    public hi(n nVar, b bVar) {
        this.c = nVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.execute(new m(this, 1));
    }
}
