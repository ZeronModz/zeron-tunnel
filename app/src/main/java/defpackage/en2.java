package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class en2 extends sq2 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ zzco h;
    public final /* synthetic */ ss2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en2(ss2 ss2Var, String str, String str2, boolean z, zzco zzcoVar) {
        super(ss2Var, true);
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = zzcoVar;
        Objects.requireNonNull(ss2Var);
        this.i = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        zzcr zzcrVar = this.i.f;
        yg0.m(zzcrVar);
        zzcrVar.getUserProperties(this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.sq2
    public final void b() {
        this.h.zzb(null);
    }
}
