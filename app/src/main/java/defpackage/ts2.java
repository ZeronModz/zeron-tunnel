package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzfav;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 implements zzfav {
    public final int a;
    public final int b;

    public ts2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final void zza(Object obj) {
        int i;
        Bundle bundle = ((zzdah) obj).a;
        int i2 = this.a;
        if (i2 == -1 || (i = this.b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        int i3 = zzbb.zza;
        if (zzbd.zzc().j) {
            bundle.putBoolean("did_reset", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final void zzb(Object obj) {
    }
}
