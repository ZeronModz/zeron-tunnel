package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ni1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final void a(URLBuilder uRLBuilder, StringBuilder sb) {
        List listZ;
        sb.append(uRLBuilder.c().a);
        String str = uRLBuilder.c().a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && str.equals("about")) {
                    CharSequence charSequence = uRLBuilder.a;
                    sb.append(":");
                    sb.append(charSequence);
                    return;
                }
            } else if (str.equals("file")) {
                CharSequence charSequence2 = uRLBuilder.a;
                CharSequence charSequenceC = c(uRLBuilder);
                sb.append("://");
                sb.append(charSequence2);
                if (!g.S(charSequenceC, '/')) {
                    sb.append('/');
                }
                sb.append(charSequenceC);
                return;
            }
        } else if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = uRLBuilder.e;
            String str3 = uRLBuilder.f;
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence string = sb2.toString();
            CharSequence charSequence3 = uRLBuilder.a;
            sb.append(":");
            sb.append(string);
            sb.append(charSequence3);
            return;
        }
        sb.append("://");
        sb.append(b(uRLBuilder));
        String strC = c(uRLBuilder);
        ParametersBuilder parametersBuilder = uRLBuilder.i;
        boolean z = uRLBuilder.b;
        strC.getClass();
        parametersBuilder.getClass();
        if (!g.B(strC) && !g.R(strC, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strC);
        if (!parametersBuilder.isEmpty() || z) {
            sb.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = parametersBuilder.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listZ = kotlin.collections.c.z(new Pair(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.c.l(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it2.next()));
                }
                listZ = arrayList2;
            }
            kotlin.collections.c.i(arrayList, listZ);
        }
        kotlin.collections.c.v(arrayList, sb, "&", new ni1(1), 60);
        if (uRLBuilder.g.length() > 0) {
            sb.append('#');
            sb.append(uRLBuilder.g);
        }
    }

    public static final String b(URLBuilder uRLBuilder) {
        uRLBuilder.getClass();
        StringBuilder sb = new StringBuilder();
        String str = uRLBuilder.e;
        String str2 = uRLBuilder.f;
        if (str != null) {
            sb.append(str);
            if (str2 != null) {
                sb.append(':');
                sb.append(str2);
            }
            sb.append("@");
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(uRLBuilder.a);
        int i = uRLBuilder.c;
        if (i != 0 && i != uRLBuilder.c().b) {
            sb2.append(":");
            sb2.append(String.valueOf(uRLBuilder.c));
        }
        return sb2.toString();
    }

    public static final String c(URLBuilder uRLBuilder) {
        List list = uRLBuilder.h;
        return list.isEmpty() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : list.size() == 1 ? ((CharSequence) kotlin.collections.c.r(list)).length() == 0 ? "/" : (String) kotlin.collections.c.r(list) : kotlin.collections.c.w(list, "/", null, null, null, 62);
    }

    public static final void d(URLBuilder uRLBuilder, String str) {
        uRLBuilder.getClass();
        str.getClass();
        uRLBuilder.d(g.B(str) ? EmptyList.INSTANCE : str.equals("/") ? f.a : new ArrayList(g.P(new char[]{'/'}, str)));
    }
}
