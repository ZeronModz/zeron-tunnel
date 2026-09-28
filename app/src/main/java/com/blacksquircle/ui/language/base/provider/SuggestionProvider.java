package com.blacksquircle.ui.language.base.provider;

import com.blacksquircle.ui.language.base.model.Suggestion;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/blacksquircle/ui/language/base/provider/SuggestionProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/base/model/Suggestion;", "getAll", "()Ljava/util/Set;", "Lcom/blacksquircle/ui/language/base/model/TextStructure;", "structure", "Lmk1;", "processAllLines", "(Lcom/blacksquircle/ui/language/base/model/TextStructure;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "lineNumber", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "processLine", "(ILjava/lang/CharSequence;)V", "deleteLine", "(I)V", "clearLines", "()V", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SuggestionProvider {
    void clearLines();

    void deleteLine(int lineNumber);

    Set<Suggestion> getAll();

    void processAllLines(TextStructure structure);

    void processLine(int lineNumber, CharSequence text);
}
