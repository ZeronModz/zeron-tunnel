package com.v2ray.ang.service;

import com.trilead.ssh2.packets.Packets;
import defpackage.cu0;
import defpackage.hz;
import defpackage.mk1;
import defpackage.qf3;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.service.NotificationService$startSpeedNotification$1", f = "NotificationService.kt", i = {0, 0, 0}, l = {Packets.SSH_MSG_USERAUTH_INFO_RESPONSE}, m = "invokeSuspend", n = {"$this$launch", "down", "up"}, s = {"L$0", "J$0", "J$1"})
final class NotificationService$startSpeedNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;

    public NotificationService$startSpeedNotification$1(Continuation<? super NotificationService$startSpeedNotification$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        NotificationService$startSpeedNotification$1 notificationService$startSpeedNotification$1 = new NotificationService$startSpeedNotification$1(continuation);
        notificationService$startSpeedNotification$1.L$0 = obj;
        return notificationService$startSpeedNotification$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((NotificationService$startSpeedNotification$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        do {
            Job job = (Job) coroutineScope.getB().get(Job.Key);
            if (!(job != null ? job.isActive() : true)) {
                return mk1.a;
            }
            Lazy lazy = zq0.a;
            long jC = zq0.u().c(0L, "BytesIn");
            long jC2 = zq0.u().c(0L, "BytesOut");
            cu0.d(jC, hz.v("↓ ", qf3.J(jC), " - ↑ ", qf3.J(jC2)), jC2);
            this.L$0 = coroutineScope;
            this.J$0 = jC;
            this.J$1 = jC2;
            this.label = 1;
        } while (f.b(1000L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
