package io.ktor.client.statement;

import com.trilead.ssh2.packets.Packets;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 0, 1, 1}, l = {49, Packets.SSH_MSG_USERAUTH_SUCCESS, 54, 54}, m = "execute", n = {"this", "block", "this", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class HttpStatement$execute$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpStatement$execute$1(HttpStatement httpStatement, Continuation<? super HttpStatement$execute$1> continuation) {
        super(continuation);
        this.this$0 = httpStatement;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:55|(1:(1:(1:(1:(2:12|13)(3:14|15|56))(3:17|18|19))(5:20|51|21|38|(2:40|45)(1:41)))(2:25|26))(3:28|29|(2:31|45)(1:32))|33|53|34|(3:37|38|(0)(0))|45) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r9.result = r10
            int r10 = r9.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.label = r10
            io.ktor.client.statement.HttpStatement r10 = r9.this$0
            r10.getClass()
            int r1 = r9.label
            r2 = r1 & r0
            if (r2 == 0) goto L18
            int r1 = r1 - r0
            r9.label = r1
            goto L1e
        L18:
            io.ktor.client.statement.HttpStatement$execute$1 r0 = new io.ktor.client.statement.HttpStatement$execute$1
            r0.<init>(r10, r9)
            r9 = r0
        L1e:
            java.lang.Object r0 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L65
            if (r2 == r7) goto L59
            if (r2 == r6) goto L48
            if (r2 == r5) goto L42
            if (r2 == r4) goto L39
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r9)
            return r3
        L39:
            java.lang.Object r9 = r9.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.d.b(r0)     // Catch: java.util.concurrent.CancellationException -> La7
            goto La6
        L42:
            java.lang.Object r9 = r9.L$0
            kotlin.d.b(r0)     // Catch: java.util.concurrent.CancellationException -> La7
            return r9
        L48:
            java.lang.Object r10 = r9.L$1
            io.ktor.client.statement.HttpResponse r10 = (io.ktor.client.statement.HttpResponse) r10
            java.lang.Object r2 = r9.L$0
            io.ktor.client.statement.HttpStatement r2 = (io.ktor.client.statement.HttpStatement) r2
            kotlin.d.b(r0)     // Catch: java.lang.Throwable -> L54
            goto L89
        L54:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L98
        L59:
            java.lang.Object r10 = r9.L$1
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r2 = r9.L$0
            io.ktor.client.statement.HttpStatement r2 = (io.ktor.client.statement.HttpStatement) r2
            kotlin.d.b(r0)     // Catch: java.util.concurrent.CancellationException -> La7
            goto L77
        L65:
            kotlin.d.b(r0)
            r9.L$0 = r10     // Catch: java.util.concurrent.CancellationException -> La7
            r9.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> La7
            r9.label = r7     // Catch: java.util.concurrent.CancellationException -> La7
            java.lang.Object r0 = r10.c(r9)     // Catch: java.util.concurrent.CancellationException -> La7
            if (r0 != r1) goto L75
            goto La4
        L75:
            r2 = r10
            r10 = r3
        L77:
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0     // Catch: java.util.concurrent.CancellationException -> La7
            r9.L$0 = r2     // Catch: java.lang.Throwable -> L97
            r9.L$1 = r0     // Catch: java.lang.Throwable -> L97
            r9.label = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.invoke(r0, r9)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L86
            goto La4
        L86:
            r8 = r0
            r0 = r10
            r10 = r8
        L89:
            r9.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> La7
            r9.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> La7
            r9.label = r5     // Catch: java.util.concurrent.CancellationException -> La7
            java.lang.Object r9 = r2.a(r10, r9)     // Catch: java.util.concurrent.CancellationException -> La7
            if (r9 != r1) goto L96
            goto La4
        L96:
            return r0
        L97:
            r10 = move-exception
        L98:
            r9.L$0 = r10     // Catch: java.util.concurrent.CancellationException -> La7
            r9.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> La7
            r9.label = r4     // Catch: java.util.concurrent.CancellationException -> La7
            java.lang.Object r9 = r2.a(r0, r9)     // Catch: java.util.concurrent.CancellationException -> La7
            if (r9 != r1) goto La5
        La4:
            return r1
        La5:
            r9 = r10
        La6:
            throw r9     // Catch: java.util.concurrent.CancellationException -> La7
        La7:
            r9 = move-exception
            java.lang.Throwable r9 = defpackage.ay2.w(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
