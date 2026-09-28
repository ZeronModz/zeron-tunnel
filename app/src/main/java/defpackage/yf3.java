package defpackage;

import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzls;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ w c;

    public /* synthetic */ yf3(w wVar, AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = wVar;
    }

    private final void a() {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            try {
                try {
                    r rVar = this.c.a;
                    atomicReference.set(rVar.d.g(rVar.l().g(), l.c0));
                } finally {
                    this.b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            try {
                try {
                    r rVar = this.c.a;
                    atomicReference.set(Integer.valueOf(rVar.d.i(rVar.l().g(), l.e0)));
                } finally {
                    this.b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            r rVar = this.c.a;
                            atomicReference.set(Boolean.valueOf(rVar.d.k(rVar.l().g(), l.b0)));
                        } finally {
                            this.b.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            default:
                z zVarJ = this.c.a.j();
                ki3 ki3VarA = ki3.a(zzls.SGTM_CLIENT);
                AtomicReference atomicReference2 = this.b;
                zVarJ.a();
                zVarJ.b();
                zVarJ.o(new mu1(zVarJ, atomicReference2, zVarJ.q(false), ki3VarA, 16));
                return;
        }
    }
}
