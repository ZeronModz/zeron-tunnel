package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.client.android.BeepManager;
import com.google.zxing.client.android.InactivityTimer;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import defpackage.fl;
import defpackage.gl;
import defpackage.jx2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CaptureManager {
    public final Activity a;
    public final DecoratedBarcodeView b;
    public final InactivityTimer h;
    public final BeepManager i;
    public final Handler j;
    public boolean m;
    public int c = -1;
    public boolean d = false;
    public boolean e = true;
    public String f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public boolean g = false;
    public boolean k = false;
    public final jx2 l = new jx2(this, 4);

    public CaptureManager(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        d dVar = new d(this);
        this.m = false;
        this.a = activity;
        this.b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().j.add(dVar);
        this.j = new Handler();
        this.h = new InactivityTimer(activity, new fl(this, 0));
        this.i = new BeepManager(activity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.b;
        CameraInstance cameraInstance = decoratedBarcodeView.getBarcodeView().a;
        if (cameraInstance == null || cameraInstance.g) {
            this.a.finish();
        } else {
            this.k = true;
        }
        decoratedBarcodeView.a.c();
        this.h.a();
    }

    public final void b(String str) {
        Activity activity = this.a;
        if (activity.isFinishing() || this.g || this.k) {
            return;
        }
        if (str.isEmpty()) {
            str = activity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(activity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new gl(this, 0));
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hl
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.a.finish();
            }
        });
        builder.show();
    }
}
