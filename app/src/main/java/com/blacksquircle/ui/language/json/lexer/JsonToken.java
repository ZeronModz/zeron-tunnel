package com.blacksquircle.ui.language.json.lexer;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/blacksquircle/ui/language/json/lexer/JsonToken;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "(Ljava/lang/String;I)V", "NUMBER", "TRUE", "FALSE", "NULL", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", "COLON", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", "LINE_COMMENT", "BLOCK_COMMENT", "IDENTIFIER", "WHITESPACE", "BAD_CHARACTER", "EOF", "language-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonToken {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JsonToken[] $VALUES;
    public static final JsonToken NUMBER = new JsonToken("NUMBER", 0);
    public static final JsonToken TRUE = new JsonToken("TRUE", 1);
    public static final JsonToken FALSE = new JsonToken("FALSE", 2);
    public static final JsonToken NULL = new JsonToken("NULL", 3);
    public static final JsonToken LBRACE = new JsonToken("LBRACE", 4);
    public static final JsonToken RBRACE = new JsonToken("RBRACE", 5);
    public static final JsonToken LBRACK = new JsonToken("LBRACK", 6);
    public static final JsonToken RBRACK = new JsonToken("RBRACK", 7);
    public static final JsonToken COMMA = new JsonToken("COMMA", 8);
    public static final JsonToken COLON = new JsonToken("COLON", 9);
    public static final JsonToken DOUBLE_QUOTED_STRING = new JsonToken("DOUBLE_QUOTED_STRING", 10);
    public static final JsonToken SINGLE_QUOTED_STRING = new JsonToken("SINGLE_QUOTED_STRING", 11);
    public static final JsonToken LINE_COMMENT = new JsonToken("LINE_COMMENT", 12);
    public static final JsonToken BLOCK_COMMENT = new JsonToken("BLOCK_COMMENT", 13);
    public static final JsonToken IDENTIFIER = new JsonToken("IDENTIFIER", 14);
    public static final JsonToken WHITESPACE = new JsonToken("WHITESPACE", 15);
    public static final JsonToken BAD_CHARACTER = new JsonToken("BAD_CHARACTER", 16);
    public static final JsonToken EOF = new JsonToken("EOF", 17);

    private static final /* synthetic */ JsonToken[] $values() {
        return new JsonToken[]{NUMBER, TRUE, FALSE, NULL, LBRACE, RBRACE, LBRACK, RBRACK, COMMA, COLON, DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING, LINE_COMMENT, BLOCK_COMMENT, IDENTIFIER, WHITESPACE, BAD_CHARACTER, EOF};
    }

    static {
        JsonToken[] jsonTokenArr$values = $values();
        $VALUES = jsonTokenArr$values;
        $ENTRIES = a.a(jsonTokenArr$values);
    }

    private JsonToken(String str, int i) {
    }

    public static EnumEntries<JsonToken> getEntries() {
        return $ENTRIES;
    }

    public static JsonToken valueOf(String str) {
        return (JsonToken) Enum.valueOf(JsonToken.class, str);
    }

    public static JsonToken[] values() {
        return (JsonToken[]) $VALUES.clone();
    }
}
