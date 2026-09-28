package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaj;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class is1 extends ts1 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is1(zaaj zaajVar, zaaj zaajVar2) {
        super(zaajVar2);
        this.c = zaajVar;
    }

    @Override // defpackage.ts1
    public final void a() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zaaj) obj).a.n.zab(null);
                break;
            default:
                ((BaseGmsClient$ConnectionProgressReportCallbacks) obj).onReportServiceBinding(new ConnectionResult(16, null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is1(zabf zabfVar, BaseGmsClient$ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks) {
        super(zabfVar);
        this.c = baseGmsClient$ConnectionProgressReportCallbacks;
    }
}
