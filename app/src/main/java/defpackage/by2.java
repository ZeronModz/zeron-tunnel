package defpackage;

import com.google.android.gms.internal.ads.zzgcd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class by2 implements zzgcd {
    public final int a;
    public final byte[] b;

    public by2(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final int zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final String zzb() {
        return new String(this.b);
    }
}
