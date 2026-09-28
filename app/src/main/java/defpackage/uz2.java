package defpackage;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzatv;
import java.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uz2 {
    public final zzatv a;
    public final long b;
    public final long c;
    public final String d;

    public uz2(zzatv zzatvVar, long j, long j2, String str) {
        this.a = zzatvVar;
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public static uz2 a(zzatv zzatvVar, byte[] bArr) throws zzatt, zzatp {
        zzatvVar.zza();
        zzatvVar.zzb(bArr);
        List list = (List) zzatvVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzatvVar.zzd(jLongValue, Optional.empty());
        byte[] bArrJ = w91.J();
        return new uz2(zzatvVar, jLongValue2, jLongValue3, "3.825731049.".concat(n23.d.g(bArrJ.length, bArrJ)));
    }
}
