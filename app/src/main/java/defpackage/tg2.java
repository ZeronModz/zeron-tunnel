package defpackage;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.internal.ads.zzcyj;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tg2 implements zza {
    public final zzcyj a;
    public final cu2 b;

    public tg2(zzcyj zzcyjVar, cu2 cu2Var) {
        this.a = zzcyjVar;
        this.b = cu2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        cu2 cu2Var = this.b;
        zzcyj zzcyjVar = this.a;
        String str = cu2Var.g;
        synchronized (zzcyjVar.a) {
            try {
                ConcurrentHashMap concurrentHashMap = zzcyjVar.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
