package io.ktor.http.parsing;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/parsing/NamedGrammar;", "Lio/ktor/http/parsing/Grammar;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "grammar", "<init>", "(Ljava/lang/String;Lio/ktor/http/parsing/Grammar;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NamedGrammar extends Grammar {
    public final String a;
    public final Grammar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NamedGrammar(String str, Grammar grammar) {
        super(null);
        str.getClass();
        grammar.getClass();
        this.a = str;
        this.b = grammar;
    }
}
