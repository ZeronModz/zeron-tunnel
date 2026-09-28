package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Process;
import android.os.StrictMode;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.CameraExecutor;
import androidx.camera.core.CameraX;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.impl.h;
import androidx.camera.core.impl.p;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.b;
import androidx.core.util.Consumer;
import androidx.lifecycle.DispatchQueue;
import androidx.work.impl.constraints.ConstraintListener;
import dev.zeron.tunnel.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.crashlytics.internal.common.e;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.CaptureManager;
import com.journeyapps.barcodescanner.RawImageData;
import com.journeyapps.barcodescanner.SourceData;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraManager;
import com.trilead.ssh2.sftp.ErrorCodes;
import com.v2ray.ang.ui.CrashActivity;
import com.v2ray.ang.util.CrashHandler;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        CameraX cameraX = (CameraX) this.b;
        b bVar = (b) this.c;
        Object obj = CameraX.o;
        if (cameraX.f != null) {
            Executor executor = cameraX.d;
            if (executor instanceof CameraExecutor) {
                CameraExecutor cameraExecutor = (CameraExecutor) executor;
                synchronized (cameraExecutor.a) {
                    try {
                        if (!cameraExecutor.b.isShutdown()) {
                            cameraExecutor.b.shutdown();
                        }
                    } finally {
                    }
                }
            }
            cameraX.f.quit();
        }
        bVar.b(null);
    }

    private final void b() {
        Deferred.DeferredHandler deferredHandler;
        hv0 hv0Var = (hv0) this.b;
        Provider provider = (Provider) this.c;
        if (hv0Var.b != hv0.d) {
            u7.p("provide() can be called only once.");
            return;
        }
        synchronized (hv0Var) {
            deferredHandler = hv0Var.a;
            hv0Var.a = null;
            hv0Var.b = provider;
        }
        deferredHandler.handle(provider);
    }

    private final void c() {
        tj0 tj0Var = (tj0) this.b;
        Provider provider = (Provider) this.c;
        synchronized (tj0Var) {
            try {
                if (tj0Var.b == null) {
                    tj0Var.a.add(provider);
                } else {
                    tj0Var.b.add(provider.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath = null;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        switch (this.a) {
            case 0:
                ((ImageReaderProxy.OnImageAvailableListener) this.c).onImageAvailable((s4) this.b);
                return;
            case 1:
                f6 f6Var = (f6) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    f6Var.a();
                }
            case 2:
                androidx.camera.camera2.internal.b bVar = (androidx.camera.camera2.internal.b) this.b;
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) this.c;
                yh yhVar = bVar.y;
                ((HashSet) yhVar.b).remove(cameraCaptureCallback);
                ((ArrayMap) yhVar.c).remove(cameraCaptureCallback);
                return;
            case 3:
                androidx.camera.camera2.internal.b bVar2 = (androidx.camera.camera2.internal.b) this.b;
                b bVar3 = (b) this.c;
                final long jK = bVar2.k();
                final b bVar4 = new b();
                bVar4.c = new n31();
                oh ohVar = new oh(bVar4);
                bVar4.b = ohVar;
                bVar4.a = vh.class;
                try {
                    bVar2.a(new Camera2CameraControlImpl$CaptureResultListener() { // from class: wh
                        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                            if (!androidx.camera.camera2.internal.b.h(totalCaptureResult, jK)) {
                                return false;
                            }
                            bVar4.b(null);
                            return true;
                        }
                    });
                    bVar4.a = "waitForSessionUpdateId:" + jK;
                    break;
                } catch (Exception e) {
                    ohVar.a(e);
                }
                xg0.r(ohVar, bVar3);
                return;
            case 4:
                zh zhVar = (zh) this.b;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.c;
                HashSet hashSet = new HashSet();
                HashSet<Camera2CameraControlImpl$CaptureResultListener> hashSet2 = (HashSet) zhVar.b;
                for (Camera2CameraControlImpl$CaptureResultListener camera2CameraControlImpl$CaptureResultListener : hashSet2) {
                    if (camera2CameraControlImpl$CaptureResultListener.onCaptureResult(totalCaptureResult)) {
                        hashSet.add(camera2CameraControlImpl$CaptureResultListener);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 5:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
            case 6:
                o oVar = (o) this.b;
                b bVar5 = (b) this.c;
                fq0 fq0Var = oVar.A;
                if (fq0Var == null) {
                    bVar5.b(Boolean.FALSE);
                    return;
                } else {
                    bVar5.b(Boolean.valueOf(oVar.a.d(o.i(fq0Var))));
                    return;
                }
            case 7:
                o oVar2 = (o) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                androidx.camera.camera2.internal.b bVar6 = oVar2.h;
                try {
                    oVar2.u(arrayList);
                    return;
                } finally {
                    bVar6.b();
                }
            case 8:
                o oVar3 = (o) this.b;
                String str = (String) this.c;
                oVar3.f("Use case " + str + " INACTIVE");
                LinkedHashMap linkedHashMap = oVar3.a.a;
                if (linkedHashMap.containsKey(str)) {
                    p pVar = (p) linkedHashMap.get(str);
                    pVar.f = false;
                    if (!pVar.e) {
                        linkedHashMap.remove(str);
                    }
                }
                oVar3.x();
                return;
            case 9:
                ((SessionConfig$ErrorListener) this.b).onError((v61) this.c, SessionConfig$SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 10:
                ((androidx.camera.camera2.internal.b) this.b).i((t) this.c);
                return;
            case 11:
                final CameraInstance cameraInstance = (CameraInstance) this.b;
                final rb0 rb0Var = (rb0) this.c;
                if (cameraInstance.f) {
                    cameraInstance.a.c(new Runnable() { // from class: com.journeyapps.barcodescanner.camera.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraManager cameraManager = cameraInstance.c;
                            Camera camera = cameraManager.a;
                            if (camera == null || !cameraManager.e) {
                                return;
                            }
                            CameraManager.CameraPreviewCallback cameraPreviewCallback = cameraManager.m;
                            cameraPreviewCallback.a = rb0Var;
                            camera.setOneShotPreviewCallback(cameraPreviewCallback);
                        }
                    });
                    return;
                }
                return;
            case 12:
                CameraRepository cameraRepository = (CameraRepository) this.b;
                CameraInternal cameraInternal = (CameraInternal) this.c;
                synchronized (cameraRepository.a) {
                    try {
                        cameraRepository.c.remove(cameraInternal);
                        if (cameraRepository.c.isEmpty()) {
                            cameraRepository.e.getClass();
                            cameraRepository.e.b(null);
                            cameraRepository.e = null;
                            cameraRepository.d = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                jx2 jx2Var = (jx2) this.b;
                BarcodeResult barcodeResult = (BarcodeResult) this.c;
                CaptureManager captureManager = (CaptureManager) jx2Var.b;
                Activity activity = captureManager.a;
                if (captureManager.d) {
                    SourceData sourceData = barcodeResult.b;
                    RawImageData rawImageData = sourceData.a;
                    int i4 = sourceData.c;
                    Rect rect = new Rect(0, 0, rawImageData.b, rawImageData.c);
                    YuvImage yuvImage = new YuvImage(rawImageData.a, sourceData.b, rawImageData.b, rawImageData.c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (i4 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i4);
                        bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", activity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        absolutePath = fileCreateTempFile.getAbsolutePath();
                    } catch (IOException e2) {
                        e2.toString();
                    }
                    break;
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", barcodeResult.a.a);
                Result result = barcodeResult.a;
                intent.putExtra("SCAN_RESULT_FORMAT", result.e.toString());
                byte[] bArr = result.b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                Map map = result.f;
                if (map != null) {
                    ResultMetadataType resultMetadataType = ResultMetadataType.UPC_EAN_EXTENSION;
                    if (map.containsKey(resultMetadataType)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(resultMetadataType).toString());
                    }
                    Number number = (Number) map.get(ResultMetadataType.ORIENTATION);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str2 = (String) map.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
                    if (str2 != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
                    }
                    Iterable iterable = (Iterable) map.get(ResultMetadataType.BYTE_SEGMENTS);
                    if (iterable != null) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i2, (byte[]) it.next());
                            i2++;
                        }
                    }
                }
                if (absolutePath != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", absolutePath);
                }
                activity.setResult(-1, intent);
                captureManager.a();
                return;
            case 15:
                b();
                return;
            case 16:
                c();
                return;
            case 17:
                h hVar = (h) this.b;
                Observable.Observer observer = (Observable.Observer) this.c;
                try {
                    observer.onNewData(hVar.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e3) {
                    observer.onError(e3);
                    return;
                }
            case 18:
                List list = (List) this.b;
                xq xqVar = (xq) this.c;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((ConstraintListener) it2.next()).onConstraintChanged(xqVar.e);
                }
                return;
            case 19:
                CrashHandler crashHandler = (CrashHandler) this.b;
                String str3 = (String) this.c;
                Context context = crashHandler.a;
                Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) CrashActivity.class);
                intent2.putExtra("error", str3);
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                return;
            case 20:
                ((e) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 21:
                qt qtVar = (qt) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(qtVar.c);
                StrictMode.ThreadPolicy threadPolicy = qtVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 22:
                gu guVar = (gu) this.b;
                String str4 = (String) this.c;
                TextInputLayout textInputLayout = guVar.a;
                DateFormat dateFormat = guVar.c;
                Context context2 = textInputLayout.getContext();
                textInputLayout.setError(context2.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context2.getString(R.string.mtrl_picker_invalid_format_use), str4.replace(' ', (char) 160)) + "\n" + String.format(context2.getString(R.string.mtrl_picker_invalid_format_example), dateFormat.format(new Date(ol1.h().getTimeInMillis())).replace(' ', (char) 160)));
                guVar.a();
                return;
            case 23:
                tv tvVar = (tv) this.b;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.c;
                Surface surface2 = surfaceOutput.getSurface(tvVar.c, new tk(i3, tvVar, surfaceOutput));
                tvVar.a.g(surface2);
                tvVar.h.put(surfaceOutput, surface2);
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                final tv tvVar2 = (tv) this.b;
                final SurfaceRequest surfaceRequest = (SurfaceRequest) this.c;
                tvVar2.i++;
                OpenGlRenderer openGlRenderer = tvVar2.a;
                hb0.d(openGlRenderer.a, true);
                hb0.c(openGlRenderer.c);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(openGlRenderer.m);
                surfaceTexture2.setDefaultBufferSize(surfaceRequest.b.getWidth(), surfaceRequest.b.getHeight());
                final Surface surface3 = new Surface(surfaceTexture2);
                jc0 jc0Var = tvVar2.c;
                surfaceRequest.c(jc0Var, new di(4, tvVar2, surfaceRequest));
                surfaceRequest.b(surface3, jc0Var, new Consumer() { // from class: sv
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        tv tvVar3 = tvVar2;
                        SurfaceRequest surfaceRequest2 = surfaceRequest;
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        Surface surface4 = surface3;
                        synchronized (surfaceRequest2.a) {
                            surfaceRequest2.n = null;
                            surfaceRequest2.o = null;
                        }
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface4.release();
                        tvVar3.i--;
                        tvVar3.a();
                    }
                });
                surfaceTexture2.setOnFrameAvailableListener(tvVar2, tvVar2.d);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((tv) this.b).k.add((ab) this.c);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                DispatchQueue dispatchQueue = (DispatchQueue) this.b;
                if (dispatchQueue.d.offer((Runnable) this.c)) {
                    dispatchQueue.a();
                    return;
                } else {
                    u7.p("cannot enqueue any more runnables");
                    return;
                }
            case 27:
                final d00 d00Var = (d00) this.b;
                SurfaceRequest surfaceRequest2 = (SurfaceRequest) this.c;
                d00Var.e++;
                DualOpenGlRenderer dualOpenGlRenderer = d00Var.a;
                boolean z = surfaceRequest2.f;
                Size size = surfaceRequest2.b;
                hb0.d(dualOpenGlRenderer.a, true);
                hb0.c(dualOpenGlRenderer.c);
                final SurfaceTexture surfaceTexture3 = new SurfaceTexture(z ? dualOpenGlRenderer.n : dualOpenGlRenderer.o);
                surfaceTexture3.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface4 = new Surface(surfaceTexture3);
                surfaceRequest2.b(surface4, d00Var.c, new Consumer() { // from class: c00
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        SurfaceTexture surfaceTexture4 = surfaceTexture3;
                        surfaceTexture4.setOnFrameAvailableListener(null);
                        surfaceTexture4.release();
                        surface4.release();
                        r1.e--;
                        d00Var.a();
                    }
                });
                if (surfaceRequest2.f) {
                    d00Var.i = surfaceTexture3;
                    return;
                } else {
                    d00Var.j = surfaceTexture3;
                    surfaceTexture3.setOnFrameAvailableListener(d00Var, d00Var.d);
                    return;
                }
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                d00 d00Var2 = (d00) this.b;
                SurfaceOutput surfaceOutput2 = (SurfaceOutput) this.c;
                Surface surface5 = surfaceOutput2.getSurface(d00Var2.c, new tk(i, d00Var2, surfaceOutput2));
                d00Var2.a.g(surface5);
                d00Var2.h.put(surfaceOutput2, surface5);
                return;
            default:
                EncoderImpl encoderImpl = (EncoderImpl) this.b;
                lg0 lg0Var = (lg0) this.c;
                Range range = EncoderImpl.E;
                encoderImpl.m.remove(lg0Var);
                return;
        }
    }
}
