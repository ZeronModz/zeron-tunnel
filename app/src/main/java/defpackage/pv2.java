package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzfqz;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pv2 extends zzbez {
    public final /* synthetic */ b43 a;
    public final /* synthetic */ zzft b;
    public final /* synthetic */ zzfqz c;

    public pv2(zzfqz zzfqzVar, b43 b43Var, zzft zzftVar) {
        this.a = b43Var;
        this.b = zzftVar;
        this.c = zzfqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) {
        Objects.requireNonNull(this.c);
        this.a.c(zzbexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        String str = this.b.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        zzo.zzi(sb.toString());
        zzfqz zzfqzVar = this.c;
        Objects.requireNonNull(zzfqzVar);
        zzfqzVar.a(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i) {
    }
}
