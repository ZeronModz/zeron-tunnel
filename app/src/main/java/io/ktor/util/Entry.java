package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/Entry;", "Key", "Value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Entry<Key, Value> implements Map.Entry<Key, Value>, KMutableMap.Entry {
    public final Object a;
    public Object b;

    public Entry(Key key, Value value) {
        this.a = key;
        this.b = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (yg0.a(entry.getKey(), this.a) && yg0.a(entry.getValue(), this.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        obj.getClass();
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.b;
        obj2.getClass();
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        return sb.toString();
    }
}
