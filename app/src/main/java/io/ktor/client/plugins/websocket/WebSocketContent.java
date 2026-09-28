package io.ktor.client.plugins.websocket;

import defpackage.if3;
import defpackage.le0;
import defpackage.mc2;
import defpackage.os;
import defpackage.vd;
import io.ktor.client.request.ClientUpgradeContent;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HeadersImpl;
import io.ktor.util.a;
import java.util.List;
import kotlin.Metadata;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSocketContent;", "Lio/ktor/client/request/ClientUpgradeContent;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketContent extends ClientUpgradeContent {
    public final HeadersImpl b;

    public WebSocketContent() {
        StringBuilder sb = new StringBuilder();
        char[] cArr = os.a;
        Buffer buffer = new Buffer();
        while (((int) buffer.c) < 16) {
            if3.P(buffer, a.d());
        }
        sb.append(vd.a(mc2.C(buffer, 16)));
        String string = sb.toString();
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        List list = le0.a;
        headersBuilder.append("Upgrade", "websocket");
        headersBuilder.append("Connection", "Upgrade");
        headersBuilder.append("Sec-WebSocket-Key", string);
        headersBuilder.append("Sec-WebSocket-Version", "13");
        this.b = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final Headers c() {
        return this.b;
    }

    public final String toString() {
        return "WebSocketContent";
    }
}
