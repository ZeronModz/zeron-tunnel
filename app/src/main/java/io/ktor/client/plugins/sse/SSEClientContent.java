package io.ktor.client.plugins.sse;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ir;
import defpackage.le0;
import defpackage.pc0;
import defpackage.xu;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HeadersImpl;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.InternalAPI;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/sse/SSEClientContent;", "Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lkotlin/time/a;", "reconnectionTime", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "showCommentEvents", "showRetryEvents", "Lio/ktor/http/content/OutgoingContent;", "requestBody", "<init>", "(JZZLio/ktor/http/content/OutgoingContent;Lxu;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SSEClientContent extends OutgoingContent.ContentWrapper {
    public final long b;
    public final boolean c;
    public final boolean d;
    public final HeadersImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEClientContent(long j, boolean z, boolean z2, OutgoingContent outgoingContent, xu xuVar) {
        super(outgoingContent);
        outgoingContent.getClass();
        this.b = j;
        this.c = z;
        this.d = z2;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(outgoingContent.c());
        List list = le0.a;
        ContentType contentType = ir.c;
        Set set = pc0.a;
        contentType.getClass();
        headersBuilder.append("Accept", contentType.toString());
        headersBuilder.append("Cache-Control", "no-store");
        this.e = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent.ContentWrapper, io.ktor.http.content.OutgoingContent
    public final Headers c() {
        return this.e;
    }

    public final String toString() {
        return "SSEClientContent";
    }
}
