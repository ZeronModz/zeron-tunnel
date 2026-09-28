package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ga2 {
    public final zzg a;

    public ga2(zzg zzgVar) {
        this.a = zzgVar;
    }

    public final void a(int i, long j) {
        if (((Boolean) zzbd.zzc().a(p32.a1)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.a;
        if (j - zzgVar.zzF() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzbd.zzc().a(p32.b1)).booleanValue()) {
            zzgVar.zzE(i);
            zzgVar.zzG(j);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j);
        }
    }
}
