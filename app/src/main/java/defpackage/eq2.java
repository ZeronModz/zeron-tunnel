package defpackage;

import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.Objects;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class eq2 implements zzgzl {
    public final /* synthetic */ long a;
    public final /* synthetic */ ut2 b;
    public final /* synthetic */ tt2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzfqg e;
    public final /* synthetic */ zzfjc f;
    public final /* synthetic */ zzenr g;

    public eq2(zzenr zzenrVar, long j, ut2 ut2Var, tt2 tt2Var, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.a = j;
        this.b = ut2Var;
        this.c = tt2Var;
        this.d = str;
        this.e = zzfqgVar;
        this.f = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.g = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq2.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public final void mo5zzb(Object obj) {
        long j;
        zzenr zzenrVar = this.g;
        long jElapsedRealtime = zzenrVar.a.elapsedRealtime() - this.a;
        synchronized (zzenrVar) {
            try {
                if (zzenrVar.e) {
                    zzenrVar.b.a(this.b, this.c, 0, null, jElapsedRealtime);
                    j = jElapsedRealtime;
                } else {
                    j = jElapsedRealtime;
                }
                if (zzenrVar.g) {
                    return;
                }
                tt2 tt2Var = this.c;
                boolean zH = zzenrVar.h(tt2Var);
                LinkedHashMap linkedHashMap = zzenrVar.d;
                if (zH) {
                    ((fq2) linkedHashMap.get(tt2Var)).d = j;
                } else {
                    linkedHashMap.put(tt2Var, new fq2(this.d, tt2Var.f0, 0, j, null));
                }
                zzenrVar.f.c(tt2Var, j, null, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
