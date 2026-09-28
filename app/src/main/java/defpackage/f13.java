package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.play.core.appupdate.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f13 implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f13(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                ((zzgqg) lp2Var.d).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
                lp2Var.a(new qj2(16, this, iBinder));
                break;
            default:
                zzx zzxVar = (zzx) obj;
                zzxVar.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                zzxVar.a().post(new pk3(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.a;
        Object obj = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                ((zzgqg) lp2Var.d).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
                lp2Var.a(new pt2(this, 17));
                break;
            default:
                zzx zzxVar = (zzx) obj;
                zzxVar.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                zzxVar.a().post(new yj3(this, i2));
                break;
        }
    }
}
