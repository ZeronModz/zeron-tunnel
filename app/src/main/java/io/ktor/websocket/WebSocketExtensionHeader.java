package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionHeader;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketExtensionHeader {
    public final String a;
    public final List b;

    public WebSocketExtensionHeader(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append(' ');
        List list = this.b;
        sb.append(list.isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ", ".concat(kotlin.collections.c.w(list, ",", null, null, null, 62)));
        return sb.toString();
    }
}
