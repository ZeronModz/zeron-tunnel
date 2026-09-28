package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.w91;
import defpackage.xm;
import defpackage.xu;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001BP\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/content/WriterContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lkotlin/Function2;", "Ljava/io/Writer;", "Lkotlin/coroutines/Continuation;", "Lmk1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/ExtensionFunctionType;", "body", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "status", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "contentLength", "<init>", "(Lkotlin/jvm/functions/Function2;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;Ljava/lang/Long;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WriterContent extends OutgoingContent.WriteChannelContent {
    public final Function2 a;
    public final ContentType b;
    public final Long c;

    public WriterContent(Function2<? super Writer, ? super Continuation<? super mk1>, ? extends Object> function2, ContentType contentType, HttpStatusCode httpStatusCode, Long l) {
        function2.getClass();
        contentType.getClass();
        this.a = function2;
        this.b = contentType;
        this.c = l;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getB() {
        return this.b;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public final Object d(ByteWriteChannel byteWriteChannel, Continuation continuation) {
        Charset charsetH = w91.h(this.b);
        if (charsetH == null) {
            charsetH = xm.a;
        }
        Object objA = a.a(new WriterContent$writeTo$2(byteWriteChannel, charsetH, this, null), (SuspendLambda) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : mk1.a;
    }

    public /* synthetic */ WriterContent(Function2 function2, ContentType contentType, HttpStatusCode httpStatusCode, Long l, int i, xu xuVar) {
        this(function2, contentType, (i & 4) != 0 ? null : httpStatusCode, (i & 8) != 0 ? null : l);
    }
}
