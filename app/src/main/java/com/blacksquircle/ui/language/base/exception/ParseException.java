package com.blacksquircle.ui.language.base.exception;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/blacksquircle/ui/language/base/exception/ParseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "lineNumber", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "columnNumber", "(Ljava/lang/String;II)V", "getColumnNumber", "()I", "getLineNumber", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParseException extends RuntimeException {
    private final int columnNumber;
    private final int lineNumber;

    public ParseException(String str, int i, int i2) {
        super(str);
        this.lineNumber = i;
        this.columnNumber = i2;
    }

    public final int getColumnNumber() {
        return this.columnNumber;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }
}
