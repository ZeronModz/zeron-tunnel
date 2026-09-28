package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzfxb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oz2 implements zzfxb {
    public final Context a;
    public final i03 b;
    public final String c;
    public final long d;
    public final long e;

    public oz2(Context context, k5 k5Var, i03 i03Var) {
        this.a = context;
        this.c = k5Var.zzb();
        this.d = k5Var.zzj();
        this.e = k5Var.F();
        this.b = i03Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(HashMap map) {
        ListenableFuture listenableFuture;
        b1 b1Var;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        map.put("v", this.c);
        map.put("t", new Throwable());
        try {
            listenableFuture = (ListenableFuture) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (listenableFuture == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture.isDone()) || (b1Var = (b1) listenableFuture.get(this.d, timeUnit)) == null || b1Var.zzb().length() <= 1) ? "E" : b1Var.zzb();
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.e, timeUnit);
                    if (!if3.W(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        HashMap mapA = this.b.a();
        a(mapA);
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        HashMap mapB = this.b.b(this.a, null);
        a(mapB);
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        HashMap mapC = this.b.c();
        a(mapC);
        return mapC;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
