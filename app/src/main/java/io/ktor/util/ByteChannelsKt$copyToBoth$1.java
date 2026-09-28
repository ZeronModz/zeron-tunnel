package io.ktor.util;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1}, l = {Packets.SSH_MSG_USERAUTH_INFO_RESPONSE, 63, 64, 78, 79, 78, 79, 78, 79}, m = "invokeSuspend", n = {"it"}, s = {"L$4"})
final class ByteChannelsKt$copyToBoth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ ByteWriteChannel $first;
    final /* synthetic */ ByteWriteChannel $second;
    final /* synthetic */ ByteReadChannel $this_copyToBoth;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelsKt$copyToBoth$1(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, Continuation<? super ByteChannelsKt$copyToBoth$1> continuation) {
        super(2, continuation);
        this.$this_copyToBoth = byteReadChannel;
        this.$first = byteWriteChannel;
        this.$second = byteWriteChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new ByteChannelsKt$copyToBoth$1(this.$this_copyToBoth, this.$first, this.$second, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((ByteChannelsKt$copyToBoth$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        if (r9.flushAndClose(r8) != r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        if (r9.flushAndClose(r8) != r0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x006c, TryCatch #5 {all -> 0x006c, blocks: (B:46:0x00f1, B:26:0x0072, B:28:0x007a, B:30:0x0082, B:32:0x008a, B:35:0x00a3, B:51:0x00f9, B:52:0x00fc, B:53:0x00fd, B:61:0x0127, B:21:0x0068, B:36:0x00ac, B:45:0x00e8, B:49:0x00f7), top: B:90:0x0068, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:46:0x00f1, B:26:0x0072, B:28:0x007a, B:30:0x0082, B:32:0x008a, B:35:0x00a3, B:51:0x00f9, B:52:0x00fc, B:53:0x00fd, B:61:0x0127, B:21:0x0068, B:36:0x00ac, B:45:0x00e8, B:49:0x00f7), top: B:90:0x0068, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e6 -> B:46:0x00f1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt$copyToBoth$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
