package com.v2ray.ang.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import dev.zeron.tunnel.R;
import com.v2ray.ang.ui.ScannerActivity;
import defpackage.b51;
import defpackage.k5;
import defpackage.qf3;
import defpackage.zq0;
import io.github.g00fy2.quickie.ScanCustomCode;
import io.github.g00fy2.quickie.config.BarcodeFormat;
import io.github.g00fy2.quickie.config.ScannerConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/ScannerActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScannerActivity extends BaseActivity {
    public static final /* synthetic */ int f = 0;
    public final ActivityResultLauncher c = registerForActivityResult(new ScanCustomCode(), new b51(this));
    public final ActivityResultLauncher d;
    public final ActivityResultLauncher e;

    public ScannerActivity() {
        final int i = 0;
        this.d = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: a51
            public final /* synthetic */ ScannerActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i2 = i;
                ScannerActivity scannerActivity = this.b;
                switch (i2) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i3 = ScannerActivity.f;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        Uri data = intent != null ? intent.getData() : null;
                        if (activityResult.a == -1 && data != null) {
                            try {
                                InputStream inputStreamOpenInputStream = scannerActivity.getContentResolver().openInputStream(data);
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                                int i4 = uz0.a;
                                String strB = uz0.b(bitmapDecodeStream);
                                if (strB != null && strB.length() != 0) {
                                    Intent intent2 = new Intent();
                                    intent2.putExtra("SCAN_RESULT", strB);
                                    scannerActivity.setResult(-1, intent2);
                                    scannerActivity.finish();
                                }
                                qf3.K(scannerActivity, R.string.toast_decoding_failed);
                            } catch (Exception unused) {
                                qf3.K(scannerActivity, R.string.toast_decoding_failed);
                                return;
                            }
                            break;
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = ScannerActivity.f;
                        if (!zBooleanValue) {
                            qf3.K(scannerActivity, R.string.toast_permission_denied);
                        } else {
                            scannerActivity.i();
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.e = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: a51
            public final /* synthetic */ ScannerActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i22 = i2;
                ScannerActivity scannerActivity = this.b;
                switch (i22) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i3 = ScannerActivity.f;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        Uri data = intent != null ? intent.getData() : null;
                        if (activityResult.a == -1 && data != null) {
                            try {
                                InputStream inputStreamOpenInputStream = scannerActivity.getContentResolver().openInputStream(data);
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                                int i4 = uz0.a;
                                String strB = uz0.b(bitmapDecodeStream);
                                if (strB != null && strB.length() != 0) {
                                    Intent intent2 = new Intent();
                                    intent2.putExtra("SCAN_RESULT", strB);
                                    scannerActivity.setResult(-1, intent2);
                                    scannerActivity.finish();
                                }
                                qf3.K(scannerActivity, R.string.toast_decoding_failed);
                            } catch (Exception unused) {
                                qf3.K(scannerActivity, R.string.toast_decoding_failed);
                                return;
                            }
                            break;
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = ScannerActivity.f;
                        if (!zBooleanValue) {
                            qf3.K(scannerActivity, R.string.toast_permission_denied);
                        } else {
                            scannerActivity.i();
                        }
                        break;
                }
            }
        });
    }

    public final void h() {
        ScannerConfig.j.getClass();
        ScannerConfig.Builder builder = new ScannerConfig.Builder();
        builder.c = true;
        builder.d = true;
        builder.f = true;
        List list = builder.a;
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((BarcodeFormat) it.next()).ordinal()));
        }
        this.c.a(new ScannerConfig(kotlin.collections.c.Q(arrayList), 0, builder.b, builder.c, builder.d, builder.e, false, builder.f, false));
    }

    public final void i() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            ActivityResultLauncher activityResultLauncher = this.d;
            Intent intentCreateChooser = Intent.createChooser(intent, getString(R.string.title_file_chooser));
            intentCreateChooser.getClass();
            activityResultLauncher.a(intentCreateChooser);
        } catch (ActivityNotFoundException unused) {
            qf3.K(this, R.string.toast_require_file_manager);
        }
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Lazy lazy = zq0.a;
        if (zq0.z().b("pref_start_scan_immediate", false)) {
            h();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_scanner, menu);
        return true;
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.scan_code) {
            h();
            return true;
        }
        if (itemId != R.id.select_photo) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
        if (k5.a(this, str) == 0) {
            i();
            return true;
        }
        this.e.a(str);
        return true;
    }
}
