package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 extends r21 {
    public static final ku1 a = new ku1("com.google.android.gms.common.ui.SignInButtonCreatorImpl");

    public static View a(Context context, int i, int i2) throws RemoteCreator$RemoteCreatorException {
        ku1 ku1Var = a;
        try {
            iu1 iu1Var = new iu1(1, i, i2, null);
            return (View) a.d(((tt1) ku1Var.getRemoteCreatorInstance(context)).h(new a(context), iu1Var));
        } catch (Exception e) {
            throw new RemoteCreator$RemoteCreatorException(vh.g(i, i2, "Could not get button with size ", " and color "), e);
        }
    }

    @Override // defpackage.r21
    public final Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof tt1 ? (tt1) iInterfaceQueryLocalInterface : new tt1(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator", 0);
    }
}
