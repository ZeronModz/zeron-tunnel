package com.v2ray.ang.viewmodel;

import com.v2ray.ang.dto.ServersCache;
import defpackage.mk1;
import defpackage.u7;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.viewmodel.MainViewModel$testAllTcping$2$1", f = "MainViewModel.kt", i = {0}, l = {227}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class MainViewModel$testAllTcping$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ ServersCache $item;
    final /* synthetic */ String $serverAddress;
    final /* synthetic */ String $serverPort;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.viewmodel.MainViewModel$testAllTcping$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.viewmodel.MainViewModel$testAllTcping$2$1$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ ServersCache $item;
        final /* synthetic */ long $testResult;
        int label;
        final /* synthetic */ MainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServersCache serversCache, long j, MainViewModel mainViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$item = serversCache;
            this.$testResult = j;
            this.this$0 = mainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$item, this.$testResult, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
            Lazy lazy = zq0.a;
            zq0.o(this.$testResult, this.$item.getGuid());
            this.this$0.getUpdateListAction().k(new Integer(this.this$0.getPosition(this.$item.getGuid())));
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$testAllTcping$2$1(String str, String str2, ServersCache serversCache, MainViewModel mainViewModel, Continuation<? super MainViewModel$testAllTcping$2$1> continuation) {
        super(2, continuation);
        this.$serverAddress = str;
        this.$serverPort = str2;
        this.$item = serversCache;
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        MainViewModel$testAllTcping$2$1 mainViewModel$testAllTcping$2$1 = new MainViewModel$testAllTcping$2$1(this.$serverAddress, this.$serverPort, this.$item, this.this$0, continuation);
        mainViewModel$testAllTcping$2$1.L$0 = obj;
        return mainViewModel$testAllTcping$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((MainViewModel$testAllTcping$2$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2 A[EDGE_INSN: B:64:0x00a2->B:50:0x00a2 BREAK  A[LOOP:0: B:9:0x0034->B:49:0x009e], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r1 = r20
            java.lang.Object r0 = r1.L$0
            r2 = r0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r1.label
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L1f
            if (r0 != r6) goto L19
            kotlin.d.b(r21)
            r0 = r21
            goto Laa
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r0)
            return r4
        L1f:
            kotlin.d.b(r21)
            m91 r7 = defpackage.m91.a
            java.lang.String r8 = r1.$serverAddress
            java.lang.String r0 = r1.$serverPort
            int r9 = java.lang.Integer.parseInt(r0)
            r1.L$0 = r2
            r1.label = r6
            r0 = 0
            r12 = r0
            r13 = -1
        L34:
            if (r12 >= r5) goto La2
            r8.getClass()
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            java.util.ArrayList r15 = defpackage.m91.b     // Catch: java.lang.Throwable -> L70
            r15.add(r0)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69 java.io.IOException -> L6c
            long r16 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69 java.io.IOException -> L6c
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69 java.io.IOException -> L6c
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L69 java.lang.Throwable -> L69 java.io.IOException -> L6c
            r18 = -1
            r10 = 3000(0xbb8, float:4.204E-42)
            r0.connect(r6, r10)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78
            long r10 = r10 - r16
            monitor-enter(r7)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78
            r15.remove(r0)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.lang.Throwable -> L78
            r0.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.lang.Throwable -> L78
            goto L7a
        L64:
            r0 = move-exception
            goto L75
        L66:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.lang.Throwable -> L78
            throw r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.lang.Throwable -> L78
        L69:
            r18 = -1
            goto L78
        L6c:
            r0 = move-exception
            r18 = -1
            goto L75
        L70:
            r0 = move-exception
            r18 = -1
            monitor-exit(r7)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.lang.Throwable -> L78
            throw r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L78 java.lang.Throwable -> L78
        L75:
            r0.toString()
        L78:
            r10 = r18
        L7a:
            kotlin.coroutines.CoroutineContext r0 = r1.getB()
            ai0 r6 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r6)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto L8d
            boolean r0 = r0.isActive()
            goto L8e
        L8d:
            r0 = 1
        L8e:
            if (r0 != 0) goto L91
            goto La2
        L91:
            int r0 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r0 == 0) goto L9e
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 == 0) goto L9d
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 >= 0) goto L9e
        L9d:
            r13 = r10
        L9e:
            int r12 = r12 + 1
            r6 = 1
            goto L34
        La2:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r13)
            if (r0 != r3) goto Laa
            return r3
        Laa:
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            lv r0 = defpackage.oy.a
            kotlinx.coroutines.MainCoroutineDispatcher r0 = defpackage.bn0.a
            com.v2ray.ang.viewmodel.MainViewModel$testAllTcping$2$1$1 r6 = new com.v2ray.ang.viewmodel.MainViewModel$testAllTcping$2$1$1
            com.v2ray.ang.dto.ServersCache r7 = r1.$item
            com.v2ray.ang.viewmodel.MainViewModel r10 = r1.this$0
            r11 = 0
            r6.<init>(r7, r8, r10, r11)
            kotlinx.coroutines.c.d(r2, r0, r4, r6, r5)
            mk1 r0 = defpackage.mk1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.viewmodel.MainViewModel$testAllTcping$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
