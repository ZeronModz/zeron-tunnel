package com.v2ray.ang.ui;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.bn0;
import defpackage.hv;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.u7;
import defpackage.xm;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.LogcatActivity$getLogcat$1", f = "LogcatActivity.kt", i = {0, 0}, l = {Packets.SSH_MSG_USERAUTH_INFO_REQUEST}, m = "invokeSuspend", n = {"$this$launch", "lst"}, s = {"L$0", "L$1"})
final class LogcatActivity$getLogcat$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LogcatActivity this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.LogcatActivity$getLogcat$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.LogcatActivity$getLogcat$1$1", f = "LogcatActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ List<String> $allText;
        int label;
        final /* synthetic */ LogcatActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LogcatActivity logcatActivity, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = logcatActivity;
            this.$allText = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$allText, continuation);
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
            kotlin.d.b(obj);
            this.this$0.d = kotlin.collections.c.S(this.$allText);
            LogcatActivity logcatActivity = this.this$0;
            ArrayList arrayListS = kotlin.collections.c.S(this.$allText);
            logcatActivity.getClass();
            logcatActivity.e = arrayListS;
            ((LogcatRecyclerAdapter) this.this$0.f.getValue()).f();
            this.this$0.i().c.setRefreshing(false);
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogcatActivity$getLogcat$1(LogcatActivity logcatActivity, Continuation<? super LogcatActivity$getLogcat$1> continuation) {
        super(2, continuation);
        this.this$0 = logcatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        LogcatActivity$getLogcat$1 logcatActivity$getLogcat$1 = new LogcatActivity$getLogcat$1(this.this$0, continuation);
        logcatActivity$getLogcat$1.L$0 = obj;
        return logcatActivity$getLogcat$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((LogcatActivity$getLogcat$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add("logcat");
            linkedHashSet.add("-d");
            linkedHashSet.add("-v");
            linkedHashSet.add("time");
            linkedHashSet.add("-s");
            linkedHashSet.add("GoLog,tun2socks,dev.zeron.tunnel,AndroidRuntime,System.err");
            lv lvVar = oy.a;
            hv hvVar = hv.c;
            LogcatActivity$getLogcat$1$process$1 logcatActivity$getLogcat$1$process$1 = new LogcatActivity$getLogcat$1$process$1(linkedHashSet, null);
            this.L$0 = coroutineScope;
            this.L$1 = null;
            this.label = 1;
            obj = kotlinx.coroutines.c.e(hvVar, logcatActivity$getLogcat$1$process$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        InputStream inputStream = ((Process) obj).getInputStream();
        inputStream.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
        try {
            ArrayList arrayListA = kotlin.io.d.a(bufferedReader);
            bufferedReader.close();
            List listJ = kotlin.collections.c.J(arrayListA);
            lv lvVar2 = oy.a;
            kotlinx.coroutines.c.d(coroutineScope, bn0.a, null, new AnonymousClass1(this.this$0, listJ, null), 2);
            return mk1.a;
        } finally {
        }
    }
}
