package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p11 extends AbsSavedState {
    public static final Parcelable.Creator<p11> CREATOR = new ew0(14);
    public float a;
    public int b;

    public p11(Parcel parcel) {
        super(parcel.readParcelable(p11.class.getClassLoader()));
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public p11(fe feVar) {
        super(feVar);
    }
}
