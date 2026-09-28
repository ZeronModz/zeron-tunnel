package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.zzgdd;
import com.google.android.gms.internal.ads.zzgnb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q03 implements zzgnb, zzgdd {
    public static final String[] g = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final Context a;
    public final ExecutorService b;
    public long c = 0;
    public long d = 0;
    public long e = -1;
    public boolean f = false;

    public q03(Context context, ExecutorService executorService, String[] strArr) {
        this.a = context;
        this.b = executorService;
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f) {
                    this.d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void b() {
        u02 u02Var = new u02(this, 1);
        try {
            Object systemService = this.a.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(g, this.b, u02Var);
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final ListenableFuture zza() {
        if (Build.VERSION.SDK_INT < 30) {
            return u33.b;
        }
        l7 l7Var = new l7(Executors.callable(new pt2(this, 16), null));
        this.b.execute(l7Var);
        return l7Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        long j;
        long j2;
        a();
        synchronized (this) {
            try {
                j = this.f ? this.d - this.c : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.e;
            this.e = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        a();
    }
}
