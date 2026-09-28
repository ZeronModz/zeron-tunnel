package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdye;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i31 b;

    public /* synthetic */ em2(i31 i31Var, int i) {
        this.a = i;
        this.b = i31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        i31 i31Var = this.b;
        switch (i) {
            case 0:
                zzdye zzdyeVar = ((zzdxz) i31Var.c).a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i31Var.b;
                zzdyeVar.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    zzdyeVar.b(concurrentHashMap);
                    String strGenerateUrl = zzdyeVar.f.generateUrl(concurrentHashMap);
                    zze.zza(strGenerateUrl);
                    if (((Boolean) zzbd.zzc().a(p32.Fe)).booleanValue() || zzdyeVar.e) {
                        zzdyeVar.c.execute(new s33(28, zzdyeVar, strGenerateUrl));
                    }
                } else {
                    zzo.zzd("Empty paramMap.");
                }
                break;
            case 1:
                ((zzdxz) i31Var.c).a.a((ConcurrentHashMap) i31Var.b, true);
                break;
            default:
                ((zzdxz) i31Var.c).a.a((ConcurrentHashMap) i31Var.b, false);
                break;
        }
    }
}
