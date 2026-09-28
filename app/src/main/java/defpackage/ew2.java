package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzgzl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements zzdhc, zzgzl, zzgru {
    public static final ew2 b = new ew2();
    public Context a;

    public /* synthetic */ ew2(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        if (((Boolean) c42.h.g()).booleanValue() && (th instanceof zzaz)) {
            kf2.N(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo5zzb(Object obj) {
        if (((Boolean) c42.j.g()).booleanValue()) {
            kf2.N(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        ((zzdca) obj).zza(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        return new zzaaa(this.a);
    }
}
