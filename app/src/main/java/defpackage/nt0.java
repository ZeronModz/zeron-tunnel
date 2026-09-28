package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nt0 implements Continuation {
    public static final nt0 a = new nt0();
    public static final EmptyCoroutineContext b = EmptyCoroutineContext.INSTANCE;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
    }
}
