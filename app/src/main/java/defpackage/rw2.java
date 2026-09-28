package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfxg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rw2 {
    public final zzfxg a;
    public final boolean b = true;

    public rw2(zzfxg zzfxgVar) {
        this.a = zzfxgVar;
    }

    public static rw2 a(Context context, String str) {
        zzfxg sw2Var;
        try {
            try {
                try {
                    IBinder iBinderB = a.c(context, a.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        sw2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        sw2Var = iInterfaceQueryLocalInterface instanceof zzfxg ? (zzfxg) iInterfaceQueryLocalInterface : new sw2(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    sw2Var.zzj(new com.google.android.gms.dynamic.a(context), str, null);
                    return new rw2(sw2Var);
                } catch (RemoteException | zzfwg | NullPointerException | SecurityException unused) {
                    return new rw2(new tw2());
                }
            } catch (Exception e) {
                throw new zzfwg(e);
            }
        } catch (Exception e2) {
            throw new zzfwg(e2);
        }
    }
}
