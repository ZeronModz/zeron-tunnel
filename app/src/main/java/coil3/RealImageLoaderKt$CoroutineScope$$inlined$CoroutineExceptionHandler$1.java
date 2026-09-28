package coil3;

import coil3.util.Logger;
import defpackage.vr;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ Logger b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(vr vrVar, Logger logger) {
        super(vrVar);
        this.b = logger;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        Logger logger = this.b;
        if (logger != null) {
            Logger.Level a = logger.getA();
            Logger.Level level = Logger.Level.Error;
            if (a.compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, null, th);
            }
        }
    }
}
