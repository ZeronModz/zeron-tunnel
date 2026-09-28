package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzfsf;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xv2 extends zzcbf {
    public final /* synthetic */ b43 a;
    public final /* synthetic */ zzcaz b;
    public final /* synthetic */ zzfsf c;

    public xv2(zzfsf zzfsfVar, b43 b43Var, zzcaz zzcazVar) {
        this.a = b43Var;
        this.b = zzcazVar;
        this.c = zzfsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        Objects.requireNonNull(this.c);
        this.a.c(this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfsf zzfsfVar = this.c;
        String str = zzfsfVar.e.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        zzo.zzi(sb.toString());
        zzfsfVar.a(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i) {
    }
}
