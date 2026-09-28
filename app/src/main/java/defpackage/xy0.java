package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xy0 {
    public static final xy0 a = new xy0();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = EmptyList.INSTANCE;
        }
        ArrayList arrayListP = c.p(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListP) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c.l(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            k1 k1Var = new k1();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                io0.e("Null processName");
                return null;
            }
            k1Var.a = str2;
            k1Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (k1Var.e | 1);
            k1Var.c = runningAppProcessInfo.importance;
            k1Var.e = (byte) (b | 2);
            k1Var.d = yg0.a(str2, str);
            k1Var.e = (byte) (k1Var.e | 4);
            arrayList2.add(k1Var.a());
        }
        return arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails b(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) next).b() == iMyPid) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        k1 k1Var = new k1();
        k1Var.a = processName;
        k1Var.b = iMyPid;
        byte b = (byte) (k1Var.e | 1);
        k1Var.c = 0;
        k1Var.d = false;
        k1Var.e = (byte) (((byte) (b | 2)) | 4);
        return k1Var.a();
    }
}
