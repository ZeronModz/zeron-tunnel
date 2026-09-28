package io.ktor.client.plugins.sse;

import defpackage.dg;
import defpackage.le0;
import defpackage.mk1;
import defpackage.p41;
import defpackage.u7;
import defpackage.yg0;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.SSEClientResponseAdapter;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SSEKt$SSE$2$1 extends SuspendLambda implements Function3<HttpRequestBuilder, OutgoingContent, Continuation<? super OutgoingContent>, Object> {
    final /* synthetic */ long $reconnectionTime;
    final /* synthetic */ boolean $showCommentEvents;
    final /* synthetic */ boolean $showRetryEvents;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEKt$SSE$2$1(long j, boolean z, boolean z2, Continuation<? super SSEKt$SSE$2$1> continuation) {
        super(3, continuation);
        this.$reconnectionTime = j;
        this.$showCommentEvents = z;
        this.$showRetryEvents = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent, Continuation<? super OutgoingContent> continuation) {
        SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new SSEKt$SSE$2$1(this.$reconnectionTime, this.$showCommentEvents, this.$showRetryEvents, continuation);
        sSEKt$SSE$2$1.L$0 = httpRequestBuilder;
        sSEKt$SSE$2$1.L$1 = outgoingContent;
        return sSEKt$SSE$2$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        OutgoingContent outgoingContent = (OutgoingContent) this.L$1;
        AttributeKey attributeKey = dg.a;
        Logger logger = c.a;
        Attributes attributes = httpRequestBuilder.f;
        if (!yg0.a(attributes.getOrNull(attributeKey), Boolean.TRUE)) {
            return outgoingContent;
        }
        c.a.trace("Sending SSE request " + httpRequestBuilder.a);
        httpRequestBuilder.c(p41.a, mk1.a);
        kotlin.time.a aVar = (kotlin.time.a) attributes.getOrNull(dg.b);
        Boolean bool = (Boolean) attributes.getOrNull(dg.c);
        Boolean bool2 = (Boolean) attributes.getOrNull(dg.d);
        attributes.put(io.ktor.client.request.a.a, new SSEClientResponseAdapter());
        ContentType b = outgoingContent.getD();
        if (b != null) {
            HeadersBuilder c = httpRequestBuilder.getC();
            List list = le0.a;
            c.set("Content-Type", b.toString());
        }
        return new SSEClientContent(aVar != null ? aVar.a : this.$reconnectionTime, bool != null ? bool.booleanValue() : this.$showCommentEvents, bool2 != null ? bool2.booleanValue() : this.$showRetryEvents, outgoingContent, null);
    }
}
