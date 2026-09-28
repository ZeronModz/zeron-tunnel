package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/http/ContentDisposition;", "Lio/ktor/http/HeaderValueWithParameters;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "disposition", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentDisposition extends HeaderValueWithParameters {
    public static final Companion d = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/ContentDisposition$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new ContentDisposition("file", null, 2, null);
        new ContentDisposition("mixed", null, 2, null);
        new ContentDisposition("attachment", null, 2, null);
        new ContentDisposition("inline", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDisposition(String str, List<HeaderValueParam> list) {
        super(str, list);
        str.getClass();
        list.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ContentDisposition)) {
            return false;
        }
        ContentDisposition contentDisposition = (ContentDisposition) obj;
        return yg0.a(this.a, contentDisposition.a) && yg0.a(this.b, contentDisposition.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public ContentDisposition(String str, List list, int i, xu xuVar) {
        this(str, (i & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
