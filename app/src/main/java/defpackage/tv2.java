package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfsa;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tv2 {
    public final wv2 c;
    public final sv2 d;
    public final Context e;
    public volatile ConnectivityManager f;
    public final Clock h;
    public AtomicInteger i;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public tv2(wv2 wv2Var, sv2 sv2Var, Context context, Clock clock) {
        this.c = wv2Var;
        this.d = sv2Var;
        this.e = context;
        this.h = clock;
    }

    public static String b(String str, AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return vh.t(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final synchronized void a(List list, zzce zzceVar) {
        try {
            if (!this.g.getAndSet(true)) {
                if (this.f == null) {
                    synchronized (this) {
                        if (this.f == null) {
                            try {
                                this.f = (ConnectivityManager) this.e.getSystemService("connectivity");
                            } catch (ClassCastException e) {
                                zzo.zzj("Failed to get connectivity manager", e);
                            }
                        }
                    }
                }
                if (!j03.n() || this.f == null) {
                    this.i = new AtomicInteger(((Integer) zzbd.zzc().a(p32.I)).intValue());
                } else {
                    try {
                        this.f.registerDefaultNetworkCallback(new jt0(this));
                    } catch (RuntimeException e2) {
                        zzo.zzj("Failed to register network callback", e2);
                        this.i = new AtomicInteger(((Integer) zzbd.zzc().a(p32.I)).intValue());
                    }
                }
                zzt.zzg().b(new s12(this));
            }
            ArrayList<zzft> arrayListE = e(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (zzft zzftVar : arrayListE) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzfsa zzfsaVarA = this.c.a(zzftVar, zzceVar);
                if (adFormat != null && zzfsaVarA != null) {
                    AtomicInteger atomicInteger = this.i;
                    if (atomicInteger != null) {
                        zzfsaVarA.p(atomicInteger.get());
                    }
                    sv2 sv2Var = this.d;
                    zzfsaVarA.r = sv2Var;
                    f(b(str, adFormat), zzfsaVarA);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    sv2Var.a(zzftVar.zzd, this.h.currentTimeMillis(), new uv2(new zzfrl(str, adFormat)), "1");
                }
            }
            this.d.b(enumMap, this.h.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z) {
        if (((Boolean) zzbd.zzc().a(p32.y)).booleanValue()) {
            d(z);
        }
    }

    public final synchronized void d(boolean z) {
        ConcurrentHashMap concurrentHashMap = this.a;
        try {
            if (z) {
                Iterator it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    ((zzfsa) it.next()).n();
                }
            } else {
                Iterator it2 = concurrentHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((zzfsa) it2.next()).g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0100 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00ee, B:35:0x0103, B:37:0x0109, B:34:0x0100), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.ArrayList e(java.util.List r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv2.e(java.util.List):java.util.ArrayList");
    }

    public final synchronized void f(String str, zzfsa zzfsaVar) {
        zzfsaVar.j();
        this.a.put(str, zzfsaVar);
    }

    public final synchronized boolean g(String str, AdFormat adFormat) {
        boolean z;
        try {
            Clock clock = this.h;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzfsa zzfsaVarI = i(str, adFormat);
            int iR = 0;
            z = zzfsaVarI != null && zzfsaVarI.l();
            Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            uv2 uv2Var = new uv2(new zzfrl(str, adFormat));
            sv2 sv2Var = this.d;
            int i = zzfsaVarI == null ? 0 : zzfsaVarI.e.zzd;
            if (zzfsaVarI != null) {
                iR = zzfsaVarI.r();
            }
            sv2Var.c(i, iR, jCurrentTimeMillis, lValueOf, zzfsaVarI != null ? zzfsaVarI.o() : null, uv2Var, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final synchronized Object h(AdFormat adFormat, Class cls, String str) {
        uv2 uv2Var = new uv2(new zzfrl(str, adFormat));
        sv2 sv2Var = this.d;
        Clock clock = this.h;
        sv2Var.g("poll_ad", "ppac_ts", clock.currentTimeMillis(), -1, -1, null, uv2Var, "1");
        zzfsa zzfsaVarI = i(str, adFormat);
        if (zzfsaVarI == null) {
            return null;
        }
        try {
            String strO = zzfsaVarI.o();
            Object objM = zzfsaVarI.m();
            Object objCast = objM == null ? null : cls.cast(objM);
            if (objCast != null) {
                sv2Var.d(clock.currentTimeMillis(), zzfsaVarI.e.zzd, zzfsaVarI.r(), strO, uv2Var, "1");
            }
            return objCast;
        } catch (ClassCastException e) {
            zzt.zzh().f("PreloadAdManager.pollAd", e);
            zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    public final synchronized zzfsa i(String str, AdFormat adFormat) {
        return (zzfsa) this.a.get(b(str, adFormat));
    }
}
