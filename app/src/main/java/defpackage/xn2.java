package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfjc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xn2 implements zzdel, zzdjy, zzdct {
    public final Context a;
    public final zzdxz b;

    public xn2(Context context, zzdxz zzdxzVar) {
        this.a = context;
        this.b = zzdxzVar;
    }

    public final void a(Context context) {
        if (((Boolean) zzbd.zzc().a(p32.z5)).booleanValue()) {
            g3.a.execute(new wn2(0, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(zzbj zzbjVar) {
        if (((Boolean) zzbd.zzc().a(p32.C5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        if (((Boolean) zzbd.zzc().a(p32.B5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        if (((Boolean) zzbd.zzc().a(p32.D5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
    }
}
