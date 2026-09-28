package defpackage;

import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.n;
import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.v;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s61 extends o {
    @Override // com.google.common.util.concurrent.o
    public final void c() {
        this.a.c();
        try {
            if (this.g.a != Service.State.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.g.a);
                f(illegalStateException);
                throw illegalStateException;
            }
            if (this.g.b) {
                this.g = new n(Service.State.STOPPING);
                d();
            } else {
                this.g = new n(Service.State.RUNNING);
                v vVar = this.f;
                e eVar = o.i;
                vVar.b(eVar, eVar);
            }
            this.a.g();
            b();
        } catch (Throwable th) {
            this.a.g();
            b();
            throw th;
        }
    }

    @Override // com.google.common.util.concurrent.o
    public final void d() {
        this.a.c();
        try {
            Service.State state = state();
            switch (i.a[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + state);
                case 2:
                case 3:
                case 4:
                    this.g = new n(Service.State.TERMINATED);
                    e(state);
                    break;
            }
        } finally {
            this.a.g();
            b();
        }
    }
}
