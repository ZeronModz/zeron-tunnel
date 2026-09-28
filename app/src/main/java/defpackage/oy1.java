package defpackage;

import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 {
    public final zzfg a;
    public final zzer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;

    public oy1(int i) {
        switch (i) {
            case 1:
                this.a = new zzfg(0L);
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.b = new zzer();
                break;
            default:
                this.a = new zzfg(0L);
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.b = new zzer();
                break;
        }
    }

    public static long a(zzer zzerVar) {
        int i = zzerVar.b;
        if (zzerVar.B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzerVar.F(0, 9, bArr);
        zzerVar.D(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (bArr[1] & 255) << 20;
        long j5 = (j2 & 3) << 13;
        return j5 | j4 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(zzaev zzaevVar) {
        byte[] bArr = wt2.b;
        int length = bArr.length;
        this.b.z(0, bArr);
        this.c = true;
        zzaevVar.zzl();
    }
}
