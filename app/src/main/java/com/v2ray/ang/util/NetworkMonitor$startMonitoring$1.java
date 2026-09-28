package com.v2ray.ang.util;

import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.util.NetworkMonitor$startMonitoring$1", f = "NetworkMonitor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {143}, m = "invokeSuspend", n = {"$this$launch", "currentRx", "currentTx", "downloadSpeed", "uploadSpeed", "currentRx2", "currentTx2", "deltaRx", "deltaTx"}, s = {"L$0", "J$0", "J$1", "F$0", "F$1", "J$2", "J$3", "J$4", "J$5"})
final class NetworkMonitor$startMonitoring$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ long $interval;
    float F$0;
    float F$1;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    long J$5;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMonitor$startMonitoring$1(NetworkMonitor networkMonitor, long j, Continuation<? super NetworkMonitor$startMonitoring$1> continuation) {
        super(2, continuation);
        this.this$0 = networkMonitor;
        this.$interval = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        NetworkMonitor$startMonitoring$1 networkMonitor$startMonitoring$1 = new NetworkMonitor$startMonitoring$1(this.this$0, this.$interval, continuation);
        networkMonitor$startMonitoring$1.L$0 = obj;
        return networkMonitor$startMonitoring$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((NetworkMonitor$startMonitoring$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01b3 -> B:33:0x01b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.util.NetworkMonitor$startMonitoring$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
