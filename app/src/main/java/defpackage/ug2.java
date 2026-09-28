package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdha;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ug2 implements zzdha, zzdct {
    public final Clock a;
    public final zzcyj b;
    public final cu2 c;
    public final String d;

    public ug2(Clock clock, zzcyj zzcyjVar, cu2 cu2Var, String str) {
        this.a = clock;
        this.b = zzcyjVar;
        this.c = cu2Var;
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdha
    public final void zza() {
        this.b.c.put(this.d, Long.valueOf(this.a.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        long jElapsedRealtime = this.a.elapsedRealtime();
        String str = this.c.g;
        zzcyj zzcyjVar = this.b;
        ConcurrentHashMap concurrentHashMap = zzcyjVar.c;
        String str2 = this.d;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        zzcyjVar.d.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
    }
}
