package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzeeq;
import com.google.android.gms.internal.ads.zzefg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fo2 extends zzbzk {
    public final /* synthetic */ zzeeq a;

    public fo2(zzeeq zzeeqVar) {
        this.a = zzeeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzeeq zzeeqVar = this.a;
        zzeeqVar.a.a(new zzefg(autoCloseInputStream, zzeeqVar.e));
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(zzba zzbaVar) {
        this.a.a.b(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) {
        this.a.a.a(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzuVar));
    }
}
