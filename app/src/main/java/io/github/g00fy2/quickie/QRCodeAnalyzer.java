package io.github.g00fy2.quickie;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import defpackage.mk1;
import defpackage.xm;
import defpackage.xu;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/github/g00fy2/quickie/QRCodeAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "barcodeFormats", "Lkotlin/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "onSuccess", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "onFailure", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "onPassCompleted", "<init>", "([ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QRCodeAnalyzer implements ImageAnalysis$Analyzer {
    public static final MultiFormatReader h;
    public final int[] a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public volatile boolean e;
    public long f;
    public final AtomicBoolean g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/github/g00fy2/quickie/QRCodeAnalyzer$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/google/zxing/MultiFormatReader;", "reader", "Lcom/google/zxing/MultiFormatReader;", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
        h = new MultiFormatReader();
    }

    public QRCodeAnalyzer(int[] iArr, Function1<? super String, mk1> function1, Function1<? super Throwable, mk1> function12, Function1<? super Boolean, mk1> function13) {
        iArr.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        this.a = iArr;
        this.b = function1;
        this.c = function12;
        this.d = function13;
        this.g = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public final void analyze(ImageProxy imageProxy) {
        Object objM36constructorimpl;
        imageProxy.getClass();
        if (imageProxy.getImage() == null) {
            return;
        }
        if (this.e && System.currentTimeMillis() - this.f < 1000) {
            imageProxy.close();
            return;
        }
        this.g.set(true);
        MultiFormatReader multiFormatReader = h;
        Pair pair = new Pair(DecodeHintType.CHARACTER_SET, xm.a);
        Pair pair2 = new Pair(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        DecodeHintType decodeHintType = DecodeHintType.POSSIBLE_FORMATS;
        List listV = b.v(this.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            BarcodeFormat value = io.github.g00fy2.quickie.config.BarcodeFormat.getEntries().get(((Number) it.next()).intValue()).getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        multiFormatReader.b(d.e(pair, pair2, new Pair(decodeHintType, arrayList)));
        if ((imageProxy.getFormat() == 35 || imageProxy.getFormat() == 39 || imageProxy.getFormat() == 40) && imageProxy.getPlanes().length == 3) {
            ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
            ByteBuffer buffer = planeProxy.getBuffer();
            buffer.getClass();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            buffer.rewind();
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int rowStride = planeProxy.getRowStride();
            int pixelStride = planeProxy.getPixelStride();
            byte[] bArr2 = new byte[width * height];
            for (int i = 0; i < height; i++) {
                for (int i2 = 0; i2 < width; i2++) {
                    bArr2[(i * width) + i2] = bArr[(i2 * pixelStride) + (i * rowStride)];
                }
            }
            RotatedImage rotatedImage = new RotatedImage(bArr2, imageProxy.getWidth(), imageProxy.getHeight());
            int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
            if (rotationDegrees != 0 && rotationDegrees % 90 == 0) {
                int i3 = rotatedImage.b;
                int i4 = rotatedImage.c;
                byte[] bArr3 = new byte[rotatedImage.a.length];
                for (int i5 = 0; i5 < i4; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        if (rotationDegrees == 90) {
                            bArr3[(((i6 * i4) + i4) - i5) - 1] = rotatedImage.a[(i5 * i3) + i6];
                        } else if (rotationDegrees == 180) {
                            bArr3[(((((i4 - i5) - 1) * i3) + i3) - i6) - 1] = rotatedImage.a[(i5 * i3) + i6];
                        } else if (rotationDegrees == 270) {
                            bArr3[(i6 * i4) + i5] = rotatedImage.a[(((i5 * i3) + i3) - i6) - 1];
                        }
                    }
                }
                rotatedImage.a = bArr3;
                if (rotationDegrees != 180) {
                    rotatedImage.c = i3;
                    rotatedImage.b = i4;
                }
            }
            try {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    byte[] bArr4 = rotatedImage.a;
                    int i7 = rotatedImage.b;
                    int i8 = rotatedImage.c;
                    BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new PlanarYUVLuminanceSource(bArr4, i7, i8, 0, 0, i7, i8, false)));
                    MultiFormatReader multiFormatReader2 = h;
                    if (multiFormatReader2.b == null) {
                        multiFormatReader2.b(null);
                    }
                    com.google.zxing.Result resultA = multiFormatReader2.a(binaryBitmap);
                    Function1 function1 = this.b;
                    String str = resultA.a;
                    str.getClass();
                    function1.invoke(str);
                    this.d.invoke(Boolean.valueOf(this.e));
                    imageProxy.close();
                    objM36constructorimpl = Result.m36constructorimpl(mk1.a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM36constructorimpl = Result.m36constructorimpl(new Result.Failure(th));
                }
                Throwable thM39exceptionOrNullimpl = Result.m39exceptionOrNullimpl(objM36constructorimpl);
                if (thM39exceptionOrNullimpl != null) {
                    if (!(thM39exceptionOrNullimpl instanceof NotFoundException)) {
                        throw thM39exceptionOrNullimpl;
                    }
                    byte[] bArr5 = rotatedImage.a;
                    int length = bArr5.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        bArr5[i9] = (byte) (~bArr5[i9]);
                    }
                    int i10 = rotatedImage.b;
                    int i11 = rotatedImage.c;
                    BinaryBitmap binaryBitmap2 = new BinaryBitmap(new HybridBinarizer(new PlanarYUVLuminanceSource(bArr5, i10, i11, 0, 0, i10, i11, false)));
                    MultiFormatReader multiFormatReader3 = h;
                    if (multiFormatReader3.b == null) {
                        multiFormatReader3.b(null);
                    }
                    com.google.zxing.Result resultA2 = multiFormatReader3.a(binaryBitmap2);
                    Function1 function12 = this.b;
                    String str2 = resultA2.a;
                    str2.getClass();
                    function12.invoke(str2);
                    this.d.invoke(Boolean.valueOf(this.e));
                    imageProxy.close();
                }
            } catch (Throwable th2) {
                try {
                    if (!(th2 instanceof NotFoundException)) {
                        this.e = true;
                        this.f = System.currentTimeMillis();
                        this.c.invoke(th2);
                    }
                    th2.printStackTrace();
                } finally {
                    h.reset();
                    imageProxy.close();
                }
            }
            this.g.set(false);
        }
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public final Size getDefaultTargetResolution() {
        return null;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public final int getTargetCoordinateSystem() {
        return 0;
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public final void updateTransform(Matrix matrix) {
    }

    public /* synthetic */ QRCodeAnalyzer(int[] iArr, Function1 function1, Function1 function12, Function1 function13, int i, xu xuVar) {
        this((i & 1) != 0 ? new int[]{io.github.g00fy2.quickie.config.BarcodeFormat.QR_CODE.ordinal()} : iArr, function1, function12, function13);
    }
}
