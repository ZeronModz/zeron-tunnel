package com.v2ray.ang.util;

import android.util.Log;
import defpackage.bn0;
import defpackage.k02;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
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
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.c;
import libv2ray.Libv2ray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.util.ConfigUpdate$configUpdate$1", f = "ConfigUpdate.kt", i = {0, 0}, l = {40}, m = "invokeSuspend", n = {"version", "newfc"}, s = {"L$0", "L$1"})
final class ConfigUpdate$configUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ String $current;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ConfigUpdate this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.util.ConfigUpdate$configUpdate$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.util.ConfigUpdate$configUpdate$1$1", f = "ConfigUpdate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;
        final /* synthetic */ ConfigUpdate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfigUpdate configUpdate, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = configUpdate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            this.this$0.a.onUpdateAvailable();
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigUpdate$configUpdate$1(String str, ConfigUpdate configUpdate, Continuation<? super ConfigUpdate$configUpdate$1> continuation) {
        super(2, continuation);
        this.$current = str;
        this.this$0 = configUpdate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new ConfigUpdate$configUpdate$1(this.$current, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((ConfigUpdate$configUpdate$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    d.b(obj);
                    if (Libv2ray.cu(this.$current)) {
                        String verNotes = Libv2ray.getVerNotes("Version");
                        String strGfc = Libv2ray.gfc();
                        Lazy lazy = zq0.a;
                        verNotes.getClass();
                        zq0.u().i("CurrentConfigVersion", verNotes);
                        strGfc.getClass();
                        zq0.u().i("KidConfigMM1", strGfc);
                        lv lvVar = oy.a;
                        MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (c.e(mainCoroutineDispatcher, anonymousClass1, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        k02.b(Log.d("ConfigUpdate", "No update available"));
                    }
                } else {
                    if (i != 1) {
                        u7.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d.b(obj);
                }
            } catch (Exception e) {
                k02.b(Log.e("ConfigUpdate", "Error Updating: " + e.getMessage(), e));
            }
            return mk1.a;
        } finally {
            this.this$0.b = false;
        }
    }
}
