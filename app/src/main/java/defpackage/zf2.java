package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdbz;
import com.google.android.gms.internal.ads.zzdxz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zf2 implements zzdbz {
    public final zzcjl a;
    public final zzdxz b;
    public final tt2 c;

    public zf2(zzcjl zzcjlVar, zzdxz zzdxzVar, tt2 tt2Var) {
        this.a = zzcjlVar;
        this.b = zzdxzVar;
        this.c = tt2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzcjl zzcjlVar;
        if (!((Boolean) zzbd.zzc().a(p32.se)).booleanValue() || (zzcjlVar = this.a) == null) {
            return;
        }
        String str = true != zzab.zza(zzcjlVar.zzE()) ? "0" : "1";
        i31 i31VarA = this.b.a();
        i31VarA.c("action", "hcp");
        i31VarA.c("hcp", str);
        i31VarA.b(this.c);
        i31VarA.d();
    }
}
