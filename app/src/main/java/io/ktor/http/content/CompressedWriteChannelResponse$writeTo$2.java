package io.ktor.http.content;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", i = {0}, l = {Packets.SSH_MSG_REQUEST_FAILURE}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
final class CompressedWriteChannelResponse$writeTo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ ByteWriteChannel $channel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CompressedWriteChannelResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressedWriteChannelResponse$writeTo$2(CompressedWriteChannelResponse compressedWriteChannelResponse, ByteWriteChannel byteWriteChannel, Continuation<? super CompressedWriteChannelResponse$writeTo$2> continuation) {
        super(2, continuation);
        this.this$0 = compressedWriteChannelResponse;
        this.$channel = byteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        CompressedWriteChannelResponse$writeTo$2 compressedWriteChannelResponse$writeTo$2 = new CompressedWriteChannelResponse$writeTo$2(this.this$0, this.$channel, continuation);
        compressedWriteChannelResponse$writeTo$2.L$0 = obj;
        return compressedWriteChannelResponse$writeTo$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((CompressedWriteChannelResponse$writeTo$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ByteWriteChannel byteWriteChannel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            byteWriteChannel = (ByteWriteChannel) this.L$0;
            try {
                d.b(obj);
                c.b(byteWriteChannel);
                return mk1.a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    io.ktor.utils.io.d.a(byteWriteChannel, th);
                    throw th;
                } catch (Throwable th3) {
                    c.b(byteWriteChannel);
                    throw th3;
                }
            }
        }
        d.b(obj);
        ByteWriteChannel byteWriteChannelEncode = this.this$0.b.encode(this.$channel, ((CoroutineScope) this.L$0).getA());
        try {
            OutgoingContent.WriteChannelContent writeChannelContent = this.this$0.a;
            this.L$0 = byteWriteChannelEncode;
            this.label = 1;
            if (writeChannelContent.d(byteWriteChannelEncode, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            byteWriteChannel = byteWriteChannelEncode;
            c.b(byteWriteChannel);
            return mk1.a;
        } catch (Throwable th4) {
            th = th4;
            byteWriteChannel = byteWriteChannelEncode;
            io.ktor.utils.io.d.a(byteWriteChannel, th);
            throw th;
        }
    }
}
