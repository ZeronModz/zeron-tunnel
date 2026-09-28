package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbxv;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pv1 extends p02 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ zzaz c;

    public pv1(zzaz zzazVar, Activity activity) {
        this.b = activity;
        this.c = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "ad_overlay");
        return null;
    }

    @Override // defpackage.p02
    public final Object b() {
        Activity activity = this.b;
        p32.a(activity);
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fc)).booleanValue();
        zzaz zzazVar = this.c;
        if (zBooleanValue) {
            try {
                return zzbxr.zzI(((zzbxv) zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", ed1.c)).zze(new a(activity)));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzazVar.zzu(z82.a(activity.getApplicationContext()));
                zzazVar.zzt().zzh(e, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzbxp zzbxpVarZzr = zzazVar.zzr();
        zzbxpVarZzr.getClass();
        try {
            IBinder iBinderZze = ((zzbxv) zzbxpVarZzr.getRemoteCreatorInstance(activity)).zze(new a(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbxs ? (zzbxs) iInterfaceQueryLocalInterface : new p82(iBinderZze);
        } catch (RemoteException e2) {
            zzo.zzj("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e3) {
            zzo.zzj("Could not create remote AdOverlay.", e3);
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzg(new a(this.b));
    }
}
