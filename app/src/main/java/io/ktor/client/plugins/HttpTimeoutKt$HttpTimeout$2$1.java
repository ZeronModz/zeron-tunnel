package io.ktor.client.plugins;

import defpackage.mk1;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send$Sender;
import io.ktor.client.request.HttpRequestBuilder;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1", f = "HttpTimeout.kt", i = {}, l = {144, 175}, m = "invokeSuspend", n = {}, s = {})
final class HttpTimeoutKt$HttpTimeout$2$1 extends SuspendLambda implements Function3<Send$Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ Long $connectTimeoutMillis;
    final /* synthetic */ Long $requestTimeoutMillis;
    final /* synthetic */ Long $socketTimeoutMillis;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1(Long l, Long l2, Long l3, Continuation<? super HttpTimeoutKt$HttpTimeout$2$1> continuation) {
        super(3, continuation);
        this.$requestTimeoutMillis = l;
        this.$connectTimeoutMillis = l2;
        this.$socketTimeoutMillis = l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mk1 invokeSuspend$lambda$1$lambda$0(Job job, Throwable th) {
        job.cancel((CancellationException) null);
        return mk1.a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send$Sender send$Sender, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpTimeoutKt$HttpTimeout$2$1 httpTimeoutKt$HttpTimeout$2$1 = new HttpTimeoutKt$HttpTimeout$2$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, continuation);
        httpTimeoutKt$HttpTimeout$2$1.L$0 = send$Sender;
        httpTimeoutKt$HttpTimeout$2$1.L$1 = httpRequestBuilder;
        return httpTimeoutKt$HttpTimeout$2$1.invokeSuspend(mk1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
