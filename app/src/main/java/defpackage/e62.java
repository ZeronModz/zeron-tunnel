package defpackage;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e62 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e62(ve2 ve2Var, String str, int i) {
        this.a = i;
        this.b = ve2Var;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        int i = this.a;
        String str = this.c;
        ve2 ve2Var = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                y52 y52Var = f62.a;
                return (((Boolean) zzbd.zzc().a(p32.yb)).booleanValue() && ve2Var != null && ve2.b(str)) ? ve2Var.a(str2, zzbb.zzh()) : z.j(str2);
            default:
                ve2Var.e.zza(new db0(26, ve2Var, (Throwable) obj));
                return z.j(str);
        }
    }
}
