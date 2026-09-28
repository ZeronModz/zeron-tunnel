package com.blacksquircle.ui.language.json.styler;

import com.blacksquircle.ui.language.base.model.SyntaxHighlightResult;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.blacksquircle.ui.language.base.model.TokenType;
import com.blacksquircle.ui.language.base.styler.LanguageStyler;
import com.blacksquircle.ui.language.json.lexer.JsonLexer;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vi0;
import defpackage.xu;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/blacksquircle/ui/language/json/styler/JsonStyler;", "Lcom/blacksquircle/ui/language/base/styler/LanguageStyler;", "Companion", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonStyler implements LanguageStyler {
    public static final Companion a = new Companion(null);
    public static JsonStyler b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/language/json/styler/JsonStyler$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/language/json/styler/JsonStyler;", "jsonStyler", "Lcom/blacksquircle/ui/language/json/styler/JsonStyler;", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    public JsonStyler(xu xuVar) {
    }

    @Override // com.blacksquircle.ui.language.base.styler.LanguageStyler
    public final List execute(TextStructure textStructure) {
        textStructure.getClass();
        String string = textStructure.a.toString();
        ArrayList arrayList = new ArrayList();
        JsonLexer jsonLexer = new JsonLexer(new StringReader(string));
        while (true) {
            try {
                int i = vi0.a[jsonLexer.a().ordinal()];
                if (i == 18) {
                    return arrayList;
                }
                switch (i) {
                    case 1:
                        arrayList.add(new SyntaxHighlightResult(TokenType.NUMBER, (int) jsonLexer.j, jsonLexer.b()));
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        arrayList.add(new SyntaxHighlightResult(TokenType.OPERATOR, (int) jsonLexer.j, jsonLexer.b()));
                        break;
                    case 8:
                    case 9:
                    case 10:
                        arrayList.add(new SyntaxHighlightResult(TokenType.LANG_CONST, (int) jsonLexer.j, jsonLexer.b()));
                        break;
                    case 11:
                    case 12:
                        arrayList.add(new SyntaxHighlightResult(TokenType.STRING, (int) jsonLexer.j, jsonLexer.b()));
                        break;
                    case 13:
                    case 14:
                        arrayList.add(new SyntaxHighlightResult(TokenType.COMMENT, (int) jsonLexer.j, jsonLexer.b()));
                        break;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return arrayList;
            }
        }
    }
}
