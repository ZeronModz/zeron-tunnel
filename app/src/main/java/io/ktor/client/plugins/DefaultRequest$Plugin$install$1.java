package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ay2;
import defpackage.kf2;
import defpackage.l02;
import defpackage.le0;
import defpackage.mk1;
import defpackage.sb2;
import defpackage.u7;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HeadersImpl;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersBuilderImpl;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLProtocol;
import io.ktor.http.Url;
import io.ktor.http.UrlDecodedParametersBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.pipeline.PipelineContext;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DefaultRequest$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ DefaultRequest $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRequest$Plugin$install$1(DefaultRequest defaultRequest, Continuation<? super DefaultRequest$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = defaultRequest;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new DefaultRequest$Plugin$install$1(this.$plugin, continuation);
        defaultRequest$Plugin$install$1.L$0 = pipelineContext;
        return defaultRequest$Plugin$install$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        Object obj2 = ((PipelineContext) this.L$0).a;
        String string = ((HttpRequestBuilder) obj2).a.toString();
        DefaultRequest.DefaultRequestBuilder defaultRequestBuilder = new DefaultRequest.DefaultRequestBuilder();
        DefaultRequest defaultRequest = this.$plugin;
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) obj2;
        Attributes attributes = httpRequestBuilder.f;
        URLBuilder uRLBuilder = httpRequestBuilder.a;
        HeadersBuilder headersBuilder = httpRequestBuilder.c;
        HeadersBuilder headersBuilder2 = defaultRequestBuilder.a;
        ay2.b(headersBuilder2, headersBuilder);
        HeadersImpl headersImplBuild = headersBuilder2.build();
        defaultRequest.a.invoke(defaultRequestBuilder);
        for (Map.Entry entry : headersImplBuild.entries()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            List all = headersBuilder2.getAll(str);
            if (all == null) {
                headersBuilder2.appendAll(str, list);
            } else if (!all.equals(list)) {
                List list2 = le0.a;
                if (!str.equals("Cookie")) {
                    headersBuilder2.b.remove(str);
                    headersBuilder2.appendAll(str, list);
                    headersBuilder2.appendMissing(str, all);
                }
            }
        }
        Url urlB = defaultRequestBuilder.b.b();
        URLProtocol uRLProtocol = urlB.k;
        DefaultRequest.b.getClass();
        if (uRLBuilder.d == null) {
            uRLBuilder.d = uRLProtocol;
        }
        if (uRLBuilder.a.length() <= 0) {
            URLBuilder uRLBuilder2 = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
            uRLBuilder2.d = uRLProtocol;
            uRLBuilder2.a = urlB.a;
            int i = urlB.b;
            Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
            uRLBuilder2.e(numValueOf != null ? numValueOf.intValue() : urlB.l.b);
            io.ktor.http.e.d(uRLBuilder2, (String) urlB.m.getValue());
            uRLBuilder2.e = (String) urlB.p.getValue();
            uRLBuilder2.f = (String) urlB.q.getValue();
            ParametersBuilderImpl parametersBuilderImplA = sb2.a();
            parametersBuilderImplA.appendAll(l02.E((String) urlB.n.getValue()));
            uRLBuilder2.i = parametersBuilderImplA;
            uRLBuilder2.j = new UrlDecodedParametersBuilder(parametersBuilderImplA);
            String str2 = (String) urlB.r.getValue();
            str2.getClass();
            uRLBuilder2.g = str2;
            uRLBuilder2.b = urlB.f;
            uRLBuilder2.d = uRLBuilder.d;
            int i2 = uRLBuilder.c;
            if (i2 != 0) {
                uRLBuilder2.e(i2);
            }
            List listBuild = uRLBuilder2.h;
            List list3 = uRLBuilder.h;
            if (!list3.isEmpty()) {
                if (listBuild.isEmpty() || ((CharSequence) kotlin.collections.c.r(list3)).length() == 0) {
                    listBuild = list3;
                } else {
                    ListBuilder listBuilder = new ListBuilder((list3.size() + listBuild.size()) - 1);
                    int size = listBuild.size() - 1;
                    for (int i3 = 0; i3 < size; i3++) {
                        listBuilder.add(listBuild.get(i3));
                    }
                    listBuilder.addAll(list3);
                    listBuild = listBuilder.build();
                }
            }
            uRLBuilder2.d(listBuild);
            if (uRLBuilder.g.length() > 0) {
                String str3 = uRLBuilder.g;
                str3.getClass();
                uRLBuilder2.g = str3;
            }
            ParametersBuilderImpl parametersBuilderImplA2 = sb2.a();
            ay2.b(parametersBuilderImplA2, uRLBuilder2.i);
            ParametersBuilder parametersBuilder = uRLBuilder.i;
            parametersBuilder.getClass();
            uRLBuilder2.i = parametersBuilder;
            uRLBuilder2.j = new UrlDecodedParametersBuilder(parametersBuilder);
            for (Map.Entry entry2 : parametersBuilderImplA2.entries()) {
                String str4 = (String) entry2.getKey();
                List list4 = (List) entry2.getValue();
                if (!uRLBuilder2.i.contains(str4)) {
                    uRLBuilder2.i.appendAll(str4, list4);
                }
            }
            kf2.w(uRLBuilder, uRLBuilder2);
        }
        Attributes attributes2 = defaultRequestBuilder.c;
        for (AttributeKey<?> attributeKey : attributes2.getAllKeys()) {
            if (!attributes.contains(attributeKey)) {
                attributeKey.getClass();
                attributes.put(attributeKey, attributes2.get(attributeKey));
            }
        }
        headersBuilder.clear();
        headersBuilder.appendAll(headersBuilder2.build());
        d.a.trace("Applied DefaultRequest to " + string + ". New url: " + uRLBuilder);
        return mk1.a;
    }
}
