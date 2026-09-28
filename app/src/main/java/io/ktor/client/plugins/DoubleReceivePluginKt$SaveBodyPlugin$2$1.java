package io.ktor.client.plugins;

import defpackage.mk1;
import defpackage.u7;
import defpackage.xu;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.internal.ByteChannelReplay;
import io.ktor.client.plugins.observer.DelegatedCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "Lmk1;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$2$1", f = "DoubleReceivePlugin.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
final class DoubleReceivePluginKt$SaveBodyPlugin$2$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponse, mk1>, HttpResponse, Continuation<? super mk1>, Object> {
    final /* synthetic */ boolean $disabled;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleReceivePluginKt$SaveBodyPlugin$2$1(boolean z, Continuation<? super DoubleReceivePluginKt$SaveBodyPlugin$2$1> continuation) {
        super(3, continuation);
        this.$disabled = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponse, mk1> pipelineContext, HttpResponse httpResponse, Continuation<? super mk1> continuation) {
        DoubleReceivePluginKt$SaveBodyPlugin$2$1 doubleReceivePluginKt$SaveBodyPlugin$2$1 = new DoubleReceivePluginKt$SaveBodyPlugin$2$1(this.$disabled, continuation);
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$0 = pipelineContext;
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$1 = httpResponse;
        return doubleReceivePluginKt$SaveBodyPlugin$2$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        mk1 mk1Var = mk1.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.d.b(obj);
                return mk1Var;
            }
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        HttpResponse httpResponse = (HttpResponse) this.L$1;
        if (!this.$disabled && !httpResponse.getA().getAttributes().contains(g.a)) {
            ByteChannelReplay byteChannelReplay = new ByteChannelReplay(httpResponse.getG());
            HttpClientCall call = httpResponse.getA();
            e eVar = new e(byteChannelReplay, i2);
            call.getClass();
            DelegatedCall delegatedCall = new DelegatedCall(call.a, eVar, call, (Headers) null, 8, (xu) null);
            delegatedCall.getAttributes().put(g.b, mk1Var);
            HttpResponse httpResponseD = delegatedCall.d();
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.e(httpResponseD, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return mk1Var;
    }
}
