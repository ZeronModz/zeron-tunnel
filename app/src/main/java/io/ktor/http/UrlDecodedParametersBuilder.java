package io.ktor.http;

import defpackage.eo;
import defpackage.mu;
import defpackage.sb2;
import io.ktor.util.StringValues;
import io.ktor.util.StringValuesImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/http/UrlDecodedParametersBuilder;", "Lio/ktor/http/ParametersBuilder;", "encodedParametersBuilder", "<init>", "(Lio/ktor/http/ParametersBuilder;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlDecodedParametersBuilder implements ParametersBuilder {
    public final ParametersBuilder a;
    public final boolean b;

    public UrlDecodedParametersBuilder(ParametersBuilder parametersBuilder) {
        parametersBuilder.getClass();
        this.a = parametersBuilder;
        this.b = parametersBuilder.getB();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void append(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.append(eo.e(str, false), eo.e(str2, true));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendAll(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        String strE = eo.e(str, false);
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(eo.e(str2, true));
        }
        this.a.appendAll(strE, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendMissing(String str, Iterable iterable) {
        str.getClass();
        iterable.getClass();
        String strE = eo.e(str, false);
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(eo.e(str2, true));
        }
        this.a.appendMissing(strE, arrayList);
    }

    @Override // io.ktor.http.ParametersBuilder, io.ktor.util.StringValuesBuilder
    public final Parameters build() {
        return mu.j(this.a);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void clear() {
        this.a.clear();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean contains(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.a.contains(eo.e(str, false), eo.e(str2, true));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final Set entries() {
        return ((StringValuesImpl) mu.j(this.a)).entries();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final String get(String str) {
        str.getClass();
        String str2 = this.a.get(eo.e(str, false));
        if (str2 != null) {
            return eo.d(0, 0, str2, 11);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final List getAll(String str) {
        str.getClass();
        List<String> all = this.a.getAll(eo.e(str, false));
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(all, 10));
        Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(eo.d(0, 0, (String) it.next(), 11));
        }
        return arrayList;
    }

    @Override // io.ktor.util.StringValuesBuilder
    /* JADX INFO: renamed from: getCaseInsensitiveName, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final Set names() {
        Set<String> setNames = this.a.names();
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(eo.d(0, 0, (String) it.next(), 15));
        }
        return kotlin.collections.c.U(arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean remove(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.a.remove(eo.e(str, false), eo.e(str2, true));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void removeKeysWithNoEntries() {
        this.a.removeKeysWithNoEntries();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void set(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.set(eo.e(str, false), eo.e(str2, true));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final StringValues build() {
        return mu.j(this.a);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean contains(String str) {
        str.getClass();
        return this.a.contains(eo.e(str, false));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void remove(String str) {
        str.getClass();
        this.a.remove(eo.e(str, false));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendAll(StringValues stringValues) {
        stringValues.getClass();
        mu.a(this.a, stringValues);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final void appendMissing(StringValues stringValues) {
        stringValues.getClass();
        ParametersBuilderImpl parametersBuilderImplA = sb2.a();
        mu.a(parametersBuilderImplA, stringValues);
        this.a.appendMissing(parametersBuilderImplA.build());
    }
}
