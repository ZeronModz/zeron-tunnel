package io.ktor.client.plugins.cookies;

import defpackage.mk1;
import defpackage.u7;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class HttpCookies$initializer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$initializer$1(HttpCookies httpCookies, Continuation<? super HttpCookies$initializer$1> continuation) {
        super(2, continuation);
        this.this$0 = httpCookies;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HttpCookies$initializer$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HttpCookies$initializer$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        HttpCookies httpCookies;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            d.b(obj);
            HttpCookies httpCookies2 = this.this$0;
            it = httpCookies2.b.iterator();
            httpCookies = httpCookies2;
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$1;
            httpCookies = (HttpCookies) this.L$0;
            d.b(obj);
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            CookiesStorage cookiesStorage = httpCookies.a;
            this.L$0 = httpCookies;
            this.L$1 = it;
            this.label = 1;
            if (function2.invoke(cookiesStorage, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return mk1.a;
    }
}
