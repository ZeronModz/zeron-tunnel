package com.blacksquircle.ui.language.base.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/blacksquircle/ui/language/base/model/SyntaxHighlightResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/base/model/TokenType;", "tokenType", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "start", "end", "<init>", "(Lcom/blacksquircle/ui/language/base/model/TokenType;II)V", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SyntaxHighlightResult {
    public final TokenType a;
    public int b;
    public int c;

    public SyntaxHighlightResult(TokenType tokenType, int i, int i2) {
        tokenType.getClass();
        this.a = tokenType;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyntaxHighlightResult)) {
            return false;
        }
        SyntaxHighlightResult syntaxHighlightResult = (SyntaxHighlightResult) obj;
        return this.a == syntaxHighlightResult.a && this.b == syntaxHighlightResult.b && this.c == syntaxHighlightResult.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder("SyntaxHighlightResult(tokenType=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(i);
        sb.append(", end=");
        return hz.q(i2, ")", sb);
    }
}
