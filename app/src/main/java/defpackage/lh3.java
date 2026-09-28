package defpackage;

import com.google.android.gms.ads.internal.util.client.zzx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lh3 extends zzx {
    public final int a;
    public final int b;
    public final double c;
    public final boolean d;

    public lh3(int i, int i2, double d, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.a == zzxVar.zza() && this.b == zzxVar.zzb() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(zzxVar.zzc()) && this.d == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.c;
        return ((((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        double d = this.c;
        int length3 = String.valueOf(d).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z).length() + 1);
        hz.C(i, i2, "PingStrategy{maxAttempts=", ", initialBackoffMs=", sb);
        sb.append(", backoffMultiplier=");
        sb.append(d);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zza() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zzc() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.d;
    }
}
