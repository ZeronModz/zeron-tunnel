package io.ktor.http.content;

import defpackage.hu;
import defpackage.le0;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/content/LastModifiedVersion;", "Lio/ktor/http/content/Version;", "Lio/ktor/util/date/GMTDate;", "lastModified", "<init>", "(Lio/ktor/util/date/GMTDate;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LastModifiedVersion implements Version {
    public final GMTDate a;
    public final GMTDate b;

    public LastModifiedVersion(GMTDate gMTDate) {
        gMTDate.getClass();
        this.a = gMTDate;
        this.b = io.ktor.util.date.a.a(gMTDate.a, gMTDate.b, gMTDate.c, gMTDate.e, gMTDate.g, gMTDate.h);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!g.B((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            GMTDate gMTDateA = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                gMTDateA = hu.a((String) it.next());
            } catch (Throwable unused) {
            }
            if (gMTDateA != null) {
                arrayList2.add(gMTDateA);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @Override // io.ktor.http.content.Version
    public final void appendHeadersTo(HeadersBuilder headersBuilder) {
        headersBuilder.getClass();
        List list = le0.a;
        List list2 = hu.a;
        StringBuilder sb = new StringBuilder();
        GMTDate gMTDate = this.a;
        sb.append(gMTDate.d.getValue());
        sb.append(", ");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(g.G(2, String.valueOf(gMTDate.e)) + ' ');
        sb2.append(gMTDate.g.getValue() + ' ');
        sb2.append(g.G(4, String.valueOf(gMTDate.h)));
        sb2.append(" " + g.G(2, String.valueOf(gMTDate.c)) + ':' + g.G(2, String.valueOf(gMTDate.b)) + ':' + g.G(2, String.valueOf(gMTDate.a)) + ' ');
        sb2.append("GMT");
        headersBuilder.set("Last-Modified", sb2.toString());
    }

    @Override // io.ktor.http.content.Version
    public final VersionCheckResult check(Headers headers) {
        headers.getClass();
        List list = le0.a;
        List<String> all = headers.getAll("If-Modified-Since");
        ArrayList<GMTDate> arrayListA = all != null ? a(all) : null;
        GMTDate gMTDate = this.b;
        if (arrayListA != null) {
            if (!arrayListA.isEmpty()) {
                for (GMTDate gMTDate2 : arrayListA) {
                    gMTDate.getClass();
                    gMTDate2.getClass();
                    long j = gMTDate.i;
                    long j2 = gMTDate2.i;
                    if (j >= j2 && j != j2) {
                    }
                }
            }
            return VersionCheckResult.NOT_MODIFIED;
        }
        List list2 = le0.a;
        List<String> all2 = headers.getAll("If-Unmodified-Since");
        ArrayList<GMTDate> arrayListA2 = all2 != null ? a(all2) : null;
        if (arrayListA2 != null && !arrayListA2.isEmpty()) {
            for (GMTDate gMTDate3 : arrayListA2) {
                gMTDate.getClass();
                gMTDate3.getClass();
                long j3 = gMTDate.i;
                long j4 = gMTDate3.i;
                if (j3 >= j4 && j3 != j4) {
                    return VersionCheckResult.PRECONDITION_FAILED;
                }
            }
        }
        return VersionCheckResult.OK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastModifiedVersion) && this.a.equals(((LastModifiedVersion) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LastModifiedVersion(lastModified=" + this.a + ')';
    }
}
