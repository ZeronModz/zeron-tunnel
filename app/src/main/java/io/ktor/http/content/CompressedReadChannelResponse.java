package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.ContentEncoder;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/content/CompressedReadChannelResponse;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "original", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "delegateChannel", "Lio/ktor/util/ContentEncoder;", "encoder", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function0;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CompressedReadChannelResponse extends OutgoingContent.ReadChannelContent {
    public final OutgoingContent a;
    public final Function0 b;
    public final ContentEncoder c;
    public final CoroutineContext d;
    public final Lazy e;

    public CompressedReadChannelResponse(OutgoingContent outgoingContent, Function0<? extends ByteReadChannel> function0, ContentEncoder contentEncoder, CoroutineContext coroutineContext) {
        outgoingContent.getClass();
        function0.getClass();
        contentEncoder.getClass();
        coroutineContext.getClass();
        this.a = outgoingContent;
        this.b = function0;
        this.c = contentEncoder;
        this.d = coroutineContext;
        this.e = c.a(LazyThreadSafetyMode.NONE, new b(this, 0));
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long getG() {
        Long g = this.a.getG();
        if (g != null) {
            Long lPredictCompressedLength = this.c.predictCompressedLength(g.longValue());
            if (lPredictCompressedLength != null && lPredictCompressedLength.longValue() >= 0) {
                return lPredictCompressedLength;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getA() {
        return this.a.getA();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final Headers c() {
        return (Headers) this.e.getValue();
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public final ByteReadChannel d() {
        return this.c.encode((ByteReadChannel) this.b.invoke(), this.d);
    }
}
