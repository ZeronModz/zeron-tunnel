package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzf;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pk3 extends zzn {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ f13 c;

    public pk3(f13 f13Var, IBinder iBinder) {
        this.c = f13Var;
        this.b = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void a() {
        zzf jh2Var;
        zzx zzxVar = (zzx) this.c.b;
        int i = rm2.b;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            jh2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            jh2Var = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new jh2(iBinder);
        }
        zzxVar.m = jh2Var;
        zzm zzmVar = zzxVar.b;
        zzmVar.c("linkToDeath", new Object[0]);
        try {
            zzxVar.m.asBinder().linkToDeath(zzxVar.j, 0);
        } catch (RemoteException e) {
            zzmVar.b(e, "linkToDeath failed", new Object[0]);
        }
        zzxVar.g = false;
        Iterator it = zzxVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzxVar.d.clear();
    }
}
