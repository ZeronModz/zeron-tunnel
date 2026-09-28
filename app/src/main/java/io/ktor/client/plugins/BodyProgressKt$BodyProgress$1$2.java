package io.ktor.client.plugins;

import defpackage.mk1;
import defpackage.u7;
import defpackage.ye;
import defpackage.yg0;
import io.ktor.client.content.ProgressListener;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class BodyProgressKt$BodyProgress$1$2 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super HttpResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public BodyProgressKt$BodyProgress$1$2(Continuation<? super BodyProgressKt$BodyProgress$1$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(continuation);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HttpResponse httpResponse, Continuation<? super HttpResponse> continuation) {
        return ((BodyProgressKt$BodyProgress$1$2) create(httpResponse, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        HttpResponse httpResponse = (HttpResponse) this.L$0;
        ProgressListener progressListener = (ProgressListener) httpResponse.getA().c().getC().getOrNull(ye.b);
        if (progressListener == null) {
            return null;
        }
        return yg0.P(httpResponse.getA(), io.ktor.client.utils.a.a(httpResponse.getG(), httpResponse.getI(), io.ktor.http.c.b(httpResponse), progressListener)).d();
    }
}
