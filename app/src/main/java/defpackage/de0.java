package defpackage;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.cache.storage.CachedResponseData;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class de0 extends HttpResponse {
    public final HttpStatusCode a;
    public final HttpProtocolVersion b;
    public final GMTDate c;
    public final GMTDate d;
    public final Headers e;
    public final CoroutineContext f;

    public de0(CachedResponseData cachedResponseData, CoroutineContext coroutineContext) {
        this.a = cachedResponseData.b;
        this.b = cachedResponseData.e;
        this.c = cachedResponseData.c;
        this.d = cachedResponseData.d;
        this.e = cachedResponseData.g;
        this.f = coroutineContext;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: a */
    public final ByteReadChannel getG() {
        throw new IllegalStateException("This is a fake response");
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: b */
    public final GMTDate getE() {
        return this.c;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: c */
    public final GMTDate getF() {
        return this.d;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: d */
    public final HttpStatusCode getC() {
        return this.a;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: e */
    public final HttpProtocolVersion getD() {
        return this.b;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: getCall */
    public final HttpClientCall getA() {
        throw new IllegalStateException("This is a fake response");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getG() {
        return this.f;
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders */
    public final Headers getH() {
        return this.e;
    }
}
