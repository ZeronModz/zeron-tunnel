package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bs extends CoroutineDispatcher {
    public static final bs c = new bs();
    public static final lv d = oy.a;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        d.a(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean c(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        d.getClass();
        return !false;
    }
}
