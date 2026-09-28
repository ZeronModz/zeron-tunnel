package defpackage;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdxz;
import java.util.EnumMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sv2 {
    public final zzdxz a;

    public sv2(zzdxz zzdxzVar) {
        this.a = zzdxzVar;
    }

    public final void a(int i, long j, uv2 uv2Var, String str) {
        i31 i31VarA = this.a.a();
        i31VarA.c("action", "start_preload");
        i31VarA.c("sp_ts", Long.toString(j));
        i31VarA.c("ad_format", uv2Var.a());
        i31VarA.c("ad_unit_id", uv2Var.a);
        i31VarA.c("pid", uv2Var.c);
        i31VarA.c("max_ads", Integer.toString(i));
        i31VarA.c("pv", str);
        i31VarA.d();
    }

    public final void b(EnumMap enumMap, long j) {
        i31 i31VarA = this.a.a();
        i31VarA.c("action", "start_preload");
        i31VarA.c("sp_ts", Long.toString(j));
        i31VarA.c("pv", "1");
        for (AdFormat adFormat : enumMap.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            i31VarA.c(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        i31VarA.d();
    }

    public final void c(int i, int i2, long j, Long l, String str, uv2 uv2Var, String str2) {
        i31 i31VarA = this.a.a();
        i31VarA.c("plaac_ts", Long.toString(j));
        i31VarA.c("max_ads", Integer.toString(i));
        i31VarA.c("cache_size", Integer.toString(i2));
        i31VarA.c("action", "is_ad_available");
        if (uv2Var != null) {
            i31VarA.c("ad_unit_id", uv2Var.a);
            i31VarA.c("pid", uv2Var.c);
            i31VarA.c("ad_format", uv2Var.a());
        }
        if (l != null) {
            i31VarA.c("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            i31VarA.c("gqi", str);
        }
        i31VarA.c("pv", str2);
        i31VarA.d();
    }

    public final void d(long j, int i, int i2, String str, uv2 uv2Var, String str2) {
        i31 i31VarA = this.a.a();
        i31VarA.c("ppla_ts", Long.toString(j));
        i31VarA.c("ad_format", uv2Var.a());
        i31VarA.c("ad_unit_id", uv2Var.a);
        i31VarA.c("pid", uv2Var.c);
        i31VarA.c("max_ads", Integer.toString(i));
        i31VarA.c("cache_size", Integer.toString(i2));
        i31VarA.c("action", "poll_ad");
        if (str != null) {
            i31VarA.c("gqi", str);
        }
        i31VarA.c("pv", str2);
        i31VarA.d();
    }

    public final void e(long j, uv2 uv2Var, zze zzeVar, int i, int i2, String str) {
        i31 i31VarA = this.a.a();
        i31VarA.c("action", "pftla");
        i31VarA.c("pftlat_ts", Long.toString(j));
        i31VarA.c("pftlaec", Integer.toString(zzeVar.zza));
        i31VarA.c("ad_format", uv2Var.a());
        i31VarA.c("max_ads", Integer.toString(i));
        i31VarA.c("cache_size", Integer.toString(i2));
        i31VarA.c("ad_unit_id", uv2Var.a);
        i31VarA.c("pid", uv2Var.c);
        i31VarA.c("pv", str);
        i31VarA.d();
    }

    public final void f(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3) {
        i31 i31VarA = this.a.a();
        i31VarA.c("action", str);
        i31VarA.c("pat", Long.toString(j));
        i31VarA.c("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        i31VarA.c("max_ads", Integer.toString(i));
        i31VarA.c("cache_size", Integer.toString(i2));
        i31VarA.c("pas", Integer.toString(i3));
        i31VarA.c("pv", "2");
        i31VarA.c("ad_unit_id", str3);
        i31VarA.c("pid", str2);
        i31VarA.d();
    }

    public final void g(String str, String str2, long j, int i, int i2, String str3, uv2 uv2Var, String str4) {
        i31 i31VarA = this.a.a();
        i31VarA.c(str2, Long.toString(j));
        if (uv2Var != null) {
            i31VarA.c("ad_unit_id", uv2Var.a);
            i31VarA.c("ad_format", uv2Var.a());
            i31VarA.c("pid", uv2Var.c);
        }
        i31VarA.c("action", str);
        if (str3 != null) {
            i31VarA.c("gqi", str3);
        }
        if (i >= 0) {
            i31VarA.c("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            i31VarA.c("cache_size", Integer.toString(i2));
        }
        i31VarA.c("pv", str4);
        i31VarA.d();
    }

    public final void h(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        i31 i31VarA = this.a.a();
        i31VarA.c("action", str);
        i31VarA.c("pat", Long.toString(j));
        i31VarA.c("pid", str2);
        i31VarA.c("ad_unit_id", str3);
        i31VarA.c("max_ads", Integer.toString(i));
        i31VarA.c("cache_size", Integer.toString(i2));
        i31VarA.c("tpcnt", Integer.toString(i4));
        i31VarA.c("mpl", Integer.toString(i5));
        if (adFormat != null) {
            i31VarA.c("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            i31VarA.c("nptr", Integer.toString(i3));
        }
        i31VarA.d();
    }
}
