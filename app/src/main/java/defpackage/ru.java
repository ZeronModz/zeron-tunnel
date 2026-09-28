package defpackage;

import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ru {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Mode.values().length];
        a = iArr;
        try {
            iArr[Mode.NUMERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Mode.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Mode.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Mode.KANJI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Mode.TERMINATOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[Mode.ECI.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[Mode.HANZI.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
