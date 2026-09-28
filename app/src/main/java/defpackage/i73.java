package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i73 {
    public static final i73 b = new i73();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, zzhbp zzhbpVar) {
        try {
            HashMap map = this.a;
            if (!map.containsKey(str)) {
                map.put(str, zzhbpVar);
                return;
            }
            if (((zzhbp) map.get(str)).equals(zzhbpVar)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(zzhbpVar);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (zzhbp) entry.getValue());
        }
    }
}
