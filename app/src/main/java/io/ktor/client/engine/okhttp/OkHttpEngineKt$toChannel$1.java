package io.ktor.client.engine.okhttp;

import defpackage.mk1;
import io.ktor.client.request.HttpRequestData;
import io.ktor.utils.io.WriterScope;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {170, 179}, m = "invokeSuspend", n = {"$this$writer", "$this$use$iv", "source", "lastRead", "$this$writer", "$this$use$iv", "source", "lastRead"}, s = {"L$0", "L$1", "L$4", "L$5", "L$0", "L$1", "L$4", "L$5"})
final class OkHttpEngineKt$toChannel$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ HttpRequestData $requestData;
    final /* synthetic */ BufferedSource $this_toChannel;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngineKt$toChannel$1(BufferedSource bufferedSource, CoroutineContext coroutineContext, HttpRequestData httpRequestData, Continuation<? super OkHttpEngineKt$toChannel$1> continuation) {
        super(2, continuation);
        this.$this_toChannel = bufferedSource;
        this.$context = coroutineContext;
        this.$requestData = httpRequestData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mk1 invokeSuspend$lambda$2$lambda$1(Ref$IntRef ref$IntRef, BufferedSource bufferedSource, HttpRequestData httpRequestData, CoroutineContext coroutineContext, ByteBuffer byteBuffer) {
        try {
            ref$IntRef.element = bufferedSource.read(byteBuffer);
            return mk1.a;
        } finally {
            th = th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        OkHttpEngineKt$toChannel$1 okHttpEngineKt$toChannel$1 = new OkHttpEngineKt$toChannel$1(this.$this_toChannel, this.$context, this.$requestData, continuation);
        okHttpEngineKt$toChannel$1.L$0 = obj;
        return okHttpEngineKt$toChannel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((OkHttpEngineKt$toChannel$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r12.flush(r11) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: all -> 0x00be, TryCatch #2 {all -> 0x00be, blocks: (B:19:0x0068, B:21:0x006e, B:23:0x0078, B:26:0x0080, B:28:0x0084), top: B:56:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bb -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
