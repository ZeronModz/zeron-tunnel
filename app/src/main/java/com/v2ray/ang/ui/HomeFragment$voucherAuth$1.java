package com.v2ray.ang.ui;

import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.u7;
import java.time.Duration;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$voucherAuth$1", f = "HomeFragment.kt", i = {1, 1, 1}, l = {3986, 4029}, m = "invokeSuspend", n = {"responseText", "json", "expiry"}, s = {"L$0", "L$1", "L$2"})
final class HomeFragment$voucherAuth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Ref$BooleanRef $isok;
    final /* synthetic */ Function1<Boolean, mk1> $onComplete;
    final /* synthetic */ boolean $showtoast;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$voucherAuth$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$voucherAuth$1$1", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ String $expiry;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeFragment homeFragment, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = homeFragment;
            this.$expiry = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$expiry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String string;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            HomeFragment homeFragment = this.this$0;
            TextView textView = homeFragment.J1;
            if (textView != null) {
                String str = this.$expiry;
                str.getClass();
                homeFragment.getClass();
                OffsetDateTime offsetDateTime = OffsetDateTime.parse(str);
                OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
                if (offsetDateTime.isBefore(offsetDateTimeNow)) {
                    string = "Expired";
                } else {
                    long minutes = Duration.between(offsetDateTimeNow, offsetDateTime).toMinutes();
                    long j = minutes / 1440;
                    long j2 = (minutes % 1440) / 60;
                    long j3 = minutes % 60;
                    StringBuilder sb = new StringBuilder();
                    String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (j > 0) {
                        sb.append(j + "day" + (j != 1 ? "s" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    }
                    if (j2 > 0) {
                        if (sb.length() > 0) {
                            sb.append(" ");
                        }
                        if (j2 != 1) {
                            str2 = "s";
                        }
                        sb.append(j2 + "hr" + str2);
                    }
                    if (j3 > 0) {
                        if (sb.length() > 0) {
                            sb.append(" ");
                        }
                        sb.append(j3 + "min");
                    }
                    sb.append(" left");
                    string = sb.toString();
                }
                textView.setText(string);
            }
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeFragment$voucherAuth$1(Ref$BooleanRef ref$BooleanRef, HomeFragment homeFragment, boolean z, Function1<? super Boolean, mk1> function1, Continuation<? super HomeFragment$voucherAuth$1> continuation) {
        super(2, continuation);
        this.$isok = ref$BooleanRef;
        this.this$0 = homeFragment;
        this.$showtoast = z;
        this.$onComplete = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$voucherAuth$1(this.$isok, this.this$0, this.$showtoast, this.$onComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HomeFragment$voucherAuth$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (kotlinx.coroutines.c.e(r1, r6, r8) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment$voucherAuth$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
