package io.ktor.client.plugins;

import defpackage.j03;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1$1$killer$1", f = "HttpTimeout.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
public final class HttpTimeoutKt$HttpTimeout$2$1$1$killer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Job $executionContext;
    final /* synthetic */ HttpRequestBuilder $request;
    final /* synthetic */ Long $requestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(Long l, HttpRequestBuilder httpRequestBuilder, Job job, Continuation<? super HttpTimeoutKt$HttpTimeout$2$1$1$killer$1> continuation) {
        super(2, continuation);
        this.$requestTimeout = l;
        this.$request = httpRequestBuilder;
        this.$executionContext = job;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(this.$requestTimeout, this.$request, this.$executionContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HttpTimeoutKt$HttpTimeout$2$1$1$killer$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (kotlinx.coroutines.f.b(jLongValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.$request);
        n.a.trace("Request timeout: " + this.$request.a);
        Job job = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        message.getClass();
        job.cancel(j03.a(message, httpRequestTimeoutException));
        return mk1.a;
    }
}
