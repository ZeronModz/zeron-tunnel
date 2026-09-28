package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgw;
import com.iphunt.sandoki.services.AutoTaskService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja(Object obj, boolean z, long j, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                AutoTaskService autoTaskService = (AutoTaskService) obj;
                Handler handler = autoTaskService.a;
                try {
                    z = autoTaskService.getSharedPreferences("airplane_mode_prefs", 0).getBoolean("control_mode_secure", false);
                    break;
                } catch (Throwable unused) {
                }
                if (z) {
                    try {
                        ii2.m(autoTaskService);
                        ii2.u(autoTaskService, true);
                        ii2.m(autoTaskService);
                        handler.postDelayed(new w2(this, 3), 2000L);
                        break;
                    } catch (Throwable unused2) {
                    }
                } else {
                    int i2 = AutoTaskService.c;
                    autoTaskService.a("timed_toggle");
                }
                handler.postDelayed(this, j);
                break;
            case 1:
                ((zzcgw) obj).c.zzu(z, j);
                break;
            default:
                ((zzcge) obj).zzu(z, j);
                break;
        }
    }
}
