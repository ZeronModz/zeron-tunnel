package defpackage;

import com.google.android.gms.internal.ads.zzfvi;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends zzfvi {
    public String a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public byte f;

    public final lw2 a() {
        String str;
        if (this.f == 63 && (str = this.a) != null) {
            return new lw2(str, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        u7.p("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
