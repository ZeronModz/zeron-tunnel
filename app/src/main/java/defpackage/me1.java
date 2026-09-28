package defpackage;

import kotlinx.coroutines.BlockingEventLoop;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class me1 {
    public static final ThreadLocal a;

    static {
        new Symbol("ThreadLocalEventLoop");
        a = new ThreadLocal();
    }

    public static EventLoop a() {
        ThreadLocal threadLocal = a;
        EventLoop eventLoop = (EventLoop) threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        BlockingEventLoop blockingEventLoop = new BlockingEventLoop(Thread.currentThread());
        threadLocal.set(blockingEventLoop);
        return blockingEventLoop;
    }
}
