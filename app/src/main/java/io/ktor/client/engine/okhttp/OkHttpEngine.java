package io.ktor.client.engine.okhttp;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mk1;
import defpackage.op1;
import defpackage.p41;
import defpackage.p60;
import defpackage.pe0;
import defpackage.tb0;
import defpackage.u7;
import defpackage.uu0;
import defpackage.vu0;
import defpackage.xu;
import defpackage.yq0;
import defpackage.z3;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.request.HttpResponseData;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1;
import io.ktor.util.LRUCache;
import io.ktor.util.date.GMTDate;
import java.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "config", "<init>", "(Lio/ktor/client/engine/okhttp/OkHttpConfig;)V", "Companion", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpEngine extends HttpClientEngineBase {
    public static final Companion k = new Companion(null);
    public static final Lazy l = c.b(new yq0(9));
    public final OkHttpConfig f;
    public final Set g;
    public final CoroutineContext h;
    public final CoroutineContext i;
    public final Map j;

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return OkHttpEngine.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.util.Iterator] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    d.b(obj);
                    CoroutineContext.Element element = OkHttpEngine.this.h.get(Job.Key);
                    element.getClass();
                    this.label = 1;
                    if (((Job) element).join(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        u7.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d.b(obj);
                }
                while (it.hasNext()) {
                    OkHttpClient okHttpClient = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                    okHttpClient.b.a();
                    okHttpClient.a.a().shutdown();
                }
                return mk1.a;
            } finally {
                it = OkHttpEngine.this.j.entrySet().iterator();
                while (it.hasNext()) {
                    OkHttpClient okHttpClient2 = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                    okHttpClient2.b.a();
                    okHttpClient2.a.a().shutdown();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$execute$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0}, l = {Packets.SSH_MSG_USERAUTH_INFO_REQUEST, 67, 68, 69}, m = "execute", n = {"this", Constants$ScionAnalytics$MessageType.DATA_MESSAGE}, s = {"L$0", "L$1"})
    final class C00231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00231(Continuation<? super C00231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return OkHttpEngine.this.execute(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngine(OkHttpConfig okHttpConfig) {
        super("ktor-okhttp");
        okHttpConfig.getClass();
        this.f = okHttpConfig;
        this.g = kotlin.collections.b.y(new HttpClientEngineCapability[]{pe0.a, op1.a, p41.a});
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LRUCache(new OkHttpEngine$clientCache$1(this), new z3(26), okHttpConfig.b));
        mapSynchronizedMap.getClass();
        this.j = mapSynchronizedMap;
        CoroutineContext.Element element = super.getA().get(Job.Key);
        element.getClass();
        CoroutineContext coroutineContextD = kotlin.coroutines.b.d(new CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key), (JobSupport) kotlinx.coroutines.a.b((Job) element));
        this.h = coroutineContextD;
        this.i = super.getA().plus(coroutineContextD);
        kotlinx.coroutines.c.c(tb0.a, super.getA(), CoroutineStart.ATOMIC, new AnonymousClass1(null));
    }

    public static HttpResponseData a(Response response, GMTDate gMTDate, Object obj, CoroutineContext coroutineContext) {
        HttpProtocolVersion httpProtocolVersion;
        HttpStatusCode httpStatusCode = new HttpStatusCode(response.d, response.c);
        switch (uu0.a[response.b.ordinal()]) {
            case 1:
                HttpProtocolVersion.d.getClass();
                httpProtocolVersion = HttpProtocolVersion.g;
                break;
            case 2:
                HttpProtocolVersion.d.getClass();
                httpProtocolVersion = HttpProtocolVersion.f;
                break;
            case 3:
                HttpProtocolVersion.d.getClass();
                httpProtocolVersion = HttpProtocolVersion.h;
                break;
            case 4:
                HttpProtocolVersion.d.getClass();
                httpProtocolVersion = HttpProtocolVersion.e;
                break;
            case 5:
                HttpProtocolVersion.d.getClass();
                httpProtocolVersion = HttpProtocolVersion.e;
                break;
            case 6:
                HttpProtocolVersion.d.getClass();
                httpProtocolVersion = HttpProtocolVersion.i;
                break;
            default:
                p60.b();
                return null;
        }
        return new HttpResponseData(httpStatusCode, gMTDate, new vu0(response.f), httpProtocolVersion, obj, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(okhttp3.OkHttpClient r8, okhttp3.Request r9, kotlin.coroutines.CoroutineContext r10, io.ktor.client.request.HttpRequestData r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 != r5) goto L3f
            java.lang.Object r7 = r0.L$3
            io.ktor.util.date.GMTDate r7 = (io.ktor.util.date.GMTDate) r7
            java.lang.Object r8 = r0.L$2
            r11 = r8
            io.ktor.client.request.HttpRequestData r11 = (io.ktor.client.request.HttpRequestData) r11
            java.lang.Object r8 = r0.L$1
            r10 = r8
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            java.lang.Object r8 = r0.L$0
            io.ktor.client.engine.okhttp.OkHttpEngine r8 = (io.ktor.client.engine.okhttp.OkHttpEngine) r8
            kotlin.d.b(r12)
            r6 = r12
            r12 = r7
            r7 = r8
            r8 = r6
            goto L8a
        L3f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r4
        L45:
            kotlin.d.b(r12)
            io.ktor.util.date.GMTDate r12 = io.ktor.util.date.a.b(r4)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.label = r5
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.a.c(r0)
            r2.<init>(r0, r5)
            r2.initCancellability()
            okhttp3.Call r8 = r8.newCall(r9)
            ai0 r9 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r9 = r10.get(r9)
            r9.getClass()
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            cg r0 = new cg
            okhttp3.internal.connection.RealCall r8 = (okhttp3.internal.connection.RealCall) r8
            r0.<init>(r8, r3)
            r9.invokeOnCompletion(r5, r5, r0)
            io.ktor.client.engine.okhttp.OkHttpCallback r9 = new io.ktor.client.engine.okhttp.OkHttpCallback
            r9.<init>(r11, r2)
            r8.enqueue(r9)
            java.lang.Object r8 = r2.m()
            if (r8 != r1) goto L8a
            return r1
        L8a:
            okhttp3.Response r8 = (okhttp3.Response) r8
            okhttp3.ResponseBody r9 = r8.g
            ai0 r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r10.get(r0)
            r0.getClass()
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            t r1 = new t
            r2 = 19
            r1.<init>(r9, r2)
            r0.invokeOnCompletion(r1)
            if (r9 == 0) goto Lb9
            okio.BufferedSource r9 = r9.getD()
            if (r9 == 0) goto Lb9
            io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1
            r0.<init>(r9, r10, r11, r4)
            tb0 r9 = defpackage.tb0.a
            io.ktor.utils.io.WriterJob r9 = io.ktor.utils.io.d.j(r9, r10, r0, r3)
            io.ktor.utils.io.ByteReadChannel r9 = r9.a
            goto Lc0
        Lb9:
            qg r9 = io.ktor.utils.io.ByteReadChannel.Companion
            r9.getClass()
            pg r9 = defpackage.qg.b
        Lc0:
            r7.getClass()
            io.ktor.client.request.HttpResponseData r7 = a(r8, r12, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.b(okhttp3.OkHttpClient, okhttp3.Request, kotlin.coroutines.CoroutineContext, io.ktor.client.request.HttpRequestData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.OkHttpClient r7, okhttp3.Request r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.L$3
            io.ktor.client.engine.okhttp.OkHttpSSESession r6 = (io.ktor.client.engine.okhttp.OkHttpSSESession) r6
            java.lang.Object r7 = r0.L$2
            io.ktor.util.date.GMTDate r7 = (io.ktor.util.date.GMTDate) r7
            java.lang.Object r8 = r0.L$1
            r9 = r8
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            java.lang.Object r8 = r0.L$0
            io.ktor.client.engine.okhttp.OkHttpEngine r8 = (io.ktor.client.engine.okhttp.OkHttpEngine) r8
            kotlin.d.b(r10)
            r2 = r6
            r6 = r8
            goto L63
        L3b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L41:
            kotlin.d.b(r10)
            io.ktor.util.date.GMTDate r10 = io.ktor.util.date.a.b(r3)
            io.ktor.client.engine.okhttp.OkHttpSSESession r2 = new io.ktor.client.engine.okhttp.OkHttpSSESession
            r2.<init>(r7, r8, r9)
            r0.L$0 = r6
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r2
            r0.label = r4
            kotlinx.coroutines.CompletableDeferred r7 = r2.c
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r5 = r10
            r10 = r7
            r7 = r5
        L63:
            okhttp3.Response r10 = (okhttp3.Response) r10
            r6.getClass()
            io.ktor.client.request.HttpResponseData r6 = a(r10, r7, r2, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.c(okhttp3.OkHttpClient, okhttp3.Request, kotlin.coroutines.CoroutineContext, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        CoroutineContext.Element element = this.h.get(Job.Key);
        element.getClass();
        ((CompletableJob) element).complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(okhttp3.OkHttpClient r7, okhttp3.Request r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.L$3
            io.ktor.client.engine.okhttp.OkHttpWebsocketSession r6 = (io.ktor.client.engine.okhttp.OkHttpWebsocketSession) r6
            java.lang.Object r7 = r0.L$2
            io.ktor.util.date.GMTDate r7 = (io.ktor.util.date.GMTDate) r7
            java.lang.Object r8 = r0.L$1
            r9 = r8
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            java.lang.Object r8 = r0.L$0
            io.ktor.client.engine.okhttp.OkHttpEngine r8 = (io.ktor.client.engine.okhttp.OkHttpEngine) r8
            kotlin.d.b(r10)
            r2 = r6
            r6 = r8
            goto L6d
        L3b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L41:
            kotlin.d.b(r10)
            io.ktor.util.date.GMTDate r10 = io.ktor.util.date.a.b(r3)
            io.ktor.client.engine.okhttp.OkHttpWebsocketSession r2 = new io.ktor.client.engine.okhttp.OkHttpWebsocketSession
            io.ktor.client.engine.okhttp.OkHttpConfig r3 = r6.f
            r3.getClass()
            r2.<init>(r7, r7, r8, r9)
            kotlinx.coroutines.CompletableDeferred r7 = r2.d
            r7.complete(r2)
            r0.L$0 = r6
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r2
            r0.label = r4
            kotlinx.coroutines.CompletableDeferred r7 = r2.e
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
            r10 = r7
            r7 = r5
        L6d:
            okhttp3.Response r10 = (okhttp3.Response) r10
            r6.getClass()
            io.ktor.client.request.HttpResponseData r6 = a(r10, r7, r2, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.d(okhttp3.OkHttpClient, okhttp3.Request, kotlin.coroutines.CoroutineContext, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(io.ktor.client.request.HttpRequestData r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.execute(io.ktor.client.request.HttpRequestData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public final HttpClientEngineConfig getConfig() {
        return this.f;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getA() {
        return this.i;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    /* JADX INFO: renamed from: getSupportedCapabilities, reason: from getter */
    public final Set getG() {
        return this.g;
    }
}
