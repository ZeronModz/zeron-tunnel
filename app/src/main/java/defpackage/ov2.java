package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfsa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ov2 {
    public final HashMap a;
    public final wv2 b;
    public final sv2 c;
    public final Context d;
    public volatile ConnectivityManager e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Clock g;
    public AtomicInteger h;
    public final zzfqr i;

    public ov2(wv2 wv2Var, sv2 sv2Var, Context context, Clock clock, zzfqr zzfqrVar) {
        HashMap map = new HashMap();
        this.a = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.b = wv2Var;
        this.c = sv2Var;
        this.d = context;
        this.g = clock;
        this.i = zzfqrVar;
    }

    public final synchronized boolean a(String str, zzft zzftVar, zzch zzchVar) {
        zzfsa zzfsaVarB;
        try {
        } catch (RuntimeException e) {
            zzo.zzj("Failed to register network callback", e);
            this.h = new AtomicInteger(((Integer) zzbd.zzc().a(p32.I)).intValue());
        } finally {
        }
        if (!this.f.getAndSet(true)) {
            if (this.e == null) {
                synchronized (this) {
                    if (this.e == null) {
                        try {
                            this.e = (ConnectivityManager) this.d.getSystemService("connectivity");
                        } catch (ClassCastException e2) {
                            zzo.zzj("Failed to get connectivity manager", e2);
                        }
                    }
                }
            }
            if (!j03.n() || this.e == null) {
                this.h = new AtomicInteger(((Integer) zzbd.zzc().a(p32.I)).intValue());
            } else {
                this.e.registerDefaultNetworkCallback(new jt0(this));
            }
            zzt.zzg().b(new s12(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat != null) {
            HashMap map = this.a;
            if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && e(adFormat) && (zzfsaVarB = this.b.b(str, zzftVar, zzchVar)) != null) {
                AtomicInteger atomicInteger = this.h;
                if (atomicInteger != null) {
                    zzfsaVarB.p(atomicInteger.get());
                }
                sv2 sv2Var = this.c;
                zzfsaVarB.r = sv2Var;
                zzfqr zzfqrVar = this.i;
                if (zzfqrVar != null) {
                    zzfqrVar.d(str, adFormat, zzfsaVarB);
                } else {
                    zzfsaVarB.j();
                }
                ((Map) map.get(adFormat)).put(str, zzfsaVarB);
                zzfrl zzfrlVar = new zzfrl(zzftVar.zza, adFormat);
                zzfrlVar.c = str;
                sv2Var.a(zzftVar.zzd, this.g.currentTimeMillis(), new uv2(zzfrlVar), "2");
                return true;
            }
        }
        return false;
    }

    public final synchronized void b(boolean z) {
        if (((Boolean) zzbd.zzc().a(p32.y)).booleanValue()) {
            c(z);
        }
    }

    public final synchronized void c(boolean z) {
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                for (zzfsa zzfsaVar : ((Map) it.next()).values()) {
                    if (z) {
                        zzfsaVar.n();
                    } else {
                        zzfsaVar.g.set(false);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object d(AdFormat adFormat, Class cls, String str) {
        sv2 sv2Var = this.c;
        Clock clock = this.g;
        sv2Var.g("poll_ad", "ppacwe_ts", clock.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.a;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
        if (zzfsaVar != null && adFormat.equals(zzfsaVar.q())) {
            zzfrl zzfrlVar = new zzfrl(zzfsaVar.e.zza, zzfsaVar.q());
            zzfrlVar.c = str;
            uv2 uv2Var = new uv2(zzfrlVar);
            sv2Var.g("poll_ad", "ppac_ts", clock.currentTimeMillis(), zzfsaVar.e.zzd, zzfsaVar.r(), null, uv2Var, "2");
            try {
                String strO = zzfsaVar.o();
                Object objM = zzfsaVar.m();
                Object objCast = objM == null ? null : cls.cast(objM);
                if (objCast != null) {
                    sv2Var.d(clock.currentTimeMillis(), zzfsaVar.e.zzd, zzfsaVar.r(), strO, uv2Var, "2");
                }
                return objCast;
            } catch (ClassCastException e) {
                zzt.zzh().f("PreloadAdManager.pollAd", e);
                zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean e(AdFormat adFormat) {
        int size;
        int iOrdinal;
        try {
            HashMap map = this.a;
            size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
            iOrdinal = adFormat.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) zzbd.zzc().a(p32.u5)).intValue(), 1) : Math.max(((Integer) zzbd.zzc().a(p32.t5)).intValue(), 1) : Math.max(((Integer) zzbd.zzc().a(p32.s5)).intValue(), 1));
    }
}
