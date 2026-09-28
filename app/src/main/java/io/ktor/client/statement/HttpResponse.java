package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.http.HttpMessage;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/http/HttpMessage;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HttpResponse implements HttpMessage, CoroutineScope {
    public abstract ByteReadChannel a();

    public abstract GMTDate b();

    public abstract GMTDate c();

    public abstract HttpStatusCode d();

    public abstract HttpProtocolVersion e();

    public abstract HttpClientCall getCall();

    public final String toString() {
        return "HttpResponse[" + getCall().c().getUrl() + ", " + d() + ']';
    }
}
