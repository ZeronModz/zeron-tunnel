package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nq2 extends sq2 {
    public final /* synthetic */ Long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ss2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq2(ss2 ss2Var, Long l, String str, String str2, Bundle bundle, boolean z) {
        super(ss2Var, true);
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        Long l = this.e;
        long jLongValue = l == null ? this.a : l.longValue();
        zzcr zzcrVar = this.j.f;
        yg0.m(zzcrVar);
        zzcrVar.logEvent(this.f, this.g, this.h, true, this.i, jLongValue);
    }
}
