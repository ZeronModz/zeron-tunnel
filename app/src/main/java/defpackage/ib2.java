package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchr;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ib2 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ zzchr k;

    public ib2(zzchr zzchrVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.k = zzchrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.a);
        map.put("cachedSrc", this.b);
        map.put("bufferedDuration", Long.toString(this.c));
        map.put("totalDuration", Long.toString(this.d));
        if (((Boolean) zzbd.zzc().a(p32.w2)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.e));
            map.put("qoeCachedBytes", Long.toString(this.f));
            map.put("totalBytes", Long.toString(this.g));
            map.put("reportTime", Long.toString(zzt.zzk().currentTimeMillis()));
        }
        map.put("cacheReady", true != this.h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.i));
        map.put("playerPreparedCount", Integer.toString(this.j));
        this.k.j(map);
    }
}
