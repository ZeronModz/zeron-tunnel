package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vi3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<vi3> CREATOR = new zzq();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public vi3(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) a.d(IObjectWrapper.Stub.c(iBinder));
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 1, this.a);
        n8.P(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        n8.C(parcel, 4, new a(this.d));
        n8.P(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        n8.P(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        n8.P(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        n8.e0(iV, parcel);
    }
}
