package defpackage;

import android.content.Intent;
import android.provider.MediaStore;
import androidx.camera.lifecycle.ProcessCameraProvider$Companion;
import androidx.camera.lifecycle.b;
import dev.zeron.tunnel.R;
import io.github.g00fy2.quickie.QROverlayView;
import io.github.g00fy2.quickie.QRScannerActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zz0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ QRScannerActivity b;

    public /* synthetic */ zz0(QRScannerActivity qRScannerActivity, int i) {
        this.a = i;
        this.b = qRScannerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        mk1 mk1Var = mk1.a;
        QRScannerActivity qRScannerActivity = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                tj1 tj1Var = qRScannerActivity.c;
                if (tj1Var == null) {
                    yg0.N("binding");
                    throw null;
                }
                QROverlayView qROverlayView = (QROverlayView) tj1Var.c;
                if (num != null && num.intValue() == 1) {
                    z = true;
                }
                qROverlayView.setTorchState(z);
                return mk1Var;
            case 1:
                ((Boolean) obj).getClass();
                int i2 = QRScannerActivity.j;
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
                qRScannerActivity.b.a(Intent.createChooser(intent, qRScannerActivity.getString(R.string.quickie_scan_qr_code)));
                return mk1Var;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i3 = QRScannerActivity.j;
                int i4 = 2;
                if (zBooleanValue) {
                    try {
                        b.h.getClass();
                        am amVarA = ProcessCameraProvider$Companion.a(qRScannerActivity);
                        amVarA.addListener(new ez0(i4, amVarA, qRScannerActivity), k5.n(qRScannerActivity));
                    } catch (Exception e) {
                        qRScannerActivity.g(e);
                    }
                } else {
                    qRScannerActivity.setResult(2, null);
                    qRScannerActivity.finish();
                }
                return mk1Var;
            case 3:
                Throwable th = (Throwable) obj;
                int i5 = QRScannerActivity.j;
                th.getClass();
                qRScannerActivity.g(th);
                return mk1Var;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i6 = QRScannerActivity.j;
                if (!qRScannerActivity.isFinishing()) {
                    tj1 tj1Var2 = qRScannerActivity.c;
                    if (tj1Var2 == null) {
                        yg0.N("binding");
                        throw null;
                    }
                    ((QROverlayView) tj1Var2.c).setLoading(zBooleanValue2);
                }
                return mk1Var;
        }
    }
}
