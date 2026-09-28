package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends cs1 {
    public final IObjectWrapper h(a aVar, iu1 iu1Var) {
        Parcel parcelA = a();
        zs1.d(parcelA, aVar);
        zs1.c(parcelA, iu1Var);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.b.transact(2, parcelA, parcelObtain, 0);
                parcelObtain.readException();
                parcelA.recycle();
                IObjectWrapper iObjectWrapperC = IObjectWrapper.Stub.c(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return iObjectWrapperC;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelA.recycle();
            throw th;
        }
    }
}
