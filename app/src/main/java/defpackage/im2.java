package defpackage;

import com.google.android.gms.internal.ads.zzdzf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class im2 extends zzdzf {
    public final long a;
    public final int b;

    public /* synthetic */ im2(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzdzf
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdzf)) {
            return false;
        }
        zzdzf zzdzfVar = (zzdzf) obj;
        return this.a == zzdzfVar.a() && this.b == zzdzfVar.b();
    }

    public final int hashCode() {
        long j = this.a;
        return this.b ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        hz.G(sb, "OnDeviceStorageKey{id=", j, ", eventType=");
        return hz.q(i, "}", sb);
    }
}
