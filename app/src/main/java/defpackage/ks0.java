package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ks0 implements Parcelable {
    public static final Parcelable.Creator<ks0> CREATOR = new h2(20);
    public final UUID a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    public ks0(Parcel parcel) {
        this.a = UUID.fromString(parcel.readString());
        this.b = parcel.readInt();
        this.c = parcel.readBundle(ks0.class.getClassLoader());
        this.d = parcel.readBundle(ks0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.toString());
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
        parcel.writeBundle(this.d);
    }

    public ks0(js0 js0Var) {
        this.a = js0Var.f;
        this.b = js0Var.b.c;
        this.c = js0Var.c;
        Bundle bundle = new Bundle();
        this.d = bundle;
        js0Var.e.b(bundle);
    }
}
