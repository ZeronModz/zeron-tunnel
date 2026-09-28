package io.ktor.client.request;

import defpackage.ir;
import defpackage.le0;
import defpackage.yg0;
import io.ktor.client.plugins.sse.DefaultClientSSESession;
import io.ktor.client.plugins.sse.SSEClientContent;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/request/SSEClientResponseAdapter;", "Lio/ktor/client/request/ResponseAdapter;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SSEClientResponseAdapter implements ResponseAdapter {
    @Override // io.ktor.client.request.ResponseAdapter
    public final Object adapt(HttpRequestData httpRequestData, HttpStatusCode httpStatusCode, Headers headers, ByteReadChannel byteReadChannel, OutgoingContent outgoingContent, CoroutineContext coroutineContext) throws BadContentTypeFormatException {
        ContentType contentTypeA;
        httpRequestData.getClass();
        httpStatusCode.getClass();
        headers.getClass();
        byteReadChannel.getClass();
        outgoingContent.getClass();
        coroutineContext.getClass();
        List list = le0.a;
        String str = headers.get("Content-Type");
        if (str != null) {
            ContentType.f.getClass();
            contentTypeA = ContentType.Companion.a(str);
        } else {
            contentTypeA = null;
        }
        AttributeKey attributeKey = a.a;
        if (httpRequestData.d instanceof SSEClientContent) {
            HttpStatusCode.c.getClass();
            if (httpStatusCode.equals(HttpStatusCode.e)) {
                if (yg0.a(contentTypeA != null ? contentTypeA.d() : null, ir.c)) {
                    return new DefaultClientSSESession((SSEClientContent) outgoingContent, byteReadChannel, coroutineContext);
                }
            }
        }
        return null;
    }
}
