package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/http/LinkHeader;", "Lio/ktor/http/HeaderValueWithParameters;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "uri", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HeaderValueParam;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "rel", "(Ljava/lang/String;Ljava/lang/String;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "(Ljava/lang/String;[Ljava/lang/String;)V", "Lio/ktor/http/ContentType;", "type", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/ContentType;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinkHeader extends HeaderValueWithParameters {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, List<String> list, ContentType contentType) {
        this(str, (List<HeaderValueParam>) kotlin.collections.c.A(new HeaderValueParam("rel", kotlin.collections.c.w(list, " ", null, null, null, 62)), new HeaderValueParam("type", contentType.toString())));
        str.getClass();
        list.getClass();
        contentType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, String str2) {
        this(str, (List<HeaderValueParam>) kotlin.collections.c.z(new HeaderValueParam("rel", str2)));
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, String... strArr) {
        this(str, (List<HeaderValueParam>) kotlin.collections.c.z(new HeaderValueParam("rel", kotlin.collections.b.s(strArr, 62))));
        str.getClass();
        strArr.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHeader(String str, List<HeaderValueParam> list) {
        super("<" + str + '>', list);
        str.getClass();
        list.getClass();
    }
}
