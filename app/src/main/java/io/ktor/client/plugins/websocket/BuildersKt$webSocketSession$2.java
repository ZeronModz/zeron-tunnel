package io.ktor.client.plugins.websocket;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.client.statement.HttpStatement;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 1, 1, 2, 2}, l = {243, 246, Packets.SSH_MSG_USERAUTH_SUCCESS, 265, 265}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
final class BuildersKt$webSocketSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ CompletableDeferred<DefaultClientWebSocketSession> $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$webSocketSession$2(HttpStatement httpStatement, CompletableDeferred<DefaultClientWebSocketSession> completableDeferred, Continuation<? super BuildersKt$webSocketSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$webSocketSession$2(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((BuildersKt$webSocketSession$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:75)|(1:(1:(1:(1:(1:(2:9|10)(3:11|12|78))(3:18|19|69))(5:21|70|22|54|(1:63)(1:69)))(4:26|72|27|(3:50|(3:53|54|(0))|63)(2:57|58)))(2:31|32))(4:34|35|36|(2:38|63)(1:39))|40|73|41|76|42|45|(2:48|(0)(0))|63|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|75|(1:(1:(1:(1:(1:(2:9|10)(3:11|12|78))(3:18|19|69))(5:21|70|22|54|(1:63)(1:69)))(4:26|72|27|(3:50|(3:53|54|(0))|63)(2:57|58)))(2:31|32))(4:34|35|36|(2:38|63)(1:39))|40|73|41|76|42|45|(2:48|(0)(0))|63|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e8, code lost:
    
        r1 = r15;
        r15 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:27:0x0052, B:50:0x00aa, B:57:0x00df, B:58:0x00e6), top: B:72:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #1 {all -> 0x0056, blocks: (B:27:0x0052, B:50:0x00aa, B:57:0x00df, B:58:0x00e6), top: B:72:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
