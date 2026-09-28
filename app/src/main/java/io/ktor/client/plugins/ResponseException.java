package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/client/statement/HttpResponse;", "response", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cachedResponseText", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ResponseException extends IllegalStateException {
    private final transient HttpResponse response;

    public ResponseException(HttpResponse httpResponse, String str) {
        httpResponse.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder("Bad response: ");
        sb.append(httpResponse);
        sb.append(". Text: \"");
        super(vh.q(sb, str, '\"'));
        this.response = httpResponse;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }
}
