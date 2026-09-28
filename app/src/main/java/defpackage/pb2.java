package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzgw;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhz;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 implements zzhb {
    public final zzgw a;
    public final long b;
    public final zzhb c;
    public long d;
    public Uri e;

    public pb2(zzgw zzgwVar, int i, zzhb zzhbVar) {
        this.a = zzgwVar;
        this.b = i;
        this.c = zzhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int iZza = this.a.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + ((long) iZza);
            this.d = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iZza2 = this.c.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.d += (long) iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        zzhf zzhfVar2;
        long j;
        Uri uri = zzhfVar.a;
        long j2 = zzhfVar.d;
        this.e = uri;
        long j3 = zzhfVar.c;
        long j4 = this.b;
        zzhf zzhfVar3 = null;
        if (j3 >= j4) {
            zzhfVar2 = null;
        } else {
            long jMin = j4 - j3;
            if (j2 != -1) {
                jMin = Math.min(j2, jMin);
            }
            zzhfVar2 = new zzhf(uri, j3, jMin, null);
        }
        if (j2 == -1 || j3 + j2 > j4) {
            long jMax = Math.max(j4, j3);
            long jMin2 = j2 != -1 ? Math.min(j2, (j3 + j2) - j4) : -1L;
            j = j3;
            zzhfVar3 = new zzhf(uri, jMax, jMin2, null);
        } else {
            j = j3;
        }
        long jZzb = zzhfVar2 != null ? this.a.zzb(zzhfVar2) : 0L;
        long jZzb2 = zzhfVar3 != null ? this.c.zzb(zzhfVar3) : 0L;
        this.d = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return zzgui.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }
}
