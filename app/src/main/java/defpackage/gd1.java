package defpackage;

import com.blacksquircle.ui.language.base.model.TokenType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gd1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TokenType.values().length];
        try {
            iArr[TokenType.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TokenType.OPERATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TokenType.KEYWORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TokenType.TYPE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TokenType.LANG_CONST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TokenType.PREPROCESSOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TokenType.VARIABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TokenType.METHOD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TokenType.STRING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TokenType.COMMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TokenType.TAG.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TokenType.TAG_NAME.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TokenType.ATTR_NAME.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[TokenType.ATTR_VALUE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[TokenType.ENTITY_REF.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        a = iArr;
    }
}
