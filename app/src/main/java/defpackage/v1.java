package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.camera.core.DynamicRange;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.sessions.ProcessDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {
    public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
        DisplayCutout.Builder waterfallInsets = new DisplayCutout.Builder().setSafeInsets(insets).setWaterfallInsets(insets2);
        if (rect != null) {
            waterfallInsets.setBoundingRectLeft(rect);
        }
        if (rect2 != null) {
            waterfallInsets.setBoundingRectTop(rect2);
        }
        if (rect3 != null) {
            waterfallInsets.setBoundingRectRight(rect3);
        }
        if (rect4 != null) {
            waterfallInsets.setBoundingRectBottom(rect4);
        }
        if (path != null) {
            waterfallInsets.setCutoutPath(path);
        }
        return waterfallInsets.build();
    }

    public static ArrayList b(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, yg0.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static ProcessDetails c(Context context) {
        Object next;
        String strJ;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = b(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProcessDetails) next).b == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            strJ = Process.myProcessName();
            strJ.getClass();
        } else if ((i < 28 || (strJ = Application.getProcessName()) == null) && (strJ = j5.j()) == null) {
            strJ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new ProcessDetails(strJ, iMyPid, 0, false);
    }

    public static OnBackInvokedDispatcher d(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.getClass();
        return onBackInvokedDispatcher;
    }

    public static PackageInfo e(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object f(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] g(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList h(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object i(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static DynamicRange j(rj rjVar) {
        Long l = (Long) rjVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (DynamicRange) k00.a.get(l);
        }
        return null;
    }

    public static Serializable k(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static SparseArray l(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static String m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean n(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void o(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static void p(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
