package coil3.intercept;

import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptorKt", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0}, l = {259}, m = "transform", n = {"result", "request", "options", "eventListener", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
final class EngineInterceptorKt$transform$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public EngineInterceptorKt$transform$1(Continuation<? super EngineInterceptorKt$transform$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return a.a(null, null, null, null, null, this);
    }
}
