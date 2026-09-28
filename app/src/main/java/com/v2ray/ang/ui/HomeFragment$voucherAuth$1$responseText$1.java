package com.v2ray.ang.ui;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$voucherAuth$1$responseText$1", f = "HomeFragment.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {5109, 4014}, m = "invokeSuspend", n = {"hardwareId", "deviceId", "body", "client", "urlauth", "$this$post$iv", "urlString$iv", "$completion$iv", "$this$post$iv$iv", "$this$post$iv$iv$iv", "builder$iv$iv$iv", "$this$request$iv$iv$iv$iv", "$i$a$-use-HomeFragment$voucherAuth$1$responseText$1$1", "$i$f$post", "$i$f$post", "$i$f$post", "$i$f$request", "hardwareId", "deviceId", "body", "client", "response", "urlauth", "$i$a$-use-HomeFragment$voucherAuth$1$responseText$1$1"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "I$0"})
public final class HomeFragment$voucherAuth$1$responseText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$voucherAuth$1$responseText$1(HomeFragment homeFragment, Continuation<? super HomeFragment$voucherAuth$1$responseText$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$voucherAuth$1$responseText$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((HomeFragment$voucherAuth$1$responseText$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f9, code lost:
    
        if (r13 == r0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5 A[Catch: all -> 0x002f, TryCatch #4 {all -> 0x002f, blocks: (B:7:0x002a, B:50:0x01fc, B:45:0x01c9, B:47:0x01d5, B:53:0x0202, B:54:0x021e), top: B:67:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0202 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #4 {all -> 0x002f, blocks: (B:7:0x002a, B:50:0x01fc, B:45:0x01c9, B:47:0x01d5, B:53:0x0202, B:54:0x021e), top: B:67:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v33 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment$voucherAuth$1$responseText$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
