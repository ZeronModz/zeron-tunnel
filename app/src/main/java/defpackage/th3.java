package defpackage;

import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzio;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th3 implements zzdy {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzmy b;
    public final /* synthetic */ yk3 c;
    public final /* synthetic */ zzio d;

    public /* synthetic */ th3(zzmy zzmyVar, yk3 yk3Var, zzio zzioVar, int i) {
        this.a = i;
        this.b = zzmyVar;
        this.c = yk3Var;
        this.d = zzioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo9zza(Object obj) {
        int i = this.a;
        zzio zzioVar = this.d;
        yk3 yk3Var = this.c;
        zzmy zzmyVar = this.b;
        zzna zznaVar = (zzna) obj;
        switch (i) {
            case 0:
                zznaVar.zzl(zzmyVar, yk3Var, zzioVar);
                break;
            default:
                zznaVar.zzk(zzmyVar, yk3Var, zzioVar);
                break;
        }
    }
}
