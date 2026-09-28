package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzgpt;
import com.google.android.gms.internal.ads.zzgpv;
import com.google.android.gms.internal.ads.zzgqg;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e13 {
    public static final zzgqg c = new zzgqg("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final lp2 a;
    public final String b;

    public e13(Context context) {
        if (g13.a(context)) {
            this.a = new lp2(context.getApplicationContext(), c, d);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public static boolean b(String str) {
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return str.trim().isEmpty();
    }

    public static boolean c(zzgpt zzgptVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return true;
            }
        }
        c.c(str, new Object[0]);
        z03 z03Var = new z03();
        byte b = (byte) (z03Var.d | 1);
        z03Var.c = 0;
        z03Var.a = 8160;
        z03Var.d = (byte) (((byte) (b | 2)) | 1);
        zzgptVar.zza(z03Var.a());
        return false;
    }

    public final void a(zzgpv zzgpvVar, zzgpt zzgptVar, int i) {
        lp2 lp2Var = this.a;
        if (lp2Var == null) {
            c.c("error: %s", "Play Store not found.");
        } else if (c(zzgptVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgpvVar.a(), zzgpvVar.b()))) {
            lp2Var.a(new wn2(12, lp2Var, new kb2(this, zzgpvVar, i, zzgptVar)));
        }
    }
}
