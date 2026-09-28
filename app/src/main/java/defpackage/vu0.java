package defpackage;

import io.ktor.http.Headers;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.collections.c;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vu0 implements Headers {
    public final /* synthetic */ okhttp3.Headers a;

    public vu0(okhttp3.Headers headers) {
        this.a = headers;
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str, String str2) {
        str.getClass();
        str2.getClass();
        List all = getAll(str);
        if (all != null) {
            return all.contains(str2);
        }
        return false;
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        okhttp3.Headers headers = this.a;
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strB = headers.b(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strB.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(headers.d(i));
        }
        return treeMap.entrySet();
    }

    @Override // io.ktor.util.StringValues
    public final void forEach(Function2 function2) {
        function2.getClass();
        ii2.h(this, function2);
    }

    @Override // io.ktor.util.StringValues
    public final String get(String str) {
        str.getClass();
        List all = getAll(str);
        if (all != null) {
            return (String) c.s(all);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final List getAll(String str) {
        str.getClass();
        List listE = this.a.e(str);
        if (listE.isEmpty()) {
            return null;
        }
        return listE;
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: getCaseInsensitiveName */
    public final boolean getA() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return this.a.size() == 0;
    }

    @Override // io.ktor.util.StringValues
    public final Set names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        okhttp3.Headers headers = this.a;
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(headers.b(i));
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str) {
        str.getClass();
        return getAll(str) != null;
    }
}
