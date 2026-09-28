package com.android.volley.toolbox;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import java.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class HttpHeaderParser {
    public static Cache.Entry a(NetworkResponse networkResponse) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long jC;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = networkResponse.b;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jC2 = str != null ? c(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jC3 = str3 != null ? c(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jC = c(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jC = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j7 = (j2 * 1000) + j4;
            if (z) {
                j6 = j7;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j7;
            }
            j5 = j7;
        } else {
            j5 = (jC2 <= j || jC3 < jC2) ? j : (jC3 - jC2) + j4;
            j6 = j5;
        }
        Cache.Entry entry = new Cache.Entry();
        entry.a = networkResponse.a;
        entry.b = str5;
        entry.f = j5;
        entry.e = j6;
        entry.c = jC2;
        entry.d = jC;
        entry.g = map;
        entry.h = networkResponse.c;
        return entry;
    }

    public static String b(String str, Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long c(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || "-1".equals(str)) {
                VolleyLog.b("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            VolleyLog.a("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }
}
