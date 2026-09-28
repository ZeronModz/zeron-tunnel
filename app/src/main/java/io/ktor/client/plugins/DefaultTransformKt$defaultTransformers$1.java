package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ir;
import defpackage.le0;
import defpackage.mk1;
import defpackage.u7;
import defpackage.uv;
import defpackage.vv;
import defpackage.wv;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteReadChannel;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "body", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
final class DefaultTransformKt$defaultTransformers$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$defaultTransformers$1(Continuation<? super DefaultTransformKt$defaultTransformers$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new DefaultTransformKt$defaultTransformers$1(continuation);
        defaultTransformKt$defaultTransformers$1.L$0 = pipelineContext;
        defaultTransformKt$defaultTransformers$1.L$1 = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OutgoingContent wvVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = pipelineContext.a;
            HeadersBuilder headersBuilder = ((HttpRequestBuilder) obj3).c;
            List list = le0.a;
            if (headersBuilder.get("Accept") == null) {
                ((HttpRequestBuilder) obj3).c.append("Accept", "*/*");
            }
            ContentType contentTypeC = io.ktor.http.c.c((HttpMessageBuilder) obj3);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (contentTypeC == null) {
                    contentTypeC = ir.b;
                }
                wvVar = new TextContent(str, contentTypeC, null, 4, null);
            } else if (obj2 instanceof byte[]) {
                wvVar = new uv(contentTypeC, obj2);
            } else if (obj2 instanceof ByteReadChannel) {
                wvVar = new vv(pipelineContext, contentTypeC, obj2);
            } else if (obj2 instanceof OutgoingContent) {
                wvVar = (OutgoingContent) obj2;
            } else {
                HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) obj3;
                obj2.getClass();
                wvVar = obj2 instanceof InputStream ? new wv(httpRequestBuilder, contentTypeC, obj2) : null;
            }
            if ((wvVar != null ? wvVar.getB() : null) != null) {
                HttpRequestBuilder httpRequestBuilder2 = (HttpRequestBuilder) obj3;
                HeadersBuilder headersBuilder2 = httpRequestBuilder2.c;
                headersBuilder2.getClass();
                headersBuilder2.b.remove("Content-Type");
                f.a.trace("Transformed with default transformers request body for " + httpRequestBuilder2.a + " from " + Reflection.a(obj2.getClass()));
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.e(wvVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
}
