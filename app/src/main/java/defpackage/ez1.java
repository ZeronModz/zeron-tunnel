package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzfm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ez1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzaz c;

    public ez1(zzaz zzazVar, Context context) {
        this.b = context;
        Objects.requireNonNull(zzazVar);
        this.c = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // defpackage.p02
    public final Object b() {
        Context context = this.b;
        p32.a(context);
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fc)).booleanValue();
        zzaz zzazVar = this.c;
        if (!zBooleanValue) {
            return zzazVar.zzp().zza(context);
        }
        try {
            IBinder iBinderZze = ((zzdc) zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", ed1.m)).zze(new a(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface : new zzcz(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (zzr e2) {
            e = e2;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzazVar.zzu(z82.a(context));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzi(new a(this.b), ModuleDescriptor.MODULE_VERSION);
    }
}
