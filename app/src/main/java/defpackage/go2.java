package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzefg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class go2 extends zzbzk {
    public final zzcen a;
    public final zzbzu b;

    public go2(zzcen zzcenVar, zzbzu zzbzuVar) {
        this.a = zzcenVar;
        this.b = zzbzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.a(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.b));
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(zzba zzbaVar) {
        this.a.b(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) {
        this.a.a(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzuVar));
    }
}
