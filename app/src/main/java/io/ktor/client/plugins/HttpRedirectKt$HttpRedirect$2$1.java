package io.ktor.client.plugins;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.Packet;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send$Sender;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", i = {0, 0}, l = {Packets.SSH_MSG_CHANNEL_CLOSE, Packet.SSH_FXP_HANDLE}, m = "invokeSuspend", n = {"$this$on", "request"}, s = {"L$0", "L$1"})
final class HttpRedirectKt$HttpRedirect$2$1 extends SuspendLambda implements Function3<Send$Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ ClientPluginBuilder<HttpRedirectConfig> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, ClientPluginBuilder<HttpRedirectConfig> clientPluginBuilder, Continuation<? super HttpRedirectKt$HttpRedirect$2$1> continuation) {
        super(3, continuation);
        this.$checkHttpMethod = z;
        this.$allowHttpsDowngrade = z2;
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send$Sender send$Sender, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, this.$this_createClientPlugin, continuation);
        httpRedirectKt$HttpRedirect$2$1.L$0 = send$Sender;
        httpRedirectKt$HttpRedirect$2$1.L$1 = httpRequestBuilder;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpRequestBuilder httpRequestBuilder;
        Send$Sender send$Sender;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            Send$Sender send$Sender2 = (Send$Sender) this.L$0;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = send$Sender2;
            this.L$1 = httpRequestBuilder;
            this.label = 1;
            Object objExecute = send$Sender2.a.execute(httpRequestBuilder, this);
            if (objExecute != coroutineSingletons) {
                send$Sender = send$Sender2;
                obj = objExecute;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.d.b(obj);
                return obj;
            }
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        httpRequestBuilder = (HttpRequestBuilder) this.L$1;
        send$Sender = (Send$Sender) this.L$0;
        kotlin.d.b(obj);
        HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        if (this.$checkHttpMethod && !k.a.contains(httpClientCall.c().getA())) {
            return httpClientCall;
        }
        boolean z = this.$allowHttpsDowngrade;
        HttpClient httpClient = this.$this_createClientPlugin.a;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objA = k.a(send$Sender, httpRequestBuilder2, httpClientCall, z, httpClient, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
