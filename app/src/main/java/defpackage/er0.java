package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class er0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<er0> CREATOR = new h2(18);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public er0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = ol1.d(calendar);
        this.a = calendarD;
        this.b = calendarD.get(2);
        this.c = calendarD.get(1);
        this.d = calendarD.getMaximum(7);
        this.e = calendarD.getActualMaximum(5);
        this.f = calendarD.getTimeInMillis();
    }

    public static er0 a(int i, int i2) {
        Calendar calendarI = ol1.i(null);
        calendarI.set(1, i);
        calendarI.set(2, i2);
        return new er0(calendarI);
    }

    public static er0 b(long j) {
        Calendar calendarI = ol1.i(null);
        calendarI.setTimeInMillis(j);
        return new er0(calendarI);
    }

    public final int c(er0 er0Var) {
        if (this.a instanceof GregorianCalendar) {
            return (er0Var.b - this.b) + ((er0Var.c - this.c) * 12);
        }
        u7.r("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((er0) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return this.b == er0Var.b && this.c == er0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
