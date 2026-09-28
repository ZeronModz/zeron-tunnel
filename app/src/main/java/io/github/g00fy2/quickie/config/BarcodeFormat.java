package io.github.g00fy2.quickie.config;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/github/g00fy2/quickie/config/BarcodeFormat;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "Lcom/google/zxing/BarcodeFormat;", "<init>", "(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;)V", "getValue", "()Lcom/google/zxing/BarcodeFormat;", "ALL_FORMATS", "CODE_128", "CODE_39", "CODE_93", "CODABAR", "DATA_MATRIX", "EAN_13", "EAN_8", "ITF", "QR_CODE", "UPC_A", "UPC_E", "PDF417", "AZTEC", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BarcodeFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BarcodeFormat[] $VALUES;
    private final com.google.zxing.BarcodeFormat value;
    public static final BarcodeFormat ALL_FORMATS = new BarcodeFormat("ALL_FORMATS", 0, null);
    public static final BarcodeFormat CODE_128 = new BarcodeFormat("CODE_128", 1, com.google.zxing.BarcodeFormat.CODE_128);
    public static final BarcodeFormat CODE_39 = new BarcodeFormat("CODE_39", 2, com.google.zxing.BarcodeFormat.CODE_39);
    public static final BarcodeFormat CODE_93 = new BarcodeFormat("CODE_93", 3, com.google.zxing.BarcodeFormat.CODE_93);
    public static final BarcodeFormat CODABAR = new BarcodeFormat("CODABAR", 4, com.google.zxing.BarcodeFormat.CODABAR);
    public static final BarcodeFormat DATA_MATRIX = new BarcodeFormat("DATA_MATRIX", 5, com.google.zxing.BarcodeFormat.DATA_MATRIX);
    public static final BarcodeFormat EAN_13 = new BarcodeFormat("EAN_13", 6, com.google.zxing.BarcodeFormat.EAN_13);
    public static final BarcodeFormat EAN_8 = new BarcodeFormat("EAN_8", 7, com.google.zxing.BarcodeFormat.EAN_8);
    public static final BarcodeFormat ITF = new BarcodeFormat("ITF", 8, com.google.zxing.BarcodeFormat.ITF);
    public static final BarcodeFormat QR_CODE = new BarcodeFormat("QR_CODE", 9, com.google.zxing.BarcodeFormat.QR_CODE);
    public static final BarcodeFormat UPC_A = new BarcodeFormat("UPC_A", 10, com.google.zxing.BarcodeFormat.UPC_A);
    public static final BarcodeFormat UPC_E = new BarcodeFormat("UPC_E", 11, com.google.zxing.BarcodeFormat.UPC_E);
    public static final BarcodeFormat PDF417 = new BarcodeFormat("PDF417", 12, com.google.zxing.BarcodeFormat.PDF_417);
    public static final BarcodeFormat AZTEC = new BarcodeFormat("AZTEC", 13, com.google.zxing.BarcodeFormat.AZTEC);

    private static final /* synthetic */ BarcodeFormat[] $values() {
        return new BarcodeFormat[]{ALL_FORMATS, CODE_128, CODE_39, CODE_93, CODABAR, DATA_MATRIX, EAN_13, EAN_8, ITF, QR_CODE, UPC_A, UPC_E, PDF417, AZTEC};
    }

    static {
        BarcodeFormat[] barcodeFormatArr$values = $values();
        $VALUES = barcodeFormatArr$values;
        $ENTRIES = a.a(barcodeFormatArr$values);
    }

    private BarcodeFormat(String str, int i, com.google.zxing.BarcodeFormat barcodeFormat) {
        this.value = barcodeFormat;
    }

    public static EnumEntries<BarcodeFormat> getEntries() {
        return $ENTRIES;
    }

    public static BarcodeFormat valueOf(String str) {
        return (BarcodeFormat) Enum.valueOf(BarcodeFormat.class, str);
    }

    public static BarcodeFormat[] values() {
        return (BarcodeFormat[]) $VALUES.clone();
    }

    public final com.google.zxing.BarcodeFormat getValue() {
        return this.value;
    }
}
