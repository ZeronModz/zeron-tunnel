package io.ktor.client.plugins.internal;

import defpackage.mk1;
import io.ktor.client.plugins.internal.ByteChannelReplay;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", f = "ByteChannelReplay.kt", i = {0}, l = {33, 34}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
final class ByteChannelReplay$replay$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Ref$ObjectRef<ByteChannelReplay.CopyFromSourceTask> $copyTask;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelReplay$replay$1(Ref$ObjectRef<ByteChannelReplay.CopyFromSourceTask> ref$ObjectRef, Continuation<? super ByteChannelReplay$replay$1> continuation) {
        super(2, continuation);
        this.$copyTask = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        ByteChannelReplay$replay$1 byteChannelReplay$replay$1 = new ByteChannelReplay$replay$1(this.$copyTask, continuation);
        byteChannelReplay$replay$1.L$0 = obj;
        return byteChannelReplay$replay$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((ByteChannelReplay$replay$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (io.ktor.utils.io.d.d(r1, r8, 0, r8.length, r7) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.d.b(r8)
            goto L73
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r2
        L17:
            java.lang.Object r1 = r7.L$0
            io.ktor.utils.io.WriterScope r1 = (io.ktor.utils.io.WriterScope) r1
            kotlin.d.b(r8)
            goto L60
        L1f:
            kotlin.d.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            io.ktor.utils.io.WriterScope r1 = (io.ktor.utils.io.WriterScope) r1
            kotlin.jvm.internal.Ref$ObjectRef<io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask> r8 = r7.$copyTask
            T r8 = r8.element
            r8.getClass()
            io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask r8 = (io.ktor.client.plugins.internal.ByteChannelReplay.CopyFromSourceTask) r8
            r7.L$0 = r1
            r7.label = r4
            io.ktor.utils.io.WriterJob r4 = r8.b
            java.lang.String r5 = "writerJob"
            if (r4 == 0) goto L76
            yg r6 = io.ktor.utils.io.d.a
            kotlinx.coroutines.Job r4 = r4.b
            boolean r4 = r4.isCompleted()
            if (r4 != 0) goto L57
            io.ktor.utils.io.WriterJob r4 = r8.b
            if (r4 == 0) goto L53
            io.ktor.utils.io.ByteReadChannel r4 = r4.a
            io.ktor.client.plugins.internal.SaveBodyAbandonedReadException r5 = new io.ktor.client.plugins.internal.SaveBodyAbandonedReadException
            r5.<init>()
            r4.cancel(r5)
            goto L57
        L53:
            defpackage.yg0.N(r5)
            throw r2
        L57:
            kotlinx.coroutines.CompletableDeferred r8 = r8.a
            java.lang.Object r8 = r8.await(r7)
            if (r8 != r0) goto L60
            goto L72
        L60:
            byte[] r8 = (byte[]) r8
            io.ktor.utils.io.ByteWriteChannel r1 = r1.a
            r7.L$0 = r2
            r7.label = r3
            yg r2 = io.ktor.utils.io.d.a
            r2 = 0
            int r3 = r8.length
            java.lang.Object r7 = io.ktor.utils.io.d.d(r1, r8, r2, r3, r7)
            if (r7 != r0) goto L73
        L72:
            return r0
        L73:
            mk1 r7 = defpackage.mk1.a
            return r7
        L76:
            defpackage.yg0.N(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.internal.ByteChannelReplay$replay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
