package defpackage;

import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzer;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 {
    public final vx1 a = new vx1();
    public final zzer b = new zzer(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(zzaev zzaevVar) throws IOException {
        int i;
        boolean z = this.e;
        zzer zzerVar = this.b;
        if (z) {
            this.e = false;
            zzerVar.y(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            int i2 = this.c;
            vx1 vx1Var = this.a;
            if (i2 < 0) {
                if (!vx1Var.a(zzaevVar, -1L) || !vx1Var.b(zzaevVar, true)) {
                    break;
                }
                int iB = vx1Var.d;
                if ((vx1Var.a & 1) == 1 && zzerVar.c == 0) {
                    iB += b(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                try {
                    zzaevVar.zzf(iB);
                    this.c = i;
                    i2 = i;
                } catch (EOFException unused) {
                }
            }
            int iB2 = b(i2);
            int i3 = this.c + this.d;
            if (iB2 > 0) {
                zzerVar.A(zzerVar.c + iB2);
                try {
                    zzaevVar.zzc(zzerVar.a, zzerVar.c, iB2);
                    zzerVar.C(zzerVar.c + iB2);
                    this.e = vx1Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == vx1Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return false;
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            vx1 vx1Var = this.a;
            if (i5 >= vx1Var.c) {
                break;
            }
            this.d = i4 + 1;
            i2 = vx1Var.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
