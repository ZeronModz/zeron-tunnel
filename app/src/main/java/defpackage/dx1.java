package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbtt c;

    public dx1(zzaz zzazVar, Context context, zzbtt zzbttVar) {
        this.b = context;
        this.c = zzbttVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.p02
    public final Object b() {
        Context context = this.b;
        try {
            return ((zzbxo) zzs.zza(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", ed1.h)).zze(new a(context), this.c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzo(new a(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
