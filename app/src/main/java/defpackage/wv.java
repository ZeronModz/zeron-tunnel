package defpackage;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wv extends OutgoingContent.ReadChannelContent {
    public final Long a;
    public final ContentType b;
    public final /* synthetic */ Object c;

    public wv(HttpRequestBuilder httpRequestBuilder, ContentType contentType, Object obj) {
        this.c = obj;
        HeadersBuilder headersBuilder = httpRequestBuilder.c;
        List list = le0.a;
        String str = headersBuilder.get("Content-Length");
        this.a = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        this.b = contentType == null ? fr.e : contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long getC() {
        return this.a;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getB() {
        return this.b;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public final ByteReadChannel d() {
        return kf2.y((InputStream) this.c);
    }
}
