package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rk2 extends sq2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ss2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk2(ss2 ss2Var, String str, int i) {
        super(ss2Var, true);
        this.e = i;
        this.f = str;
        this.g = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        switch (this.e) {
            case 0:
                zzcr zzcrVar = this.g.f;
                yg0.m(zzcrVar);
                zzcrVar.beginAdUnitExposure(this.f, this.b);
                break;
            default:
                zzcr zzcrVar2 = this.g.f;
                yg0.m(zzcrVar2);
                zzcrVar2.endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
