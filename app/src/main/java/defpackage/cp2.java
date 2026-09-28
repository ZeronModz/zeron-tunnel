package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcr;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cp2 extends sq2 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ss2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp2(ss2 ss2Var, boolean z) {
        super(ss2Var, true);
        this.e = z;
        Objects.requireNonNull(ss2Var);
        this.f = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        zzcr zzcrVar = this.f.f;
        yg0.m(zzcrVar);
        zzcrVar.setDataCollectionEnabled(this.e);
    }
}
