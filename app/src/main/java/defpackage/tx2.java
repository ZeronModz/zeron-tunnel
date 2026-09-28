package defpackage;

import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tx2 implements zzikp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tx2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new ci2(((l5) obj).a, 15);
            case 1:
                return new ux2(((l5) obj).a);
            case 2:
                return new ux2(((l5) obj).a);
            default:
                t61 t61Var = (t61) obj;
                l5 l5Var = (l5) t61Var.b;
                t61 t61Var2 = (t61) t61Var.c;
                gj0 gj0Var = new gj0();
                gj0Var.a = l5Var;
                gj0Var.b = t61Var2;
                return gj0Var;
        }
    }
}
