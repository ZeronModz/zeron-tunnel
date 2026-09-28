package defpackage;

import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzaru;
import com.google.android.gms.internal.ads.zzask;
import java.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy1 {
    public static zzarh a(zzaru zzaruVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long jB;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzaruVar.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jB2 = str != null ? b(str) : 0L;
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
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
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
        long jB3 = str3 != null ? b(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jB = b(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jB = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j7 = (j3 * 1000) + j4;
            if (z) {
                j6 = j7;
            } else {
                Long.signum(j2);
                j6 = (j2 * 1000) + j7;
            }
            j5 = j7;
        } else {
            j5 = (jB2 <= j || jB3 < jB2) ? j : (jB3 - jB2) + j4;
            j6 = j5;
        }
        zzarh zzarhVar = new zzarh();
        zzarhVar.a = zzaruVar.b;
        zzarhVar.b = str5;
        zzarhVar.f = j5;
        zzarhVar.e = j6;
        zzarhVar.c = jB2;
        zzarhVar.d = jB;
        zzarhVar.g = map;
        zzarhVar.h = zzaruVar.d;
        return zzarhVar;
    }

    public static long b(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzask.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzask.b("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }
}
