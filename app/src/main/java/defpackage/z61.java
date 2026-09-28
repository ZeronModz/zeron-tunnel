package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.a;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.DataCollectionStatus;
import com.google.firebase.sessions.LogEnvironment;
import com.google.firebase.sessions.ProcessDetails;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z61 {
    public static final z61 a = new z61();
    public static final rb0 b;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        jsonDataEncoderBuilder.registerEncoder(SessionEvent.class, ga.a);
        jsonDataEncoderBuilder.registerEncoder(SessionInfo.class, ha.a);
        jsonDataEncoderBuilder.registerEncoder(DataCollectionStatus.class, ea.a);
        jsonDataEncoderBuilder.registerEncoder(ApplicationInfo.class, da.a);
        jsonDataEncoderBuilder.registerEncoder(AndroidApplicationInfo.class, ca.a);
        jsonDataEncoderBuilder.registerEncoder(ProcessDetails.class, fa.a);
        jsonDataEncoderBuilder.d = true;
        b = new rb0(jsonDataEncoderBuilder, 10);
    }

    public static ApplicationInfo a(a aVar) throws PackageManager.NameNotFoundException {
        aVar.a();
        Context context = aVar.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        aVar.a();
        String str = aVar.c.b;
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        String str3 = Build.VERSION.RELEASE;
        str3.getClass();
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = strValueOf;
        }
        String str5 = Build.MANUFACTURER;
        str5.getClass();
        aVar.a();
        ProcessDetails processDetailsC = v1.c(context);
        aVar.a();
        return new ApplicationInfo(str, str2, "3.0.3", str3, logEnvironment, new AndroidApplicationInfo(packageName, str4, strValueOf, str5, processDetailsC, v1.b(context)));
    }
}
