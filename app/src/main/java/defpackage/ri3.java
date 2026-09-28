package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.o;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ri3 extends hi3 {
    public static final boolean d(String str) {
        String str2 = (String) l.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (java.lang.Math.abs(r5.hashCode() % 100) < r7.C().n()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pi3 b(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri3.b(java.lang.String):pi3");
    }

    public final String c(String str) {
        o oVar = this.b.a;
        g0.P(oVar);
        String strN = oVar.n(str);
        if (TextUtils.isEmpty(strN)) {
            return (String) l.r.a(null);
        }
        Uri uri = Uri.parse((String) l.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strN).length() + 1 + String.valueOf(authority).length());
        sb.append(strN);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
