package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbtt c;
    public final /* synthetic */ zzaz d;

    public wy1(zzaz zzazVar, Context context, zzbtt zzbttVar) {
        this.b = context;
        this.c = zzbttVar;
        this.d = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "ads_preloader");
        return null;
    }

    @Override // defpackage.p02
    public final Object b() {
        zzck zzciVar;
        Context context = this.b;
        a aVar = new a(context);
        p32.a(context);
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fc)).booleanValue();
        zzaz zzazVar = this.d;
        zzbtt zzbttVar = this.c;
        if (!zBooleanValue) {
            return zzazVar.zzv().zza(context, zzbttVar);
        }
        try {
            IBinder iBinderZze = ((zzcl) zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", ed1.l)).zze(aVar, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                zzciVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzciVar = iInterfaceQueryLocalInterface instanceof zzck ? (zzck) iInterfaceQueryLocalInterface : new zzci(iBinderZze);
            }
            zzciVar.zzl(zzbttVar);
            return zzciVar;
        } catch (RemoteException e) {
            e = e;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (zzr e2) {
            e = e2;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzh(new a(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
