package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcjw;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vn2 {
    public final Context a;
    public final VersionInfoParcel b;
    public final ta2 c;
    public final AtomicReference d = new AtomicReference(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);

    public vn2(Context context, VersionInfoParcel versionInfoParcel, ta2 ta2Var) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = ta2Var;
    }

    public static final String c(String str) {
        return zzs.zzl(new String(Base64.decode(str, 0)), new String(Base64.decode((String) zzbd.zzc().a(p32.Of), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        if (((Boolean) zzbd.zzc().a(p32.Kf)).booleanValue()) {
            if (!((String) zzbd.zzc().a(p32.Mf)).isEmpty()) {
                if (!((String) zzbd.zzc().a(p32.Nf)).isEmpty()) {
                    if (!((String) zzbd.zzc().a(p32.Of)).isEmpty()) {
                        String str = (String) this.d.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.c.execute(new kc2(this, 14));
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final String b() {
        String name;
        VersionInfoParcel versionInfoParcel = this.b;
        String strC = null;
        if (versionInfoParcel.isClientJar) {
            name = zzcjw.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) zzbd.zzc().a(p32.Mf))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) zzbd.zzc().a(p32.Lf)).booleanValue()) {
                    zzt.zzh().f("SdkIE", e);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) zzbd.zzc().a(p32.Nf));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) zzbd.zzc().a(p32.Lf)).booleanValue()) {
                zzt.zzh().f("SdkIE", e2);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
