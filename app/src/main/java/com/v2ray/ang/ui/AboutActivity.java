package com.v2ray.ang.ui;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.FileProvider;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.tencent.mmkv.MMKV;
import com.trilead.ssh2.sftp.AttribFlags;
import com.v2ray.ang.ui.AboutActivity;
import defpackage.hz;
import defpackage.if3;
import defpackage.lo;
import defpackage.m;
import defpackage.m2;
import defpackage.m91;
import defpackage.qf3;
import defpackage.zq0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import libv2ray.Libv2ray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/AboutActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AboutActivity extends BaseActivity {
    public static final /* synthetic */ int g = 0;
    public final Lazy c;
    public final Lazy d;
    public final ActivityResultLauncher e;
    public final ActivityResultLauncher f;

    public AboutActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: h
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String absolutePath;
                int i2 = i;
                AboutActivity aboutActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = AboutActivity.g;
                        View viewInflate = aboutActivity.getLayoutInflater().inflate(R.layout.activity_about, (ViewGroup) null, false);
                        int i4 = R.id.check_pre_release;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.check_pre_release, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.layout_backup;
                            LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_backup, viewInflate);
                            if (linearLayout != null) {
                                i4 = R.id.layout_check_update;
                                LinearLayout linearLayout2 = (LinearLayout) l02.n(R.id.layout_check_update, viewInflate);
                                if (linearLayout2 != null) {
                                    i4 = R.id.layout_feedback;
                                    LinearLayout linearLayout3 = (LinearLayout) l02.n(R.id.layout_feedback, viewInflate);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.layout_oss_licenses;
                                        LinearLayout linearLayout4 = (LinearLayout) l02.n(R.id.layout_oss_licenses, viewInflate);
                                        if (linearLayout4 != null) {
                                            i4 = R.id.layout_privacy_policy;
                                            LinearLayout linearLayout5 = (LinearLayout) l02.n(R.id.layout_privacy_policy, viewInflate);
                                            if (linearLayout5 != null) {
                                                i4 = R.id.layout_restore;
                                                LinearLayout linearLayout6 = (LinearLayout) l02.n(R.id.layout_restore, viewInflate);
                                                if (linearLayout6 != null) {
                                                    i4 = R.id.layout_share;
                                                    LinearLayout linearLayout7 = (LinearLayout) l02.n(R.id.layout_share, viewInflate);
                                                    if (linearLayout7 != null) {
                                                        i4 = R.id.layout_soure_ccode;
                                                        LinearLayout linearLayout8 = (LinearLayout) l02.n(R.id.layout_soure_ccode, viewInflate);
                                                        if (linearLayout8 != null) {
                                                            i4 = R.id.layout_tg_channel;
                                                            LinearLayout linearLayout9 = (LinearLayout) l02.n(R.id.layout_tg_channel, viewInflate);
                                                            if (linearLayout9 != null) {
                                                                i4 = R.id.tv_backup_summary;
                                                                TextView textView = (TextView) l02.n(R.id.tv_backup_summary, viewInflate);
                                                                if (textView != null) {
                                                                    i4 = R.id.tv_version;
                                                                    TextView textView2 = (TextView) l02.n(R.id.tv_version, viewInflate);
                                                                    if (textView2 != null) {
                                                                        return new m2((ScrollView) viewInflate, switchCompat, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, textView, textView2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = AboutActivity.g;
                        Regex regex = ul1.a;
                        try {
                            File externalFilesDir = aboutActivity.getExternalFilesDir("backups");
                            if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                                absolutePath = aboutActivity.getDir("backups", 0).getAbsolutePath();
                            }
                            absolutePath.getClass();
                            break;
                        } catch (Exception unused) {
                            absolutePath = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        return new File(absolutePath);
                }
            }
        });
        final int i2 = 1;
        this.d = kotlin.c.b(new Function0(this) { // from class: h
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String absolutePath;
                int i22 = i2;
                AboutActivity aboutActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = AboutActivity.g;
                        View viewInflate = aboutActivity.getLayoutInflater().inflate(R.layout.activity_about, (ViewGroup) null, false);
                        int i4 = R.id.check_pre_release;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.check_pre_release, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.layout_backup;
                            LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_backup, viewInflate);
                            if (linearLayout != null) {
                                i4 = R.id.layout_check_update;
                                LinearLayout linearLayout2 = (LinearLayout) l02.n(R.id.layout_check_update, viewInflate);
                                if (linearLayout2 != null) {
                                    i4 = R.id.layout_feedback;
                                    LinearLayout linearLayout3 = (LinearLayout) l02.n(R.id.layout_feedback, viewInflate);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.layout_oss_licenses;
                                        LinearLayout linearLayout4 = (LinearLayout) l02.n(R.id.layout_oss_licenses, viewInflate);
                                        if (linearLayout4 != null) {
                                            i4 = R.id.layout_privacy_policy;
                                            LinearLayout linearLayout5 = (LinearLayout) l02.n(R.id.layout_privacy_policy, viewInflate);
                                            if (linearLayout5 != null) {
                                                i4 = R.id.layout_restore;
                                                LinearLayout linearLayout6 = (LinearLayout) l02.n(R.id.layout_restore, viewInflate);
                                                if (linearLayout6 != null) {
                                                    i4 = R.id.layout_share;
                                                    LinearLayout linearLayout7 = (LinearLayout) l02.n(R.id.layout_share, viewInflate);
                                                    if (linearLayout7 != null) {
                                                        i4 = R.id.layout_soure_ccode;
                                                        LinearLayout linearLayout8 = (LinearLayout) l02.n(R.id.layout_soure_ccode, viewInflate);
                                                        if (linearLayout8 != null) {
                                                            i4 = R.id.layout_tg_channel;
                                                            LinearLayout linearLayout9 = (LinearLayout) l02.n(R.id.layout_tg_channel, viewInflate);
                                                            if (linearLayout9 != null) {
                                                                i4 = R.id.tv_backup_summary;
                                                                TextView textView = (TextView) l02.n(R.id.tv_backup_summary, viewInflate);
                                                                if (textView != null) {
                                                                    i4 = R.id.tv_version;
                                                                    TextView textView2 = (TextView) l02.n(R.id.tv_version, viewInflate);
                                                                    if (textView2 != null) {
                                                                        return new m2((ScrollView) viewInflate, switchCompat, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, textView, textView2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = AboutActivity.g;
                        Regex regex = ul1.a;
                        try {
                            File externalFilesDir = aboutActivity.getExternalFilesDir("backups");
                            if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                                absolutePath = aboutActivity.getDir("backups", 0).getAbsolutePath();
                            }
                            absolutePath.getClass();
                            break;
                        } catch (Exception unused) {
                            absolutePath = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        return new File(absolutePath);
                }
            }
        });
        this.e = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: l
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i3 = i;
                AboutActivity aboutActivity = this.b;
                switch (i3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i4 = AboutActivity.g;
                        if (!zBooleanValue) {
                            qf3.K(aboutActivity, R.string.toast_permission_denied);
                            return;
                        } else {
                            try {
                                aboutActivity.k();
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i5 = AboutActivity.g;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        Uri data = intent != null ? intent.getData() : null;
                        if (activityResult.a != -1 || data == null) {
                            return;
                        }
                        try {
                            File file = new File(aboutActivity.getCacheDir().getAbsolutePath(), System.currentTimeMillis() + ".zip");
                            InputStream inputStreamOpenInputStream = aboutActivity.getContentResolver().openInputStream(data);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        mu.h(inputStreamOpenInputStream, fileOutputStream);
                                    } finally {
                                    }
                                }
                                fileOutputStream.close();
                                if3.c(inputStreamOpenInputStream, null);
                                if (aboutActivity.j(file)) {
                                    qf3.O(aboutActivity);
                                    return;
                                } else {
                                    qf3.M(aboutActivity, R.string.toast_failure);
                                    return;
                                }
                            } finally {
                            }
                        } catch (Exception unused2) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                            return;
                        }
                        break;
                }
            }
        });
        this.f = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: l
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i3 = i2;
                AboutActivity aboutActivity = this.b;
                switch (i3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i4 = AboutActivity.g;
                        if (!zBooleanValue) {
                            qf3.K(aboutActivity, R.string.toast_permission_denied);
                            return;
                        } else {
                            try {
                                aboutActivity.k();
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i5 = AboutActivity.g;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        Uri data = intent != null ? intent.getData() : null;
                        if (activityResult.a != -1 || data == null) {
                            return;
                        }
                        try {
                            File file = new File(aboutActivity.getCacheDir().getAbsolutePath(), System.currentTimeMillis() + ".zip");
                            InputStream inputStreamOpenInputStream = aboutActivity.getContentResolver().openInputStream(data);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        mu.h(inputStreamOpenInputStream, fileOutputStream);
                                    } finally {
                                    }
                                }
                                fileOutputStream.close();
                                if3.c(inputStreamOpenInputStream, null);
                                if (aboutActivity.j(file)) {
                                    qf3.O(aboutActivity);
                                    return;
                                } else {
                                    qf3.M(aboutActivity, R.string.toast_failure);
                                    return;
                                }
                            } finally {
                            }
                        } catch (Exception unused2) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                            return;
                        }
                        break;
                }
            }
        });
    }

    public final Pair h(String str) {
        File[] fileArrListFiles;
        String str2 = getString(R.string.app_name) + "_" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
        String str3 = getCacheDir().getAbsolutePath() + "/" + str2;
        String strV = hz.v(str, "/", str2, ".zip");
        if (MMKV.backupAllToDirectory(str3) <= 0) {
            return new Pair(Boolean.FALSE, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
        try {
            if (str3.length() != 0 && strV.length() != 0) {
                ArrayList<String> arrayList = new ArrayList();
                File file = new File(str3);
                if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            arrayList.add(file2.getAbsolutePath());
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(strV));
                    for (String str4 : arrayList) {
                        zipOutputStream.putNextEntry(new ZipEntry(new File(str4).getName()));
                        FileInputStream fileInputStream = new FileInputStream(str4);
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i > 0) {
                                zipOutputStream.write(bArr, 0, i);
                            }
                        }
                        fileInputStream.close();
                    }
                    zipOutputStream.closeEntry();
                    zipOutputStream.close();
                    return new Pair(Boolean.TRUE, strV);
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(Boolean.FALSE, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public final m2 i() {
        return (m2) this.c.getValue();
    }

    public final boolean j(File file) {
        String str = getCacheDir().getAbsolutePath() + "/" + System.currentTimeMillis();
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                enumerationEntries.getClass();
                for (ZipEntry zipEntry : kotlin.sequences.b.a(new lo(enumerationEntries))) {
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    try {
                        String str2 = str + File.separator + zipEntry.getName();
                        if (zipEntry.isDirectory()) {
                            new File(str2).mkdir();
                        } else {
                            inputStream.getClass();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                            byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                            bufferedOutputStream.close();
                        }
                        if3.c(inputStream, null);
                    } finally {
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return MMKV.restoreAllFromDirectory(str) > 0;
    }

    public final void k() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            ActivityResultLauncher activityResultLauncher = this.f;
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
        setContentView(i().a);
        setTitle(getString(R.string.title_about));
        final int i = 1;
        final int i2 = 0;
        i().l.setText(getString(R.string.summary_configuration_backup, (File) this.d.getValue()));
        final int i3 = 4;
        i().c.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                AboutActivity aboutActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i6 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i7 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        final int i4 = 5;
        i().i.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i5 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i6 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i7 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        final int i5 = 6;
        i().h.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i6 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i7 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        i().d.setOnClickListener(new a(this, i2));
        i().b.setOnCheckedChangeListener(new m(0));
        SwitchCompat switchCompat = i().b;
        Lazy lazy = zq0.a;
        switchCompat.setChecked(zq0.z().b("pref_check_update_pre_release", false));
        final int i6 = 7;
        i().j.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i6;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i62 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i7 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        i().e.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i62 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i7 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        i().f.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i62 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i7 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        final int i7 = 2;
        i().k.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i7;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i62 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i72 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i8 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        final int i8 = 3;
        i().g.setOnClickListener(new View.OnClickListener(this) { // from class: i
            public final /* synthetic */ AboutActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i8;
                AboutActivity aboutActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = AboutActivity.g;
                        Regex regex = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG/issues");
                        break;
                    case 1:
                        int i62 = AboutActivity.g;
                        WebView webView = new WebView(aboutActivity);
                        webView.loadUrl("file:///android_asset/open_source_licenses.html");
                        new AlertDialog.Builder(aboutActivity).setTitle("Open source licenses").setView(webView).setPositiveButton("OK", new k(0)).show();
                        break;
                    case 2:
                        int i72 = AboutActivity.g;
                        Regex regex2 = ul1.a;
                        ul1.x(aboutActivity, "https://t.me/github_2dust");
                        break;
                    case 3:
                        int i82 = AboutActivity.g;
                        Regex regex3 = ul1.a;
                        ul1.x(aboutActivity, "https://raw.githubusercontent.com/2dust/v2rayNG/master/CR.md");
                        break;
                    case 4:
                        int i9 = AboutActivity.g;
                        String absolutePath = ((File) aboutActivity.d.getValue()).getAbsolutePath();
                        absolutePath.getClass();
                        if (!((Boolean) aboutActivity.h(absolutePath).getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            qf3.O(aboutActivity);
                        }
                        break;
                    case 5:
                        int i10 = AboutActivity.g;
                        String absolutePath2 = aboutActivity.getCacheDir().getAbsolutePath();
                        absolutePath2.getClass();
                        Pair pairH = aboutActivity.h(absolutePath2);
                        if (!((Boolean) pairH.getFirst()).booleanValue()) {
                            qf3.M(aboutActivity, R.string.toast_failure);
                        } else {
                            aboutActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("application/zip").setFlags(1).putExtra("android.intent.extra.STREAM", FileProvider.c(aboutActivity, new File((String) pairH.getSecond()))), aboutActivity.getString(R.string.title_configuration_share)));
                        }
                        break;
                    case 6:
                        int i11 = AboutActivity.g;
                        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
                        if (k5.a(aboutActivity, str) != 0) {
                            aboutActivity.e.a(str);
                        } else {
                            try {
                                aboutActivity.k();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        int i12 = AboutActivity.g;
                        Regex regex4 = ul1.a;
                        ul1.x(aboutActivity, "https://github.com/2dust/v2rayNG");
                        break;
                }
            }
        });
        m91 m91Var = m91.a;
        String strCheckVersionX = Libv2ray.checkVersionX();
        strCheckVersionX.getClass();
        i().m.setText("vv1.0.8.8 (" + strCheckVersionX + ")");
    }
}
