package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzgdh;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r03 {
    public final zzgdh a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c = -1;
    public long d = -1;
    public Throwable e = null;
    public final int f;

    public r03(int i, zzgdh zzgdhVar) {
        this.f = i;
        this.a = zzgdhVar;
    }

    public final void a() {
        if (this.b.get()) {
            u7.p("Finished trace.");
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }

    public final void b(Throwable th) {
        if (this.b.get()) {
            u7.p("Finished trace.");
        } else {
            this.e = th;
        }
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.getAndSet(true)) {
            u7.p("Finished trace.");
            return;
        }
        this.d = SystemClock.uptimeMillis();
        this.a.zzb(this.f - 1, atomicBoolean.get() ? this.d - this.c : -1L, this.e, null);
    }
}
