package io.ktor.http.content;

import defpackage.mk1;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.ContentEncoder;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/content/CompressedWriteChannelResponse;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "original", "Lio/ktor/util/ContentEncoder;", "encoder", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent$WriteChannelContent;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CompressedWriteChannelResponse extends OutgoingContent.WriteChannelContent {
    public final OutgoingContent.WriteChannelContent a;
    public final ContentEncoder b;
    public final CoroutineContext c;
    public final Lazy d;

    public CompressedWriteChannelResponse(OutgoingContent.WriteChannelContent writeChannelContent, ContentEncoder contentEncoder, CoroutineContext coroutineContext) {
        writeChannelContent.getClass();
        contentEncoder.getClass();
        coroutineContext.getClass();
        this.a = writeChannelContent;
        this.b = contentEncoder;
        this.c = coroutineContext;
        this.d = c.a(LazyThreadSafetyMode.NONE, new b(this, 1));
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long getC() {
        Long c = this.a.getC();
        if (c != null) {
            Long lPredictCompressedLength = this.b.predictCompressedLength(c.longValue());
            if (lPredictCompressedLength != null && lPredictCompressedLength.longValue() >= 0) {
                return lPredictCompressedLength;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getB() {
        return this.a.getB();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final Headers c() {
        return (Headers) this.d.getValue();
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public final Object d(ByteWriteChannel byteWriteChannel, Continuation continuation) {
        Object objE = kotlinx.coroutines.c.e(this.c, new CompressedWriteChannelResponse$writeTo$2(this, byteWriteChannel, null), continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : mk1.a;
    }
}
