package defpackage;

import com.google.android.gms.internal.ads.zzian;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yc3 extends zc3 {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzian c;

    public yc3(zzian zzianVar) {
        this.c = zzianVar;
        this.b = zzianVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.android.gms.internal.ads.zziai
    public final byte zza() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.zzb(i);
        }
        p60.m();
        return (byte) 0;
    }
}
