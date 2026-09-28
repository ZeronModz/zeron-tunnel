package io.github.g00fy2.quickie;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.camera.view.PreviewView;
import androidx.core.view.h;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.cn1;
import defpackage.io0;
import defpackage.j03;
import defpackage.k5;
import defpackage.l02;
import defpackage.tj1;
import defpackage.v1;
import defpackage.vd0;
import defpackage.xu;
import defpackage.yg0;
import defpackage.zu0;
import defpackage.zz0;
import io.github.g00fy2.quickie.config.BarcodeFormat;
import io.github.g00fy2.quickie.config.ParcelableScannerConfig;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/github/g00fy2/quickie/QRScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QRScannerActivity extends AppCompatActivity {
    public static final /* synthetic */ int j = 0;
    public final ActivityResultLauncher b;
    public tj1 c;
    public ExecutorService d;
    public int[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/github/g00fy2/quickie/QRScannerActivity$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "EXTRA_CONFIG", "Ljava/lang/String;", "EXTRA_RESULT_BYTES", "EXTRA_RESULT_VALUE", "EXTRA_RESULT_TYPE", "EXTRA_RESULT_PARCELABLE", "EXTRA_RESULT_EXCEPTION", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "RESULT_MISSING_PERMISSION", "I", "RESULT_ERROR", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public QRScannerActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new vd0(this, 1));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.b = activityResultLauncherRegisterForActivityResult;
        this.e = new int[]{BarcodeFormat.QR_CODE.ordinal()};
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final io.github.g00fy2.quickie.QRScannerActivity r7, androidx.activity.result.ActivityResult r8) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.g00fy2.quickie.QRScannerActivity.i(io.github.g00fy2.quickie.QRScannerActivity, androidx.activity.result.ActivityResult):void");
    }

    public final void g(Throwable th) {
        setResult(3, new Intent().putExtra("quickie-exception", new Exception(th)));
        finish();
    }

    public final void h(String str) {
        tj1 tj1Var = this.c;
        if (tj1Var == null) {
            yg0.N("binding");
            throw null;
        }
        ((QROverlayView) tj1Var.c).setHighlighted(true);
        if (this.f) {
            tj1 tj1Var2 = this.c;
            if (tj1Var2 == null) {
                yg0.N("binding");
                throw null;
            }
            ((QROverlayView) tj1Var2.c).performHapticFeedback(3, 3);
        }
        Intent intent = new Intent();
        intent.putExtra("quickie-value", str);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        super.onCreate(bundle);
        int i = getApplicationInfo().theme;
        View viewInflate = (i != 0 ? getLayoutInflater().cloneInContext(new ContextThemeWrapper(this, i)) : getLayoutInflater()).inflate(R.layout.quickie_scanner_activity, (ViewGroup) null, false);
        int i2 = R.id.overlay_view;
        QROverlayView qROverlayView = (QROverlayView) l02.n(R.id.overlay_view, viewInflate);
        if (qROverlayView != null) {
            i2 = R.id.preview_view;
            PreviewView previewView = (PreviewView) l02.n(R.id.preview_view, viewInflate);
            if (previewView != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                this.c = new tj1(frameLayout, 13, qROverlayView, previewView);
                setContentView(frameLayout);
                j03.t(getWindow(), false);
                tj1 tj1Var = this.c;
                if (tj1Var == null) {
                    yg0.N("binding");
                    throw null;
                }
                QROverlayView qROverlayView2 = (QROverlayView) tj1Var.c;
                zu0 zu0Var = new zu0();
                WeakHashMap weakHashMap = h.a;
                cn1.m(qROverlayView2, zu0Var);
                Intent intent = getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelableExtra = v1.i(intent, "quickie-config", ParcelableScannerConfig.class);
                    } else {
                        parcelableExtra = intent.getParcelableExtra("quickie-config");
                        if (!ParcelableScannerConfig.class.isInstance(parcelableExtra)) {
                            parcelableExtra = null;
                        }
                    }
                    ParcelableScannerConfig parcelableScannerConfig = (ParcelableScannerConfig) parcelableExtra;
                    if (parcelableScannerConfig != null) {
                        this.e = parcelableScannerConfig.a;
                        tj1 tj1Var2 = this.c;
                        if (tj1Var2 == null) {
                            yg0.N("binding");
                            throw null;
                        }
                        ((QROverlayView) tj1Var2.c).setCustomText(parcelableScannerConfig.b);
                        tj1 tj1Var3 = this.c;
                        if (tj1Var3 == null) {
                            yg0.N("binding");
                            throw null;
                        }
                        ((QROverlayView) tj1Var3.c).setCustomIcon(parcelableScannerConfig.c);
                        tj1 tj1Var4 = this.c;
                        if (tj1Var4 == null) {
                            yg0.N("binding");
                            throw null;
                        }
                        ((QROverlayView) tj1Var4.c).setHorizontalFrameRatio(parcelableScannerConfig.f);
                        this.f = parcelableScannerConfig.d;
                        this.g = parcelableScannerConfig.e;
                        this.i = parcelableScannerConfig.g;
                        this.h = parcelableScannerConfig.h;
                        if (parcelableScannerConfig.i) {
                            getWindow().addFlags(128);
                        }
                    }
                }
                this.d = Executors.newSingleThreadExecutor();
                zz0 zz0Var = new zz0(this, 2);
                if (k5.a(this, "android.permission.CAMERA") == 0) {
                    zz0Var.invoke(Boolean.TRUE);
                    return;
                } else {
                    registerForActivityResult(new ActivityResultContracts$RequestPermission(), new vd0(zz0Var, 2)).a("android.permission.CAMERA");
                    return;
                }
            }
        }
        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.shutdown();
        } else {
            yg0.N("analysisExecutor");
            throw null;
        }
    }
}
