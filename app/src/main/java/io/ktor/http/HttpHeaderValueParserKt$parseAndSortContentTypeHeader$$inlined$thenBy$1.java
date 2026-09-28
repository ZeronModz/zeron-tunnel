package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import io.ktor.http.ContentType;
import java.util.Comparator;
import kotlin.Metadata;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1<T> implements Comparator {
    public final /* synthetic */ Comparator a;

    public HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) throws BadContentTypeFormatException {
        int iCompare = this.a.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        ContentType.Companion companion = ContentType.f;
        String str = ((HeaderValue) obj).a;
        companion.getClass();
        ContentType contentTypeA = ContentType.Companion.a(str);
        int i = yg0.a(contentTypeA.d, Marker.ANY_MARKER) ? 2 : 0;
        if (yg0.a(contentTypeA.e, Marker.ANY_MARKER)) {
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        ContentType contentTypeA2 = ContentType.Companion.a(((HeaderValue) obj2).a);
        int i2 = yg0.a(contentTypeA2.d, Marker.ANY_MARKER) ? 2 : 0;
        if (yg0.a(contentTypeA2.e, Marker.ANY_MARKER)) {
            i2++;
        }
        return kotlin.comparisons.a.a(numValueOf, Integer.valueOf(i2));
    }
}
