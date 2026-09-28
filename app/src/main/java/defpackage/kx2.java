package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzgah;
import com.sandok.tunnel.core.Connection;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kx2 {
    public static final String h = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final mo2 f;
    public final jx2 g;

    public kx2(Context context, String str, String str2, String str3) {
        mo2 mo2Var = mo2.d;
        if (mo2Var == null) {
            mo2Var = new mo2(context);
            mo2.d = mo2Var;
        }
        this.f = mo2Var;
        this.g = jx2.d(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    public final zzgah a(boolean z, String str, String str2, long j) throws IOException {
        String str3 = this.b;
        mo2 mo2Var = this.f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(h)) {
                    String string = ((SharedPreferences) mo2Var.c).getString(str3, null);
                    String string2 = ((SharedPreferences) mo2Var.c).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgah();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            u7.p(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str4 = this.c;
        String str5 = this.d;
        long j2 = ((SharedPreferences) mo2Var.c).getLong(z2 ? str5 : str4, -1L);
        if (j2 != -1) {
            if (jCurrentTimeMillis < j2) {
                mo2Var.f(Long.valueOf(jCurrentTimeMillis), z2 ? str5 : str4);
            } else if (jCurrentTimeMillis >= j2 + j) {
                return b(str, str2);
            }
        }
        if (!z2) {
            str3 = this.a;
        }
        String string3 = ((SharedPreferences) mo2Var.c).getString(str3, null);
        if (string3 == null && !z) {
            return b(str, str2);
        }
        if (z2) {
            str4 = str5;
        }
        return new zzgah(string3, ((SharedPreferences) mo2Var.c).getLong(str4, -1L));
    }

    public final zzgah b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f.f(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z) throws IOException {
        String str = z ? this.d : this.c;
        mo2 mo2Var = this.f;
        mo2Var.l(str);
        mo2Var.l(z ? this.b : this.a);
    }

    public final zzgah d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            u7.p(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str2 = z ? this.d : this.c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        mo2 mo2Var = this.f;
        mo2Var.f(lValueOf, str2);
        mo2Var.f(str, z ? this.b : this.a);
        return new zzgah(str, jCurrentTimeMillis);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(vh.t(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder("not null".length() + str4.length() + Connection.CONNECTION_DEFAULT_TIMEOUT);
        hz.H(sb, this.e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        u7.k(sb, "not null");
        return null;
    }
}
