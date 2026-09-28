package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbmx;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yh2 extends gj1 implements zzbmx {
    public final Bundle b;

    public yh2(Set set) {
        super(set);
        this.b = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final synchronized void zza(String str, Bundle bundle) {
        this.b.putAll(bundle);
        i(wh2.e);
    }
}
