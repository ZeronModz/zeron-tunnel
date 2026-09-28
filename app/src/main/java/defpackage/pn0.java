package defpackage;

import com.google.common.collect.s1;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pn0 extends AbstractMap {
    public abstract Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        s1.d(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ln0(2, this);
    }
}
