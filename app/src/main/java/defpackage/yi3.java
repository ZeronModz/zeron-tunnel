package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.consent_sdk.zzcd;
import com.google.android.gms.internal.consent_sdk.zzce;
import com.google.android.gms.internal.consent_sdk.zzcf;
import com.google.android.gms.internal.consent_sdk.zzcg;
import com.google.android.gms.internal.consent_sdk.zzch;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzcj;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yi3 {
    public final mo2 a;
    public final Activity b;
    public final px1 c;
    public final pq d;

    public /* synthetic */ yi3(mo2 mo2Var, Activity activity, px1 px1Var, pq pqVar) {
        this.a = mo2Var;
        this.b = activity;
        this.c = px1Var;
        this.d = pqVar;
    }

    public static zzcj a(yi3 yi3Var) throws zzg {
        Bundle bundle;
        String string;
        List list;
        List list2;
        PackageInfo packageInfo;
        zzcj zzcjVar = new zzcj();
        pq pqVar = yi3Var.d;
        mo2 mo2Var = yi3Var.a;
        Application application = (Application) mo2Var.b;
        pqVar.getClass();
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        zzcjVar.a = string;
        if (yi3Var.c.b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        zzcjVar.i = list;
        zzcjVar.e = ((py1) mo2Var.c).a();
        pqVar.getClass();
        zzcjVar.d = Boolean.FALSE;
        zzcjVar.c = Locale.getDefault().toLanguageTag();
        zzcf zzcfVar = new zzcf();
        int i = Build.VERSION.SDK_INT;
        zzcfVar.b = Integer.valueOf(i);
        zzcfVar.a = Build.MODEL;
        zzcfVar.c = 2;
        zzcjVar.b = zzcfVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        zzch zzchVar = new zzch();
        zzchVar.a = Integer.valueOf(configuration.screenWidthDp);
        zzchVar.b = Integer.valueOf(configuration.screenHeightDp);
        zzchVar.c = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = yi3Var.b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcg zzcgVar = new zzcg();
                        zzcgVar.b = Integer.valueOf(rect.left);
                        zzcgVar.c = Integer.valueOf(rect.right);
                        zzcgVar.a = Integer.valueOf(rect.top);
                        zzcgVar.d = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzcgVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzchVar.d = list2;
        zzcjVar.f = zzchVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcdVar = new zzcd();
        zzcdVar.a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        zzcdVar.b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcdVar.c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzcjVar.g = zzcdVar;
        zzci zzciVar = new zzci();
        zzciVar.a = "3.2.0";
        zzcjVar.h = zzciVar;
        return zzcjVar;
    }
}
