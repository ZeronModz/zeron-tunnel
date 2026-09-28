package defpackage;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzdjm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i62 implements zzaa {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zza c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ Map e;

    public i62(zzbou zzbouVar, boolean z, zza zzaVar, HashMap map, Map map2) {
        this.b = z;
        this.c = zzaVar;
        this.d = map;
        this.e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        zza zzaVar = this.c;
        if (z && this.b) {
            ((zzdjm) zzaVar).zzdu();
        }
        this.a = true;
        String str = (String) this.e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.d;
        map.put(str, boolValueOf);
        ((zzbrd) zzaVar).zze("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }
}
