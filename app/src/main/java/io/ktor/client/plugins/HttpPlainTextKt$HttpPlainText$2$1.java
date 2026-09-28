package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ir;
import defpackage.le0;
import defpackage.mk1;
import defpackage.u7;
import defpackage.w91;
import defpackage.yg0;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class HttpPlainTextKt$HttpPlainText$2$1 extends SuspendLambda implements Function3<HttpRequestBuilder, Object, Continuation<? super OutgoingContent>, Object> {
    final /* synthetic */ String $acceptCharsetHeader;
    final /* synthetic */ Charset $requestCharset;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$1(String str, Charset charset, Continuation<? super HttpPlainTextKt$HttpPlainText$2$1> continuation) {
        super(3, continuation);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, Object obj, Continuation<? super OutgoingContent> continuation) {
        HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, continuation);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = httpRequestBuilder;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Charset charsetH;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        Object obj2 = this.L$1;
        String str = this.$acceptCharsetHeader;
        Logger logger = j.a;
        HeadersBuilder headersBuilder = httpRequestBuilder.c;
        URLBuilder uRLBuilder = httpRequestBuilder.a;
        List list = le0.a;
        if (headersBuilder.get("Accept-Charset") == null) {
            j.a.trace("Adding Accept-Charset=" + str + " to " + uRLBuilder);
            httpRequestBuilder.c.set("Accept-Charset", str);
        }
        if (!(obj2 instanceof String)) {
            return null;
        }
        ContentType contentTypeC = io.ktor.http.c.c(httpRequestBuilder);
        if (contentTypeC != null) {
            String str2 = contentTypeC.d;
            ContentType contentType = ir.a;
            if (!yg0.a(str2, ir.b.d)) {
                return null;
            }
        }
        Charset charset = this.$requestCharset;
        String str3 = (String) obj2;
        ContentType contentType2 = contentTypeC == null ? ir.b : contentTypeC;
        if (contentTypeC != null && (charsetH = w91.h(contentTypeC)) != null) {
            charset = charsetH;
        }
        j.a.trace("Sending request body to " + uRLBuilder + " as text/plain with charset " + charset);
        return new TextContent(str3, w91.D(contentType2, charset), null, 4, null);
    }
}
