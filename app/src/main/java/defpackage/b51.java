package defpackage;

import android.content.Intent;
import androidx.activity.result.ActivityResultCallback;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.ui.ScannerActivity;
import io.github.g00fy2.quickie.QRResult;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b51 implements ActivityResultCallback, FunctionAdapter {
    public final /* synthetic */ ScannerActivity a;

    public b51(ScannerActivity scannerActivity) {
        this.a = scannerActivity;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return getFunctionDelegate().equals(((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, ScannerActivity.class, "handleResult", "handleResult(Lio/github/g00fy2/quickie/QRResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        QRResult qRResult = (QRResult) obj;
        qRResult.getClass();
        int i = ScannerActivity.f;
        boolean z = qRResult instanceof QRResult.QRSuccess;
        ScannerActivity scannerActivity = this.a;
        if (!z) {
            scannerActivity.finish();
            return;
        }
        String a = ((QRResult.QRSuccess) qRResult).a.getA();
        if (a == null) {
            a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        Intent intent = new Intent();
        intent.putExtra("SCAN_RESULT", a);
        scannerActivity.setResult(-1, intent);
        scannerActivity.finish();
    }
}
