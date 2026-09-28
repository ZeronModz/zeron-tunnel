package defpackage;

import com.google.android.gms.internal.ads.zzikp;
import java.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ue3 extends re3 {
    public static final /* synthetic */ int b = 0;

    static {
        te3.a(Collections.EMPTY_MAP);
    }

    public static uh2 a(int i) {
        return new uh2(i);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.a;
        LinkedHashMap linkedHashMapO = qj1.O(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapO.put(entry.getKey(), ((zzikp) entry.getValue()).zzb());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapO);
    }
}
