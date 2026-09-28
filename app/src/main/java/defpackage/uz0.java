package defpackage;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.InvertedLuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.c;
import kotlin.collections.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uz0 {
    public static final /* synthetic */ int a = 0;

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
        ArrayList arrayListJ = c.j(BarcodeFormat.AZTEC, BarcodeFormat.CODABAR, BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.DATA_MATRIX, BarcodeFormat.EAN_8, BarcodeFormat.EAN_13, BarcodeFormat.ITF, BarcodeFormat.MAXICODE, BarcodeFormat.PDF_417, barcodeFormat, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED, BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.UPC_EAN_EXTENSION);
        enumMap.put(DecodeHintType.TRY_HARDER, barcodeFormat);
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, arrayListJ);
        enumMap.put(DecodeHintType.CHARACTER_SET, xm.a);
    }

    public static Bitmap a(String str) {
        Object objD;
        str.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, 800, 800, d.d(new Pair(EncodeHintType.CHARACTER_SET, xm.a)));
            int[] iArr = new int[640000];
            for (int i = 0; i < 640000; i++) {
                iArr[i] = bitMatrixEncode.b(i % 800, i / 800) ? -16777216 : -1;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, 800, 0, 0, 800, 800);
            objD = Result.m36constructorimpl(bitmapCreateBitmap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        if (Result.m42isFailureimpl(objD)) {
            objD = null;
        }
        return (Bitmap) objD;
    }

    public static String b(Bitmap bitmap) {
        Object objD;
        String str;
        if (bitmap == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            RGBLuminanceSource rGBLuminanceSource = new RGBLuminanceSource(bitmap.getWidth(), bitmap.getHeight(), iArr);
            QRCodeReader qRCodeReader = new QRCodeReader();
            try {
                str = qRCodeReader.decode(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)), d.d(new Pair(DecodeHintType.TRY_HARDER, Boolean.TRUE))).a;
            } catch (NotFoundException unused) {
                str = qRCodeReader.decode(new BinaryBitmap(new GlobalHistogramBinarizer(new InvertedLuminanceSource(rGBLuminanceSource))), d.d(new Pair(DecodeHintType.TRY_HARDER, Boolean.TRUE))).a;
            }
            objD = Result.m36constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        return (String) (Result.m42isFailureimpl(objD) ? null : objD);
    }
}
