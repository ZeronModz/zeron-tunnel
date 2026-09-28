package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import com.google.zxing.client.android.InactivityTimer;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.sandok.tunnel.service.OpenVPNService;
import defpackage.k5;
import defpackage.x2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CaptureActivity extends Activity {
    public CaptureManager a;
    public DecoratedBarcodeView b;

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CaptureManager captureManager = this.a;
        captureManager.g = true;
        captureManager.h.a();
        captureManager.j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.b.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        CaptureManager captureManager = this.a;
        captureManager.h.a();
        BarcodeView barcodeView = captureManager.b.a;
        CameraInstance cameraInstance = barcodeView.getCameraInstance();
        barcodeView.c();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.g && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CaptureManager captureManager = this.a;
        captureManager.getClass();
        if (i == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                captureManager.b.a.e();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            captureManager.a.setResult(0, intent);
            if (captureManager.e) {
                captureManager.b(captureManager.f);
            } else {
                captureManager.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        CaptureManager captureManager = this.a;
        Activity activity = captureManager.a;
        if (k5.a(activity, "android.permission.CAMERA") == 0) {
            captureManager.b.a.e();
        } else if (!captureManager.m) {
            x2.N(activity, new String[]{"android.permission.CAMERA"}, OpenVPNService.log_deque_max);
            captureManager.m = true;
        }
        InactivityTimer inactivityTimer = captureManager.h;
        if (!inactivityTimer.c) {
            inactivityTimer.a.registerReceiver(inactivityTimer.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            inactivityTimer.c = true;
        }
        Handler handler = inactivityTimer.d;
        handler.removeCallbacksAndMessages(null);
        if (inactivityTimer.f) {
            handler.postDelayed(inactivityTimer.e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.a.c);
    }
}
