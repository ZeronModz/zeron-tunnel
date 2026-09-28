package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.if3;
import defpackage.le0;
import defpackage.mk1;
import defpackage.u7;
import defpackage.w91;
import defpackage.yg0;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.TransformResponseBodyContext;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Reflection;
import kotlinx.io.Source;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "response", "Lio/ktor/client/statement/HttpResponse;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "requestedType", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", i = {0}, l = {137}, m = "invokeSuspend", n = {"response"}, s = {"L$0"})
final class HttpPlainTextKt$HttpPlainText$2$2 extends SuspendLambda implements Function5<TransformResponseBodyContext, HttpResponse, ByteReadChannel, TypeInfo, Continuation<? super Object>, Object> {
    final /* synthetic */ Charset $responseCharsetFallback;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$2(Charset charset, Continuation<? super HttpPlainTextKt$HttpPlainText$2$2> continuation) {
        super(5, continuation);
        this.$responseCharsetFallback = charset;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TransformResponseBodyContext transformResponseBodyContext, HttpResponse httpResponse, ByteReadChannel byteReadChannel, TypeInfo typeInfo, Continuation<Object> continuation) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, continuation);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = httpResponse;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = byteReadChannel;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = typeInfo;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpResponse httpResponse;
        ContentType contentTypeA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            HttpResponse httpResponse2 = (HttpResponse) this.L$0;
            ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$1;
            if (!yg0.a(((TypeInfo) this.L$2).a, Reflection.a(String.class))) {
                return null;
            }
            this.L$0 = httpResponse2;
            this.L$1 = null;
            this.label = 1;
            Object objS = io.ktor.utils.io.c.s(byteReadChannel, this);
            if (objS == coroutineSingletons) {
                return coroutineSingletons;
            }
            httpResponse = httpResponse2;
            obj = objS;
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            httpResponse = (HttpResponse) this.L$0;
            kotlin.d.b(obj);
        }
        Source source = (Source) obj;
        Charset charset = this.$responseCharsetFallback;
        HttpClientCall a = httpResponse.getA();
        Logger logger = j.a;
        Headers h = a.d().getD();
        List list = le0.a;
        String str = h.get("Content-Type");
        if (str != null) {
            ContentType.f.getClass();
            contentTypeA = ContentType.Companion.a(str);
        } else {
            contentTypeA = null;
        }
        Charset charsetH = contentTypeA != null ? w91.h(contentTypeA) : null;
        if (charsetH != null) {
            charset = charsetH;
        }
        j.a.trace("Reading response body for " + a.c().getB() + " as String with charset " + charset);
        return if3.H(source, charset, 2);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(TransformResponseBodyContext transformResponseBodyContext, HttpResponse httpResponse, ByteReadChannel byteReadChannel, TypeInfo typeInfo, Continuation<? super Object> continuation) {
        return invoke2(transformResponseBodyContext, httpResponse, byteReadChannel, typeInfo, (Continuation<Object>) continuation);
    }
}
