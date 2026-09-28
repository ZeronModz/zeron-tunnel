package defpackage;

import com.google.android.gms.internal.ads.zzfjc;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dh2 {
    public final AtomicLong a;

    public dh2(zzfjc zzfjcVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        atomicLong.set(zzfjcVar.a.a.u.get());
    }

    public final void a(long j) {
        this.a.set(j);
    }
}
