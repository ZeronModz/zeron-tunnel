package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.xu;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/HttpSend;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Config", "Plugin", "InterceptedSender", "DefaultSender", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpSend {
    public static final Plugin c = new Plugin(null);
    public static final AttributeKey d;
    public final int a;
    public final ArrayList b = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @KtorDsl
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Config;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/HttpSend$DefaultSender;", "Lio/ktor/client/plugins/Sender;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxSendCount", "Lio/ktor/client/HttpClient;", "client", "<init>", "(ILio/ktor/client/HttpClient;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultSender implements Sender {
        public final int a;
        public final HttpClient b;
        public int c;
        public HttpClientCall d;

        public DefaultSender(int i, HttpClient httpClient) {
            httpClient.getClass();
            this.a = i;
            this.b = httpClient;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // io.ktor.client.plugins.Sender
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object execute(io.ktor.client.request.HttpRequestBuilder r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                if (r0 == 0) goto L13
                r0 = r7
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = (io.ktor.client.plugins.HttpSend$DefaultSender$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = new io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L32
                if (r2 != r4) goto L2c
                java.lang.Object r5 = r0.L$0
                io.ktor.client.plugins.HttpSend$DefaultSender r5 = (io.ktor.client.plugins.HttpSend.DefaultSender) r5
                kotlin.d.b(r7)
                goto L56
            L2c:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.u7.p(r5)
                return r3
            L32:
                kotlin.d.b(r7)
                io.ktor.client.call.HttpClientCall r7 = r5.d
                if (r7 == 0) goto L3c
                defpackage.zr.b(r7, r3)
            L3c:
                int r7 = r5.c
                int r2 = r5.a
                if (r7 >= r2) goto L6a
                int r7 = r7 + r4
                r5.c = r7
                io.ktor.client.HttpClient r7 = r5.b
                io.ktor.client.request.HttpSendPipeline r7 = r7.g
                java.lang.Object r2 = r6.d
                r0.L$0 = r5
                r0.label = r4
                java.lang.Object r7 = r7.a(r6, r2, r0)
                if (r7 != r1) goto L56
                return r1
            L56:
                boolean r6 = r7 instanceof io.ktor.client.call.HttpClientCall
                if (r6 == 0) goto L5e
                r6 = r7
                io.ktor.client.call.HttpClientCall r6 = (io.ktor.client.call.HttpClientCall) r6
                goto L5f
            L5e:
                r6 = r3
            L5f:
                if (r6 == 0) goto L64
                r5.d = r6
                return r6
            L64:
                java.lang.String r5 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                defpackage.oq.m(r7, r5)
                return r3
            L6a:
                io.ktor.client.plugins.SendCountExceedException r5 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.String r6 = "Max send count "
                java.lang.String r7 = " exceeded. Consider increasing the property maxSendCount if more is required."
                java.lang.String r6 = defpackage.hz.p(r2, r6, r7)
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend.DefaultSender.execute(io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BB\u00121\u0010\t\u001a-\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u0007¢\u0006\u0002\b\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/plugins/HttpSend$InterceptedSender;", "Lio/ktor/client/plugins/Sender;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/client/call/HttpClientCall;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/plugins/HttpSendInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptor", "nextSender", "<init>", "(Lkotlin/jvm/functions/Function3;Lio/ktor/client/plugins/Sender;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InterceptedSender implements Sender {
        public final Function3 a;
        public final Sender b;

        public InterceptedSender(Function3<? super Sender, ? super HttpRequestBuilder, ? super Continuation<? super HttpClientCall>, ? extends Object> function3, Sender sender) {
            function3.getClass();
            sender.getClass();
            this.a = function3;
            this.b = sender;
        }

        @Override // io.ktor.client.plugins.Sender
        public final Object execute(HttpRequestBuilder httpRequestBuilder, Continuation continuation) {
            return this.a.invoke(this.b, httpRequestBuilder, continuation);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpSend$Config;", "Lio/ktor/client/plugins/HttpSend;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Plugin implements HttpClientPlugin<Config, HttpSend> {
        public Plugin(xu xuVar) {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        /* JADX INFO: renamed from: getKey */
        public final AttributeKey<HttpSend> getC() {
            return HttpSend.d;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(HttpSend httpSend, HttpClient httpClient) {
            HttpSend httpSend2 = httpSend;
            httpSend2.getClass();
            httpClient.getClass();
            HttpRequestPipeline httpRequestPipeline = httpClient.e;
            HttpRequestPipeline.g.getClass();
            httpRequestPipeline.g(HttpRequestPipeline.l, new HttpSend$Plugin$install$1(httpSend2, httpClient, null));
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final HttpSend prepare(Function1<? super Config, mk1> function1) {
            function1.getClass();
            function1.invoke(new Config());
            return new HttpSend(20, null);
        }
    }

    static {
        TypeReference typeReferenceB = null;
        ClassReference classReferenceA = Reflection.a(HttpSend.class);
        try {
            typeReferenceB = Reflection.b(HttpSend.class);
        } catch (Throwable unused) {
        }
        d = new AttributeKey("HttpSend", new TypeInfo(classReferenceA, typeReferenceB));
    }

    public HttpSend(int i, xu xuVar) {
        this.a = i;
    }
}
