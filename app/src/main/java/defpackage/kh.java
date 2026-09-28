package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints$DateValidator;
import java.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh implements Parcelable {
    public static final Parcelable.Creator<kh> CREATOR = new h2(7);
    public final er0 a;
    public final er0 b;
    public final CalendarConstraints$DateValidator c;
    public final er0 d;
    public final int e;
    public final int f;
    public final int g;

    public kh(er0 er0Var, er0 er0Var2, CalendarConstraints$DateValidator calendarConstraints$DateValidator, er0 er0Var3, int i) {
        Objects.requireNonNull(er0Var, "start cannot be null");
        Objects.requireNonNull(er0Var2, "end cannot be null");
        Objects.requireNonNull(calendarConstraints$DateValidator, "validator cannot be null");
        this.a = er0Var;
        this.b = er0Var2;
        this.d = er0Var3;
        this.e = i;
        this.c = calendarConstraints$DateValidator;
        if (er0Var3 != null && er0Var.a.compareTo(er0Var3.a) > 0) {
            u7.r("start Month cannot be after current Month");
            throw null;
        }
        if (er0Var3 != null && er0Var3.a.compareTo(er0Var2.a) > 0) {
            u7.r("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > ol1.i(null).getMaximum(7)) {
            u7.r("firstDayOfWeek is not valid");
            throw null;
        }
        this.g = er0Var.c(er0Var2) + 1;
        this.f = (er0Var2.c - er0Var.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return this.a.equals(khVar.a) && this.b.equals(khVar.b) && Objects.equals(this.d, khVar.d) && this.e == khVar.e && this.c.equals(khVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
