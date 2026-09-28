package defpackage;

import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzfwq;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d03 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e03 b;

    public /* synthetic */ d03(e03 e03Var, int i) {
        this.a = i;
        this.b = e03Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        e03 e03Var = this.b;
        switch (i) {
            case 0:
                rz2 rz2Var = e03Var.a;
                r5 r5VarB = rz2Var.b(1);
                if (r5VarB == null) {
                    rz2Var.e.b(15315);
                    return null;
                }
                String strV = r5VarB.v().v();
                File fileA = sb2.A(strV, rz2Var.c(), "pcam.jar");
                fileA.getClass();
                if (!fileA.exists()) {
                    fileA = sb2.A(strV, rz2Var.c(), "pcam");
                    fileA.getClass();
                }
                File fileA2 = sb2.A(strV, rz2Var.c(), "pcopt");
                fileA2.getClass();
                File fileA3 = sb2.A(strV, rz2Var.c(), "pcbc");
                fileA3.getClass();
                return new zzfwq(r5VarB.v(), fileA, fileA3, fileA2);
            default:
                r5 r5VarB2 = e03Var.a.b(1);
                return r5VarB2 == null ? r5.A() : r5VarB2;
        }
    }
}
