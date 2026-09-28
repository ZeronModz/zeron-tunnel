package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzghb;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class az2 extends zzghb {
    public final Map f;
    public final Context g;
    public final zzgcc h;
    public final long i;
    public final long j;

    public az2(vz1 vz1Var, zzgfx zzgfxVar, Map map, Context context, zzgcc zzgccVar, k5 k5Var, f6 f6Var) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", vz1Var, zzgfxVar, f6Var.a(113));
        this.g = context;
        this.f = map;
        this.h = zzgccVar;
        this.i = k5Var.zzj();
        this.j = k5Var.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghb
    public final void a(Method method, vz1 vz1Var) {
        b1 b1Var;
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.f.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (b1Var = (b1) listenableFuture.get(this.i, TimeUnit.MILLISECONDS)) != null && b1Var.zzb().length() > 1)) {
                strZzb = b1Var.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!if3.W(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (vz1Var) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                vz1Var.d();
                ((b1) vz1Var.b).A(jLongValue);
                String str2 = (String) objArr[1];
                vz1Var.d();
                ((b1) vz1Var.b).z(str2);
                String str3 = (String) objArr[2];
                vz1Var.d();
                ((b1) vz1Var.b).J(str3);
                String str4 = (String) objArr[3];
                vz1Var.d();
                ((b1) vz1Var.b).K(str4);
                n23 n23VarF = n23.f.f();
                byte[] bArr = (byte[]) objArr[4];
                String strG = n23VarF.g(bArr.length, bArr);
                vz1Var.d();
                ((b1) vz1Var.b).v(strG);
                vz1Var.d();
                ((b1) vz1Var.b).K0(strZzb);
                if (bool != null) {
                    int i = true != bool.booleanValue() ? 1 : 2;
                    vz1Var.d();
                    ((b1) vz1Var.b).n0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
