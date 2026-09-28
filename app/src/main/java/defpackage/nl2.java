package defpackage;

import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.internal.ads.i5;
import com.google.android.gms.internal.ads.zzdxz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 {
    public final zzdxz a;

    public nl2(zzdxz zzdxzVar) {
        this.a = zzdxzVar;
    }

    public final boolean a(i5 i5Var) {
        boolean zE = i5Var.E();
        zzdxz zzdxzVar = this.a;
        if (zE) {
            i31 i31VarA = zzdxzVar.a();
            i31VarA.c("action", "aq_ad_closed");
            i31VarA.c("gqi", i5Var.y());
            i31VarA.c("aq_ad_duration", String.valueOf(i5Var.zzb()));
            i31VarA.c("aq_ad_bounce_cnt", String.valueOf(i5Var.z()));
            i31VarA.c("aq_time_away", String.valueOf(i5Var.B()));
            return i31VarA.e().equals(zzt.SUCCESS);
        }
        i31 i31VarA2 = zzdxzVar.a();
        i31VarA2.c("action", "aq_ad_kill");
        i31VarA2.c("gqi", i5Var.y());
        i31VarA2.c("aq_ad_duration", String.valueOf(i5Var.zzb()));
        i31VarA2.c("aq_ad_bounce_cnt", String.valueOf(i5Var.z()));
        i31VarA2.c("aq_time_away", String.valueOf(i5Var.B()));
        i31VarA2.c("aq_is_os_kill", String.valueOf(i5Var.zze()));
        return i31VarA2.e().equals(zzt.SUCCESS);
    }
}
