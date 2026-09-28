package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class af3 {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public float i = 1.0f;
    public long j = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long k = -9223372036854775807L;
    public long l = -9223372036854775807L;

    public /* synthetic */ af3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a() {
        long j = this.h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.h = j3;
        }
        this.j = -9223372036854775807L;
    }

    public final void b() {
        long j;
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            j = this.d;
            if (j == -9223372036854775807L) {
                long j3 = this.f;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.g;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }
}
