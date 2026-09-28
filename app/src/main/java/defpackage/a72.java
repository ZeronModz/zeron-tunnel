package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a72 implements zzboh {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzbsk b;
    public final /* synthetic */ zzbro c;
    public final /* synthetic */ zzbsl d;

    public a72(zzbsl zzbslVar, long j, zzbsk zzbskVar, zzbro zzbroVar) {
        this.a = j;
        this.b = zzbskVar;
        this.c = zzbroVar;
        this.d = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        long jCurrentTimeMillis = zzt.zzk().currentTimeMillis() - this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        zze.zza(sb.toString());
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbsl zzbslVar = this.d;
        synchronized (zzbslVar.a) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbsk zzbskVar = this.b;
            if (zzbskVar.b.get() != -1 && zzbskVar.b.get() != 1) {
                zzbslVar.i = 0;
                zzbro zzbroVar = this.c;
                zzbroVar.zzm("/log", f62.c);
                zzbroVar.zzm("/result", f62.j);
                zzbskVar.a.a(zzbroVar);
                zzbslVar.h = zzbskVar;
                zze.zza("Successfully loaded JS Engine.");
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
