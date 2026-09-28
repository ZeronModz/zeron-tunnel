package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzfav;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ns2 implements zzfav {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public ns2(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).a;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzbd.zzc().a(p32.D4));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) zzbd.zzc().a(p32.S6)).booleanValue()) {
            String str = this.h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleM = n8.M("sdk_env", bundle);
        bundleM.putBoolean("mf", ((Boolean) k42.g.g()).booleanValue());
        bundleM.putBoolean("instant_app", this.a);
        bundleM.putBoolean("lite", this.b);
        bundleM.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", bundleM);
        Bundle bundleM2 = n8.M("build_meta", bundleM);
        bundleM2.putString("cl", "839961582");
        bundleM2.putString("rapid_rc", "dev");
        bundleM2.putString("rapid_rollup", "HEAD");
        bundleM.putBundle("build_meta", bundleM2);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).b;
        bundle.putString("js", this.c);
        bundle.putInt("target_api", this.e);
    }
}
