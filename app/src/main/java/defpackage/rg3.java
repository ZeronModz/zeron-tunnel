package defpackage;

import com.google.android.gms.internal.ads.zzwk;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rg3 {
    public final zzwk a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public rg3(zzwk zzwkVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        n8.S(!z3 || z);
        n8.S(!z2 || z);
        this.a = zzwkVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final rg3 a(long j) {
        return j == this.b ? this : new rg3(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final rg3 b(long j) {
        return j == this.c ? this : new rg3(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rg3.class != obj.getClass()) {
            return false;
        }
        rg3 rg3Var = (rg3) obj;
        return this.b == rg3Var.b && this.c == rg3Var.c && this.d == rg3Var.d && this.e == rg3Var.e && this.f == rg3Var.f && this.g == rg3Var.g && this.h == rg3Var.h && this.a.equals(rg3Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 29791) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
