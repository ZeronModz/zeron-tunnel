package com.blacksquircle.ui.language.base.model;

import com.blacksquircle.ui.language.base.exception.ParseException;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/language/base/model/ParseResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/base/exception/ParseException;", "exception", "<init>", "(Lcom/blacksquircle/ui/language/base/exception/ParseException;)V", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ParseResult {
    public final ParseException a;

    public ParseResult(ParseException parseException) {
        this.a = parseException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParseResult) && yg0.a(this.a, ((ParseResult) obj).a);
    }

    public final int hashCode() {
        ParseException parseException = this.a;
        if (parseException == null) {
            return 0;
        }
        return parseException.hashCode();
    }

    public final String toString() {
        return "ParseResult(exception=" + this.a + ")";
    }
}
