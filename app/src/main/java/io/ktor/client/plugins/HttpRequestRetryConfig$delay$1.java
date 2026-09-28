package io.ktor.client.plugins;

import androidx.datastore.preferences.protobuf.x0;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "it", "Lmk1;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", i = {}, l = {x0.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
public final class HttpRequestRetryConfig$delay$1 extends SuspendLambda implements Function2<Long, Continuation<? super mk1>, Object> {
    /* synthetic */ long J$0;
    int label;

    public HttpRequestRetryConfig$delay$1(Continuation<? super HttpRequestRetryConfig$delay$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        HttpRequestRetryConfig$delay$1 httpRequestRetryConfig$delay$1 = new HttpRequestRetryConfig$delay$1(continuation);
        httpRequestRetryConfig$delay$1.J$0 = ((Number) obj).longValue();
        return httpRequestRetryConfig$delay$1;
    }

    public final Object invoke(long j, Continuation<? super mk1> continuation) {
        return ((HttpRequestRetryConfig$delay$1) create(Long.valueOf(j), continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            long j = this.J$0;
            this.label = 1;
            if (kotlinx.coroutines.f.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        return mk1.a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super mk1> continuation) {
        return invoke(l.longValue(), continuation);
    }
}
