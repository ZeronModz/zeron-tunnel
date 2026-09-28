package io.ktor.client.call;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ii2;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.HttpMethod;
import io.ktor.http.c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/call/SavedHttpCall;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/HttpClient;", "client", "Lio/ktor/client/request/HttpRequest;", "request", "Lio/ktor/client/statement/HttpResponse;", "response", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "responseBody", "<init>", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;[B)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedHttpCall extends HttpClientCall {
    public final byte[] g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedHttpCall(HttpClient httpClient, HttpRequest httpRequest, HttpResponse httpResponse, byte[] bArr) {
        super(httpClient);
        httpClient.getClass();
        httpRequest.getClass();
        httpResponse.getClass();
        bArr.getClass();
        this.g = bArr;
        this.b = new SavedHttpRequest(this, httpRequest);
        this.c = new SavedHttpResponse(this, bArr, httpResponse);
        Long lB = c.b(httpResponse);
        long length = bArr.length;
        HttpMethod b = httpRequest.getA();
        b.getClass();
        if (lB != null && lB.longValue() >= 0) {
            HttpMethod.b.getClass();
            if (!b.equals(HttpMethod.e) && lB.longValue() != length) {
                throw new IllegalStateException("Content-Length mismatch: expected " + lB + " bytes, but received " + length + " bytes");
            }
        }
        this.h = true;
    }

    @Override // io.ktor.client.call.HttpClientCall
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getH() {
        return this.h;
    }

    @Override // io.ktor.client.call.HttpClientCall
    public final Object e() {
        return ii2.a(this.g);
    }
}
