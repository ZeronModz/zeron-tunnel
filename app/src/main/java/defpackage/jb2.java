package defpackage;

import com.google.android.gms.internal.ads.zzchx;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ zzchx j;

    public jb2(zzchx zzchxVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = zzchxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.a);
        map.put("cachedSrc", this.b);
        map.put("bytesLoaded", Integer.toString(this.c));
        map.put("totalBytes", Integer.toString(this.d));
        map.put("bufferedDuration", Long.toString(this.e));
        map.put("totalDuration", Long.toString(this.f));
        map.put("cacheReady", true != this.g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.h));
        map.put("playerPreparedCount", Integer.toString(this.i));
        this.j.j(map);
    }
}
