package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbmp;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d02 extends p02 {
    public final /* synthetic */ View b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ zzaz e;

    public d02(zzaz zzazVar, View view, HashMap map, HashMap map2) {
        this.b = view;
        this.c = map;
        this.d = map2;
        this.e = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // defpackage.p02
    public final Object b() {
        View view = this.b;
        p32.a(view.getContext());
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fc)).booleanValue();
        zzaz zzazVar = this.e;
        HashMap map = this.d;
        HashMap map2 = this.c;
        if (zBooleanValue) {
            try {
                return zzblb.zze(((zzblf) zzs.zza(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", ed1.o)).zze(new a(view), new a(map2), new a(map)));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzazVar.zzu(z82.a(view.getContext()));
                zzazVar.zzt().zzh(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzbmp zzbmpVarZzs = zzazVar.zzs();
        zzbmpVarZzs.getClass();
        try {
            IBinder iBinderZze = ((zzblf) zzbmpVarZzs.getRemoteCreatorInstance(view.getContext())).zze(new a(view), new a(map2), new a(map));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzblc ? (zzblc) iInterfaceQueryLocalInterface : new h52(iBinderZze);
        } catch (RemoteException e2) {
            e = e2;
            zzo.zzj("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteCreator$RemoteCreatorException e3) {
            e = e3;
            zzo.zzj("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzk(new a(this.b), new a(this.c), new a(this.d));
    }
}
