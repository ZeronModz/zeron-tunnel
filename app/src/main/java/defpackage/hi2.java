package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hi2 extends sq2 {
    public final /* synthetic */ int e = 3;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ss2 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi2(ss2 ss2Var, zzdf zzdfVar, String str, String str2) {
        super(ss2Var, true);
        this.i = zzdfVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(ss2Var);
        this.h = ss2Var;
    }

    @Override // defpackage.sq2
    public final void a() throws RemoteException {
        switch (this.e) {
            case 0:
                zzcr zzcrVar = this.h.f;
                yg0.m(zzcrVar);
                zzcrVar.setUserProperty(this.f, this.g, new a(this.i), true, this.a);
                break;
            case 1:
                zzcr zzcrVar2 = this.h.f;
                yg0.m(zzcrVar2);
                zzcrVar2.clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                break;
            case 2:
                zzcr zzcrVar3 = this.h.f;
                yg0.m(zzcrVar3);
                zzcrVar3.getConditionalUserProperties(this.f, this.g, (zzco) this.i);
                break;
            default:
                zzcr zzcrVar4 = this.h.f;
                yg0.m(zzcrVar4);
                zzcrVar4.setCurrentScreenByScionActivityInfo((zzdf) this.i, this.f, this.g, this.a);
                break;
        }
    }

    @Override // defpackage.sq2
    public void b() {
        switch (this.e) {
            case 2:
                ((zzco) this.i).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi2(ss2 ss2Var, String str, String str2, Bundle bundle) {
        super(ss2Var, true);
        this.f = str;
        this.g = str2;
        this.i = bundle;
        Objects.requireNonNull(ss2Var);
        this.h = ss2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi2(ss2 ss2Var, String str, String str2, zzco zzcoVar) {
        super(ss2Var, true);
        this.f = str;
        this.g = str2;
        this.i = zzcoVar;
        Objects.requireNonNull(ss2Var);
        this.h = ss2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi2(ss2 ss2Var, String str, String str2, Object obj) {
        super(ss2Var, true);
        this.f = str;
        this.g = str2;
        this.i = obj;
        Objects.requireNonNull(ss2Var);
        this.h = ss2Var;
    }
}
