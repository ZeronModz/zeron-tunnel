package defpackage;

import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nt2 extends zzbp {
    public final /* synthetic */ zzfi a;

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(zzm zzmVar) {
        zzi(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final boolean zzg() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzm zzmVar, int i) {
        zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.zza.post(new kc2(this, 28));
    }
}
