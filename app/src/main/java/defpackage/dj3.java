package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzpm;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dj3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<dj3> CREATOR = new zzpm();
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public dj3(long j, Object obj, String str, String str2) {
        yg0.j(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                u7.r("User attribute given of un-supported type");
                throw null;
            }
            this.d = null;
            this.g = (Double) obj;
            this.e = null;
        }
    }

    public final Object a() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzpm.a(this, parcel);
    }

    public dj3(ej3 ej3Var) {
        this(ej3Var.d, ej3Var.e, ej3Var.c, ej3Var.b);
    }

    public dj3(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.g = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.e = str2;
        this.f = str3;
    }
}
