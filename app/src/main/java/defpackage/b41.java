package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.RotationListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b41 extends OrientationEventListener {
    public final /* synthetic */ RotationListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(RotationListener rotationListener, Context context) {
        super(context, 3);
        this.a = rotationListener;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int rotation;
        RotationListener rotationListener = this.a;
        WindowManager windowManager = rotationListener.b;
        rb0 rb0Var = rotationListener.d;
        if (windowManager == null || rb0Var == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == rotationListener.a) {
            return;
        }
        rotationListener.a = rotation;
        rb0Var.onRotationChanged(rotation);
    }
}
