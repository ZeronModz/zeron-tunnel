package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a90 extends e90 implements Map.Entry {
    public abstract Map.Entry a();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return a().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return a().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        return a().setValue(obj);
    }
}
