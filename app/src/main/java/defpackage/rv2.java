package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfsa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 extends zzcj {
    public final tv2 a;
    public final ov2 b;

    public rv2(tv2 tv2Var, ov2 ov2Var) {
        this.a = tv2Var;
        this.b = ov2Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, zzce zzceVar) {
        this.a.a(list, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) {
        boolean zG;
        tv2 tv2Var = this.a;
        synchronized (tv2Var) {
            zG = tv2Var.g(str, AdFormat.REWARDED);
        }
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzcaz zzg(String str) {
        zzcaz zzcazVar;
        tv2 tv2Var = this.a;
        synchronized (tv2Var) {
            zzcazVar = (zzcaz) tv2Var.h(AdFormat.REWARDED, zzcaz.class, str);
        }
        return zzcazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) {
        boolean zG;
        tv2 tv2Var = this.a;
        synchronized (tv2Var) {
            zG = tv2Var.g(str, AdFormat.APP_OPEN_AD);
        }
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbex zzi(String str) {
        zzbex zzbexVar;
        tv2 tv2Var = this.a;
        synchronized (tv2Var) {
            zzbexVar = (zzbex) tv2Var.h(AdFormat.APP_OPEN_AD, zzbex.class, str);
        }
        return zzbexVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) {
        boolean zG;
        tv2 tv2Var = this.a;
        synchronized (tv2Var) {
            zG = tv2Var.g(str, AdFormat.INTERSTITIAL);
        }
        return zG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzk(String str) {
        zzbx zzbxVar;
        tv2 tv2Var = this.a;
        synchronized (tv2Var) {
            zzbxVar = (zzbx) tv2Var.h(AdFormat.INTERSTITIAL, zzbx.class, str);
        }
        return zzbxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, zzft zzftVar, zzch zzchVar) {
        return this.b.a(str, zzftVar, zzchVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            try {
                Clock clock = ov2Var.g;
                long jCurrentTimeMillis = clock.currentTimeMillis();
                HashMap map = ov2Var.a;
                if (!map.containsKey(adFormat)) {
                    return false;
                }
                zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
                uv2 uv2Var = null;
                String strO = zzfsaVar == null ? null : zzfsaVar.o();
                boolean z = strO != null && adFormat.equals(zzfsaVar.q());
                Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
                if (zzfsaVar != null) {
                    zzfrl zzfrlVar = new zzfrl(zzfsaVar.e.zza, adFormat);
                    zzfrlVar.c = str;
                    uv2Var = new uv2(zzfrlVar);
                }
                ov2Var.c.c(zzfsaVar == null ? 0 : zzfsaVar.e.zzd, zzfsaVar != null ? zzfsaVar.r() : 0, jCurrentTimeMillis, lValueOf, strO, uv2Var, "2");
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzo(String str) {
        zzbx zzbxVar;
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            zzbxVar = (zzbx) ov2Var.d(AdFormat.INTERSTITIAL, zzbx.class, str);
        }
        return zzbxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbex zzp(String str) {
        zzbex zzbexVar;
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            zzbexVar = (zzbex) ov2Var.d(AdFormat.APP_OPEN_AD, zzbex.class, str);
        }
        return zzbexVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzcaz zzq(String str) {
        zzcaz zzcazVar;
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            zzcazVar = (zzcaz) ov2Var.d(AdFormat.REWARDED, zzcaz.class, str);
        }
        return zzcazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzft zzr(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return null;
        }
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            HashMap map = ov2Var.a;
            if (map.containsKey(adFormat)) {
                zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
                ov2Var.c.f("pgc", ov2Var.g.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.e.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.e.zzd, zzfsaVar != null ? zzfsaVar.r() : -1, 1);
                if (zzfsaVar != null) {
                    return zzfsaVar.e;
                }
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i) {
        HashMap map;
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            try {
                map = new HashMap();
                AdFormat adFormat = AdFormat.getAdFormat(i);
                if (adFormat != null) {
                    HashMap map2 = ov2Var.a;
                    if (map2.containsKey(adFormat)) {
                        for (zzfsa zzfsaVar : ((Map) map2.get(adFormat)).values()) {
                            map.put(zzfsaVar.l, zzfsaVar.e);
                        }
                        ov2Var.c.f("pgcs", ov2Var.g.currentTimeMillis(), null, null, adFormat, -1, -1, map.size());
                    }
                }
            } finally {
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            zzft zzftVar = (zzft) entry.getValue();
            Parcel parcelObtain = Parcel.obtain();
            zzftVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(str, bArrMarshall);
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return 0;
        }
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            HashMap map = ov2Var.a;
            if (!map.containsKey(adFormat)) {
                return 0;
            }
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str);
            int iR = zzfsaVar != null ? zzfsaVar.r() : 0;
            ov2Var.c.f("pnav", ov2Var.g.currentTimeMillis(), str, zzfsaVar == null ? null : zzfsaVar.e.zza, adFormat, zzfsaVar == null ? -1 : zzfsaVar.e.zzd, iR, 1);
            return iR;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i, String str) {
        zzfsa zzfsaVar;
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            try {
                HashMap map = ov2Var.a;
                if (map.containsKey(adFormat) && (zzfsaVar = (zzfsa) ((Map) map.get(adFormat)).get(str)) != null) {
                    ((Map) map.get(adFormat)).remove(str);
                    zzfsaVar.g.set(false);
                    zzfsaVar.p.set(false);
                    zzfqr zzfqrVar = ov2Var.i;
                    if (zzfqrVar != null) {
                        zzfqrVar.e(str, adFormat);
                    }
                    zzfsaVar.t();
                    sv2 sv2Var = ov2Var.c;
                    long jCurrentTimeMillis = ov2Var.g.currentTimeMillis();
                    zzft zzftVar = zzfsaVar.e;
                    sv2Var.f("pd", jCurrentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzfsaVar.r(), 1);
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i) {
        ov2 ov2Var = this.b;
        synchronized (ov2Var) {
            try {
                AdFormat adFormat = AdFormat.getAdFormat(i);
                if (adFormat != null) {
                    HashMap map = ov2Var.a;
                    if (map.containsKey(adFormat)) {
                        Map map2 = (Map) map.get(adFormat);
                        int size = map2.size();
                        for (String str : map2.keySet()) {
                            zzfsa zzfsaVar = (zzfsa) map2.get(str);
                            if (zzfsaVar != null) {
                                zzfsaVar.g.set(false);
                                zzfsaVar.p.set(false);
                                zzfqr zzfqrVar = ov2Var.i;
                                if (zzfqrVar != null) {
                                    zzfqrVar.e(str, adFormat);
                                }
                                zzfsaVar.t();
                                zzo.zzh("Destroyed ad preloader for preloadId: ".concat(String.valueOf(str)));
                            }
                        }
                        map2.clear();
                        zzo.zzh("Destroyed all ad preloaders for ad format: ".concat(adFormat.toString()));
                        ov2Var.c.f("pda", ov2Var.g.currentTimeMillis(), null, null, adFormat, -1, -1, size);
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbtt zzbttVar) {
    }
}
