package io.ktor.util.date;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.f61;
import defpackage.ib0;
import defpackage.if3;
import defpackage.xu;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0015\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0017"}, d2 = {"Lio/ktor/util/date/GMTDate;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "seconds", "minutes", "hours", "Lio/ktor/util/date/WeekDay;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lio/ktor/util/date/Month;", "month", "year", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "timestamp", "<init>", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)V", "seen0", "Lf61;", "serializationConstructorMarker", "(IIIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJLf61;)V", "Companion", "ib0", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GMTDate implements Comparable<GMTDate> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer[] j;
    public final int a;
    public final int b;
    public final int c;
    public final WeekDay d;
    public final int e;
    public final int f;
    public final Month g;
    public final int h;
    public final long i;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/date/GMTDate$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/serialization/KSerializer;", "Lio/ktor/util/date/GMTDate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public final KSerializer<GMTDate> serializer() {
            return ib0.a;
        }
    }

    static {
        WeekDay[] weekDayArrValues = WeekDay.values();
        weekDayArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("io.ktor.util.date.WeekDay", weekDayArrValues);
        Month[] monthArrValues = Month.values();
        monthArrValues.getClass();
        j = new KSerializer[]{null, null, null, enumSerializer, null, null, new EnumSerializer("io.ktor.util.date.Month", monthArrValues), null, null};
        a.b(0L);
    }

    public /* synthetic */ GMTDate(int i, int i2, int i3, int i4, WeekDay weekDay, int i5, int i6, Month month, int i7, long j2, f61 f61Var) {
        if (511 != (i & 511)) {
            if3.L(ib0.a.getDescriptor(), i, 511);
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = weekDay;
        this.e = i5;
        this.f = i6;
        this.g = month;
        this.h = i7;
        this.i = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(GMTDate gMTDate) {
        GMTDate gMTDate2 = gMTDate;
        gMTDate2.getClass();
        long j2 = this.i;
        long j3 = gMTDate2.i;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) obj;
        return this.a == gMTDate.a && this.b == gMTDate.b && this.c == gMTDate.c && this.d == gMTDate.d && this.e == gMTDate.e && this.f == gMTDate.f && this.g == gMTDate.g && this.h == gMTDate.h && this.i == gMTDate.i;
    }

    public final int hashCode() {
        int iHashCode = (((this.g.hashCode() + ((((((this.d.hashCode() + (((((this.a * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31;
        long j2 = this.i;
        return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.a + ", minutes=" + this.b + ", hours=" + this.c + ", dayOfWeek=" + this.d + ", dayOfMonth=" + this.e + ", dayOfYear=" + this.f + ", month=" + this.g + ", year=" + this.h + ", timestamp=" + this.i + ')';
    }

    public GMTDate(int i, int i2, int i3, WeekDay weekDay, int i4, int i5, Month month, int i6, long j2) {
        weekDay.getClass();
        month.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = weekDay;
        this.e = i4;
        this.f = i5;
        this.g = month;
        this.h = i6;
        this.i = j2;
    }
}
