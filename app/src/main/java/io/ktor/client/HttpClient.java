package io.ktor.client;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ie0;
import defpackage.kv;
import defpackage.m8;
import defpackage.me0;
import defpackage.mk1;
import defpackage.rn;
import defpackage.t;
import defpackage.u7;
import defpackage.xu;
import defpackage.ye;
import defpackage.z3;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.c;
import io.ktor.client.plugins.g;
import io.ktor.client.plugins.i;
import io.ktor.client.plugins.j;
import io.ktor.client.plugins.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.client.utils.HttpResponseReceiveFail;
import io.ktor.events.Events;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.a;
import io.ktor.util.pipeline.PipelineContext;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "userConfig", "<init>", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "manageEngine", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;Z)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpClient implements CoroutineScope, Closeable {
    public static final /* synthetic */ long l = m8.a.objectFieldOffset(HttpClient.class.getDeclaredField("closed"));
    public static final /* synthetic */ int m = 0;
    public final HttpClientEngine a;
    public final boolean b;
    public final JobImpl c;
    private volatile /* synthetic */ int closed;
    public final CoroutineContext d;
    public final HttpRequestPipeline e;
    public final HttpResponsePipeline f;
    public final HttpSendPipeline g;
    public final HttpReceivePipeline h;
    public final Attributes i;
    public final Events j;
    public final HttpClientConfig k;

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "call", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {1345, 1347}, m = "invokeSuspend", n = {"$this$intercept", "call"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
            AnonymousClass2 anonymousClass2 = HttpClient.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            PipelineContext pipelineContext;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            mk1 mk1Var = mk1.a;
            if (i == 0) {
                d.b(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof HttpClientCall)) {
                    StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
                    sb.append(obj2);
                    ClassReference classReferenceA = Reflection.a(obj2.getClass());
                    sb.append('(');
                    sb.append(classReferenceA);
                    sb.append(").");
                    throw new IllegalStateException(sb.toString().toString());
                }
                HttpReceivePipeline httpReceivePipeline = HttpClient.this.h;
                HttpResponse httpResponseD = ((HttpClientCall) obj2).d();
                this.L$0 = pipelineContext2;
                this.L$1 = obj2;
                this.label = 1;
                Object objA = httpReceivePipeline.a(mk1Var, httpResponseD, this);
                if (objA != coroutineSingletons) {
                    pipelineContext = pipelineContext2;
                    obj = objA;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    d.b(obj);
                    return mk1Var;
                }
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            d.b(obj);
            HttpResponse httpResponse = (HttpResponse) obj;
            HttpClientCall httpClientCall = (HttpClientCall) obj2;
            httpClientCall.getClass();
            httpResponse.getClass();
            httpClientCall.c = httpResponse;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            return pipelineContext.e(obj2, this) == coroutineSingletons ? coroutineSingletons : mk1Var;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {1379}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    public static final class AnonymousClass4 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super mk1>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super mk1> continuation) {
            AnonymousClass4 anonymousClass4 = HttpClient.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = pipelineContext;
            return anonymousClass4.invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            PipelineContext pipelineContext;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                d.b(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                try {
                    this.L$0 = pipelineContext2;
                    this.label = 1;
                    Object objD = pipelineContext2.d(this);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pipelineContext = pipelineContext2;
                    obj = objD;
                } catch (Throwable th2) {
                    pipelineContext = pipelineContext2;
                    th = th2;
                    HttpClient.this.j.a(rn.d, new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.a).d(), th));
                    throw th;
                }
            } else {
                if (i != 1) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pipelineContext = (PipelineContext) this.L$0;
                try {
                    d.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    HttpClient.this.j.a(rn.d, new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.a).d(), th));
                    throw th;
                }
            }
            return mk1.a;
        }
    }

    public HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig<? extends HttpClientEngineConfig> httpClientConfig) {
        httpClientEngine.getClass();
        httpClientConfig.getClass();
        this.a = httpClientEngine;
        boolean z = false;
        this.closed = 0;
        JobImpl jobImpl = new JobImpl((Job) httpClientEngine.getH().get(Job.Key));
        this.c = jobImpl;
        this.d = httpClientEngine.getH().plus(jobImpl);
        int i = 1;
        xu xuVar = null;
        this.e = new HttpRequestPipeline(z, i, xuVar);
        this.f = new HttpResponsePipeline(z, i, xuVar);
        HttpSendPipeline httpSendPipeline = new HttpSendPipeline(z, i, xuVar);
        this.g = httpSendPipeline;
        this.h = new HttpReceivePipeline(z, i, xuVar);
        this.i = a.a();
        httpClientEngine.getConfig();
        this.j = new Events();
        HttpClientConfig httpClientConfig2 = new HttpClientConfig();
        this.k = httpClientConfig2;
        if (this.b) {
            jobImpl.invokeOnCompletion(new t(this, 9));
        }
        httpClientEngine.install(this);
        HttpSendPipeline.g.getClass();
        httpSendPipeline.g(HttpSendPipeline.l, new AnonymousClass2(null));
        int i2 = 19;
        httpClientConfig2.a(me0.b, new z3(i2));
        httpClientConfig2.a(ye.c, new z3(i2));
        httpClientConfig2.a(g.c, new z3(i2));
        if (httpClientConfig.f) {
            httpClientConfig2.c.put("DefaultTransformers", new z3(17));
        }
        httpClientConfig2.a(HttpSend.c, new z3(i2));
        ClientPlugin clientPlugin = i.b;
        httpClientConfig2.a(clientPlugin, new z3(i2));
        if (httpClientConfig.e) {
            httpClientConfig2.a(k.d, new z3(i2));
        }
        httpClientConfig2.e = httpClientConfig.e;
        httpClientConfig2.f = httpClientConfig.f;
        httpClientConfig2.a.putAll(httpClientConfig.a);
        httpClientConfig2.b.putAll(httpClientConfig.b);
        httpClientConfig2.c.putAll(httpClientConfig.c);
        if (httpClientConfig.f) {
            httpClientConfig2.a(j.b, new z3(i2));
        }
        AttributeKey attributeKey = kv.a;
        httpClientConfig2.a(clientPlugin, new c(httpClientConfig2));
        Iterator it = httpClientConfig2.a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = httpClientConfig2.c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        HttpResponsePipeline httpResponsePipeline = this.f;
        HttpResponsePipeline.g.getClass();
        httpResponsePipeline.g(HttpResponsePipeline.h, new AnonymousClass4(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.client.request.HttpRequestBuilder r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.HttpClient$execute$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.HttpClient$execute$1 r0 = (io.ktor.client.HttpClient$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.HttpClient$execute$1 r0 = new io.ktor.client.HttpClient$execute$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            kotlin.d.b(r6)
            goto L45
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L2e:
            kotlin.d.b(r6)
            io.ktor.events.Events r6 = r4.j
            io.ktor.events.EventDefinition r2 = defpackage.rn.a
            r6.a(r2, r5)
            java.lang.Object r6 = r5.d
            r0.label = r3
            io.ktor.client.request.HttpRequestPipeline r4 = r4.e
            java.lang.Object r6 = r4.a(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r6.getClass()
            io.ktor.client.call.HttpClientCall r6 = (io.ktor.client.call.HttpClientCall) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.HttpClient.a(io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (m8.a.compareAndSwapInt(this, l, 0, 1)) {
            Attributes attributes = (Attributes) this.i.get(ie0.a);
            Iterator<T> it = attributes.getAllKeys().iterator();
            while (it.hasNext()) {
                AttributeKey attributeKey = (AttributeKey) it.next();
                attributeKey.getClass();
                Object obj = attributes.get(attributeKey);
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                }
            }
            this.c.complete();
            if (this.b) {
                this.a.close();
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getH() {
        return this.d;
    }

    public final String toString() {
        return "HttpClient[" + this.a + ']';
    }

    public /* synthetic */ HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig httpClientConfig, int i, xu xuVar) {
        this(httpClientEngine, (i & 2) != 0 ? new HttpClientConfig() : httpClientConfig);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig<? extends HttpClientEngineConfig> httpClientConfig, boolean z) {
        this(httpClientEngine, httpClientConfig);
        httpClientEngine.getClass();
        httpClientConfig.getClass();
        this.b = z;
    }
}
