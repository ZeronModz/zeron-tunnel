package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdbv;
import com.google.android.gms.internal.ads.zzdir;
import com.google.android.gms.internal.ads.zzdiv;
import com.google.android.gms.internal.ads.zzfoe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yu2 implements zzdir, zzdbv, zzdiv {
    public final bv2 a;
    public final zzfoe b;

    public yu2(Context context, bv2 bv2Var) {
        this.a = bv2Var;
        this.b = ec1.X(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final void zza() {
        if (((Boolean) d42.d.g()).booleanValue()) {
            zzfoe zzfoeVar = this.b;
            zzfoeVar.zzd(true);
            this.a.a(zzfoeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzh() {
        if (((Boolean) d42.d.g()).booleanValue()) {
            this.b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(zze zzeVar) {
        if (((Boolean) d42.d.g()).booleanValue()) {
            String string = zzeVar.zza().toString();
            zzfoe zzfoeVar = this.b;
            zzfoeVar.zzk(string);
            zzfoeVar.zzd(false);
            this.a.a(zzfoeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiv
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzg() {
    }
}
