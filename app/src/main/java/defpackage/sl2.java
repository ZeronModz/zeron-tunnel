package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sl2 extends sq2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zzco f;
    public final /* synthetic */ ss2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl2(ss2 ss2Var, zzco zzcoVar, int i) {
        super(ss2Var, true);
        this.e = i;
        this.f = zzcoVar;
        this.g = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        switch (this.e) {
            case 0:
                zzcr zzcrVar = this.g.f;
                yg0.m(zzcrVar);
                zzcrVar.getGmpAppId(this.f);
                break;
            case 1:
                zzcr zzcrVar2 = this.g.f;
                yg0.m(zzcrVar2);
                zzcrVar2.getCachedAppInstanceId(this.f);
                break;
            case 2:
                zzcr zzcrVar3 = this.g.f;
                yg0.m(zzcrVar3);
                zzcrVar3.generateEventId(this.f);
                break;
            case 3:
                zzcr zzcrVar4 = this.g.f;
                yg0.m(zzcrVar4);
                zzcrVar4.getCurrentScreenName(this.f);
                break;
            default:
                zzcr zzcrVar5 = this.g.f;
                yg0.m(zzcrVar5);
                zzcrVar5.getCurrentScreenClass(this.f);
                break;
        }
    }

    @Override // defpackage.sq2
    public final void b() {
        int i = this.e;
        zzco zzcoVar = this.f;
        switch (i) {
            case 0:
                zzcoVar.zzb(null);
                break;
            case 1:
                zzcoVar.zzb(null);
                break;
            case 2:
                zzcoVar.zzb(null);
                break;
            case 3:
                zzcoVar.zzb(null);
                break;
            default:
                zzcoVar.zzb(null);
                break;
        }
    }
}
