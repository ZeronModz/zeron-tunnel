package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class js1 extends ts1 {
    public final /* synthetic */ zaaw b;
    public final /* synthetic */ pt1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js1(zaaw zaawVar, zaaw zaawVar2, pt1 pt1Var) {
        super(zaawVar);
        this.b = zaawVar2;
        this.c = pt1Var;
    }

    @Override // defpackage.ts1
    public final void a() {
        IAccountAccessor hVar;
        zaaw zaawVar = this.b;
        if (zaawVar.g(0)) {
            pt1 pt1Var = this.c;
            ConnectionResult connectionResult = pt1Var.b;
            if (!connectionResult.b()) {
                if (!zaawVar.l || connectionResult.a()) {
                    zaawVar.d(connectionResult);
                    return;
                } else {
                    zaawVar.a();
                    zaawVar.f();
                    return;
                }
            }
            d dVar = pt1Var.c;
            yg0.m(dVar);
            ConnectionResult connectionResult2 = dVar.c;
            if (!connectionResult2.b()) {
                String strValueOf = String.valueOf(connectionResult2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                zaawVar.d(connectionResult2);
                return;
            }
            zaawVar.n = true;
            IBinder iBinder = dVar.b;
            if (iBinder == null) {
                hVar = null;
            } else {
                int i = IAccountAccessor.Stub.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                hVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            yg0.m(hVar);
            zaawVar.o = hVar;
            zaawVar.p = dVar.d;
            zaawVar.q = dVar.e;
            zaawVar.f();
        }
    }
}
