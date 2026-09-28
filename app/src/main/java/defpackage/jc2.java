package defpackage;

import com.google.android.gms.ads.internal.client.zzr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jc2 {
    public final int a;
    public final int b;
    public final int c;

    public jc2(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static jc2 a(zzr zzrVar) {
        return zzrVar.zzd ? new jc2(3, 0, 0) : zzrVar.zzi ? new jc2(2, 0, 0) : zzrVar.zzh ? new jc2(0, 0, 0) : new jc2(1, zzrVar.zzf, zzrVar.zzc);
    }

    public final boolean b() {
        return this.a == 3;
    }
}
