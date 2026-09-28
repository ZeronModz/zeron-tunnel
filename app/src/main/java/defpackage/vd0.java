package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import dev.zeron.tunnel.R;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.c;
import io.github.g00fy2.quickie.QRScannerActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements ActivityResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Hometab hometab = (Hometab) obj2;
                if (((Boolean) obj).booleanValue()) {
                    int i2 = c.a[hometab.g.ordinal()];
                } else {
                    Hometab.Companion companion = Hometab.n;
                    qf3.K(hometab, R.string.toast_permission_denied);
                }
                hometab.g = Hometab.Action.NONE;
                break;
            case 1:
                QRScannerActivity.i((QRScannerActivity) obj2, (ActivityResult) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                int i3 = QRScannerActivity.j;
                bool.getClass();
                ((zz0) obj2).invoke(bool);
                break;
        }
    }
}
