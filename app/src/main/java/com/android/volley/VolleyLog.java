package com.android.volley;

import android.util.Log;
import defpackage.hz;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class VolleyLog {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = VolleyLog.class.getName();

    public static void a(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                hz.z(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".").append(stackTrace[i].getMethodName());
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        Thread.currentThread().getId();
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            a(str, objArr);
        }
    }
}
