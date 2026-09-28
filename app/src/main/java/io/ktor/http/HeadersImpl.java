package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.util.StringValuesImpl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/HeadersImpl;", "Lio/ktor/http/Headers;", "Lio/ktor/util/StringValuesImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "values", "<init>", "(Ljava/util/Map;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeadersImpl extends StringValuesImpl implements Headers {
    public /* synthetic */ HeadersImpl(Map map, int i, xu xuVar) {
        this((i & 1) != 0 ? kotlin.collections.d.a() : map);
    }

    @Override // io.ktor.util.StringValuesImpl
    public final String toString() {
        return "Headers " + entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadersImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadersImpl(Map<String, ? extends List<String>> map) {
        super(true, map);
        map.getClass();
    }
}
