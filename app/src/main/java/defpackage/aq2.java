package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcr;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class aq2 extends sq2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ar2 f;
    public final /* synthetic */ ss2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq2(ss2 ss2Var, ar2 ar2Var, int i) {
        super(ss2Var, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = ar2Var;
                this.g = ss2Var;
                super(ss2Var, true);
                break;
            default:
                this.f = ar2Var;
                Objects.requireNonNull(ss2Var);
                this.g = ss2Var;
                break;
        }
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        switch (this.e) {
            case 0:
                zzcr zzcrVar = this.g.f;
                yg0.m(zzcrVar);
                zzcrVar.registerOnMeasurementEventListener(this.f);
                break;
            default:
                zzcr zzcrVar2 = this.g.f;
                yg0.m(zzcrVar2);
                zzcrVar2.unregisterOnMeasurementEventListener(this.f);
                break;
        }
    }
}
