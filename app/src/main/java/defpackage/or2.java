package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class or2 extends sq2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ r50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(r50 r50Var, Activity activity, int i) {
        super((ss2) r50Var.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity;
                this.g = r50Var;
                super((ss2) r50Var.b, true);
                break;
            case 2:
                this.f = activity;
                this.g = r50Var;
                super((ss2) r50Var.b, true);
                break;
            case 3:
                this.f = activity;
                this.g = r50Var;
                super((ss2) r50Var.b, true);
                break;
            case 4:
                this.f = activity;
                this.g = r50Var;
                super((ss2) r50Var.b, true);
                break;
            default:
                this.f = activity;
                this.g = r50Var;
                break;
        }
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        switch (this.e) {
            case 0:
                zzcr zzcrVar = ((ss2) this.g.b).f;
                yg0.m(zzcrVar);
                zzcrVar.onActivityStartedByScionActivityInfo(zzdf.a(this.f), this.b);
                break;
            case 1:
                zzcr zzcrVar2 = ((ss2) this.g.b).f;
                yg0.m(zzcrVar2);
                zzcrVar2.onActivityResumedByScionActivityInfo(zzdf.a(this.f), this.b);
                break;
            case 2:
                zzcr zzcrVar3 = ((ss2) this.g.b).f;
                yg0.m(zzcrVar3);
                zzcrVar3.onActivityPausedByScionActivityInfo(zzdf.a(this.f), this.b);
                break;
            case 3:
                zzcr zzcrVar4 = ((ss2) this.g.b).f;
                yg0.m(zzcrVar4);
                zzcrVar4.onActivityStoppedByScionActivityInfo(zzdf.a(this.f), this.b);
                break;
            default:
                zzcr zzcrVar5 = ((ss2) this.g.b).f;
                yg0.m(zzcrVar5);
                zzcrVar5.onActivityDestroyedByScionActivityInfo(zzdf.a(this.f), this.b);
                break;
        }
    }
}
