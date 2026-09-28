package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.fb1;
import defpackage.xu;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/util/StringValuesBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "caseInsensitiveName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "(ZI)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class StringValuesBuilderImpl implements StringValuesBuilder {
    public final boolean a;
    public final Map b;

    public StringValuesBuilderImpl(boolean z, int i) {
        this.a = z;
        this.b = z ? new CaseInsensitiveMap() : new LinkedHashMap(i);
    }

    public final List a(String str) {
        Map map = this.b;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        b(str);
        map.put(str, arrayList);
        return arrayList;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void append(String str, String str2) {
        str.getClass();
        str2.getClass();
        c(str2);
        a(str).add(str2);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendAll(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        List listA = a(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
        kotlin.collections.c.i(listA, iterable);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendMissing(String str, Iterable iterable) {
        Set setU;
        str.getClass();
        iterable.getClass();
        List list = (List) this.b.get(str);
        if (list == null || (setU = kotlin.collections.c.U(list)) == null) {
            setU = EmptySet.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!setU.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        appendAll(str, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public StringValues build() {
        return new StringValuesImpl(this.a, this.b);
    }

    public void c(String str) {
        str.getClass();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void clear() {
        this.b.clear();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean contains(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) this.b.get(str);
        if (list != null) {
            return list.contains(str2);
        }
        return false;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final Set entries() {
        Set setEntrySet = this.b.entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final String get(String str) {
        str.getClass();
        List all = getAll(str);
        if (all != null) {
            return (String) kotlin.collections.c.s(all);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final List getAll(String str) {
        str.getClass();
        return (List) this.b.get(str);
    }

    @Override // io.ktor.util.StringValuesBuilder
    /* JADX INFO: renamed from: getCaseInsensitiveName, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final Set names() {
        return this.b.keySet();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean remove(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = (List) this.b.get(str);
        if (list != null) {
            return list.remove(str2);
        }
        return false;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void removeKeysWithNoEntries() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((List) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void set(String str, String str2) {
        str.getClass();
        str2.getClass();
        c(str2);
        List listA = a(str);
        listA.clear();
        listA.add(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesBuilderImpl() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public /* synthetic */ StringValuesBuilderImpl(boolean z, int i, int i2, xu xuVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 8 : i);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean contains(String str) {
        str.getClass();
        return this.b.containsKey(str);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void remove(String str) {
        str.getClass();
        this.b.remove(str);
    }

    public void b(String str) {
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendAll(StringValues stringValues) {
        stringValues.getClass();
        stringValues.forEach(new fb1(this, 1));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendMissing(StringValues stringValues) {
        stringValues.getClass();
        stringValues.forEach(new fb1(this, 0));
    }
}
