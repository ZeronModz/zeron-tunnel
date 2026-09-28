package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ay2;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.client.request.HttpRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "request", "Lio/ktor/client/request/HttpRequest;", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3", f = "HttpCallValidator.kt", i = {0}, l = {119}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
final class HttpCallValidatorKt$HttpCallValidator$2$3 extends SuspendLambda implements Function3<HttpRequest, Throwable, Continuation<? super Throwable>, Object> {
    final /* synthetic */ List<HandlerWrapper> $callExceptionHandlers;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$3(List<? extends HandlerWrapper> list, Continuation<? super HttpCallValidatorKt$HttpCallValidator$2$3> continuation) {
        super(3, continuation);
        this.$callExceptionHandlers = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpRequest httpRequest, Throwable th, Continuation<? super Throwable> continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$3 httpCallValidatorKt$HttpCallValidator$2$3 = new HttpCallValidatorKt$HttpCallValidator$2$3(this.$callExceptionHandlers, continuation);
        httpCallValidatorKt$HttpCallValidator$2$3.L$0 = httpRequest;
        httpCallValidatorKt$HttpCallValidator$2$3.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$3.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            kotlin.d.b(obj);
            return th;
        }
        kotlin.d.b(obj);
        HttpRequest httpRequest = (HttpRequest) this.L$0;
        Throwable thW = ay2.w((Throwable) this.L$1);
        List<HandlerWrapper> list = this.$callExceptionHandlers;
        this.L$0 = thW;
        this.label = 1;
        return i.a(list, thW, httpRequest, this) == coroutineSingletons ? coroutineSingletons : thW;
    }
}
