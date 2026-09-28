package io.ktor.client.call;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ii2;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/call/SavedHttpResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/SavedHttpCall;", "call", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "body", "origin", "<init>", "(Lio/ktor/client/call/SavedHttpCall;[BLio/ktor/client/statement/HttpResponse;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedHttpResponse extends HttpResponse {
    public final SavedHttpCall a;
    public final byte[] b;
    public final HttpStatusCode c;
    public final HttpProtocolVersion d;
    public final GMTDate e;
    public final GMTDate f;
    public final Headers g;
    public final CoroutineContext h;

    public SavedHttpResponse(SavedHttpCall savedHttpCall, byte[] bArr, HttpResponse httpResponse) {
        savedHttpCall.getClass();
        bArr.getClass();
        httpResponse.getClass();
        this.a = savedHttpCall;
        this.b = bArr;
        this.c = httpResponse.getC();
        this.d = httpResponse.getD();
        this.e = httpResponse.getE();
        this.f = httpResponse.getF();
        this.g = httpResponse.getD();
        this.h = httpResponse.getE();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: a */
    public final ByteReadChannel getG() {
        return ii2.a(this.b);
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: b, reason: from getter */
    public final GMTDate getE() {
        return this.e;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: c, reason: from getter */
    public final GMTDate getF() {
        return this.f;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: d, reason: from getter */
    public final HttpStatusCode getC() {
        return this.c;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: e, reason: from getter */
    public final HttpProtocolVersion getD() {
        return this.d;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: getCall */
    public final HttpClientCall getA() {
        return this.a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getE() {
        return this.h;
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders, reason: from getter */
    public final Headers getD() {
        return this.g;
    }
}
