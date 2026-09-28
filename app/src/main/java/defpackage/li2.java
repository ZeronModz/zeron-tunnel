package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.measurement.zzcr;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class li2 extends sq2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ss2 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(ss2 ss2Var, Bundle bundle) {
        super(ss2Var, true);
        this.e = 0;
        this.g = bundle;
        Objects.requireNonNull(ss2Var);
        this.f = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        switch (this.e) {
            case 0:
                zzcr zzcrVar = this.f.f;
                yg0.m(zzcrVar);
                zzcrVar.setConditionalUserProperty((Bundle) this.g, this.a);
                break;
            case 1:
                zzcr zzcrVar2 = this.f.f;
                yg0.m(zzcrVar2);
                zzcrVar2.retrieveAndUploadBatches(new el2(this, (wn2) this.g));
                break;
            case 2:
                zzcr zzcrVar3 = this.f.f;
                yg0.m(zzcrVar3);
                zzcrVar3.logHealthData(5, "Error with data collection. Data lost.", new a((Exception) this.g), new a(null), new a(null));
                break;
            case 3:
                zzcr zzcrVar4 = this.f.f;
                yg0.m(zzcrVar4);
                zzcrVar4.setEventInterceptor((xq2) this.g);
                break;
            default:
                zzcr zzcrVar5 = this.f.f;
                yg0.m(zzcrVar5);
                zzcrVar5.setSgtmDebugInfo((Intent) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li2(ss2 ss2Var, Object obj, int i) {
        super(ss2Var, true);
        this.e = i;
        this.g = obj;
        this.f = ss2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(ss2 ss2Var, Exception exc) {
        super(ss2Var, false);
        this.e = 2;
        this.g = exc;
        this.f = ss2Var;
    }
}
