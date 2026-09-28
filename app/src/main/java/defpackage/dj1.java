package defpackage;

import com.google.common.collect.o3;
import java.util.Objects;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dj1 extends o3 {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ HashMap b;

    public dj1(o3 o3Var, HashMap map) {
        this.a = o3Var;
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = this.b;
        Object obj3 = map.get(obj);
        Objects.requireNonNull(obj3);
        Object obj4 = map.get(obj2);
        Objects.requireNonNull(obj4);
        return this.a.compare(obj3, obj4);
    }
}
