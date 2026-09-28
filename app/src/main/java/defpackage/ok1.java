package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ok1 extends CoroutineDispatcher {
    public static final ok1 c = new ok1();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        lv.d.c.b(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void b(CoroutineContext coroutineContext, Runnable runnable) {
        lv.d.c.b(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher d(int i) {
        kf2.c(i);
        return i >= vd1.d ? this : super.d(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: toString */
    public final String getE() {
        return "Dispatchers.IO";
    }
}
