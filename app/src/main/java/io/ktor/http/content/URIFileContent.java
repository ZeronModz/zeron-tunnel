package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hv;
import defpackage.lg;
import defpackage.lv;
import defpackage.oy;
import defpackage.xu;
import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.RawSourceChannel;
import io.ktor.utils.io.pool.ByteBufferPool;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/content/URIFileContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Ljava/net/URI;", "uri", "Lio/ktor/http/ContentType;", "contentType", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "contentLength", "<init>", "(Ljava/net/URI;Lio/ktor/http/ContentType;Ljava/lang/Long;)V", "Ljava/net/URL;", "url", "(Ljava/net/URL;Lio/ktor/http/ContentType;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class URIFileContent extends OutgoingContent.ReadChannelContent {
    public final URI a;
    public final ContentType b;
    public final Long c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ URIFileContent(URI uri, ContentType contentType, Long l, int i, xu xuVar) {
        if ((i & 2) != 0) {
            ContentType.Companion companion = ContentType.f;
            String path = uri.getPath();
            path.getClass();
            contentType = io.ktor.http.a.a(companion, path);
        }
        this(uri, contentType, (i & 4) != 0 ? null : l);
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

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public final ByteReadChannel d() throws IOException {
        InputStream inputStreamOpenStream = this.a.toURL().openStream();
        inputStreamOpenStream.getClass();
        ByteBufferPool byteBufferPool = lg.a;
        lv lvVar = oy.a;
        hv hvVar = hv.c;
        hvVar.getClass();
        byteBufferPool.getClass();
        return new RawSourceChannel(kotlinx.io.a.a(inputStreamOpenStream), hvVar);
    }

    public URIFileContent(URI uri, ContentType contentType, Long l) {
        uri.getClass();
        contentType.getClass();
        this.a = uri;
        this.b = contentType;
        this.c = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ URIFileContent(URL url, ContentType contentType, int i, xu xuVar) {
        if ((i & 2) != 0) {
            ContentType.Companion companion = ContentType.f;
            String path = url.getPath();
            path.getClass();
            contentType = io.ktor.http.a.a(companion, path);
        }
        this(url, contentType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public URIFileContent(URL url, ContentType contentType) throws URISyntaxException {
        url.getClass();
        contentType.getClass();
        URI uri = url.toURI();
        uri.getClass();
        this(uri, contentType, null, 4, null);
    }
}
