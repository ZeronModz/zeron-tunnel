package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.xu;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Plugin", "DefaultRequestBuilder", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultRequest {
    public static final Plugin b = new Plugin(null);
    public static final AttributeKey c;
    public final Function1 a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @KtorDsl
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultRequestBuilder implements HttpMessageBuilder {
        public final HeadersBuilder a = new HeadersBuilder(0, 1, null);
        public final URLBuilder b = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        public final Attributes c = io.ktor.util.a.a();

        @Override // io.ktor.http.HttpMessageBuilder
        /* JADX INFO: renamed from: getHeaders, reason: from getter */
        public final HeadersBuilder getA() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/client/plugins/DefaultRequest;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Plugin implements HttpClientPlugin<DefaultRequestBuilder, DefaultRequest> {
        public Plugin(xu xuVar) {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        /* JADX INFO: renamed from: getKey */
        public final AttributeKey<DefaultRequest> getC() {
            return DefaultRequest.c;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(DefaultRequest defaultRequest, HttpClient httpClient) {
            DefaultRequest defaultRequest2 = defaultRequest;
            defaultRequest2.getClass();
            httpClient.getClass();
            HttpRequestPipeline httpRequestPipeline = httpClient.e;
            HttpRequestPipeline.g.getClass();
            httpRequestPipeline.g(HttpRequestPipeline.h, new DefaultRequest$Plugin$install$1(defaultRequest2, null));
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final DefaultRequest prepare(Function1<? super DefaultRequestBuilder, mk1> function1) {
            function1.getClass();
            return new DefaultRequest(function1, null);
        }
    }

    static {
        TypeReference typeReferenceB = null;
        ClassReference classReferenceA = Reflection.a(DefaultRequest.class);
        try {
            typeReferenceB = Reflection.b(DefaultRequest.class);
        } catch (Throwable unused) {
        }
        c = new AttributeKey("DefaultRequest", new TypeInfo(classReferenceA, typeReferenceB));
    }

    public DefaultRequest(Function1 function1, xu xuVar) {
        this.a = function1;
    }
}
