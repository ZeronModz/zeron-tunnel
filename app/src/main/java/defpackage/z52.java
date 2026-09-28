package defpackage;

import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzgzl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z52 implements zzgzl, zzclh {
    public final /* synthetic */ zzcjl a;

    public /* synthetic */ z52(zzcjl zzcjlVar) {
        this.a = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclh
    public /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        zzcjl zzcjlVar = this.a;
        zzcjlVar.zzJ();
        zzcjlVar.zzP().zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo5zzb(Object obj) {
        String str = (String) obj;
        zzcjl zzcjlVar = this.a;
        new zzbt(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str, null, zzcjlVar.zzC() != null ? zzcjlVar.zzC().x0 : null).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzt.zzh().f("DefaultGmsgHandlers.attributionReportingManager", th);
    }
}
