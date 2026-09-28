package defpackage;

import android.hardware.Camera;
import com.journeyapps.barcodescanner.camera.AutoFocusManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n9 implements Camera.AutoFocusCallback {
    public final /* synthetic */ AutoFocusManager a;

    public n9(AutoFocusManager autoFocusManager) {
        this.a = autoFocusManager;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        this.a.e.post(new w2(this, 2));
    }
}
