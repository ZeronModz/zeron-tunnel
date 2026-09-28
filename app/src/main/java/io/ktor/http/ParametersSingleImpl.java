package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.util.StringValuesSingleImpl;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/ParametersSingleImpl;", "Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValuesSingleImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParametersSingleImpl extends StringValuesSingleImpl implements Parameters {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParametersSingleImpl(String str, List<String> list) {
        super(true, str, list);
        str.getClass();
        list.getClass();
    }

    @Override // io.ktor.util.StringValuesSingleImpl
    public final String toString() {
        return "Parameters " + entries();
    }
}
