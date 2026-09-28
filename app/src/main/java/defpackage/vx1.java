package defpackage;

import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzer;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final zzer g = new zzer(255);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r10 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r9.zzn() >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9.zzd(1) != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.gms.internal.ads.zzaev r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.zzn()
            long r2 = r9.zzm()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            defpackage.n8.S(r0)
            com.google.android.gms.internal.ads.zzer r8 = r8.g
            r0 = 4
            r8.y(r0)
        L1a:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r4 = r9.zzn()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L2c
            goto L4c
        L2c:
            byte[] r4 = r8.a
            boolean r4 = r9.zzh(r4, r1, r0, r2)     // Catch: java.io.EOFException -> L33
            goto L34
        L33:
            r4 = r1
        L34:
            if (r4 == 0) goto L4c
            r8.D(r1)
            long r3 = r8.N()
            r5 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L48
            r9.zzl()
            return r2
        L48:
            r9.zzf(r2)
            goto L1a
        L4c:
            if (r3 == 0) goto L56
            long r4 = r9.zzn()
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L5d
        L56:
            int r8 = r9.zzd(r2)
            r0 = -1
            if (r8 != r0) goto L4c
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx1.a(com.google.android.gms.internal.ads.zzaev, long):boolean");
    }

    public final boolean b(zzaev zzaevVar, boolean z) throws IOException {
        boolean zZzh;
        boolean zZzh2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        zzer zzerVar = this.g;
        zzerVar.y(27);
        try {
            zZzh = zzaevVar.zzh(zzerVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zZzh = false;
        }
        if (zZzh && zzerVar.N() == 1332176723) {
            if (zzerVar.I() == 0) {
                this.a = zzerVar.I();
                this.b = zzerVar.e();
                zzerVar.a();
                zzerVar.a();
                zzerVar.a();
                int I = zzerVar.I();
                this.c = I;
                this.d = I + 27;
                zzerVar.y(I);
                try {
                    zZzh2 = zzaevVar.zzh(zzerVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zZzh2 = false;
                }
                if (zZzh2) {
                    for (int i = 0; i < this.c; i++) {
                        int I2 = zzerVar.I();
                        this.f[i] = I2;
                        this.e += I2;
                    }
                    return true;
                }
            } else if (!z) {
                throw zzat.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }
}
