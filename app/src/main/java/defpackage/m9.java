package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import dev.zeron.tunnel.R;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.Decoder;
import com.journeyapps.barcodescanner.DecoderThread;
import com.journeyapps.barcodescanner.RawImageData;
import com.journeyapps.barcodescanner.SourceData;
import com.journeyapps.barcodescanner.camera.AutoFocusManager;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m9 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        RawImageData rawImageData;
        PlanarYUVLuminanceSource planarYUVLuminanceSource;
        Result resultDecode = null;
        switch (this.a) {
            case 0:
                int i = message.what;
                AutoFocusManager autoFocusManager = (AutoFocusManager) this.b;
                if (i != 1) {
                    return false;
                }
                autoFocusManager.b();
                return true;
            case 1:
                DecoderThread decoderThread = (DecoderThread) this.b;
                rb0 rb0Var = decoderThread.j;
                CameraInstance cameraInstance = decoderThread.a;
                int i2 = message.what;
                int i3 = 11;
                if (i2 == R.id.zxing_decode) {
                    SourceData sourceData = (SourceData) message.obj;
                    Handler handler = decoderThread.e;
                    System.currentTimeMillis();
                    Rect rect = decoderThread.f;
                    sourceData.d = rect;
                    RawImageData rawImageData2 = sourceData.a;
                    if (rect == null) {
                        z = true;
                        planarYUVLuminanceSource = null;
                    } else {
                        int i4 = sourceData.c;
                        byte[] bArr = rawImageData2.a;
                        int i5 = rawImageData2.c;
                        int i6 = rawImageData2.b;
                        if (i4 == 90) {
                            z = true;
                            byte[] bArr2 = new byte[i6 * i5];
                            int i7 = 0;
                            for (int i8 = 0; i8 < i6; i8++) {
                                for (int i9 = i5 - 1; i9 >= 0; i9--) {
                                    bArr2[i7] = bArr[(i9 * i6) + i8];
                                    i7++;
                                }
                            }
                            rawImageData = new RawImageData(bArr2, i5, i6);
                        } else if (i4 == 180) {
                            int i10 = i6 * i5;
                            byte[] bArr3 = new byte[i10];
                            int i11 = i10 - 1;
                            z = true;
                            for (int i12 = 0; i12 < i10; i12++) {
                                bArr3[i11] = bArr[i12];
                                i11--;
                            }
                            rawImageData = new RawImageData(bArr3, i6, i5);
                        } else if (i4 != 270) {
                            z = true;
                            rawImageData = rawImageData2;
                        } else {
                            int i13 = i6 * i5;
                            byte[] bArr4 = new byte[i13];
                            int i14 = i13 - 1;
                            for (int i15 = 0; i15 < i6; i15++) {
                                for (int i16 = i5 - 1; i16 >= 0; i16--) {
                                    bArr4[i14] = bArr[(i16 * i6) + i15];
                                    i14--;
                                }
                            }
                            rawImageData = new RawImageData(bArr4, i5, i6);
                            z = true;
                        }
                        Rect rect2 = sourceData.d;
                        byte[] bArr5 = rawImageData.a;
                        int iWidth = rect2.width();
                        int iHeight = rect2.height();
                        int i17 = rect2.top;
                        byte[] bArr6 = new byte[iWidth * iHeight];
                        int i18 = rawImageData.b;
                        int i19 = (i17 * i18) + rect2.left;
                        for (int i20 = 0; i20 < iHeight; i20++) {
                            System.arraycopy(bArr5, i19, bArr6, i20 * iWidth, iWidth);
                            i19 += i18;
                        }
                        RawImageData rawImageData3 = new RawImageData(bArr6, iWidth, iHeight);
                        byte[] bArr7 = rawImageData3.a;
                        int i21 = rawImageData3.b;
                        int i22 = rawImageData3.c;
                        planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr7, i21, i22, 0, 0, i21, i22, false);
                    }
                    if (planarYUVLuminanceSource != null) {
                        Decoder decoder = decoderThread.d;
                        BinaryBitmap binaryBitmapA = decoder.a(planarYUVLuminanceSource);
                        Reader reader = decoder.a;
                        decoder.b.clear();
                        try {
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            reader.reset();
                            throw th;
                        }
                        if (reader instanceof MultiFormatReader) {
                            MultiFormatReader multiFormatReader = (MultiFormatReader) reader;
                            if (multiFormatReader.b == null) {
                                multiFormatReader.b(null);
                            }
                            resultDecode = multiFormatReader.a(binaryBitmapA);
                            ((MultiFormatReader) reader).reset();
                        } else {
                            resultDecode = reader.decode(binaryBitmapA);
                            reader.reset();
                        }
                    }
                    if (resultDecode != null) {
                        System.currentTimeMillis();
                        if (handler != null) {
                            Message messageObtain = Message.obtain(handler, R.id.zxing_decode_succeeded, new BarcodeResult(resultDecode, sourceData));
                            messageObtain.setData(new Bundle());
                            messageObtain.sendToTarget();
                        }
                    } else if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                    if (handler != null) {
                        Decoder decoder2 = decoderThread.d;
                        decoder2.getClass();
                        ArrayList<ResultPoint> arrayList = new ArrayList(decoder2.b);
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (ResultPoint resultPoint : arrayList) {
                            float f = resultPoint.a * 1.0f;
                            Rect rect3 = sourceData.d;
                            float f2 = f + rect3.left;
                            float f3 = (resultPoint.b * 1.0f) + rect3.top;
                            if (sourceData.e) {
                                f2 = rawImageData2.b - f2;
                            }
                            arrayList2.add(new ResultPoint(f2, f3));
                        }
                        Message.obtain(handler, R.id.zxing_possible_result_points, arrayList2).sendToTarget();
                    }
                    cameraInstance.h.post(new r4(i3, cameraInstance, rb0Var));
                } else {
                    z = true;
                    if (i2 == R.id.zxing_preview_failed) {
                        cameraInstance.h.post(new r4(i3, cameraInstance, rb0Var));
                    }
                }
                return z;
            default:
                if (message.what == 0) {
                    pg0 pg0Var = (pg0) this.b;
                    if (message.obj == null) {
                        synchronized (pg0Var.a) {
                            throw null;
                        }
                    }
                    u7.q();
                }
                return false;
        }
    }
}
