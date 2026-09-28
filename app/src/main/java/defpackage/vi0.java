package defpackage;

import com.blacksquircle.ui.language.json.lexer.JsonToken;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsonToken.LBRACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JsonToken.RBRACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JsonToken.LBRACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[JsonToken.RBRACK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[JsonToken.COMMA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[JsonToken.COLON.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[JsonToken.TRUE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[JsonToken.FALSE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[JsonToken.NULL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[JsonToken.DOUBLE_QUOTED_STRING.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[JsonToken.SINGLE_QUOTED_STRING.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[JsonToken.BLOCK_COMMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[JsonToken.LINE_COMMENT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[JsonToken.IDENTIFIER.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[JsonToken.WHITESPACE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[JsonToken.BAD_CHARACTER.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[JsonToken.EOF.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        a = iArr;
    }
}
