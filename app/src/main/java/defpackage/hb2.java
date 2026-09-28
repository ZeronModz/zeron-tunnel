package defpackage;

import com.google.android.gms.internal.ads.zzchu;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zzchu e;

    public hb2(zzchu zzchuVar, String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = zzchuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.a);
        map.put("cachedSrc", this.b);
        map.put("bytesLoaded", Integer.toString(this.c));
        map.put("totalBytes", Integer.toString(this.d));
        map.put("cacheReady", "0");
        this.e.j(map);
    }
}
