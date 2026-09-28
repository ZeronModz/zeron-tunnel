package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.u7;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/RangesSpecifier;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "unit", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/ContentRange;", "ranges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lio/ktor/http/RangeUnits;", "(Lio/ktor/http/RangeUnits;Ljava/util/List;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RangesSpecifier {
    public final String a;
    public final List b;

    public RangesSpecifier(String str, List<? extends ContentRange> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        if (list.isEmpty()) {
            u7.r("It should be at least one range");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangesSpecifier)) {
            return false;
        }
        RangesSpecifier rangesSpecifier = (RangesSpecifier) obj;
        return yg0.a(this.a, rangesSpecifier.a) && yg0.a(this.b, rangesSpecifier.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return kotlin.collections.c.w(this.b, ",", vh.q(new StringBuilder(), this.a, '='), null, null, 60);
    }

    public /* synthetic */ RangesSpecifier(String str, List list, int i, xu xuVar) {
        this((i & 1) != 0 ? RangeUnits.Bytes.getUnitToken() : str, (List<? extends ContentRange>) list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangesSpecifier(RangeUnits rangeUnits, List<? extends ContentRange> list) {
        this(rangeUnits.getUnitToken(), list);
        rangeUnits.getClass();
        list.getClass();
    }
}
