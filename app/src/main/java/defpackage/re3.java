package defpackage;

import com.google.android.gms.internal.ads.zzikg;
import java.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class re3 implements zzikg {
    public final Map a;

    public re3(LinkedHashMap linkedHashMap) {
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }
}
