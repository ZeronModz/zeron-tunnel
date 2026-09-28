package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzfn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzbmo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 extends p02 {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zzaz e;

    public tz1(zzaz zzazVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
        this.e = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.d, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override // defpackage.p02
    public final Object b() {
        Context context = this.d;
        p32.a(context);
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fc)).booleanValue();
        zzaz zzazVar = this.e;
        FrameLayout frameLayout = this.c;
        FrameLayout frameLayout2 = this.b;
        if (zBooleanValue) {
            try {
                return zzbkv.zzdF(((zzbkz) zzs.zza(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", ed1.n)).zze(new a(context), new a(frameLayout2), new a(frameLayout), ModuleDescriptor.MODULE_VERSION));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzazVar.zzu(z82.a(context));
                zzazVar.zzt().zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzbmo zzbmoVarZzq = zzazVar.zzq();
        zzbmoVarZzq.getClass();
        try {
            IBinder iBinderZze = ((zzbkz) zzbmoVarZzq.getRemoteCreatorInstance(context)).zze(new a(context), new a(frameLayout2), new a(frameLayout), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbkw ? (zzbkw) iInterfaceQueryLocalInterface : new d52(iBinderZze);
        } catch (RemoteException e2) {
            e = e2;
            zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e3) {
            e = e3;
            zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zze(new a(this.b), new a(this.c));
    }
}
