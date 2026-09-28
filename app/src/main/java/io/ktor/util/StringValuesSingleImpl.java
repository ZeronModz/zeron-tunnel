package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.gb1;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.h;
import kotlin.jvm.functions.Function2;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/util/StringValuesSingleImpl;", "Lio/ktor/util/StringValues;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "caseInsensitiveName", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "values", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class StringValuesSingleImpl implements StringValues {
    public final boolean a;
    public final String b;
    public final List c;

    public StringValuesSingleImpl(boolean z, String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = list;
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(String str, String str2) {
        str.getClass();
        str2.getClass();
        return g.w(str, this.b, this.a) && this.c.contains(str2);
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        return h.b(new gb1(this));
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
        function2.invoke(this.b, this.c);
    }

    @Override // io.ktor.util.StringValues
    public final String get(String str) {
        str.getClass();
        if (g.w(str, this.b, this.a)) {
            return (String) kotlin.collections.c.s(this.c);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final List getAll(String str) {
        str.getClass();
        if (g.w(this.b, str, this.a)) {
            return this.c;
        }
        return null;
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
        return false;
    }

    @Override // io.ktor.util.StringValues
    public final Set names() {
        return h.b(this.b);
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
        return g.w(str, this.b, this.a);
    }
}
