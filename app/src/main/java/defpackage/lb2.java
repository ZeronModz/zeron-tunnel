package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfba;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lb2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lb2(zzfba zzfbaVar, long j, zzfax zzfaxVar, Bundle bundle) {
        this.c = zzfbaVar;
        this.b = j;
        this.d = zzfaxVar;
        this.e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.c);
                map.put("cachedSrc", (String) this.d);
                map.put("totalDuration", Long.toString(this.b));
                ((zzchr) this.e).j(map);
                return;
            default:
                zzfba zzfbaVar = (zzfba) this.c;
                long j = this.b;
                zzfax zzfaxVar = (zzfax) this.d;
                Bundle bundle = (Bundle) this.e;
                long jElapsedRealtime = zzt.zzk().elapsedRealtime() - j;
                if (((Boolean) m42.a.g()).booleanValue()) {
                    String canonicalName = zzfaxVar.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    vh.A(sb, "Signal runtime (ms) : ", canonicalName, " = ");
                    sb.append(jElapsedRealtime);
                    zze.zza(sb.toString());
                }
                if (((Boolean) zzbd.zzc().a(p32.K2)).booleanValue()) {
                    if (((Boolean) zzbd.zzc().a(p32.Q2)).booleanValue()) {
                        synchronized (zzfbaVar) {
                            int iZzb = zzfaxVar.zzb();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                            sb2.append("sig");
                            sb2.append(iZzb);
                            bundle.putLong(sb2.toString(), jElapsedRealtime);
                        }
                    }
                    break;
                }
                if (((Boolean) zzbd.zzc().a(p32.I2)).booleanValue()) {
                    i31 i31VarA = zzfbaVar.e.a();
                    i31VarA.c("action", "lat_ms");
                    i31VarA.c("lat_grp", "sig_lat_grp");
                    i31VarA.c("lat_id", String.valueOf(zzfaxVar.zzb()));
                    i31VarA.c("clat_ms", String.valueOf(jElapsedRealtime));
                    int i = 1;
                    if (((Boolean) zzbd.zzc().a(p32.J2)).booleanValue()) {
                        synchronized (zzfbaVar) {
                            zzfbaVar.g++;
                            break;
                        }
                        i31VarA.c("seq_num", zzt.zzh().c.c.a());
                        synchronized (zzfbaVar) {
                            try {
                                if (zzfbaVar.g == zzfbaVar.b.size() && zzfbaVar.f != 0) {
                                    zzfbaVar.g = 0;
                                    String strValueOf = String.valueOf(zzt.zzk().elapsedRealtime() - zzfbaVar.f);
                                    if (zzfaxVar.zzb() <= 39 || zzfaxVar.zzb() >= 52) {
                                        i31VarA.c("lat_clsg", strValueOf);
                                    } else {
                                        i31VarA.c("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    ((zzdxz) i31VarA.c).b.execute(new em2(i31VarA, i));
                    return;
                }
                return;
        }
    }

    public lb2(zzchr zzchrVar, String str, String str2, long j) {
        this.c = str;
        this.d = str2;
        this.b = j;
        this.e = zzchrVar;
    }
}
