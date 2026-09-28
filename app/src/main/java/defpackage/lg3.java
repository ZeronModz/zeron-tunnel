package defpackage;

import com.google.android.gms.internal.measurement.zzld;
import com.google.android.gms.internal.measurement.zzlh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lg3 implements zzld {
    public int a = 0;
    public final int b;
    public final /* synthetic */ zzlh c;

    public lg3(zzlh zzlhVar) {
        this.c = zzlhVar;
        this.b = zzlhVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzld
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
