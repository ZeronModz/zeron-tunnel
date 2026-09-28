package defpackage;

import com.google.android.gms.internal.ads.zzfvj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lw2 extends zzfvj {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;

    public /* synthetic */ lw2(String str, boolean z, boolean z2, long j, long j2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final boolean c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfvj)) {
            return false;
        }
        zzfvj zzfvjVar = (zzfvj) obj;
        return this.a.equals(zzfvjVar.a()) && this.b == zzfvjVar.b() && this.c == zzfvjVar.c() && this.d == zzfvjVar.d() && this.e == zzfvjVar.e();
    }

    public final int hashCode() {
        return ((int) this.e) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.d)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        boolean z = this.b;
        int length = String.valueOf(z).length();
        boolean z2 = this.c;
        int length2 = String.valueOf(z2).length();
        long j = this.d;
        int length3 = String.valueOf(j).length();
        long j2 = this.e;
        int length4 = String.valueOf(j2).length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
