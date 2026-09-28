package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbsl b;
    public final /* synthetic */ zzbsk c;
    public final /* synthetic */ zzbro d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ long f;

    public /* synthetic */ c72(zzbsl zzbslVar, zzbsk zzbskVar, zzbro zzbroVar, ArrayList arrayList, long j, int i) {
        this.a = i;
        this.c = zzbskVar;
        this.d = zzbroVar;
        this.e = arrayList;
        this.f = j;
        this.b = zzbslVar;
    }

    private final void a() {
        String string;
        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbsl zzbslVar = this.b;
        synchronized (zzbslVar.a) {
            try {
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbsk zzbskVar = this.c;
                if (zzbskVar.b.get() != -1 && zzbskVar.b.get() != 1) {
                    if (((Boolean) zzbd.zzc().a(p32.K8)).booleanValue()) {
                        zzbskVar.c(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbskVar.b();
                    }
                    g3.f.execute(new b72(this.d, 0));
                    String strValueOf = String.valueOf(zzbd.zzc().a(p32.e));
                    int i = zzbskVar.b.get();
                    int i2 = zzbslVar.i;
                    ArrayList arrayList = this.e;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb = new StringBuilder(strValueOf2.length() + 88);
                        sb.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb.append(strValueOf2);
                        string = sb.toString();
                    }
                    long jCurrentTimeMillis = zzt.zzk().currentTimeMillis() - this.f;
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i2).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb2.append("Could not finish the full JS engine loading in ");
                    sb2.append(strValueOf);
                    sb2.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb2.append(i);
                    sb2.append(". Update status(fullLoadTimeout) is ");
                    sb2.append(i2);
                    sb2.append(string);
                    sb2.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ms at timeout. Rejecting.");
                    zze.zza(sb2.toString());
                    zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                zzbsl zzbslVar = this.b;
                zzbsk zzbskVar = this.c;
                zzbro zzbroVar = this.d;
                ArrayList arrayList = this.e;
                long j = this.f;
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (zzbslVar.a) {
                    try {
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (zzbskVar.b.get() != -1 && zzbskVar.b.get() != 1) {
                            if (((Boolean) zzbd.zzc().a(p32.K8)).booleanValue()) {
                                zzbskVar.c(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                            } else {
                                zzbskVar.b();
                            }
                            g3.f.execute(new b72(zzbroVar, 1));
                            String strValueOf = String.valueOf(zzbd.zzc().a(p32.d));
                            int i = zzbskVar.b.get();
                            int i2 = zzbslVar.i;
                            String strValueOf2 = String.valueOf(arrayList.get(0));
                            long jCurrentTimeMillis = zzt.zzk().currentTimeMillis() - j;
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 94 + String.valueOf(i).length() + 39 + String.valueOf(i2).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                            sb.append("Could not receive /jsLoaded in ");
                            sb.append(strValueOf);
                            sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb.append(i);
                            sb.append(". Update status(onEngLoadedTimeout) is ");
                            sb.append(i2);
                            sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb.append(strValueOf2);
                            sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb.append(jCurrentTimeMillis);
                            sb.append(" ms. Rejecting.");
                            zze.zza(sb.toString());
                            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
