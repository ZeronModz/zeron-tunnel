package io.ktor.client.plugins.cookies;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1", f = "HttpCookies.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
final class HttpCookies$Companion$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ HttpCookies $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$Companion$install$1(HttpCookies httpCookies, Continuation<? super HttpCookies$Companion$install$1> continuation) {
        super(3, continuation);
        this.$plugin = httpCookies;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        HttpCookies$Companion$install$1 httpCookies$Companion$install$1 = new HttpCookies$Companion$install$1(this.$plugin, continuation);
        httpCookies$Companion$install$1.L$0 = pipelineContext;
        return httpCookies$Companion$install$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            d.b(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            HttpCookies httpCookies = this.$plugin;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) pipelineContext.a;
            this.label = 1;
            if (httpCookies.a(httpRequestBuilder, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
        }
        return mk1.a;
    }
}
