package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t81 extends q {
    public static final Parcelable.Creator<t81> CREATOR = new p(5);
    public boolean c;
    public int d;

    public t81(Parcel parcel) {
        super(parcel, null);
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
    }

    @Override // defpackage.q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }
}
