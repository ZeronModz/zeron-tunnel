package defpackage;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.eb;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzicg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lc2 {
    public String a;
    public eb b;
    public qc c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public lc2(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strC = vp1.b(Features.GET_VARIATIONS_HEADER) ? sp1.c() : null;
            if (strC != null && !strC.isEmpty()) {
                this.a = strC;
                byte[] bArrDecode = Base64.decode(strC, 10);
                this.b = eb.v(bArrDecode, gd3.a());
                if (((Boolean) zzbd.zzc().a(p32.ka)).booleanValue()) {
                    this.c = qc.v(bArrDecode, gd3.a());
                }
                if (((Boolean) zzbd.zzc().a(p32.ia)).booleanValue()) {
                    if (((Boolean) zzbd.zzc().a(p32.ha)).booleanValue()) {
                        this.d.schedule(new kc2(this, 0), ((Integer) zzbd.zzc().a(p32.ja)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzicg | IllegalArgumentException e) {
            zzt.zzh().g(e, "ChromeVariations");
        }
    }
}
