package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.google.zxing.client.android.AmbientLightManager;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.SourceData;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import defpackage.rb0;
import defpackage.u7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraManager {
    public Camera a;
    public Camera.CameraInfo b;
    public AutoFocusManager c;
    public AmbientLightManager d;
    public boolean e;
    public String f;
    public DisplayConfiguration h;
    public Size i;
    public Size j;
    public final Context l;
    public CameraSettings g = new CameraSettings();
    public int k = -1;
    public final CameraPreviewCallback m = new CameraPreviewCallback();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public final class CameraPreviewCallback implements Camera.PreviewCallback {
        public rb0 a;
        public Size b;

        public CameraPreviewCallback() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraManager cameraManager = CameraManager.this;
            Size size = this.b;
            rb0 rb0Var = this.a;
            if (size == null || rb0Var == null) {
                if (rb0Var != null) {
                    rb0Var.onPreviewError(new Exception("No resolution available"));
                    return;
                }
                return;
            }
            try {
                if (bArr == null) {
                    throw new NullPointerException("No preview data received");
                }
                SourceData sourceData = new SourceData(bArr, size.a, size.b, camera.getParameters().getPreviewFormat(), cameraManager.k);
                if (cameraManager.b.facing == 1) {
                    sourceData.e = true;
                }
                rb0Var.onPreview(sourceData);
            } catch (RuntimeException e) {
                rb0Var.onPreviewError(e);
            }
        }
    }

    public CameraManager(Context context) {
        this.l = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:5:0x0006, B:16:0x001e, B:20:0x0027, B:22:0x0033, B:21:0x002e), top: B:38:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            android.hardware.Camera r0 = r6.a
            if (r0 == 0) goto L61
            r1 = 0
            r2 = 1
            com.journeyapps.barcodescanner.camera.DisplayConfiguration r3 = r6.h     // Catch: java.lang.Exception -> L38
            int r3 = r3.b     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L14
            if (r3 == r2) goto L1c
            r4 = 2
            if (r3 == r4) goto L19
            r4 = 3
            if (r3 == r4) goto L16
        L14:
            r3 = r1
            goto L1e
        L16:
            r3 = 270(0x10e, float:3.78E-43)
            goto L1e
        L19:
            r3 = 180(0xb4, float:2.52E-43)
            goto L1e
        L1c:
            r3 = 90
        L1e:
            android.hardware.Camera$CameraInfo r4 = r6.b     // Catch: java.lang.Exception -> L38
            int r5 = r4.facing     // Catch: java.lang.Exception -> L38
            int r4 = r4.orientation
            if (r5 != r2) goto L2e
            int r4 = r4 + r3
            int r4 = r4 % 360
            int r3 = 360 - r4
            int r3 = r3 % 360
            goto L33
        L2e:
            int r4 = r4 - r3
            int r4 = r4 + 360
            int r3 = r4 % 360
        L33:
            r6.k = r3     // Catch: java.lang.Exception -> L38
            r0.setDisplayOrientation(r3)     // Catch: java.lang.Exception -> L38
        L38:
            r6.b(r1)     // Catch: java.lang.Exception -> L3c
            goto L3f
        L3c:
            r6.b(r2)     // Catch: java.lang.Exception -> L3f
        L3f:
            android.hardware.Camera r0 = r6.a
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            android.hardware.Camera$Size r0 = r0.getPreviewSize()
            if (r0 != 0) goto L50
            com.journeyapps.barcodescanner.Size r0 = r6.i
            r6.j = r0
            goto L5c
        L50:
            com.journeyapps.barcodescanner.Size r1 = new com.journeyapps.barcodescanner.Size
            int r2 = r0.width
            int r0 = r0.height
            r1.<init>(r2, r0)
            r6.j = r1
            r0 = r1
        L5c:
            com.journeyapps.barcodescanner.camera.CameraManager$CameraPreviewCallback r6 = r6.m
            r6.b = r0
            return
        L61:
            java.lang.String r6 = "Camera not open"
            defpackage.s31.f(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.camera.CameraManager.a():void");
    }

    public final void b(boolean z) {
        Camera.Parameters parameters = this.a.getParameters();
        String str = this.f;
        if (str == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            return;
        }
        parameters.flatten();
        CameraSettings.FocusMode focusMode = this.g.b;
        int i = a.a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        int[] iArr = null;
        String strA = (z || focusMode == CameraSettings.FocusMode.AUTO) ? a.a(new String[]{"auto"}, supportedFocusModes) : focusMode == CameraSettings.FocusMode.CONTINUOUS ? a.a(new String[]{"continuous-picture", "continuous-video", "auto"}, supportedFocusModes) : focusMode == CameraSettings.FocusMode.INFINITY ? a.a(new String[]{"infinity"}, supportedFocusModes) : focusMode == CameraSettings.FocusMode.MACRO ? a.a(new String[]{"macro"}, supportedFocusModes) : null;
        if (!z && strA == null) {
            strA = a.a(new String[]{"macro", "edof"}, supportedFocusModes);
        }
        if (strA != null && !strA.equals(parameters.getFocusMode())) {
            parameters.setFocusMode(strA);
        }
        if (!z) {
            a.b(parameters, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new Size(previewSize.width, previewSize.height);
                arrayList.add(new Size(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new Size(size.width, size.height));
            }
        }
        if (arrayList.size() == 0) {
            this.i = null;
        } else {
            DisplayConfiguration displayConfiguration = this.h;
            int i2 = this.k;
            if (i2 == -1) {
                u7.p("Rotation not calculated yet. Call configure() first.");
                return;
            }
            boolean z2 = i2 % 180 != 0;
            Size size2 = displayConfiguration.a;
            if (size2 == null) {
                size2 = null;
            } else if (z2) {
                size2 = new Size(size2.b, size2.a);
            }
            Size sizeA = displayConfiguration.c.a(arrayList, size2);
            this.i = sizeA;
            parameters.setPreviewSize(sizeA.a, sizeA.b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    Arrays.toString(it.next());
                    it.hasNext();
                }
            }
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i3 = next[0];
                    int i4 = next[1];
                    if (i3 >= 10000 && i4 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr != null) {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Arrays.toString(iArr);
                    } else {
                        Arrays.toString(iArr);
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        parameters.flatten();
        this.a.setParameters(parameters);
    }

    public final void c(boolean z) {
        String flashMode;
        Camera camera = this.a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    AutoFocusManager autoFocusManager = this.c;
                    if (autoFocusManager != null) {
                        autoFocusManager.a = true;
                        autoFocusManager.b = false;
                        autoFocusManager.e.removeMessages(1);
                        if (autoFocusManager.c) {
                            try {
                                autoFocusManager.d.cancelAutoFocus();
                            } catch (RuntimeException unused) {
                            }
                        }
                    }
                    Camera.Parameters parameters2 = this.a.getParameters();
                    a.b(parameters2, z);
                    this.g.getClass();
                    this.a.setParameters(parameters2);
                    AutoFocusManager autoFocusManager2 = this.c;
                    if (autoFocusManager2 != null) {
                        autoFocusManager2.a = false;
                        autoFocusManager2.b();
                    }
                }
            } catch (RuntimeException unused2) {
            }
        }
    }

    public final void d() {
        Camera camera = this.a;
        if (camera == null || this.e) {
            return;
        }
        camera.startPreview();
        this.e = true;
        this.c = new AutoFocusManager(this.a, this.g);
        AmbientLightManager ambientLightManager = new AmbientLightManager(this.l, this, this.g);
        this.d = ambientLightManager;
        ambientLightManager.b.getClass();
    }
}
