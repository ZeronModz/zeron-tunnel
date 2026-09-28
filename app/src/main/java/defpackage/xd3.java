package defpackage;

import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.zzjd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj3 b;
    public final /* synthetic */ zzjd c;

    public /* synthetic */ xd3(zzjd zzjdVar, wj3 wj3Var, int i) {
        this.a = i;
        this.b = wj3Var;
        this.c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        wj3 wj3Var = this.b;
        zzjd zzjdVar = this.c;
        switch (i) {
            case 0:
                g0 g0Var = zzjdVar.a;
                g0Var.w();
                wd3.d(g0Var);
                String str = wj3Var.a;
                yg0.j(str);
                int i2 = 0;
                if (g0Var.Z().k(null, l.A0)) {
                    ((wu) g0Var.zzaZ()).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i3 = g0Var.Z().i(null, l.j0);
                    g0Var.Z();
                    long jLongValue = jCurrentTimeMillis - ((Long) l.e.a(null)).longValue();
                    while (i2 < i3 && g0Var.D(jLongValue, null)) {
                        i2++;
                    }
                } else {
                    g0Var.Z();
                    long jIntValue = ((Integer) l.l.a(null)).intValue();
                    while (i2 < jIntValue && g0Var.D(0L, str)) {
                        i2++;
                    }
                }
                if (g0Var.Z().k(null, l.B0)) {
                    g0Var.zzaW().a();
                    g0Var.C();
                }
                ri3 ri3Var = g0Var.j;
                zzin zzinVarZzb = zzin.zzb(wj3Var.E);
                ri3Var.a();
                if (zzinVarZzb == zzin.CLIENT_UPLOAD_ELIGIBLE && !ri3.d(str)) {
                    o oVar = ri3Var.b.a;
                    g0.P(oVar);
                    n nVarM = oVar.m(str);
                    if (nVarM != null && nVarM.B() && !nVarM.C().o().isEmpty()) {
                        g0Var.zzaV().n.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        ((wu) g0Var.zzaZ()).getClass();
                        g0Var.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 1:
                g0 g0Var2 = zzjdVar.a;
                g0Var2.w();
                g0Var2.zzaW().a();
                g0Var2.g0();
                yg0.j(wj3Var.a);
                g0Var2.X(wj3Var);
                break;
            case 2:
                g0 g0Var3 = zzjdVar.a;
                g0Var3.w();
                g0Var3.zzaW().a();
                g0Var3.g0();
                yg0.j(wj3Var.a);
                g0Var3.h0(wj3Var);
                g0Var3.i0(wj3Var);
                break;
            default:
                g0 g0Var4 = zzjdVar.a;
                g0Var4.w();
                g0Var4.h0(wj3Var);
                break;
        }
    }
}
