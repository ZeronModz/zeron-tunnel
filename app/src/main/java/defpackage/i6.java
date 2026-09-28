package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.app.k;
import androidx.core.view.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 implements Runnable {
    public final /* synthetic */ k a;

    public i6(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        k kVar = this.a;
        kVar.w.showAtLocation(kVar.v, 55, 0, 0);
        jo1 jo1Var = kVar.y;
        if (jo1Var != null) {
            jo1Var.b();
        }
        if (!kVar.z || (viewGroup = kVar.A) == null || !viewGroup.isLaidOut()) {
            kVar.v.setAlpha(1.0f);
            kVar.v.setVisibility(0);
            return;
        }
        kVar.v.setAlpha(0.0f);
        jo1 jo1VarA = h.a(kVar.v);
        jo1VarA.a(1.0f);
        kVar.y = jo1VarA;
        jo1VarA.d(new dq1(this, 2));
    }
}
