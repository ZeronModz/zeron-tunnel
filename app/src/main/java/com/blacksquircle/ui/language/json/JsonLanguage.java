package com.blacksquircle.ui.language.json;

import com.blacksquircle.ui.language.base.Language;
import com.blacksquircle.ui.language.base.parser.LanguageParser;
import com.blacksquircle.ui.language.base.provider.SuggestionProvider;
import com.blacksquircle.ui.language.base.styler.LanguageStyler;
import com.blacksquircle.ui.language.json.parser.JsonParser;
import com.blacksquircle.ui.language.json.provider.JsonProvider;
import com.blacksquircle.ui.language.json.styler.JsonStyler;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/language/json/JsonLanguage;", "Lcom/blacksquircle/ui/language/base/Language;", "<init>", "()V", "Companion", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonLanguage implements Language {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/language/json/JsonLanguage$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "LANGUAGE_NAME", "Ljava/lang/String;", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    @Override // com.blacksquircle.ui.language.base.Language
    public final String getLanguageName() {
        return "json";
    }

    @Override // com.blacksquircle.ui.language.base.Language
    public final LanguageParser getParser() {
        JsonParser.a.getClass();
        JsonParser jsonParser = JsonParser.b;
        if (jsonParser != null) {
            return jsonParser;
        }
        JsonParser jsonParser2 = new JsonParser(null);
        JsonParser.b = jsonParser2;
        return jsonParser2;
    }

    @Override // com.blacksquircle.ui.language.base.Language
    public final SuggestionProvider getProvider() {
        JsonProvider.b.getClass();
        JsonProvider jsonProvider = JsonProvider.c;
        if (jsonProvider != null) {
            return jsonProvider;
        }
        JsonProvider jsonProvider2 = new JsonProvider(null);
        JsonProvider.c = jsonProvider2;
        return jsonProvider2;
    }

    @Override // com.blacksquircle.ui.language.base.Language
    public final LanguageStyler getStyler() {
        JsonStyler.a.getClass();
        JsonStyler jsonStyler = JsonStyler.b;
        if (jsonStyler != null) {
            return jsonStyler;
        }
        JsonStyler jsonStyler2 = new JsonStyler(null);
        JsonStyler.b = jsonStyler2;
        return jsonStyler2;
    }
}
