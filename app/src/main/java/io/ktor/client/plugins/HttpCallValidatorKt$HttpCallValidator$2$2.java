package io.ktor.client.plugins;

import defpackage.mk1;
import defpackage.u7;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send$Sender;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", i = {1}, l = {112, 113}, m = "invokeSuspend", n = {"call"}, s = {"L$0"})
final class HttpCallValidatorKt$HttpCallValidator$2$2 extends SuspendLambda implements Function3<Send$Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ List<Function2<HttpResponse, Continuation<? super mk1>, Object>> $responseValidators;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends Function2<? super HttpResponse, ? super Continuation<? super mk1>, ? extends Object>> list, Continuation<? super HttpCallValidatorKt$HttpCallValidator$2$2> continuation) {
        super(3, continuation);
        this.$responseValidators = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send$Sender send$Sender, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, continuation);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = send$Sender;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = httpRequestBuilder;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            Send$Sender send$Sender = (Send$Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = send$Sender.a.execute(httpRequestBuilder, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            HttpClientCall httpClientCall = (HttpClientCall) this.L$0;
            kotlin.d.b(obj);
            return httpClientCall;
        }
        kotlin.d.b(obj);
        HttpClientCall httpClientCall2 = (HttpClientCall) obj;
        List<Function2<HttpResponse, Continuation<? super mk1>, Object>> list = this.$responseValidators;
        HttpResponse httpResponseD = httpClientCall2.d();
        this.L$0 = httpClientCall2;
        this.label = 2;
        return i.b(list, httpResponseD, this) == coroutineSingletons ? coroutineSingletons : httpClientCall2;
    }
}
