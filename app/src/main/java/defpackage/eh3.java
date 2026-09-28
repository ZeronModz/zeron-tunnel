package defpackage;

import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgg;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh3 extends zzgg {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ z b;

    public eh3(z zVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = zVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void zze(mi3 mi3Var) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            m mVar = this.b.a.f;
            r.h(mVar);
            mVar.n.b(Integer.valueOf(mi3Var.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(mi3Var);
            atomicReference.notifyAll();
        }
    }
}
