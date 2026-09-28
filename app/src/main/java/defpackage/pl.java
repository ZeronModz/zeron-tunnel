package defpackage;

import androidx.constraintlayout.helper.widget.a;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftx;
import java.util.DesugarCollections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ pl(Runnable runnable, float f, int i) {
        this.a = i;
        this.c = runnable;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.b;
        Runnable runnable = this.c;
        switch (i) {
            case 0:
                ((a) runnable).a.r.z(1.0f, f, 5);
                break;
            default:
                zzftp zzftpVar = ((zzftd) ((pt2) runnable).b).g;
                zzftpVar.a = f;
                dw2 dw2Var = zzftpVar.c;
                if (dw2Var == null) {
                    dw2Var = dw2.c;
                    zzftpVar.c = dw2Var;
                }
                Iterator it = DesugarCollections.unmodifiableCollection(dw2Var.b).iterator();
                while (it.hasNext()) {
                    zzftx zzftxVar = ((zv2) it.next()).d;
                    i60.m.d(zzftxVar.c(), "setDeviceVolume", Float.valueOf(f), zzftxVar.a);
                }
                break;
        }
    }
}
