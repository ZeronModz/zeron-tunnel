package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m12 extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator<m12> CREATOR = new zzbf();
    public final Bundle a;

    public m12(Bundle bundle) {
        this.a = bundle;
    }

    public final Object a(String str) {
        return this.a.get(str);
    }

    public final Double b() {
        return Double.valueOf(this.a.getDouble("value"));
    }

    public final String c() {
        return this.a.getString("currency");
    }

    public final Bundle d() {
        return new Bundle(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rk1(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.A(parcel, 2, d());
        n8.e0(iV, parcel);
    }
}
