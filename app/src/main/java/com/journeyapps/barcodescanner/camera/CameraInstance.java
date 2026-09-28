package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.os.Handler;
import com.journeyapps.barcodescanner.Util;
import defpackage.fk;
import defpackage.zk3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CameraInstance {
    public final zk3 a;
    public CameraSurface b;
    public final CameraManager c;
    public Handler d;
    public DisplayConfiguration e;
    public final Handler h;
    public boolean f = false;
    public boolean g = true;
    public CameraSettings i = new CameraSettings();
    public final fk j = new fk(this, 0);
    public final fk k = new fk(this, 1);
    public final fk l = new fk(this, 2);
    public final c m = new c(this);

    public CameraInstance(Context context) {
        Util.a();
        zk3 zk3Var = zk3.g;
        if (zk3Var == null) {
            zk3Var = new zk3();
            zk3.g = zk3Var;
        }
        this.a = zk3Var;
        CameraManager cameraManager = new CameraManager(context);
        this.c = cameraManager;
        cameraManager.g = this.i;
        this.h = new Handler();
    }

    public CameraInstance(CameraManager cameraManager) {
        Util.a();
        this.c = cameraManager;
    }
}
