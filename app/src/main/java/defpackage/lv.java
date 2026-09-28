package defpackage;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lv extends SchedulerCoroutineDispatcher {
    public static final lv d = new lv(vd1.c, vd1.d, vd1.e, vd1.a);

    @Override // kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher d(int i) {
        kf2.c(i);
        return i >= vd1.c ? this : super.d(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Default";
    }
}
