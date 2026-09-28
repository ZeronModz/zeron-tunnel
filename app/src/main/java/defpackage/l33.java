package defpackage;

import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.i7;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l33 extends if3 {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(i7.class, Set.class, "h");
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(i7.class, "i");

    @Override // defpackage.if3
    public final void U(h7 h7Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = g;
            if (atomicReferenceFieldUpdater.compareAndSet(h7Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(h7Var) == null);
    }

    @Override // defpackage.if3
    public final int X(h7 h7Var) {
        return h.decrementAndGet(h7Var);
    }
}
