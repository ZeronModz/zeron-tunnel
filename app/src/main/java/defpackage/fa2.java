package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgck;
import com.google.android.gms.internal.ads.zzikg;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 implements zzikg {
    public final /* synthetic */ int a;
    public final te3 b;
    public final te3 c;

    public /* synthetic */ fa2(te3 te3Var, te3 te3Var2, int i) {
        this.a = i;
        this.b = te3Var;
        this.c = te3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        te3 te3Var = this.c;
        te3 te3Var2 = this.b;
        switch (i) {
            case 0:
                return new ea2((Context) te3Var2.a, (zzg) te3Var.a);
            case 1:
                ExecutorService executorService = (ExecutorService) te3Var2.a;
                k5 k5Var = (k5) te3Var.a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                hz.H(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new zzgck(executorService, sb.toString(), k5Var.G());
            case 2:
                return new m03((Context) te3Var2.a, (ExecutorService) te3Var.a);
            default:
                return new p03((Context) te3Var2.a, (ExecutorService) te3Var.a);
        }
    }
}
