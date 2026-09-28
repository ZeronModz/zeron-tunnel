package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
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
public final class m03 implements zzgnb, zzgdd {
    public final Context a;
    public final ExecutorService b;
    public NetworkCapabilities c = null;

    public m03(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    public final /* synthetic */ void a() {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        jt0 jt0Var = new jt0(this, 5);
        try {
            Object systemService = this.a.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(jt0Var);
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final ListenableFuture zza() {
        if (Build.VERSION.SDK_INT < 24) {
            return u33.b;
        }
        l7 l7Var = new l7(Executors.callable(new pt2(this, 15), null));
        this.b.execute(l7Var);
        return l7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.util.Map r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "ntc"
            r3.put(r1, r0)
            monitor-enter(r2)
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            r1 = 4
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 2
            goto L38
        L19:
            r3 = move-exception
            goto L42
        L1b:
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L19
            r1 = 1
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 1
            goto L38
        L28:
            android.net.NetworkCapabilities r0 = r2.c     // Catch: java.lang.Throwable -> L19
            r1 = 0
            boolean r0 = r0.hasTransport(r1)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = 0
            goto L38
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0 = -1
        L38:
            java.lang.String r2 = "nt"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            return
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        L44:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m03.zzb(java.util.Map):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
    }
}
