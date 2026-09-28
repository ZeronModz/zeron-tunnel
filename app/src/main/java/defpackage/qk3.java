package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qk3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<qk3> CREATOR = new zzu();
    public final String a;
    public final sf3 b;
    public final boolean c;
    public final boolean d;

    public qk3(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        sf3 sf3Var = null;
        if (iBinder != null) {
            try {
                int i = zzw.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper iObjectWrapperZzd = (iInterfaceQueryLocalInterface instanceof zzx ? (zzx) iInterfaceQueryLocalInterface : new xk3(iBinder, "com.google.android.gms.common.internal.ICertData", 1)).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) a.d(iObjectWrapperZzd);
                if (bArr != null) {
                    sf3Var = new sf3(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.b = sf3Var;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 1, this.a);
        sf3 sf3Var = this.b;
        if (sf3Var == null) {
            sf3Var = null;
        }
        n8.C(parcel, 2, sf3Var);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        n8.P(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        n8.e0(iV, parcel);
    }

    public qk3(String str, sf3 sf3Var, boolean z, boolean z2) {
        this.a = str;
        this.b = sf3Var;
        this.c = z;
        this.d = z2;
    }
}
