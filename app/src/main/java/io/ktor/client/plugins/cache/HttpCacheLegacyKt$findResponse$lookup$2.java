package io.ktor.client.plugins.cache;

import io.ktor.http.HeadersBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCacheLegacyKt$findResponse$lookup$2 extends FunctionReferenceImpl implements Function1<String, List<? extends String>> {
    public HttpCacheLegacyKt$findResponse$lookup$2(Object obj) {
        super(1, obj, HeadersBuilder.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<String> invoke(String str) {
        str.getClass();
        return ((HeadersBuilder) this.receiver).getAll(str);
    }
}
