package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/util/StringValuesImpl;", "Lio/ktor/util/StringValues;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "caseInsensitiveName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "values", "<init>", "(ZLjava/util/Map;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class StringValuesImpl implements StringValues {
    public final boolean a;
    public final Map b;

    public StringValuesImpl(boolean z, Map<String, ? extends List<String>> map) {
        map.getClass();
        this.a = z;
        Map caseInsensitiveMap = z ? new CaseInsensitiveMap() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(value.get(i));
            }
            caseInsensitiveMap.put(key, arrayList);
        }
        this.b = caseInsensitiveMap;
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) this.b.get(str);
        if (list != null) {
            return list.contains(str2);
        }
        return false;
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        Set setEntrySet = this.b.entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) obj;
        if (this.a != stringValues.getA()) {
            return false;
        }
        return entries().equals(stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public final void forEach(Function2 function2) {
        function2.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // io.ktor.util.StringValues
    public final String get(String str) {
        str.getClass();
        List list = (List) this.b.get(str);
        if (list != null) {
            return (String) kotlin.collections.c.s(list);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final List getAll(String str) {
        str.getClass();
        return (List) this.b.get(str);
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: getCaseInsensitiveName, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public final int hashCode() {
        return entries().hashCode() + ((this.a ? 1231 : 1237) * 961);
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // io.ktor.util.StringValues
    public final Set names() {
        Set setKeySet = this.b.keySet();
        setKeySet.getClass();
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setKeySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!this.a);
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str) {
        str.getClass();
        return ((List) this.b.get(str)) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesImpl() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ StringValuesImpl(boolean z, Map map, int i, xu xuVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.d.a() : map);
    }
}
