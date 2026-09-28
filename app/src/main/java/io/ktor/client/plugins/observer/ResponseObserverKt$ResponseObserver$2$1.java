package io.ktor.client.plugins.observer;

import defpackage.mk1;
import defpackage.u7;
import defpackage.yg0;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.a;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.c;
import kotlinx.coroutines.slf4j.MDCContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", "Lio/ktor/client/statement/HttpResponse;", "response", "Lmk1;", "<anonymous>", "(Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", i = {0, 0, 0}, l = {63, 72}, m = "invokeSuspend", n = {"$this$on", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$2"})
final class ResponseObserverKt$ResponseObserver$2$1 extends SuspendLambda implements Function3<AfterReceiveHook$Context, HttpResponse, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function1<HttpClientCall, Boolean> $filter;
    final /* synthetic */ Function2<HttpResponse, Continuation<? super mk1>, Object> $responseHandler;
    final /* synthetic */ ClientPluginBuilder<ResponseObserverConfig> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", i = {0}, l = {64, 68}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ Function2<HttpResponse, Continuation<? super mk1>, Object> $responseHandler;
        final /* synthetic */ HttpResponse $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HttpResponse httpResponse, Function2<? super HttpResponse, ? super Continuation<? super mk1>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sideResponse = httpResponse;
            this.$responseHandler = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sideResponse, this.$responseHandler, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        
            if (r9 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 0
                mk1 r3 = defpackage.mk1.a
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L1b
                if (r1 != r4) goto L15
                kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L13
                goto L67
            L13:
                r8 = move-exception
                goto L76
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.u7.p(r8)
                return r2
            L1b:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L23
                goto L3d
            L23:
                r9 = move-exception
                goto L41
            L25:
                kotlin.d.b(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super mk1>, java.lang.Object> r1 = r8.$responseHandler
                io.ktor.client.statement.HttpResponse r6 = r8.$sideResponse
                kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L23
                r8.L$0 = r9     // Catch: java.lang.Throwable -> L23
                r8.label = r5     // Catch: java.lang.Throwable -> L23
                java.lang.Object r9 = r1.invoke(r6, r8)     // Catch: java.lang.Throwable -> L23
                if (r9 != r0) goto L3d
                goto L66
            L3d:
                kotlin.Result.m36constructorimpl(r3)     // Catch: java.lang.Throwable -> L23
                goto L4b
            L41:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                kotlin.Result$Failure r1 = new kotlin.Result$Failure
                r1.<init>(r9)
                kotlin.Result.m36constructorimpl(r1)
            L4b:
                io.ktor.client.statement.HttpResponse r9 = r8.$sideResponse
                io.ktor.utils.io.ByteReadChannel r9 = r9.getG()
                boolean r1 = r9.isClosedForRead()
                if (r1 != 0) goto L80
                r8.L$0 = r2     // Catch: java.lang.Throwable -> L13
                r8.label = r4     // Catch: java.lang.Throwable -> L13
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Object r9 = io.ktor.utils.io.c.f(r9, r1, r8)     // Catch: java.lang.Throwable -> L13
                if (r9 != r0) goto L67
            L66:
                return r0
            L67:
                java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L13
                long r8 = r9.longValue()     // Catch: java.lang.Throwable -> L13
                java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L13
                r0.<init>(r8)     // Catch: java.lang.Throwable -> L13
                kotlin.Result.m36constructorimpl(r0)     // Catch: java.lang.Throwable -> L13
                goto L80
            L76:
                kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
                kotlin.Result$Failure r9 = new kotlin.Result$Failure
                r9.<init>(r8)
                kotlin.Result.m36constructorimpl(r9)
            L80:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResponseObserverKt$ResponseObserver$2$1(Function1<? super HttpClientCall, Boolean> function1, ClientPluginBuilder<ResponseObserverConfig> clientPluginBuilder, Function2<? super HttpResponse, ? super Continuation<? super mk1>, ? extends Object> function2, Continuation<? super ResponseObserverKt$ResponseObserver$2$1> continuation) {
        super(3, continuation);
        this.$filter = function1;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$responseHandler = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AfterReceiveHook$Context afterReceiveHook$Context, HttpResponse httpResponse, Continuation<? super mk1> continuation) {
        ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new ResponseObserverKt$ResponseObserver$2$1(this.$filter, this.$this_createClientPlugin, this.$responseHandler, continuation);
        responseObserverKt$ResponseObserver$2$1.L$0 = afterReceiveHook$Context;
        responseObserverKt$ResponseObserver$2$1.L$1 = httpResponse;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AfterReceiveHook$Context afterReceiveHook$Context;
        HttpResponse httpResponse;
        HttpResponse httpResponse2;
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        mk1 mk1Var = mk1.a;
        if (i == 0) {
            d.b(obj);
            afterReceiveHook$Context = (AfterReceiveHook$Context) this.L$0;
            HttpResponse httpResponse3 = (HttpResponse) this.L$1;
            Function1<HttpClientCall, Boolean> function1 = this.$filter;
            if (function1 == null || function1.invoke(httpResponse3.getA()).booleanValue()) {
                Pair pairH = a.h(httpResponse3.getG(), httpResponse3);
                ByteReadChannel byteReadChannel = (ByteReadChannel) pairH.component1();
                HttpResponse httpResponseD = yg0.P(httpResponse3.getA(), (ByteReadChannel) pairH.component2()).d();
                HttpResponse httpResponseD2 = yg0.P(httpResponse3.getA(), byteReadChannel).d();
                HttpClient httpClient = this.$this_createClientPlugin.a;
                this.L$0 = afterReceiveHook$Context;
                this.L$1 = httpResponseD;
                this.L$2 = httpResponseD2;
                this.L$3 = httpClient;
                this.label = 1;
                Object obj2 = (MDCContext) getB().get(MDCContext.c);
                if (obj2 == null) {
                    obj2 = EmptyCoroutineContext.INSTANCE;
                }
                if (obj2 != coroutineSingletons) {
                    Object obj3 = obj2;
                    httpResponse = httpResponseD2;
                    obj = obj3;
                    httpResponse2 = httpResponseD;
                    coroutineScope = httpClient;
                }
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
        coroutineScope = (CoroutineScope) this.L$3;
        httpResponse = (HttpResponse) this.L$2;
        httpResponse2 = (HttpResponse) this.L$1;
        afterReceiveHook$Context = (AfterReceiveHook$Context) this.L$0;
        d.b(obj);
        c.d(coroutineScope, (CoroutineContext) obj, null, new AnonymousClass1(httpResponse, this.$responseHandler, null), 2);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        return afterReceiveHook$Context.a.e(httpResponse2, this) == coroutineSingletons ? coroutineSingletons : mk1Var;
    }
}
