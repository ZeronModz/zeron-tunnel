package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ w c;

    public /* synthetic */ bg3(w wVar, AtomicReference atomicReference, int i) {
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
                    atomicReference.set(Double.valueOf(rVar.d.j(rVar.l().g(), l.f0)));
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
                            atomicReference.set(Long.valueOf(rVar.d.h(rVar.l().g(), l.d0)));
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
            default:
                w wVar = this.c;
                f63 f63Var = wVar.a.e;
                r.f(f63Var);
                Bundle bundleA = f63Var.n.a();
                z zVarJ = wVar.a.j();
                AtomicReference atomicReference2 = this.b;
                zVarJ.a();
                zVarJ.b();
                zVarJ.o(new mu1(zVarJ, atomicReference2, zVarJ.q(false), bundleA, 15));
                return;
        }
    }
}
