package io.ktor.client.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.http.ContentType;
import io.ktor.http.a;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import java.io.File;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/content/LocalFileContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Ljava/io/File;", "file", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/io/File;Lio/ktor/http/ContentType;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalFileContent extends OutgoingContent.ReadChannelContent {
    public final File a;
    public final ContentType b;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalFileContent(File file, ContentType contentType, int i, xu xuVar) {
        if ((i & 2) != 0) {
            ContentType.Companion companion = ContentType.f;
            companion.getClass();
            file.getClass();
            String name = file.getName();
            name.getClass();
            contentType = a.d(a.b(companion, g.U('.', name, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)));
        }
        this(file, contentType);
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long getC() {
        return Long.valueOf(this.a.length());
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getB() {
        return this.b;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public final ByteReadChannel d() {
        return io.ktor.util.cio.a.a(this.a);
    }

    public LocalFileContent(File file, ContentType contentType) {
        file.getClass();
        contentType.getClass();
        this.a = file;
        this.b = contentType;
    }
}
