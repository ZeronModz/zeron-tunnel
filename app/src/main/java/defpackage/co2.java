package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class co2 implements zzikg {
    public final zzikp a;
    public final ee2 b;
    public final fg2 c;

    public co2(se3 se3Var, ee2 ee2Var, fg2 fg2Var) {
        this.a = se3Var;
        this.b = ee2Var;
        this.c = fg2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzedt zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        ta2 ta2Var2 = g3.b;
        k02.J(ta2Var2);
        Context contextA = ((sc2) this.b.b).a();
        k02.J(ta2Var);
        return new zzedt(scheduledExecutorService, ta2Var, ta2Var2, new ho2(contextA, ta2Var), se3.b(this.c));
    }
}
