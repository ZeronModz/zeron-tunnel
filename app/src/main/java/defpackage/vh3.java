package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzhe;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vh3 extends oi3 {
    public final HashMap d;
    public final zzhe e;
    public final zzhe f;
    public final zzhe g;
    public final zzhe h;
    public final zzhe i;
    public final zzhe j;

    public vh3(g0 g0Var) {
        super(g0Var);
        this.d = new HashMap();
        f63 f63Var = this.a.e;
        r.f(f63Var);
        this.e = new zzhe(f63Var, "last_delete_stale", 0L);
        f63 f63Var2 = this.a.e;
        r.f(f63Var2);
        this.f = new zzhe(f63Var2, "last_delete_stale_batch", 0L);
        f63 f63Var3 = this.a.e;
        r.f(f63Var3);
        this.g = new zzhe(f63Var3, "backoff", 0L);
        f63 f63Var4 = this.a.e;
        r.f(f63Var4);
        this.h = new zzhe(f63Var4, "last_upload", 0L);
        f63 f63Var5 = this.a.e;
        r.f(f63Var5);
        this.i = new zzhe(f63Var5, "last_upload_attempt", 0L);
        f63 f63Var6 = this.a.e;
        r.f(f63Var6);
        this.j = new zzhe(f63Var6, "midnight_offset", 0L);
    }

    public final Pair e(String str) {
        uh3 uh3Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        a();
        r rVar = this.a;
        wu wuVar = rVar.k;
        b bVar = rVar.d;
        wuVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.d;
        uh3 uh3Var2 = (uh3) map.get(str);
        if (uh3Var2 != null && jElapsedRealtime < uh3Var2.c) {
            return new Pair(uh3Var2.a, Boolean.valueOf(uh3Var2.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jH = bVar.h(str, l.b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(rVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (uh3Var2 != null && jElapsedRealtime < uh3Var2.c + bVar.h(str, l.c)) {
                    return new Pair(uh3Var2.a, Boolean.valueOf(uh3Var2.b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e) {
            m mVar = rVar.f;
            r.h(mVar);
            mVar.m.b(e, "Unable to get advertising id");
            uh3Var = new uh3(jH, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        uh3Var = id != null ? new uh3(jH, id, advertisingIdInfo.isLimitAdTrackingEnabled()) : new uh3(jH, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, advertisingIdInfo.isLimitAdTrackingEnabled());
        map.put(str, uh3Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(uh3Var.a, Boolean.valueOf(uh3Var.b));
    }

    public final String f(String str, boolean z) {
        a();
        String str2 = z ? (String) e(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestR = h0.r();
        if (messageDigestR == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestR.digest(str2.getBytes())));
    }

    @Override // defpackage.oi3
    public final void d() {
    }
}
