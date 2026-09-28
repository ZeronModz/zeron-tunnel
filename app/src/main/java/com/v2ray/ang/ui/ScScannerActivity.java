package com.v2ray.ang.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.ScScannerActivity;
import com.v2ray.ang.ui.ScannerActivity;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/ScScannerActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScScannerActivity extends BaseActivity {
    public static final /* synthetic */ int e = 0;
    public final ActivityResultLauncher c;
    public final ActivityResultLauncher d;

    public ScScannerActivity() {
        final int i = 0;
        this.c = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: x41
            public final /* synthetic */ ScScannerActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i2 = i;
                ScScannerActivity scScannerActivity = this.b;
                switch (i2) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            int i3 = ScScannerActivity.e;
                            qf3.K(scScannerActivity, R.string.toast_permission_denied);
                            scScannerActivity.finish();
                        } else {
                            scScannerActivity.d.a(new Intent(scScannerActivity, (Class<?>) ScannerActivity.class));
                        }
                        break;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i4 = ScScannerActivity.e;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            Intent intent = activityResult.b;
                            String stringExtra = intent != null ? intent.getStringExtra("SCAN_RESULT") : null;
                            if (stringExtra == null) {
                                stringExtra = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            Pair pairI = ay2.i(stringExtra, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
                            if (((Number) pairI.component2()).intValue() + ((Number) pairI.component1()).intValue() > 0) {
                                qf3.O(scScannerActivity);
                            } else {
                                qf3.M(scScannerActivity, R.string.toast_failure);
                            }
                            scScannerActivity.startActivity(new Intent(scScannerActivity, (Class<?>) Hometab.class));
                        }
                        scScannerActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.d = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: x41
            public final /* synthetic */ ScScannerActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i22 = i2;
                ScScannerActivity scScannerActivity = this.b;
                switch (i22) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            int i3 = ScScannerActivity.e;
                            qf3.K(scScannerActivity, R.string.toast_permission_denied);
                            scScannerActivity.finish();
                        } else {
                            scScannerActivity.d.a(new Intent(scScannerActivity, (Class<?>) ScannerActivity.class));
                        }
                        break;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i4 = ScScannerActivity.e;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            Intent intent = activityResult.b;
                            String stringExtra = intent != null ? intent.getStringExtra("SCAN_RESULT") : null;
                            if (stringExtra == null) {
                                stringExtra = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            Pair pairI = ay2.i(stringExtra, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
                            if (((Number) pairI.component2()).intValue() + ((Number) pairI.component1()).intValue() > 0) {
                                qf3.O(scScannerActivity);
                            } else {
                                qf3.M(scScannerActivity, R.string.toast_failure);
                            }
                            scScannerActivity.startActivity(new Intent(scScannerActivity, (Class<?>) Hometab.class));
                        }
                        scScannerActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_none);
        this.c.a("android.permission.CAMERA");
    }
}
