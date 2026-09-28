package defpackage;

import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgd;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dh3 extends zzgd {
    public final /* synthetic */ AtomicReference a;

    public dh3(z zVar, AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void zze(List list) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
