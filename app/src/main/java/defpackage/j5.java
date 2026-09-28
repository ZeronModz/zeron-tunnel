package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.Notification;
import android.app.Person;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.webkit.TracingController;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.Person$Builder;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j5 {
    public static String a = "";
    public static String b;
    public static int c;
    public static Boolean d;

    public static boolean A(Handler handler, wk wkVar, long j) {
        return handler.postDelayed(wkVar, "retry_token", j);
    }

    public static void B(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void C(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static boolean D(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Person E(mw0 mw0Var) {
        Person.Builder name = new Person.Builder().setName(mw0Var.a);
        IconCompat iconCompat = mw0Var.b;
        Icon iconZ = null;
        if (iconCompat != null) {
            iconCompat.getClass();
            iconZ = kf2.z(iconCompat, null);
        }
        return name.setIcon(iconZ).setUri(mw0Var.c).setKey(mw0Var.d).setBot(mw0Var.e).setImportant(mw0Var.f).build();
    }

    public static boolean F() {
        Boolean boolValueOf = d;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new zzy(n8.N("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler d(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static DisplayCutout e(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    public static mw0 f(Person person) {
        IconCompat iconCompatE;
        Person$Builder person$Builder = new Person$Builder();
        person$Builder.a = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatE = kf2.e(icon);
        } else {
            iconCompatE = null;
        }
        person$Builder.b = iconCompatE;
        person$Builder.c = person.getUri();
        person$Builder.d = person.getKey();
        person$Builder.e = person.isBot();
        person$Builder.f = person.isImportant();
        return person$Builder.a();
    }

    public static String g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object objInvoke;
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        int i = Build.VERSION.SDK_INT;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String processName = i >= 28 ? Application.getProcessName() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        a = processName;
        if (!TextUtils.isEmpty(processName)) {
            return a;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            objInvoke = declaredMethod.invoke(null, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str2 = objInvoke instanceof String ? (String) objInvoke : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        a = str2;
        if (!TextUtils.isEmpty(str2)) {
            return a;
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    str = next.processName;
                    break;
                }
            }
        }
        a = str;
        return str;
    }

    public static String[] h(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor i(Context context) {
        return context.getMainExecutor();
    }

    public static String j() throws Throwable {
        BufferedReader bufferedReader;
        String str = b;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            b = processName;
            return processName;
        }
        int iMyPid = c;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            c = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        if (iMyPid > 0) {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                sb.append("/proc/");
                sb.append(iMyPid);
                sb.append("/cmdline");
                String string = sb.toString();
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new FileReader(string));
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            } catch (IOException unused) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                String line = bufferedReader.readLine();
                yg0.m(line);
                strTrim = line.trim();
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                mc2.i(bufferedReader2);
                throw th;
            }
            mc2.i(bufferedReader);
        }
        b = strTrim;
        return strTrim;
    }

    public static Network k(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static String l() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int m(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String n(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int r(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int s(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static int t(Notification.Action action) {
        return action.getSemanticAction();
    }

    public static PrecomputedText.Params u(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static void v() {
        TracingController.getInstance();
    }

    public static int w(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri x(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader y() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper z(WebView webView) {
        return webView.getWebViewLooper();
    }
}
