package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dn0;
import defpackage.fr;
import defpackage.gr;
import defpackage.ir;
import defpackage.j03;
import defpackage.o0;
import defpackage.w91;
import defpackage.xm;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.sequences.Sequence;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Lazy a = kotlin.c.b(new o0(11));
    public static final Lazy b = kotlin.c.b(new o0(12));

    public static final ContentType a(ContentType.Companion companion, String str) {
        companion.getClass();
        ContentType.Companion companion2 = ContentType.f;
        companion2.getClass();
        int iY = g.y(str, '.', g.F(str, j03.x("/\\")) + 1, 4);
        return d(iY == -1 ? EmptyList.INSTANCE : b(companion2, str.substring(iY + 1)));
    }

    public static final List b(ContentType.Companion companion, String str) {
        companion.getClass();
        for (String strJ = dn0.J(g.I(str, ".")); strJ.length() > 0; strJ = g.T(strJ, ".", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            List list = (List) ((Map) a.getValue()).get(strJ);
            if (list != null) {
                return list;
            }
        }
        return EmptyList.INSTANCE;
    }

    public static final LinkedHashMap c(Sequence sequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequence) {
            Object first = ((Pair) obj).getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.d.c(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(kotlin.collections.c.l(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    public static final ContentType d(List list) {
        list.getClass();
        ContentType contentType = (ContentType) kotlin.collections.c.s(list);
        if (contentType == null) {
            contentType = fr.e;
        }
        if (contentType.b(ir.a)) {
            if (w91.h(contentType) == null) {
                return w91.D(contentType, xm.a);
            }
        } else if (contentType.b(gr.a)) {
            if (w91.h(contentType) == null) {
                return w91.D(contentType, xm.a);
            }
        } else if (contentType.b(fr.a) && ((contentType.b(fr.b) || contentType.b(fr.d) || contentType.b(fr.f) || contentType.b(fr.g) || contentType.b(fr.h)) && w91.h(contentType) == null)) {
            return w91.D(contentType, xm.a);
        }
        return contentType;
    }
}
