package io.ktor.client.plugins.sse;

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
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession$2", f = "builders.kt", i = {0, 1, 1}, l = {259, 262, 281, 281}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
final class BuildersKt$serverSentEventsSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ CompletableDeferred<ClientSSESession> $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSession$2(HttpStatement httpStatement, CompletableDeferred<ClientSSESession> completableDeferred, Continuation<? super BuildersKt$serverSentEventsSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$serverSentEventsSession$2(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((BuildersKt$serverSentEventsSession$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:72)|(1:(1:(1:(1:(2:8|9)(3:10|11|75))(3:17|18|68))(4:20|69|21|(3:44|45|(1:53)(1:68))(2:48|49)))(2:25|26))(4:28|29|30|(2:32|53)(1:33))|34|70|35|73|36|39|(2:42|(0)(0))|53) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|72|(1:(1:(1:(1:(2:8|9)(3:10|11|75))(3:17|18|68))(4:20|69|21|(3:44|45|(1:53)(1:68))(2:48|49)))(2:25|26))(4:28|29|30|(2:32|53)(1:33))|34|70|35|73|36|39|(2:42|(0)(0))|53|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:21:0x003f, B:44:0x0098, B:48:0x00ac, B:49:0x00b3), top: B:69:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:21:0x003f, B:44:0x0098, B:48:0x00ac, B:49:0x00b3), top: B:69:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
