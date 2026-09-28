package defpackage;

import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzfrc;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qv2 extends zzbm {
    public final /* synthetic */ b43 a;
    public final /* synthetic */ zzbx b;
    public final /* synthetic */ zzfrc c;

    public qv2(zzfrc zzfrcVar, b43 b43Var, zzbx zzbxVar) {
        this.a = b43Var;
        this.b = zzbxVar;
        this.c = zzfrcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.c);
        this.a.c(this.b);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfrc zzfrcVar = this.c;
        String str = zzfrcVar.e.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        zzo.zzi(sb.toString());
        zzfrcVar.a(zzeVar);
    }
}
