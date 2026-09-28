package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzsd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hk3 {
    public final Handler a;
    public final gk3 b;
    public final /* synthetic */ zzsd c;

    public /* synthetic */ hk3(zzsd zzsdVar) {
        this.c = zzsdVar;
        Handler handlerN = wt2.n();
        this.a = handlerN;
        gk3 gk3Var = new gk3(this);
        this.b = gk3Var;
        zzsdVar.a.registerStreamEventCallback(new t30(handlerN, 3), gk3Var);
    }

    public final /* synthetic */ void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
