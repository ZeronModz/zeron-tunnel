package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcz;
import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xq2 extends zzcz {
    public final zzjp a;

    public xq2(zzjp zzjpVar) {
        this.a = zzjpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.a.interceptEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.a);
    }
}
