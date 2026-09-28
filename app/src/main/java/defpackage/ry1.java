package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbtt d;
    public final /* synthetic */ zzaz e;

    public ry1(zzaz zzazVar, Context context, String str, zzbtt zzbttVar) {
        this.b = context;
        this.c = str;
        this.d = zzbttVar;
        this.e = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "native_ad");
        return new zzfi();
    }

    @Override // defpackage.p02
    public final Object b() {
        Context context = this.b;
        p32.a(context);
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fc)).booleanValue();
        zzaz zzazVar = this.e;
        zzbtt zzbttVar = this.d;
        String str = this.c;
        if (!zBooleanValue) {
            return zzazVar.zzo().zza(context, str, zzbttVar);
        }
        try {
            IBinder iBinderZze = ((zzbu) zzs.zza(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", ed1.k)).zze(new a(context), str, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbt ? (zzbt) iInterfaceQueryLocalInterface : new zzbr(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (zzr e2) {
            e = e2;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzd(new a(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
