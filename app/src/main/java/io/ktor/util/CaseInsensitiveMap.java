package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import defpackage.z3;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/CaseInsensitiveMap;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CaseInsensitiveMap<Value> implements Map<String, Value>, KMutableMap {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.a.containsKey(new CaseInsensitiveString((String) obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        final int i = 0;
        final int i2 = 1;
        return new DelegatingMutableSet(this.a.entrySet(), new Function1() { // from class: io.ktor.util.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i) {
                    case 0:
                        entry.getClass();
                        return new Entry(((CaseInsensitiveString) entry.getKey()).a, entry.getValue());
                    default:
                        entry.getClass();
                        String str = (String) entry.getKey();
                        str.getClass();
                        return new Entry(new CaseInsensitiveString(str), entry.getValue());
                }
            }
        }, new Function1() { // from class: io.ktor.util.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                switch (i2) {
                    case 0:
                        entry.getClass();
                        return new Entry(((CaseInsensitiveString) entry.getKey()).a, entry.getValue());
                    default:
                        entry.getClass();
                        String str = (String) entry.getKey();
                        str.getClass();
                        return new Entry(new CaseInsensitiveString(str), entry.getValue());
                }
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CaseInsensitiveMap)) {
            return false;
        }
        return yg0.a(((CaseInsensitiveMap) obj).a, this.a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.a.get(new CaseInsensitiveString((String) obj));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new DelegatingMutableSet(this.a.keySet(), new z3(3), new z3(4));
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        String str2 = str;
        str2.getClass();
        obj.getClass();
        return this.a.put(new CaseInsensitiveString(str2), obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            value.getClass();
            this.a.put(new CaseInsensitiveString(str), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.a.remove(new CaseInsensitiveString((String) obj));
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.a.values();
    }
}
