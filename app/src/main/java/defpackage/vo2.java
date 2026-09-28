package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vo2 extends sq2 {
    public final /* synthetic */ zzco e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ss2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo2(ss2 ss2Var, zzco zzcoVar, int i) {
        super(ss2Var, true);
        this.e = zzcoVar;
        this.f = i;
        this.g = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        zzcr zzcrVar = this.g.f;
        yg0.m(zzcrVar);
        zzcrVar.getTestFlag(this.e, this.f);
    }

    @Override // defpackage.sq2
    public final void b() {
        this.e.zzb(null);
    }
}
