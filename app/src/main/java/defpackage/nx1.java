package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbtt c;
    public final /* synthetic */ OnH5AdsEventListener d;

    public nx1(zzaz zzazVar, Context context, zzbtt zzbttVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.b = context;
        this.c = zzbttVar;
        this.d = onH5AdsEventListener;
    }

    @Override // defpackage.p02
    public final /* synthetic */ Object a() {
        return new zzbpr();
    }

    @Override // defpackage.p02
    public final Object b() {
        Context context = this.b;
        try {
            return ((zzbpn) zzs.zza(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", ed1.j)).zze(new a(context), this.c, ModuleDescriptor.MODULE_VERSION, new zzbpe(this.d));
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzp(new a(this.b), this.c, ModuleDescriptor.MODULE_VERSION, new zzbpe(this.d));
    }
}
