package io.ktor.http.parsing;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/parsing/AnyOfGrammar;", "Lio/ktor/http/parsing/Grammar;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "<init>", "(Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnyOfGrammar extends Grammar {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyOfGrammar(String str) {
        super(null);
        str.getClass();
        this.a = str;
    }
}
