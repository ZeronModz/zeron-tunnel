package io.ktor.client.statement;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/statement/HttpResponseContainer;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/util/reflect/TypeInfo;", "expectedType", "response", "<init>", "(Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HttpResponseContainer {
    public final TypeInfo a;
    public final Object b;

    public HttpResponseContainer(TypeInfo typeInfo, Object obj) {
        typeInfo.getClass();
        obj.getClass();
        this.a = typeInfo;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponseContainer)) {
            return false;
        }
        HttpResponseContainer httpResponseContainer = (HttpResponseContainer) obj;
        return this.a.equals(httpResponseContainer.a) && this.b.equals(httpResponseContainer.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.b + ')';
    }
}
