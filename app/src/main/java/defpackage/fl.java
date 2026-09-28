package defpackage;

import android.content.Intent;
import com.journeyapps.barcodescanner.CaptureManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CaptureManager b;

    public /* synthetic */ fl(CaptureManager captureManager, int i) {
        this.a = i;
        this.b = captureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CaptureManager captureManager = this.b;
        switch (i) {
            case 0:
                captureManager.a.finish();
                break;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                captureManager.a.setResult(0, intent);
                captureManager.a();
                break;
        }
    }
}
