package defpackage;

import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzekg;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kg2 implements zzcwi {
    public final Map a;

    public kg2(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final zzekg zza(int i, String str) {
        return (zzekg) this.a.get(str);
    }
}
