package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzikg;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pc2 implements zzikg {
    public final /* synthetic */ int a;
    public final nc2 b;

    public /* synthetic */ pc2(nc2 nc2Var, int i) {
        this.a = i;
        this.b = nc2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        nc2 nc2Var = this.b;
        switch (i) {
            case 0:
                return new k3((Context) nc2Var.c, (VersionInfoParcel) nc2Var.b);
            case 1:
                Context context = (Context) nc2Var.c;
                k02.J(context);
                return context;
            case 2:
                WeakReference weakReference = (WeakReference) nc2Var.d;
                k02.J(weakReference);
                return weakReference;
            case 3:
                return new zzbjy((Context) nc2Var.c);
            case 4:
                return new zzk((Context) nc2Var.c, (VersionInfoParcel) nc2Var.b);
            case 5:
                String strZze = zzt.zzc().zze((Context) nc2Var.c, ((VersionInfoParcel) nc2Var.b).afmaVersion);
                k02.J(strZze);
                return strZze;
            default:
                return Long.valueOf(nc2Var.a);
        }
    }
}
