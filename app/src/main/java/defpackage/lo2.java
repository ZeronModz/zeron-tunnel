package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzegw;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzika;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lo2 {
    public final Context a;
    public final zzgzy b;
    public final zzgzy c;
    public final zzika d;
    public final VersionInfoParcel e;
    public final tj1 f;
    public final zzdxz g;

    public lo2(Context context, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzika zzikaVar, VersionInfoParcel versionInfoParcel, tj1 tj1Var, zzdxz zzdxzVar) {
        this.a = context;
        this.b = zzgzyVar;
        this.c = zzgzyVar2;
        this.d = zzikaVar;
        this.e = versionInfoParcel;
        this.f = tj1Var;
        this.g = zzdxzVar;
    }

    public final void a() {
        try {
            ((zzegw) this.d.zzb()).zzi(this.e.afmaVersion);
            if (((Boolean) zzbd.zzc().a(p32.Cf)).booleanValue()) {
                i31 i31VarA = this.g.a();
                i31VarA.c("action", "ptard");
                i31VarA.c("ptard", "l");
                i31VarA.d();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) zzbd.zzc().a(p32.Df)).booleanValue()) {
                zzt.zzh().f("Preconnect Local", e);
            }
        }
    }
}
