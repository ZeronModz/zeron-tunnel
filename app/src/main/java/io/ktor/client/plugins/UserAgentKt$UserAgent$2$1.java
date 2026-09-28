package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.le0;
import defpackage.mk1;
import defpackage.qj1;
import defpackage.u7;
import io.ktor.client.plugins.api.OnRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/plugins/api/OnRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "request", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<unused var>", "Lmk1;", "<anonymous>", "(Lio/ktor/client/plugins/api/OnRequestContext;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$2$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class UserAgentKt$UserAgent$2$1 extends SuspendLambda implements Function4<OnRequestContext, HttpRequestBuilder, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ String $agent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentKt$UserAgent$2$1(String str, Continuation<? super UserAgentKt$UserAgent$2$1> continuation) {
        super(4, continuation);
        this.$agent = str;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(OnRequestContext onRequestContext, HttpRequestBuilder httpRequestBuilder, Object obj, Continuation<? super mk1> continuation) {
        UserAgentKt$UserAgent$2$1 userAgentKt$UserAgent$2$1 = new UserAgentKt$UserAgent$2$1(this.$agent, continuation);
        userAgentKt$UserAgent$2$1.L$0 = httpRequestBuilder;
        return userAgentKt$UserAgent$2$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        s.a.trace("Adding User-Agent header: agent for " + httpRequestBuilder.a);
        List list = le0.a;
        qj1.u(httpRequestBuilder, "User-Agent", this.$agent);
        return mk1.a;
    }
}
