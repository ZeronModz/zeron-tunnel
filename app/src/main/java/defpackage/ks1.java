package defpackage;

import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.signin.internal.zac;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 extends zac {
    public final WeakReference b;

    public ks1(zaaw zaawVar) {
        this.b = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(pt1 pt1Var) {
        zaaw zaawVar = (zaaw) this.b.get();
        if (zaawVar == null) {
            return;
        }
        zabi zabiVar = zaawVar.a;
        js1 js1Var = new js1(zaawVar, zaawVar, pt1Var);
        rs1 rs1Var = zabiVar.e;
        rs1Var.sendMessage(rs1Var.obtainMessage(1, js1Var));
    }
}
