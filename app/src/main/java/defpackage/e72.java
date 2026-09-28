package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.measurement.internal.g0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e72 implements zzbrf {
    public ArrayList a;
    public long b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e72(zzbsl zzbslVar, ArrayList arrayList, long j, zzbsk zzbskVar, zzbro zzbroVar) {
        this.c = zzbslVar;
        this.a = arrayList;
        this.b = j;
        this.d = zzbskVar;
        this.e = zzbroVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(long r11, com.google.android.gms.internal.measurement.a0 r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e72.a(long, com.google.android.gms.internal.measurement.a0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public /* synthetic */ void zza() {
        long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
        long j = this.b;
        ArrayList arrayList = this.a;
        arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
        String strValueOf = String.valueOf(arrayList.get(0));
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
        sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
        sb.append(strValueOf);
        sb.append(" ms.");
        zze.zza(sb.toString());
        zzs.zza.postDelayed(new c72((zzbsl) this.c, (zzbsk) this.d, (zzbro) this.e, arrayList, j, 1), ((Integer) zzbd.zzc().a(p32.d)).intValue());
    }

    public /* synthetic */ e72(g0 g0Var) {
        this.e = g0Var;
    }
}
