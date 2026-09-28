package com.v2ray.ang;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import dev.zeron.tunnel.R;
import defpackage.hv;
import defpackage.lv;
import defpackage.mk1;
import defpackage.n8;
import defpackage.oy;
import defpackage.u7;
import defpackage.zr;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.f;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplashActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: com.v2ray.ang.SplashActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.SplashActivity$onCreate$1", f = "SplashActivity.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return SplashActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                d.b(obj);
                this.label = 1;
                if (f.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d.b(obj);
            }
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.getClass();
            splashActivity.startActivity(new Intent(splashActivity, (Class<?>) Hometab.class));
            splashActivity.finish();
            return mk1.a;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        androidx.activity.c.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        n8.c(this);
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(zr.a(hv.c), null, null, new AnonymousClass1(null), 3);
    }
}
