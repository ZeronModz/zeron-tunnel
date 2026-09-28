package defpackage;

import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yh3 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ mo2 c;

    public yh3(mo2 mo2Var, long j, long j2) {
        Objects.requireNonNull(mo2Var);
        this.c = mo2Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = ((d0) this.c.c).a.g;
        r.h(qVar);
        qVar.j(new b0(this));
    }
}
