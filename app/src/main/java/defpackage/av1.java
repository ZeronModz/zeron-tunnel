package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzfq;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class av1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbtt d;

    public av1(zzaz zzazVar, Context context, String str, zzbtt zzbttVar) {
        this.b = context;
        this.c = str;
        this.d = zzbttVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "rewarded");
        return new zzfq();
    }

    @Override // defpackage.p02
    public final Object b() {
        String str = this.c;
        zzbtt zzbttVar = this.d;
        Context context = this.b;
        try {
            IBinder iBinderZze = ((z92) zzs.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", c22.e)).zze(new a(context), str, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzcaz ? (zzcaz) iInterfaceQueryLocalInterface : new x92(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (zzr e2) {
            e = e2;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzl(new a(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
