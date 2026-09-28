package defpackage;

import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.MessageLite;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rj0 implements Map.Entry {
    public Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.a.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.a(lazyField.e);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof MessageLite)) {
            u7.r("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        LazyField lazyField = (LazyField) this.a.getValue();
        MessageLite messageLite = lazyField.c;
        lazyField.a = null;
        lazyField.d = null;
        lazyField.c = (MessageLite) obj;
        return messageLite;
    }
}
