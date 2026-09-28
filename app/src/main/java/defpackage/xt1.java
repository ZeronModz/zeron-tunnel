package defpackage;

import android.app.AlertDialog;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends zabw {
    public final /* synthetic */ AlertDialog a;
    public final /* synthetic */ db0 b;

    public xt1(db0 db0Var, AlertDialog alertDialog) {
        this.b = db0Var;
        this.a = alertDialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        au1 au1Var = (au1) this.b.c;
        au1Var.c.set(null);
        zau zauVar = ((gs1) au1Var).g.n;
        zauVar.sendMessage(zauVar.obtainMessage(3));
        AlertDialog alertDialog = this.a;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}
