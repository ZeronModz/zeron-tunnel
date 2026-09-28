package io.ktor.http.content;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.LongRange;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {Packets.SSH_MSG_CHANNEL_WINDOW_ADJUST, Packets.SSH_MSG_CHANNEL_EXTENDED_DATA}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
final class OutgoingContent$ReadChannelContent$readFrom$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ LongRange $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OutgoingContent.ReadChannelContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingContent$ReadChannelContent$readFrom$1(OutgoingContent.ReadChannelContent readChannelContent, LongRange longRange, Continuation<? super OutgoingContent$ReadChannelContent$readFrom$1> continuation) {
        super(2, continuation);
        this.this$0 = readChannelContent;
        this.$range = longRange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, continuation);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (io.ktor.utils.io.c.c(r1, r10, r5, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.d.b(r10)
            goto L5b
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r9)
            return r2
        L17:
            java.lang.Object r1 = r9.L$1
            io.ktor.utils.io.ByteReadChannel r1 = (io.ktor.utils.io.ByteReadChannel) r1
            java.lang.Object r4 = r9.L$0
            io.ktor.utils.io.WriterScope r4 = (io.ktor.utils.io.WriterScope) r4
            kotlin.d.b(r10)
            goto L42
        L23:
            kotlin.d.b(r10)
            java.lang.Object r10 = r9.L$0
            io.ktor.utils.io.WriterScope r10 = (io.ktor.utils.io.WriterScope) r10
            io.ktor.http.content.OutgoingContent$ReadChannelContent r1 = r9.this$0
            io.ktor.utils.io.ByteReadChannel r1 = r1.d()
            kotlin.ranges.LongRange r5 = r9.$range
            long r5 = r5.a
            r9.L$0 = r10
            r9.L$1 = r1
            r9.label = r4
            java.lang.Object r4 = io.ktor.utils.io.c.f(r1, r5, r9)
            if (r4 != r0) goto L41
            goto L5a
        L41:
            r4 = r10
        L42:
            kotlin.ranges.LongRange r10 = r9.$range
            long r5 = r10.b
            long r7 = r10.a
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            io.ktor.utils.io.ByteWriteChannel r10 = r4.a
            r9.L$0 = r2
            r9.L$1 = r2
            r9.label = r3
            java.lang.Object r9 = io.ktor.utils.io.c.c(r1, r10, r5, r9)
            if (r9 != r0) goto L5b
        L5a:
            return r0
        L5b:
            mk1 r9 = defpackage.mk1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
