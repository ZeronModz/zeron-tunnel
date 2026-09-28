package com.blacksquircle.ui.language.base.styler;

import com.blacksquircle.ui.language.base.model.SyntaxHighlightResult;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/blacksquircle/ui/language/base/styler/LanguageStyler;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "execute", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/base/model/SyntaxHighlightResult;", "structure", "Lcom/blacksquircle/ui/language/base/model/TextStructure;", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LanguageStyler {
    List<SyntaxHighlightResult> execute(TextStructure structure);
}
